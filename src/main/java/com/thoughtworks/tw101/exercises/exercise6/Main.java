package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// reportStatus methods. Create instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the status of all monsters using a void reportStatus() method. ReportStatus should print the name and current hit 
// points of the monster.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage
 abstract class Monster{
    int hitPoints;
    private String nameOfMonster;
    public abstract void takeDamage(int amount);
    public abstract String name();
    public abstract int getHitPoints();

}

class Troll extends Monster{
    private int hitPoints = 40;
    String nameOfMonster = "Troll";

    public void takeDamage(int amount){
        amount = amount/2;
        hitPoints -= amount;

    }
    public String name(){
        return nameOfMonster;
    }
    public int getHitPoints(){
        return hitPoints;
    }


}

class Orc extends Monster{
    private int hitPoints = 20;
    private String nameOfMonster= "Orc";

    public String name(){
        return nameOfMonster;
    }
    public void takeDamage(int amount){
        hitPoints -= amount;
    }
    public int getHitPoints(){
        return hitPoints;
    }




}
public class Main {
    public static void main(String[] args) {
        Monster[] monsters = {
                new Orc(),
                new Troll(),
                new Orc()
        };


        for(int i=0; i<monsters.length; i++){
            monsters[i].takeDamage(10);
        }

        for(int j = 0; j<monsters.length; j++){
            System.out.println("Name: "+ monsters[j].name()+" Hit Points: "+monsters[j].getHitPoints());
        }

    }
}
