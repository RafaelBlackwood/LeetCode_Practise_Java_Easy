package Package1;
import Package2.*;

public class A {

    public static void main(String[] args){
        // TODO Auto-generated method stub


        C c= new C();
        //C c= new C(); // this class is not public
        //  System.out.println(c.defaultMessage); //default: visible to all classes in the same package
        System.out.println(c.publicMessage); //public: visible in all classes in all packages

        B b = new B();
        //System.out.println(b.privateMessage); //private: visible only in the same class

    }



   // protected String protectedMessage = "This is public message";

}
