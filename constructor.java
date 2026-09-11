import java.lang.Character.Subset;
class s {
        String name; 
        int age;
        String ClassRomm;

        public s(String name1, int age1, String ClassRomm1){
            this.name = name1;
            this.age  = age1;
            this.ClassRomm = ClassRomm1;
        }
        public void getValue(){
            System.out.println("Name: "+ name);
            System.out.println("Age: "+ age);
            System.out.println("Class Room: "+ ClassRomm);
            System.out.println("---------------------------------------");
        }
    public static void main(String[] args){
        s s1 = new s("Sachin", 18,"A");
        s1.getValue();
        s s2 = new s("Kunal", 20,"B");
        s2.getValue();
        
    }
}
