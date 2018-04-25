package com.wsm.http;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by wangsm on 2018/4/24.
 */
public class HttpServer {


    public void server(){

        try {


            ServerSocket serverSocket = new ServerSocket(5555);
            System.out.println("服务端开启-------------");
            Socket socket = serverSocket.accept();
            System.out.println("客户端连接到服务端----------");

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = br.readLine();
            System.out.println(line);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("我收到你的信息了，你好client\n");
            bw.flush();


            System.out.println(111);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {
        new  HttpServer().server();
    }


}
