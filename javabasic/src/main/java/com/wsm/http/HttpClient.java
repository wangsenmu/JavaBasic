package com.wsm.http;

import java.io.*;
import java.net.Socket;

/**
 * Created by wangsm on 2018/4/24.
 * http 原始交互方式
 * 我们回顾一下传统的HTTP服务器的原理
 *      创建一个ServerSocket，监听并绑定一个端口
 *      一系列客户端来请求这个端口
 *      服务器使用Accept，获得一个来自客户端的Socket连接对象
 *      启动一个新线程处理连接
 *            读Socket，得到字节流
 *            解码协议，得到Http请求对象
 *            处理Http请求，得到一个结果，封装成一个HttpResponse对象
 *            编码协议，将结果序列化字节流
 *            写Socket，将字节流发给客户端继续
 *     循环步骤3
 */
public class HttpClient {

    public void getConnect(){

        try {
            Socket socket = new Socket("127.0.0.1",5555);
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            bw.write("客户端写入信息\n");
            bw.flush();
            BufferedReader br = new  BufferedReader(new InputStreamReader(is));
            String line  = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
       new HttpClient().getConnect();
    }

}
