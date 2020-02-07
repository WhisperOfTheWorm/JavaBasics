public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length ; }
    public double getWidth() { return width ; }

    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }

    public double getArea() { return this.length * this.width; }
    public double getDiagonal() { return Math.sqrt((length * length)+(width * width)); }
    public boolean isSquare() { if(width == length){ return true; } else return false; }

    public String toString(){
        return
                "This Rectangle has a length of " +
                        this.getLength() + " and a width of " +
                        this.getWidth() + " and an area of " +
                        this.getArea() + " and a diagonal of " +
                        this.getDiagonal() + " Is it a square? " +
                        this.isSquare();
    }

}
