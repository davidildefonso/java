
package com.david;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        String sentence = "my first sentence";
        char a = 'A';
        int n = 23;
	    Date todaysDate = new Date();
	    byte theByte = -128;
	    short theShort = 2322;
	    long theLong = 1323213331321111111L;
	    float pi = 3.1415F;
	    double doublePi = 3.141516;
	    boolean isAdult = true;

        //System.out.printf("%s %s \n", theByte, sentence);

        String name = new String("david");
        //System.out.println(name.toUpperCase());
        //System.out.println(name.length());
        //System.out.println(name.charAt(2));
        //System.out.println(name.contains("a"));
        String lastName = "ildefonso";
        //System.out.println(name.equals(lastName));

        LocalDate now =  LocalDate.now();
        String currentMonth = now.getMonth().toString();
        //System.out.println(now);

        int x = 100;
        int y = x;
        x = 1;
        //System.out.println("x = " + x + " -  y = " + y);

        Person alex = new Person("Alex");
        Person mariam = alex;
        //System.out.println(alex.name + " " + mariam.name);
        mariam.name = "mairna";
        //System.out.println(alex.name + " " + mariam.name);

        double n1 = 100.56;
        int n2 = -3;
        //System.out.println(n1*n2);

        /*
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(-1,-2));
        System.out.println(Math.min(0.002, 0.2));
        System.out.println((int) Math.pow(4,4));
        System.out.println(Math.sqrt(996));
        System.out.println(Math.PI*5*5);
        */

/*
        System.out.println(14 < 2);
        System.out.println(4 == 4);
        System.out.println(6 != 2);

        System.out.println(5 < 12 && 1!=0);
        System.out.println(5 == 5 || 1 >= 0);
        System.out.println(!(6<10));
        */

        int age = 12;
        boolean isRich = true;

        String message = age >= 18
                ? "you can enter"
                : isRich
                    ? "you can enter Mr Rich"
                    : "you cannot enter";
        //System.out.println(message);

        if(age >= 18){
          //  System.out.println("you can enter");
        }else if(isRich){
            //System.out.println("you can enter Mr Rich");
        }else{
            //System.out.println("you cannot enter");
        }

        String game = "minecrcaft";
        switch (game){
            case "minecraft":
               // System.out.println("the best");
                break;
            case "angry birds":
             //   System.out.println("good");
                break;
            case "solitaire":
           //     System.out.println("worst");
                break;
            default:
         //       System.out.println("stupid game");

        }

        int zero = 0;
        int one = 1;

        int [] numbers = new int[3];
        int [] numbers2 = {3, 4, 6, 7, 7};
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 44;
        //System.out.println(Arrays.toString(numbers));
        //System.out.println(Arrays.toString(numbers2));
        //System.out.println(numbers.length);

        String [] namesList = {"david", "sebas", "vale"};
        //System.out.println(Arrays.toString((namesList)));

        //System.out.println(namesList[namesList.length - 1]);
        int singleNumber = 3;
        singleNumber++;
        //System.out.println(--singleNumber);
        singleNumber+= 2;
        //System.out.println(singleNumber);

        int [] list = {2, 4, 6, 6, 3, 0, 1};
        for(int i = 0; i < list.length; i++){
          //  System.out.print(list[i]+ " ");
        }
        //System.out.println();
        //System.out.println("enhanced for loop ");
        for(int el : list){
          //  System.out.print(el + " ");
        };
        //System.out.println();

        //Arrays.stream(list).forEach(System.out:: println);

        String [] listNames = {"Ana", "Ali", "Dai", "Tim"};
        for(String singleName : listNames){
            if(singleName.equals("Ali")){
                //break;
                continue;
            }
            //System.out.println(singleName);
        }

        int flag = 10;
        while(flag > 0){
            //System.out.print(flag + " ");
            flag--;
        }
        //System.out.println();


        do{
          //  System.out.print(flag + " ");
            flag++;
        }while(flag < 20);
        //System.out.println();

       // Scanner scanner = new Scanner(System.in);

//        System.out.println("what is your name?: ");
        //String username = scanner.nextLine();
  //      System.out.println("Hello " + username);

    //    System.out.println("how old are you?");
        //int userAge = scanner.nextInt();
        //int userYear =  LocalDate.now().minusYears(userAge).getYear();
      //  System.out.println("you were born in " + userYear);

        String brand = "SAMSUNG";
        //System.out.println(brand.toLowerCase());
        //System.out.println(brand.startsWith("F"));
        //System.out.println(brand.endsWith("g"));


        char[] letters = {'A', 'A', 'A',
        'B','B','B','B','B','C','C'};
        char letter = 'A';

        int count = countOcurrences(letters, letter);

       // System.out.println("letter " +
          //      letter + " is repeated " + count + " times.");





        Lens lensOne = new Lens(
                "sony",
                "85mm",
                true
        );

        Lens lensTwo = new Lens(
                "hp",
                "44mm",
                false
        );
        Lens lensThree = new Lens(
                "huawei",
                "444mm",
                false
        );

       // System.out.println(lensOne.brand);
        //System.out.println(lensTwo.brand);
        //System.out.println(lensThree.brand);


        Passport ukPassport = new Passport(
                "ak12313",
                "UK",
                LocalDate.of(2025, 3, 22)

        );

        Passport usPassport = new Passport(
                "54212313",
                "US",
                LocalDate.of(2029, 10, 2)

        );


        System.out.println(usPassport.number);
        System.out.println(ukPassport.number);



    }

    static class Passport{
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate){
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }

    static class Lens{
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(
                String brand,
                String focalLength,
                boolean isPrime
        ){
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }


    public static  int countOcurrences(char[] list, char letter){
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i] == letter){
                counter++;
            }
        }
        return counter;
    }


    static class Person{
        String name;
        Person(String name){
            this.name = name;
        }
    }






}

