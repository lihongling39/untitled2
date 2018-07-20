package oop.c1;

import java.io.File;

/**
 * Created by 李红玲 on 2018/7/20.
 */
public class FileDemo {
    public  static  void main(String [] args){
        File file = new File("a/b/c");
        String path = file.getAbsolutePath();
        System.out.println(path);
        file.mkdirs();
        if(file.isDirectory()){
            System.out.println("目录");
        }if(file.isFile()) {
            System.out.println("文件");
        }
        if(file.exists()){
            System.out.println("file exits: true");
        }else {
            System.out.println("file exits: false");
        }

    }
}

