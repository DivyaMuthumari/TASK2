package com.task2;
import java.util.Scanner;

public class Product {
    int pid;
    double price;
    int quantity;

    public Product(int a,double b,int c)//parameterized constructor
    {
        pid=a;
        price=b;
        quantity=c;
    }

}


 class XYZ { //new class created

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        Product[] myProducts=new Product[5]; //product array created to have 5 product info
        for(int i=0;i<5;i++)  //for loop used to get user input 5 times
        {
            System.out.println("Please enter id,quantity, price of the item:");
            int id=Scanner.nextInt();
            int qty=Scanner.nextInt();
            int prc=Scanner.nextInt();
            myProducts[i]=new Product(id, qty, prc); //individual product object created with parameterized constructor
        }

        double newprc=myProducts[0].price;
        int newpid=myProducts[0].pid;

        for(int i=0;i<myProducts.length;i++)
        {
            if(myProducts[i].price>newprc) //condition to check highest price
            {
                newpid=myProducts[i].pid;
            }
        }
        System.out.println("Highest Price pid: "+newpid);
        XYZ myclass=new XYZ();
        double total=myclass.totalAmount(myProducts);
        System.out.println("Total Amount: "+total);
        }


        public double totalAmount(Product[] myProduct)
        {
            double totalPrice=0;
            for(int i=0;i<myProduct.length;i++)
            {
                totalPrice=totalPrice+(myProduct[i].quantity*myProduct[i].price);//calculating total amount
            }
            return totalPrice;
        }


        }




