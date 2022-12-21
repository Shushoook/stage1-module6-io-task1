package com.epam.mjc.io;

import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {
        String[] params = new String[4];
        int counter=0;
        try ( BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file))) {
            String str;
            while ((str = bufferedReader.readLine())!=null){
                params[counter++]=  str.split(":")[1].trim();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        return new Profile(params[0],Integer.parseInt(params[1]),params[2],Long.parseLong(params[3]));
    }
}
