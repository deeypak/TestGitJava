package com.oops.inheritance;

public class Aclass extends Object{ // super class


    public void test(){
        System.out.println("test method");
    }

    public static void main(String[] args) {
        Aclass a = new Aclass();
        a.test();
    }

}

class Zclass {

    void test3(){
        System.out.println("test 3 mthoed");
    }
}

 class Bclass extends Aclass{  // sub class


    void test1(){
        System.out.println("test 1 method");
    }
}

class Cclass extends Bclass{


}
