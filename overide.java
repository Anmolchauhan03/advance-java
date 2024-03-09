public class overide{
       
       public void fun()
       {
        System.out.println("In the parent class");
       }
       public static void sfun(){
        System.out.println("in the parent sfun");
       }
}
 class B extends overide{
     public void fun(){
        System.out.println("in the child class");
     }
     public static void sfun(){
        System.out.println("in the child class sfun");
     }
 }

 class main{
    public static void main(String[] args) {
        B obj1=new B();
       obj1.fun();
       obj1.sfun();

       overide obj2=new overide();
       obj2.fun();
       obj2.sfun();

       overide obj3=new B();
       obj3.fun();
       obj3.sfun();

    }
 }