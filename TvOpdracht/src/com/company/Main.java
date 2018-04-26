package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        Television tv =  new Television();

        boolean proceed = true;

        while(proceed){

            System.out.println("Televisie\n");

            System.out.println("1: ON");
            System.out.println("2: OFF");
            System.out.println("3: Channel up");
            System.out.println("4: Channel down");
            System.out.println("5: Volume up");
            System.out.println("6: Volume down");
            System.out.println("7: Set Channel");
            System.out.println("8: Set Volume");
            System.out.println("9: Exit\n");

            System.out.println("Maak uw Keuze:");

            int userInput = scanner.nextInt();


            switch (userInput) {
                case 1: tv.turnOn(); break;
                case 2: tv.turnOff(); break;
                case 3: tv.channelUp(); break;
                case 4: tv.channelDown(); break;
                case 5: tv.volumeUp(); break;
                case 6: tv.volumeDown(); break;
                case 7: if (tv.isOn()) {
                    int choice = getNewChannel(); tv.setChannel(choice); break;
                }   else {
                    System.out.println("De TV staat niet aan."); break;
                }
                case 8: if (tv.isOn()) {
                    int choice = getNewVolumeLevel(); tv.setVolume(choice); break;
                }   else {
                    System.out.println("De TV staat niet aan."); break;
                }
                case 9: System.exit(0);
                default:
                    System.out.println("Sorry, die keuze staat niet in het menu.\n");
            }

        }

    }


    public static int getNewChannel() {
        System.out.print("Op welk kanaal wilt u de TV zetten? ");
        int choice =  scanner.nextInt();
        return choice;
    }


    public static int getNewVolumeLevel() {
        System.out.print("Op welk volume wilt u de TV zetten? ");
        int choice =  scanner.nextInt();
        return choice;
    }

}
