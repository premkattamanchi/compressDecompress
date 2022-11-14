/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codefiles;

import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author 91630
 */
public class Decompress {
    public static void method(File file) throws IOException
    {
        String fileDirectory=file.getParent();
        System.out.println(fileDirectory);
        FileInputStream fis=new FileInputStream(file);
        GZIPInputStream gzipIS=new GZIPInputStream(fis);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"\\Decompressedfile.txt");
        
        byte[] buffer=new byte[1024];
        int len;
        while((len=gzipIS.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        fis.close();
        gzipIS.close();
        fos.close();
    }
    public static void main(String [] args) throws IOException
    {
        File path=new File("C:\\Users\\91630\\OneDrive\\Documents\\Compressedfile.gz");
        method(path);
    }   
}
