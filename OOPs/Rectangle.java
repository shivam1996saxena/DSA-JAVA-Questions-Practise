package OOPs;

class Rectangle {
    double width;
    double length;

     Rectangle(double length, double width) {
        this.length = length;
        if (this.length < 0){
            this.length = 0;
        }
        this.width = width;
        if (this.width < 0){
            this.width = 0;
        }
    }

    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getArea(){
         return width*length;
    }
}
class Cuboid extends Rectangle{
    double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
        if (this.height < 0){
            this.height = 0;
        }

    }
    public double getHeight() {
        return height;
    }
    public double getVolume(){
       return getArea()*height;
    }
}
