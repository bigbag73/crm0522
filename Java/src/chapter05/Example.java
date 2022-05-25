package chapter05;
import java.io.*;
public class Example{
public static void main(String[] args) throws Exception {
 FileInputStream fis = new FileInputStream("file.txt");
FileOutputStream fos = new FileOutputStream("copy_file.txt");
  int ch = 0;
  while((ch =fis.read())!=-1){
    fos.write(ch);
  }
  fos._______;
  fis.close();
 }
}