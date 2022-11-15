package OOPs;

class Circle {
        private double radius;
        public Circle(double radius){
            if(radius < 0)
                this.radius=0;
            else
                this.radius=radius;
        }
        public double getRadius()
        {
            return this.radius;
        }
        public double getArea(){
            return Math.PI*this.radius*this.radius;
        }
    }

    class Cylinder extends Circle{
        private double height;
        public Cylinder(double radius,double height){
            super(radius);
            if(height < 0)
                this.height=0;
            else
                this.height=height;
        }
        public double getHeight(){
            return this.height;
        }
        public double getVolume(){
            return super.getArea()*this.height;
        }

    }
