public class MethodOverloading {


    // 1 parameter
    void add(int a) {
        System.out.println(a);
    }

    // 2 parameters
    void add(int a, int b) {
        System.out.println(a + b);
    }

    // 3 parameters
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {

        MethodOverloading c = new MethodOverloading();

        c.add(10);          // calls add(int)
        c.add(10, 20);      // calls add(int, int)
        c.add(10, 20, 30); // calls add(int, int, int)
    }
}

