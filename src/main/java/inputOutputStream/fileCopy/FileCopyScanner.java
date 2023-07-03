package inputOutputStream.fileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyScanner {
    public static void main(String arg[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Source file: ");
        String src = sc.nextLine();

        System.out.println("Enter Dest file: ");
        String dst = sc.nextLine();

        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dst);

        int data;
        while((data = fis.read()) != -1){
            fos.write(data);
        }

        fis.close();
        fos.close();
    }
}
