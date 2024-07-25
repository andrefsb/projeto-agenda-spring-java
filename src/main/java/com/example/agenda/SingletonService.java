package com.example.agenda;

import org.springframework.stereotype.Service;

@Service
public class SingletonService {
    public void log(String message) {
        System.out.println(message);
    }
}