package com.company;

public class Television {

    private int channel = 1;
    private int volumeLevel = 1;
    private boolean on = false;

    public void turnOn(){
        if (!on) {
            on = true;
            System.out.println("De TV staat nu aan.");
        }   else {
            System.out.println("De TV staat al aan.");
        }
    }



    public void turnOff(){
        if (on) {
            on = false;
            System.out.println("De TV staat nu uit.");
        }   else {
            System.out.println("De TV staat al uit.");
        }
    }



    public void setChannel(int newChannel){
        if (on) {
        this.channel = newChannel;
        System.out.println("Het kanaal staat nu op " + channel);
    }   else {
            System.out.println("Sorry, je kan alleen zappen als de TV aan staat");
        }
    }



    public void setVolume(int newVolumeLevel){
        if (on) {
        this.volumeLevel = newVolumeLevel;
        System.out.println("Het volume staat nu op " + volumeLevel);
    }   else {
        System.out.println("Sorry, je kan alleen zappen als de TV aan staat");
    }
}



    public void channelUp(){
       if (on) {
           if (channel < 10) {
               channel++;
               System.out.println("Channel: " +channel);
           }   else {
               System.out.println("Deze channel bestaat niet");
           }
       } else {
           System.out.println("Sorry, je kan alleen zappen als de TV aan staat");
       }
    }



    public void channelDown(){
        if (on) {
            if (channel > 1) {
                channel--;
                System.out.println("Channel: " + channel);
            }   else {
                System.out.println("Deze channel bestaat niet");
            }
        } else {
            System.out.println("Sorry, je kan alleen zappen als de TV aan staat");
        }
    }



    public void volumeUp(){
        if (on) {
            if (volumeLevel < 20) {
                volumeLevel++;
                System.out.println("Volume: " + volumeLevel);
            }   else {
                System.out.println("Het volume kan niet hoger");
            }
        } else {
            System.out.println("Sorry, je kan het volume alleen aanpassen als de TV aan staat");
        }
    }




    public void volumeDown(){
        if (on) {
            if (volumeLevel > 0) {
                volumeLevel--;
                System.out.println("Volume: " + volumeLevel);
            }   else {
                System.out.println("Het volume kan niet lager");
            }
        } else {
            System.out.println("Sorry, je kan het volume alleen aanpassen als de TV aan staat");
        }
    }

    public boolean isOn() {
        return on;
    }

}
