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

            send(); //서버 보내는 스레드
            receive(); // 서버 받는 스레드


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //서버 키보드 입력 -> 클라이언트로 전송
    private void send() {
        Thread t = new Thread(() -> {
            try {
                while (true) {
                    System.out.print("서버 말 : ");
                    String message = sc.nextLine();

                    os.writeUTF(message);
                    os.flush();

                    if(message.equals("종료")){
                        System.out.println("서버가 종료를 요청했습니다.");
                        closeAll();
                        break;
                    }
                }
            } catch (IOException e) {
                System.out.println("메시지 전송 중 오류가 발생했습니다.");
            }
        });
        t.start();

    }

    // 클라이언트 메시지 수신
    private void receive() {
        Thread t = new Thread(() -> {
            try {
                while(true) {
                    String message = is.readUTF();
                    System.out.println("클라이언트 말 : " + message); // client로부터 받은 message 출력

                    if(message.equals("종료")){
                        System.out.println("클라이언트가 종료를 요청했습니다.");
                        closeAll();
                        break;
                    }
                }

            } catch (IOException e) {
                System.out.println("클라이언트와 연결이 종료되었습니다.");
            }
        });
        t.start();

    }

    private void closeAll() {
        try {
            if (is != null) is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (os != null) os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (socket != null) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (serverSocket != null) serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        new Server2();
    }


}
