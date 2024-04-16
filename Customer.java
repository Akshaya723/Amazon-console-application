package AMAZON;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    int pass=789;
    int password;
    Scanner sc=new Scanner(System.in);
    ArrayList<AmazonProd> products;
    ArrayList<String> cart=new ArrayList<>();
    Customer(ArrayList<AmazonProd> products){
        this.products=products;
        System.out.println("Enter the password:");
        password=sc.nextInt();
    }
    void customerRole(){
        if(pass!=password){
            System.out.println("Invalid password!");
            return;
        }

        String str="yes";
        while(str.equals("yes")) {
            System.out.println("Choose the operation:");
            System.out.println("1:Place Order\n2:View cart");
            int op = sc.nextInt();
            switch(op){
                case 1:
                    placeOrder();
                    break;
                case 2:
                    viewCart();
                    break;
            }
            System.out.println("Do you want to continue?yes/no");
            str=sc.next();
        }
    }

    void placeOrder(){
        System.out.println("Enter product id:");
        int prod_id=sc.nextInt();
        System.out.println("Enter quantity:");
        int qty=sc.nextInt();
        for(AmazonProd p:products){
            if(p.getid()==prod_id && p.getQty()>=qty){
                System.out.println("Your order has been placed!");
                int Q=p.getQty()-qty;
                p.setQty(Q);
                cart.add("Name-"+p.getCat()+" Cost-"+p.getCost()+" Quantity:"+qty);
                return;
            }
            else{
                System.out.println("Your requisition of product is invalid!");
            }
        }
    }
    void viewCart(){
        System.out.println("---------------CART PRODUCTS---------------");
        for(String c:cart){
            System.out.println(c);
        }
    }
}
