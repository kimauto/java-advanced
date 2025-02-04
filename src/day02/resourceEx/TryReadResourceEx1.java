package day02.resourceEx;

import java.io.*;

public class TryReadResourceEx1 {

    public static void main(String[] args) {

       try(FileWriter file = new FileWriter("data2.txt")) {
           file.write("김병곤");
       }catch(IOException e) {
           e.printStackTrace();
       }


       try(
        FileInputStream fis = new FileInputStream("data.txt");
        DataInputStream dis = new DataInputStream(fis);)
       {
           while(true) {
               String data = dis.readUTF();
               System.out.println(data);
           }
       }catch (EOFException e){
           e.printStackTrace();
       }
       catch(IOException e) {
           e.printStackTrace();
       }
    }
}
