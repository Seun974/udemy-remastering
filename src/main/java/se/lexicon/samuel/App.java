package se.lexicon.samuel;


import com.sun.xml.internal.bind.v2.runtime.SwaRefAdapter;

public class App
{
    public static void main( String[] args ) {
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real = " + number.getReal());
        System.out.println("number.imaginary = " + number.getImaginary());


    }
}














//app data for carpet cost challenge
//    Floor floor = new Floor(20, 10);
//    Carpet carpet = new Carpet(1000);
//    Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total cost = " + calculator.getTotalCost());
//


//App data for point challenge
//    Point first = new Point(6,5);
//    Point second = new Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance());
//                System.out.println("distance(second)= " + first.distance(second));
//                System.out.println("distance(2,2)= " + first.distance(2,2));
//                Point point = new Point();
//                System.out.println("distance()= " + point.distance());
//



//        Wall wall = new Wall(5, 4);
//       System.out.println(wall.getArea());
//        wall.setHeight(-1.5);
//        System.out.println(wall.getWidth());
//        System.out.println(wall.getHeight());
//        System.out.println(wall.getArea());

//        Wall wall1 = new Wall(-1.25, -1.25);
//        System.out.println(wall1.getHeight());
//        System.out.println(wall1.getWidth());
//
//        System.out.println(wall1.getArea());

//        Account account = new Account("230186",10.0,"Samuel", "samuel@gmail.com", "072-996");
//
//        System.out.println(account.getBalance());
//        account.depositFunds(100);
//        account.depositFunds(2000);
//        account.withdrawFunds(100);
//        account.withdrawFunds(3000);
//        account.depositFunds(1500);
//        account.withdrawFunds(1000);

//        VipCustomer vipCustomer = new VipCustomer();
//        System.out.println(vipCustomer.getName());
//
//        VipCustomer vipCustomer1 = new VipCustomer("Bob", 25000.00);
//        System.out.println(vipCustomer1.getName());
//
//        VipCustomer vipCustomer2 = new VipCustomer("tim", 100.00, "tim@email.com");
//        System.out.println(vipCustomer2.getName());
