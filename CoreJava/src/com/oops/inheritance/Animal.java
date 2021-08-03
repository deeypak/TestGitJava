package com.oops.inheritance;

public class Animal {

    public void eat() {
        System.out.println("animal eat");
    }

    public void sound() {
        System.out.println("animal sound");
    }

}

class Lion extends Animal {

    public void eat(int i) { //defined
        System.out.println("lion eat with arugment");
    }

    public void sound() {
        System.out.println("lion sound");
    }

}

class Elephant extends Animal {

    Tusk tusk;

    public void sound() {
        System.out.println("elephant sound");
    }

}

class Tusk {
    int noOfTusk = 2;
}

class TestMain {

    public static void main(String[] args) {
        Animal l = new Lion();
        l.eat(); // inherited method
        l.sound();
     //   l.eat(10);
        System.out.println("-----------------");

        Elephant e = new Elephant();
        e.eat();
        e.sound();
        e.tusk = new Tusk();
        System.out.println(e.tusk.noOfTusk);

    }
}



