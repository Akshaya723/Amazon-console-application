package AMAZON;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    int pass=456;
    int password;
    ArrayList<AmazonProd> products;
    ArrayList<AmazonSellers> sellers;
    ArrayList<AmazonCustomers> customers;
    Scanner sc=new Scanner(System.in);
    Admin(ArrayList<AmazonProd> products,ArrayList<AmazonSellers> sellers,ArrayList<AmazonCustomers> customers){
        this.products=products;
        this.sellers=sellers;
        this.customers=customers;
        System.out.println("Enter the password:");
        password=sc.nextInt();
    }
    void adminRole(){
        if(pass!=password){
            System.out.println("Invalid password!");
            return;
        }

        String str="yes";
        while(str.equals("yes")) {
            System.out.println("Choose the operation:\n1:View Sellers\n2:View Customers\n3:View Products\n4.Add Sellers\n5:Add customers");
            int op=sc.nextInt();
            switch (op) {
                case 1:
                    viewSellers();
                    break;
                case 2:
                    viewCustomers();
                    break;
                case 3:
                    viewProducts();
                    break;
                case 4:
                    addSellers();
                    break;
                case 5:
                    addCustomers();
                    break;
            }
            System.out.println("Do you want to continue?yes/no");
            str=sc.next();
        }
    }
    void addSellers(){
        System.out.println("Enter name:");
        String name=sc.next();
        System.out.println("Enter id");
        String id=sc.next();
        System.out.println("Enter mailid:");
        String mailid=sc.next();
        sellers.add(new AmazonSellers(name,id,mailid));
        System.out.println("Seller has been added!");
    }
    void viewSellers(){
        System.out.println("---------------SELLERS LIST---------------");
        for(AmazonSellers s:sellers){
            System.out.println("Name-"+s.getName()+" Id-"+s.getid()+" Mail id-"+s.getmailid());
        }
    }
    void addCustomers(){
        System.out.println("Enter name:");
        String name=sc.next();
        System.out.println("Enter contact");
        int cnt=sc.nextInt();
        System.out.println("Enter mailid:");
        String mailid=sc.next();
        customers.add(new AmazonCustomers(name,cnt,mailid));
        System.out.println("Customer has been added!");
    }
    void viewCustomers(){
        System.out.println("---------------CUSTOMERS LIST---------------");
        for(AmazonCustomers c:customers){
            System.out.println("Name-"+c.getName()+" Contact no.-"+c.getContact()+" Mail id-"+c.getmailid());
        }
    }
    void viewProducts(){
        System.out.println("---------------PRODUCTS LIST---------------");
        for(AmazonProd p:products){
            System.out.println("Id-"+p.getid()+" Name-"+p.getCat()+" Cost-"+p.getCost()+" Quantity-"+p.getQty());
        }
    }
}
