class Shapes{
    String color;

    Shapes(String color){
        this.color=color;
    }

    void displayInfo(){
        System.out.println("color="+" "+color);
    }
}

class twoDShapes extends Shapes{
    twoDShapes(String color){
        super(color);
    }

    void displayArea(double area){
        System.out.println("the area is="+" "+area);
        displayInfo();
    }
}

class Circle extends twoDShapes{
    int radius;
    
    Circle(int radius,String color){
        super(color);
        this.radius=radius;
    }

    void calculateArea(){
        double area= 3.14*radius*radius;
        displayArea(area);
    }

}

public class multilevelInheritance_2{
    public static void main(String[] args){
        Circle obj = new Circle(2,"blue");
        obj.calculateArea();
    }
}

