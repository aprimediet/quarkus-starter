package com.aprimediet.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
  public String greeting(String name) {
    return "hello " + name;
  }
}
