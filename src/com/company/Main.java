package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageDegree(25,20));
        System.out.println(ageDegree(50, 40));
        System.out.println(ageDegree(26, 27));
        System.out.println(ageDegree(16, -10));
        System.out.println(ageDegree(30,0));

    }
    public static String ageDegree(int age, int degree) {
        if (age > 20 && age < 45) {
            if (degree > -20 && degree < 30) {
                return ("Можно идти гулять!");
            }
        }
        else if (age<20 && degree<28 && degree>0){
                return ("Можно идти гулять!");
            }
        else if (age > 45){
                if (degree>-10 && degree<25){
                    return ("Можно идти гулять!");
                }
        }
        return ("Оставайтесь дома!");
    }

}
