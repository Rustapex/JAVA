package object.String;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str = "i love java";
        int cnt = str.length();

        // 기본 자료형
        int a,b;
        double c;
        boolean d;

        // java 객체지향언어
        /*바아븨 라이브러리 : 자바가 제공하는 기능에서는 대부분 객체를 매개변술로 받는다.
        *
        * 기본형을 객체로 만들어주는 Wrapper 를 제공
        *
        *
        * autoBoxing int-> Integer
        * autoUnBoxint Integer -> int
        *
        * 기본 자로형을 객체로 마들어주느 Wrapper 클래스가 제공되고 잉ㅆ다.
        *
        * int -> Integer
        * char-> character\
        * boolean => Boolean
        * double -<> Double
        *
        *
        *         *


                */
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(new Integer(5));
        list.add (Integer.valueOf(10));

        for(int i=0; i<list.size() ; i++){
            Object oo = list.get(i);
            System.out.println(oo);
        }
    }
}
