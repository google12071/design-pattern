package com.learn.java.dp.builder;

public class BuilderClient {
    public static void main(String[]args){
        Director director=new Director(new ConcreteABuilder());
        BuildProduct product=director.construct();
        System.out.println(product);
    }
}
