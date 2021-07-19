package com.du.lianxi05;

import java.io.File;

public class Test01 {
    // 遍历D盘 的 其中一个文件夹 , 并查找出 文件中带有 java 的 文件.
    public static void main(String[] args) {
        File file = new File("D:/IDELds");
        all(file);
    }
    //查找出 文件中带有 java 的 文件.并查找出 文件后缀名带有.class的文件
    private static void all(File file){
        File[] files = file.listFiles();
        for (File file1 : files){
            if (file1.isDirectory()) {
                all(file1);
            }else if (file1.isFile()) {
                String[] spkit = file1.getName().split("\\.");
                boolean aClass = spkit[spkit.length - 1].equals("class");
                boolean bClass = spkit[spkit.length - 1].equals("java");
                if (aClass||bClass) {
                    System.out.println("file1 = " + file1.toString());
                }
            }
        }
    }
}
