package jan24;


public class Container<A,R> {


    A item1;
    R item2;



    public Container(A item1, R item2) {
        this.item1 = item1;
        this.item2 = item2;
    }





    void printItems(){
        System.out.println(item1);
        System.out.println(item2);
    }
}
