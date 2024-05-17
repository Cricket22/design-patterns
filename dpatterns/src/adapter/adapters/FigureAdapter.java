package adapter.adapters;

import adapter.models.Figure;
import adapter.models.FigureInterface;

public class FigureAdapter implements FigureInterface {
    private Figure figure;

    public FigureAdapter(Figure figure){
        this.figure = figure;
    }

    @Override
    public Float getArea() {
        return this.figure.getArea();
    }

    @Override
    public Float getPerimeter() {
        return this.figure.getPerimeter();
    }

    @Override
    public Figure swapFigure() {
        System.out.println("\nSwapping figures...");
        this.figure = this.figure.swapFigure();
        this.whoAmI();
        return this.figure;
    }

    @Override
    public void whoAmI() {
        this.figure.whoAmI();
    }
}
