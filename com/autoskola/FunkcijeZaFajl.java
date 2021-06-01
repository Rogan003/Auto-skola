package com.autoskola;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FunkcijeZaFajl{
    FileWriter myWriter;

    FunkcijeZaFajl() throws IOException{
        myWriter = new FileWriter("informacije.txt");
    }
    
    void NapisiUFaljl(String unos) throws IOException{
        myWriter.write(unos);
        myWriter.close();
    }

}