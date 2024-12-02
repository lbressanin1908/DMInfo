package org.application;

import org.application.Services.ApiService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException{

        ApiService apiService = new ApiService();

        System.out.println(apiService.getDigimon("Gigimon"));
    }
}