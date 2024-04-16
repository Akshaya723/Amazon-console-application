package AMAZON;
import java.util.*;
public class Amazon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME!!!");
        System.out.println("Choose your user login:");
        System.out.println("1->Customer\n2->Seller\n3->Admin");
        int user=sc.nextInt();

        ArrayList<AmazonProd> products=new ArrayList<>();
        ArrayList<AmazonSellers> sellers=new ArrayList<>();
        ArrayList<AmazonCustomers> customers=new ArrayList<>();
        products.add(new AmazonProd(1,"bottle",50,2));

        switch(user){
            case 1:
                Customer customer=new Customer(products);
                customer.customerRole();
                break;
            case 2:
                Seller seller=new Seller(products);
                seller.sellerRole();
                break;
            case 3:
                Admin admin=new Admin(products,sellers,customers);
                admin.adminRole();
                break;
            default:
                System.out.println("Invalid user login!");
        }
        System.out.println("Thank you! Have a nice day!");
    }
}
