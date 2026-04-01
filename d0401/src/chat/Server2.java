package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {

    /*
    server socket
    socket : client 와 통신할 socket
    Filter Stream(보조 스트림) : in
    Filter Stream(보족 스트림) : out
    Scanner
        */

    ServerSocket serverSocket;
    Socket socket;
    DataInputStream is;
    DataOutputStream os;
    Scanner sc = new Scanner(System.in);

    public Server2() {
        try { //5000~9000
            serverSocket = new ServerSocket(6500); //6500 port로 열림
            System.out.println("기다리는 중...");
            socket = serverSocket.accept(); //client의 연결을 기다림

            System.out.println("client : " + socket.getInetAddress().toString()); // client의 ip주소 출력

            is = new DataInputStream(socket.getInputStream()); // client로부터 데이터를 받는 스트림
            os = new DataOutputStream(socket.getOutputStream()); // client로 데이터를 보내는 스트림

            receive();
            send();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void receive() {
        Thread t = new Thread(() -> {
            try {
                while(true) {
                    System.out.println("서버 말 : ");
                    String message = sc.nextLine();
                    os.writeUTF(message); // client로 message를 보냄
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        t.start();

    }

    private void send() {
        Thread t = new Thread(() -> {
            String message = null;
            try {
                while (true) {
                    message = is.readUTF();
                    System.out.println(message);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });

        t.start();

    }

    public static void main(String[] args) {
        new Server2();
    }


}
