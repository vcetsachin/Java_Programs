 class Birds{

    public void sound(){
        System.out.println("The sparrow sound very slowely..");
    }

    public void crow(){
        System.out.println("Crow is the cleaver bird.");
    }
}

class Peacock extends Birds{
    @Override
    public void sound() {
        System.out.println("Peacock sound is very beautifull and shoothing..");
    }
}

public class MethodOverriding {
    public static void main(String[] args){
        Birds b1 = new Peacock();
        b1.sound();
        Birds b2 = new Birds();
        b2.sound();
    }
}
