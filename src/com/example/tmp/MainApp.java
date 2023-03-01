package com.example.tmp;

public class MainApp {
    public static void main(String[] args) throws Exception {
        DispatcherServlet servlet = new DispatcherServlet();
        servlet.initialize("com.example.tmp.controller");
        System.out.println("*** Result for /art/writing");
        System.out.println(servlet.doGet("/art/writing"));
        System.out.println();
        System.out.println("*** Result for /art/painting");
        System.out.println(servlet.doGet("/art/painting"));
        System.out.println();
        System.out.println("*** Result for /art/math");
        System.out.println(servlet.doGet("/art/math"));
        System.out.println();
        System.out.println("*** Result for /science/math");
        System.out.println(servlet.doGet("/science/math"));
        System.out.println();
        System.out.println("*** Result for /science/physics");
        System.out.println(servlet.doGet("/science/physics"));
        System.out.println();
        System.out.println("*** Result for /science/writing");
        System.out.println(servlet.doGet("/science/writing"));
        System.out.println();
    }
}
