package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Point
        Point first = new org.example.Point(6, 5);
        Point second = new org.example.Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new org.example.Point(0,0);
        System.out.println("distance()= " + point.distance());

        //Player

        Player player1 = new org.example.Player("Arthur", 80, Weapon.SWORD);
        System.out.println("Player " + player1.healthRemaining() + " can ile oyuna başladı.");

        player1.loseHealth(20);
        System.out.println("Player canı azaldı: " + player1.healthRemaining());

        player1.restoreHealth(30);
        System.out.println("Player canı arttı: " + player1.healthRemaining());

        player1.loseHealth(90);
        System.out.println("Player canı azaldı: " + player1.healthRemaining());

        Player player2 = new Player("Lancelot", 120, Weapon.AXE); // healthPercentage 100'e eşitlenecek
        System.out.println("Player 2 canı: " + player2.healthRemaining());

        Player player3 = new Player("Guinevere", -10, Weapon.BOW); // healthPercentage 0'a eşitlenecek
        System.out.println("Player 3 canı: " + player3.healthRemaining());

    }
}