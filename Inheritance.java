 class animal{
        String colors = "Blue";
            int age= 22;
        public void dog(){
            System.out.println("Dog is bark loudly..");
        }
        public void color(){
            System.out.println("The dog color is the red..");
        }
        public void color1(){
            System.out.println("The dog color is "+colors);
        }
    }

    class dog extends animal{
           public void color(){
             System.out.println("The dog color is "+colors);
         }
        public void color1(){
            System.out.println("The dog color is "+colors);
        }
    }
    public class Inheritance {
    public static void main(String[] args) {
        animal a2 = new dog();  //
        dog a1 = new dog();
        animal d = new animal();
        a2.color();

    }
}
