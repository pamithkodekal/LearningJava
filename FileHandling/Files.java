package FileHandling;

import java.io.BufferedReader;
//import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Files {
    public static void main(String[] args){
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter("NewFile.txt"));
        writer.write("Let's Try this");
        writer.write("\nLet's Change this");
        writer.write("\nYes it's working");
        writer.close();
    }
    catch(IOException e){
        e.printStackTrace();
    }

    try {
        BufferedReader reader = new BufferedReader(new FileReader("NewFile.txt"));
        String line;
        while((line =  reader.readLine()) !=null){
            System.out.println(line);
        }
        reader.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    }
}
