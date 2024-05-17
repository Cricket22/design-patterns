package adapter.models;

import java.util.List;

public abstract class Figure implements FigureInterface {
    protected Integer numberSides;
    protected List<Float> sides;

    public Figure(List<Float> sides) {
        this.numberSides = sides.size();
        this.sides = sides;
    }

    public abstract Float getArea();
    public abstract Float getPerimeter();
    public abstract Figure swapFigure();
    public abstract void whoAmI();

}
