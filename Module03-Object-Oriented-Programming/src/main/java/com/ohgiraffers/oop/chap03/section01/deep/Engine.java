package com.ohgiraffers.oop.chap03.section01.deep;

public class Engine {
    boolean status = false;

    void start(){
        status = true;
        System.out.println("엔진 시작");

    }

    void increaseSpeed(){
        System.out.println("속도 증가.");
    }
}
