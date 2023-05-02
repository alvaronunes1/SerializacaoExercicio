package EXEMPLO;

import java.io.*;
import java.util.Scanner;

public class Leitura {
    public static void leitor(String path) throws IOException{
        BufferedReader ler = new BufferedReader(new FileReader(path));
        String linha = "";
        while(true) {
            if (linha != null){
                System.out.println(linha);

            } else
                break;
            linha = ler.readLine();
        }
        ler.close();
    }
}
