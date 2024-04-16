package AMAZON;

public class AmazonCustomers {
    String name;
    int cnt;
    String mailid;
    AmazonCustomers(String name,int cnt,String mailid){
        this.name=name;
        this.cnt=cnt;
        this.mailid=mailid;
    }
    String getName(){
        return name;
    }
    int getContact(){
        return cnt;
    }
    String getmailid(){
        return mailid;
    }
}
