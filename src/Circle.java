public class Circle {
    private double radius = 1.0;
    private String color = "red";

     Circle(){
     }
     Circle(double radius){
         this.radius = radius;
         this.color= "red";
     }

     public  double setRadius(double radius){
         this.radius = radius;
         return radius;
     }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI*(radius*radius);
    }
}
