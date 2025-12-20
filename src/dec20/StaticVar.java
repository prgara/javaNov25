package dec20;

public class StaticVar {

   static  int count =10;

    StaticVar(){
        System.out.println(count);
        count++;
    }

    public static void main(String[] args) {
   StaticVar var =  new StaticVar(); // 10++
     new StaticVar();
     new StaticVar();
     new StaticVar();
    }
    //10-11-12 ->
    //10-10-10 ->




}
