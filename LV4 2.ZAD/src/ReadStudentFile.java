import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadStudentFile
{
    private ObjectInputStream input;

    public void openFile() throws java.io.IOException
    {
        input = new ObjectInputStream(new FileInputStream("students.ser"));
    }

    public Student readStudent() throws java.io.IOException, ClassNotFoundException
    {
        return (Student)input.readObject();
    }

    public void closeFile() throws java.io.IOException
    {
        if(input != null)
            input.close();
    }
}