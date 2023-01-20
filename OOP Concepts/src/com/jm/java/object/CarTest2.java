package com.jm.java.object;

class Car2 {
    String color;       // 색상
    String gearType;    // 변속기 종류 - auto (자동) , manual (수동)
    int door;           // 문의 개수

    Car2() {            // 기본 생성자
        this("white", "auto", 4);       //  Car2(String color, String gearType, int door)  를 호출함.
    }

    
    Car2(String color) {   				// 매개변수로 color 를 받음.
        this(color, "auto", 4);
    }

    
    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}


public class CarTest2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1 의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2 의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}