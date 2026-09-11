                                       
                                       //Achieve the abstraction using the abstract class
//  abstract class Animal{
//        abstract void dog();
//        abstract void lion();
//        void tiger(){
//         System.out.println("Tiger is the king..");
//        }
//  }
// class Dog extends Animal{
//     @Override
//     public void dog(){
//         System.out.println();
//     }
//     public void lion(){
//         System.out.println("Lion is the very high energetic powerfull animal..");
//     }
// }
//     public class abstrations {
 
//     public static void main(String[] args) {
//         Animal s1 = new Dog();
//         s1.dog();
//     }
// }

                     //Acieve the abstraction using the interface

interface Animal{
       abstract void dog();
       abstract void lion();
      default void tiger(){
        System.out.println("Tiger is the king..");
       }
 }
class Dog implements Animal{
    @Override
    public void dog(){
        System.out.println();
    }
    public void lion(){
        System.out.println("Lion is the very high energetic powerfull animal..");
    }
}
    public class abstrations {
 
    public static void main(String[] args) {
        Animal s1 = new Dog();
       // Animal s2 = new Animal();
        Dog s3 = new Dog();
        s1.dog();
    }
}

