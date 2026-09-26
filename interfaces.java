interface Animal2{

      void sound();

      default void bark(){
        System.out.println("The dog is barking..");
      }
}
class hourse implements Animal2{
   public void sound(){
        System.out.println("Sachin P Rathod");
    }
}
public class interfaces {
    public static void main(String[] args){

        Animal2 a = new hourse();
        a.sound();
    }
}
