package com.company;

public class Main {

    public static void main(String[] args) {
        int votersAge = 11;
        System.out.println("Prepare to looop!!!");
        while (votersAge < 16){
            System.out.println("You cannot vote, you are " + votersAge + "!");
            votersAge = votersAge +1;

        }
        System.out.println("Phew! That was fun");
    }
}
