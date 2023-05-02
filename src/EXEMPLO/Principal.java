package EXEMPLO;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/12116455/IdeaProjects/Serializacao/Nomes.txt";
        String path2 = "C:/Users/12116455/IdeaProjects/Serializacao/Sobrenome.txt";
        Leitura.leitor(path);
        Leitura.leitor(path2);
        Escrita.escritor(path);
        Escrita.escritor(path2);


    }
}
