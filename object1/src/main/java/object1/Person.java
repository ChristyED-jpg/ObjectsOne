package object1;

class Person {
    String name;
    int age  = 0;
    int height = 0; // units centimeters

    // Constructor
    public Person(String name, int age, int height ) {
        this.name = name;
        this.age = age;
        this.height = height;
    }  // Declare and initialize an object

    public int getHeight() {
         return height;

    }
}

