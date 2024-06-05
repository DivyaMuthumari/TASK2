package com.task2;

class Person {
    String name;
    int age=18; //initializing properties of the class person
    void Name() //method created
    {
        System.out.println("person's name is:"+name );
    }
    void Age() //method created
    {
        System.out.println("person's age :"+age);
    }
    public static void main(String[] args)
    {
        Person person1=new Person(); //object created person1
        person1.name="Rajeev"; //object initialization
        person1.Name();
        person1.Age(); //method is called
    }

}
