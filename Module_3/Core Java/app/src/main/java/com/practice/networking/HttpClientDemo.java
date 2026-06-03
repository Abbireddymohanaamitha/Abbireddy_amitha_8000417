package com.practice.networking;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * 36. HTTP Client API
 * Uses HttpClient to fetch GitHub user data and parse JSON with Gson.
 */
public class HttpClientDemo {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/users/octocat"))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body:");
            System.out.println(response.body());

            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
            System.out.println("Parsed name: " + jsonObject.get("name").getAsString());
            System.out.println("Parsed company: " + jsonObject.get("company").getAsString());
        } catch (Exception e) {
            System.err.println("HTTP request failed: " + e.getMessage());
        }
    }
}
