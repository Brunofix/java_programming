import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CreateStudentFile
{
    private ObjectOutputStream output;

    public void openFile() throws java.io.IOException
    {
        output = new ObjectOutputStream(new FileOutputStream( "students.ser" ) );
    }

    public void addStudent(Student student) throws java.io.IOException
    {
        output.writeObject(student);
    }

    public void closeFile() throws java.io.IOException
    {
        if (output != null)
            output.close();
    }
}