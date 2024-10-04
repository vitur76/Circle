//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Circle circ = new Circle(10);
        circ.showArea();
    }
}

class Circle {

    double pi = 3.14;
    double radius;
    double area;

    Circle(double radius)
    {
        this.radius = radius;
    }

    double calculateArea()
    {
        return pi * radius * radius;
    }

    void showArea()
    {
        System.out.printf("Circle area: " +  calculateArea());
    }
}