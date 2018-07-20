package oop.c1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InvalidClassException;

/**
 * Created by 李红玲 on 2018/7/20.
 */
 class FileWriteTester {
     public  static  void  main(String [] args)throws IOException{
         String fileName="D:\\Hello.txt";
         FileWriter writer = new FileWriter(fileName);
         writer.write("Hello!\n");
         writer.write("this is my firsst text file,\n");
         writer.write("you can see bow this is done.\n");
         writer.write("输入一行中文也可以\n");
         writer.close();
     }
}
