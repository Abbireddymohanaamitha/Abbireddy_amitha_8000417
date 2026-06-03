package com.practice.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 35. TCP Client-Server Chat
 * Simple server that accepts one client connection and echoes messages.
 */
public class TCPServer {
    public static void main(String[] args) {
        System.out.println("Starting TCP server on port 5555...");
        try (ServerSocket serverSocket = new ServerSocket(5555)) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {
                writer.println("Welcome to the TCP server. Type 'exit' to quit.");
                String message;
                while ((message = reader.readLine()) != null) {
                    System.out.println("Client says: " + message);
                    if ("exit".equalsIgnoreCase(message.strip())) {
                        writer.println("Goodbye!");
                        break;
                    }
                    writer.println("Server echoed: " + message);
                }
            }
        } catch (Exception e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}
