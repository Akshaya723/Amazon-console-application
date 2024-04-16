package AMAZON;

public class AmazonProd {
    int id,q;
    double cost;
    String cat;

    AmazonProd(int id,String cat,double cost,int q){
        this.id=id;
        this.cat=cat;
        this.cost=cost;
        this.q=q;
    }
    int getid(){
        return id;
    }
    String getCat(){
        return cat;
    }
    double getCost(){
        return cost;
    }
    int getQty(){
        return q;
    }
    void setQty(int Q){
        this.q=Q;
    }
}
