package TrabalhoSD;
/* Trabalho desenvolvido pelos alunos:
   João Gabriel Grandotto Viana & Otávio Profeta dos Santos
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Thread {

    public static void main(String args[]) {
        ServerSocket s = null;
        System.out.println("Servidor Iniciado");
        try {
            s = new ServerSocket(12345);
            while (true) {

                Socket conexao = s.accept();

                Thread t = new Servidor(conexao);
                t.start();
            }
        } catch (IOException e) {
            System.out.println("IOException " + e);
        }
    }

    private Socket conexao;

    public Servidor(Socket s) {
        conexao = s;
    }

    public void run() {
        try {

            System.out.println("Nova conexão com o cliente " + conexao.getInetAddress().getHostAddress());

            DataInputStream entrada = new DataInputStream(conexao.getInputStream());
            Manipulador manipulador = new Manipulador();

            String t = entrada.readUTF();
            int qtLinhas = entrada.readInt();
            String[][] respostas = manipulador.LeituraRespostas(t, qtLinhas);

            String gabarito = manipulador.Read("D:/Gabarito.txt");
            int gabaLinhas = manipulador.QtdLinhas("D:/Gabarito.txt");
            String[][] gabaritoVetor = manipulador.LeituraRespostas(gabarito, gabaLinhas);
            manipulador.VerificarRespostas(respostas, gabaritoVetor);

            entrada.close();
            conexao.close();


        } catch (IOException e) {
            System.out.println("IOException " + e);
        }

        /*
        - Feito por Gilberto Toledo somente a parte de leitura arquivos (método Read, Write).
        - Estrutura das Threads criada por farelogost.
         */

    }
}