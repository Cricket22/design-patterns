package adapter.models;

import java.util.List;

public class Rectangle extends Figure {

    public Rectangle(Float height, Float width) {
        super(List.of(height, width));
    }

    @Override
    public Float getArea() {
        return this.sides.get(0) * this.sides.get(1);
    }

    @Override
    public Float getPerimeter() {
        return 2 * (this.sides.get(0) + this.sides.get(1));
    }

    @Override
    public Figure swapFigure() {
        return new Triangle(5f,5f,5f);
    }

    @Override
    public void whoAmI() {
        System.out.println("\nI am a rectangle.");
    }

}
