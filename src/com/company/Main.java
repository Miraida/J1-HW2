package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        System.out.println(getPermission(23,19));

        System.out.println(getPermission(45,-50));

        System.out.println(getPermission(6,-14));

        System.out.println(getPermission(14,20));

        System.out.println(getPermission(46,10));
        System.out.println("-----------------------");
        int randomNumber=generateRandomAge();
        System.out.println("Random Number is: "+randomNumber);

        System.out.println(getPermission(randomNumber,-11));
    }
    //////////////////////////////////////////////////////////////
    public static String getPermission(int age, int temp){

       if(age>=20 && age<=45 && temp>=-20 && temp<=30){
           return "You can go for a walk 1";
       }
       else if(age<=20 && 0<=temp && temp<=28){
           return "You can go for a walk 2";
       }
       else if(age>=45 && temp>=-10 && temp<=25){
          return "You can go for a walk 3";
       }
       else{
           return "Stay home";
       }

    }
    /////////////////////////////////////////////////////////////
    public static int generateRandomAge(){
        Random random=new Random();
        return random.nextInt(100+1);
    }
}
