public class Runner {
    public static void main(String[] args) {
        Car westy=new Car(2002,"VW",120000,"Westy");
        System.out.println(westy.toString());
        westy.setMiles(20000);
        System.out.println(westy.toString());

        Rectangle a=new Rectangle(10,10);
        System.out.println(a.toString());
        a.setLength(15);
        System.out.println(a.toString());
    }
}
