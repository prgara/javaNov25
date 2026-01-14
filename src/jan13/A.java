package jan13;

public class A {

    int x = 100;

    A(){
        System.out.println("In class A");
    }

    A(int a){
        System.out.println(a);
    }


}

class B extends A {

    int x = 10;



   void show(){
       System.out.println(x);
       System.out.println(super.x);
   }

}

class Main{

    static void main() {
     B b = new B();
     b.show();
    }
}
