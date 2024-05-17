package adapter.models;

import java.util.List;

public class Triangle extends Figure {
    public Triangle(Float base, Float height, Float hypotenuse) {
        super(List.of(base, height, hypotenuse));
    }

    @Override
    public Float getArea() {
        return ( this.sides.get(0) * this.sides.get(1) ) / 2;
    }

    @Override
    public Float getPerimeter() {
        return this.sides.get(0) + this.sides.get(1) + this.sides.get(2);
    }

    @Override
    public Figure swapFigure() {
        return new Rectangle(10f, 10f);
    }

    @Override
    public void whoAmI() {
        System.out.println("\nI am a triangle.");
    }
}
