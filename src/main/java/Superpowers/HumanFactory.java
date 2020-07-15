package Superpowers;

import Superpowers.SuperHuman.Affiliation;

public class HumanFactory {


    public static void main (String args[]){

        SuperHuman SHuman1 = new SuperHuman("SpiderMan", Affiliation.LAWFUL_GOOD, "Spidey powers");
        SuperHuman SHuman2 = new SuperHuman("Thanos", Affiliation.TRUE_NEUTRAL, "Thanos snap");
        SuperHuman SHuman3 = new SuperHuman("Joker", Affiliation.CHAOTIC_EVIL, "Gun");


        SHuman1.setGender("male");
        SHuman2.usePower();
        SHuman3.setAge(25);

        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();

        human1.setAge(24);
        human2.setGender("Male");
        human3.setOccupation("Psychic");

        human1.catchPhrase();
    }
    
}