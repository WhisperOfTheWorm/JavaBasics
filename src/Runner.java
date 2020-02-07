public class Runner {
    public static void main(String[] args) {
        Car myCar = new Car(1981,"DeLorean Motor Company", "DeLorean" );
        myCar.drive(69420);
        System.out.println(myCar.toString());

        Rectangle myRec = new Rectangle(16,18);
        myRec.isSquare();
        System.out.println(myRec.toString());
    }
}
