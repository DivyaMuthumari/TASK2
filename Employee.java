package com.task2;
 class Employee extends Person //Subclass created
        {
    int employeeid=2905;
    double salary=2000;
    public Employee() {
        super();
    }
    public static void main(String[] args){
        Person person1=new Person(); //object created person1
        person1.name="Rajeev"; //object initialization
        person1.Name();
        person1.Age();
        Employee emp = new Employee();
        System.out.println("employee id:"+emp.employeeid);
        System.out.println("employee salary:"+emp.salary);


    }

}



