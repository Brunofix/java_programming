import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;

public class Server {

    private static final List<String> FILTERS = Arrays.asList(
            "psovka1",
            "psovka2",
            "psovka3",
            "uvreda1",
            "uvreda2",
            "uvreda3"
    );

    private final ServerSocket serverSocket;

    private final Socket socket;

    private final PrintWriter printWriter;

    private Server(String address, int port) {
        try {
            this.serverSocket = new ServerSocket();
            this.serverSocket.bind(new InetSocketAddress(address, port));

            System.out.println("[SERVER]: Waiting connection...");
            this.socket = this.serverSocket.accept();
            System.out.println("[SERVER]: Connection established " + socket);

            this.printWriter = new PrintWriter(new PrintStream(socket.getOutputStream()), true);
            this.read(new BufferedReader(new InputStreamReader(this.socket.getInputStream())));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void read(BufferedReader reader) throws IOException {
        String message;
        while ((message = reader.readLine()) != null) {
            System.out.println("[CLIENT]: " + message);
            for (String filter : FILTERS) {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < filter.length(); i++)
                    builder.append("*");

                message = message.replaceAll(filter, builder.toString());
            }
            printWriter.println(message);
        }
    }

    public static void main(String[] args) {
        new Server("127.0.0.1", 1337);
    }

}