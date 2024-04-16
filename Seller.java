package AMAZON;

import java.util.ArrayList;
import java.util.Scanner;

public class Seller {
    int pass=123;
    int password;
    ArrayList<AmazonProd> products;
    Scanner sc=new Scanner(System.in);

    Seller(ArrayList<AmazonProd> products){
        this.products=products;
        System.out.println("Enter the password:");
        password=sc.nextInt();
    }
    void sellerRole(){
        if(pass!=password){
            System.out.println("Invalid password!");
            return;
        }

        String str="yes";
        while(str.equals("yes")) {
            System.out.println("Choose the operation:\n1:Add products\n2:View products");
            int op=sc.nextInt();
            switch (op) {
                case 1:
                    addProducts();
                    break;
                case 2:
                    viewProducts();
                    break;
            }
            System.out.println("Do you want to continue?yes/no");
            str=sc.next();
        }
    }
    void addProducts(){
        System.out.println("Enter product id:");
        int id=sc.nextInt();
        System.out.println("Enter product category:");
        String cat=sc.next();
        System.out.println("Enter price:");
        double cost=sc.nextDouble();
        System.out.println("Enter quantity:");
        int q=sc.nextInt();
        products.add(new AmazonProd(id,cat,cost,q));
        System.out.println("Product has been added!");
    }
    void viewProducts(){
        System.out.println("---------------PRODUCTS LIST---------------");
        for(AmazonProd p:products){
            System.out.println("Id-"+p.getid()+" Name-"+p.getCat()+" Cost-"+p.getCost()+" Quantity-"+p.getQty());
        }
    }

}
