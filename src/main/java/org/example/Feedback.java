package org.example;

public class Feedback {
    private void connect(){
        System.out.println("Connected");
    }
    private void disconnect(){
        System.out.println("Disconnected");
    }
    public void sendFeedback(String feedback){
        authenticate();
        connect();
        System.out.println("Send feedbac to cheff through Email service");
        disconnect();
    }
    private void authenticate(){
        System.out.println("Authenticated");
    }
}
