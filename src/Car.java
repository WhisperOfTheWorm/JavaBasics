public class Car {
    private int year;
    private String make;
    private int miles;
    private String model;

    public Car(int year, String make, String Model){
        this.year = year;
        this.make = make;
        this.model = model;
        this.miles = 0;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMake(String Make){
        this.make = make;
    }

    public void setModel(String Model){
        this.model = model;
    }

    public void setMiles(int miles){
        this.miles = miles;
    }

    public void drive(int miles) { this.miles += miles; }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public int getMiles(){
        return miles;
    }

    public String toString(){
        return
                "This car is a" +
                        this.getYear() + " " +
                        this.getMake() + " " +
                        this.getModel() + " with  " +
                        this.getMiles() + " miles ";
    }
}
