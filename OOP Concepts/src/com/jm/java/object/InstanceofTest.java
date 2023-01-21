package com.jm.java.object;

public class InstanceofTest {
    public static void main(String[] args) {
    	
        FireEngine3 fe = new FireEngine3();
        
        if (fe instanceof FireEngine3) {        // true
            System.out.println("This is a FireEngine3 instance.");
        }
        
        if (fe instanceof Car5) {               // true  (FireEngine3 클래스는 Car5 클래스의 자손이기 때문에)
            System.out.println("This is a Car5 instance.");
        }
        
        if (fe instanceof Object) {             // true  (FireEngine3 클래스는 Object 클래스의 자손이기 때문에)
            System.out.println("This is an Object instance.");
        }

        System.out.println(fe.getClass().getName());     // 클래스의 이름(FireEngine3) 을 출력
    }                                                    // 참조변수.getClass().getName()
}       // InstanceofTest 클래스 종료                           └> 참조변수가 가리키고 있는 인스턴스의 클래스 이름을 문자열로 반환


class Car5 { }

class FireEngine3 extends Car5 { }