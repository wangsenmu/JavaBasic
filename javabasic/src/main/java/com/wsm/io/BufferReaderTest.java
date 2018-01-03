package com.wsm.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangsm on 2018/1/3.
 *   流的关闭顺序
 * 一般情况下是：先打开的后关闭，后打开的先关闭
 * 另一种情况：看依赖关系，如果流a依赖流b，应该先关闭流a，再关闭流b。例如，处理流a依赖节点流b，应该先关闭处理流a，再关闭节点流b
 * 可以只关闭处理流，不用关闭节点流。处理流关闭的时候，会调用其处理的节点流的关闭方法。
 * jdk 1.7 以后 try（）里面new 的流会被自动关闭掉
 */
public class BufferReaderTest {
    public static void main(String[] args) {
//        FileInputStream fileInputStream = null;
//        BufferedReader br = null;
        List<String> lineList = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(new File("D:/test.txt"));
             BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));) {
            String line = null;
            while ((line = br.readLine()) != null) {
                lineList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }/* finally {
            if (br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }*/

        System.out.println(lineList);

    }
}
