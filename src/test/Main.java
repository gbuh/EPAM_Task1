package test;

import logic.Agent;

public class Main {

    public static void main(String[] args) {        
        System.out.println("Турагентство \"Путешествие без границ\"");
        Agent agent = new Agent("Татьяна");
        agent.offer();
    }
}