package com.practice.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Simple TCP client that connects to the server and allows two-way messaging.
 */
public class TCPClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5555);
             BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {

            System.out.println("Connected to TCP server. Type a message and press Enter.");
            System.out.println(serverReader.readLine());

            String userInput;
            while ((userInput = consoleReader.readLine()) != null) {
                writer.println(userInput);
                String response = serverReader.readLine();
                System.out.println("Server reply: " + response);
                if ("Goodbye!".equals(response)) {
                    break;
                }
            }
        } catch (Exception e) {
            System.err.println("Client error: " + e.getMessage());
        }
    }
}
