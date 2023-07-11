import java.io.*;

class buffered
{
    public static void main(String args[])throws Exception
    {
        FileOutputStream fout = new FileOutputStream("f1.txt");

        //creating bufferdOutputStream obj
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        //illustrating write() method
        for(int i = 65; i < 75; i++)
        {
            bout.write(i);
        }

        byte b[] = { 75, 76, 77, 78, 79, 80,81,82 };
        bout.write(b);

        //illustrating flush() method
        bout.flush();

        //illustrating close() method
        bout.close();
        fout.close();
    }
}

