package com.company;

public class Main {

    public static void main(String[] args) {
        public class Animal {
            protected String name;
            private int legs;
            private String sound;

            public Animal(String name, int legs, String sound) {
                this.name = name;
                this.legs = legs;
                this.sound = sound;
            }

            public void say(String words) {
                System.out.println(name + " says " + sound);
            }
        }


        public class Cow extends Animal {
            public Cow(String name) {
                super(name, 4, "moo!");
            }

            public double milk() {
                double yield = Math.random() * 20 + 20;
                System.out.println(name + " gives " + yield + " litres of milk");
                return yield;
            }
        }


        public class Dog extends Animal {
            private String carrying;

            public Dog(String name) {
                super(name, 4, "Woof!");
                carrying = "";
            }
        public class StBernard extends Dog {
                public void rescue (String name){
                    super.fetch(name);
                    System.out.println(getName()+" gives some brandy to "  + name);

                }
        }
            public void fetch(String thing) {
                if (carrying.equals("")) {
                    System.out.println(name + " runs off and grabs " + thing);
                    carrying = thing;
                } else {
                    System.out.println(name + " is already carrying " + carrying);
                }
            }

            public String drop() {
                if (carrying != "") {
                    System.out.println(name + " gives you " + carrying);
                    String temp = carrying;
                    carrying = "";
                    return temp;
                } else {
                    System.out.println(name + " isn't carrying anything!");
                    return "";
                }
            }
        }


        class Main {
            public static void main(String[] args) {
                System.out.println("Animal crackers");
                Cow daisy = new Cow("Daisy");
                daisy.milk();
                daisy.say("hello");

                Dog spot = new Dog("Spot");
                spot.say("hello");
                spot.fetch("stick");
                spot.fetch("banana");
                spot.drop();
                spot.drop();
            }

        }

    }
}
