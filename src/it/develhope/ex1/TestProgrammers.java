package it.develhope.ex1;


public class TestProgrammers {

    public static void main(String[] args) {


        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();

        programmer1.name = "Jason Di Bartolo";
        programmer1.age = 24;
        programmer1.wearsGlasses = true;

        programmer2.name = "Mario Rossi";
        programmer2.age = 27;
        programmer2.wearsGlasses = false;

        programmer1.drinkCoffe();
        programmer1.printDetails();

        programmer2.printDetails();
        programmer2.hasGlasses();

    }
}