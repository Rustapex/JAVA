package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    Scanner sc = new Scanner(System.in);

    public Client2() {
        try {
            socket = new Socket("localhost", 6500); // server와 연결
            System.out.println("서버와 연결됨");

            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());

            send();
            receive();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    // 클라이언트 키보드 입력 -> 서버로 전송
    private void send() {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true) {
                        System.out.println("클라이언트 말 : ");
                        String message = sc.nextLine();
                        
                        dos.writeUTF(message); // server로 message를 보냄
                        dos.flush();
                        
                        if(message.equals("종료")){
                            System.out.println("클라이언트가 종료를 요청했습니다.");
                            closeAll();
                            break;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("메시지 전송 중 오류가 발생했습니다.");
                }
            }
        });
        th.start();

    }

    private void receive() {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true) {
                        String message = dis.readUTF();
                        System.out.println("서버 : " + message); // server로부터 받은 message 출력

                        if(message.equals("종료")){
                            System.out.println("서버가 종료를 요청했습니다.");
                            closeAll();
                            break;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("서버와 연결이 종료되었습니다.");
                }
            }

        });
        th.start();

    }

    private void closeAll() {
        try {
            if (dis != null) dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (dos != null) dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (socket != null) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Client2();

    }
}
