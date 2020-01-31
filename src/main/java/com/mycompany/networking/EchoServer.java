/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author tss
 */
public class EchoServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        System.out.println("------------------------   Echo Server Start  -----------------------------");
        while (true) {
            try ( Socket clientSocket = serverSocket.accept();) {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());
                /* eseguo Echo */ String line;
                line = br.readLine();
                System.out.println("Server; " + line);
                pw.println(line);
                pw.close();
                br.close();
            }
            //clientSocket.close();
        }
        //  System.out.println("------------------------    Echo Server End    -----------------------------");
    }

}
