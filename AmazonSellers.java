package AMAZON;



public class AmazonSellers {
    String name,id,mailid;
    AmazonSellers(String name,String id,String mailid){
        this.name=name;
        this.id=id;
        this.mailid=mailid;
    }
    String getName(){
        return name;
    }
    String getid(){
        return id;
    }
    String getmailid(){
        return mailid;
    }
}
