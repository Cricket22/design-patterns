package adapter;

import adapter.adapters.FigureAdapter;
import adapter.models.Rectangle;

public class AdapterPattern {

    public AdapterPattern() {
        System.out.println("\n\n*** Adapter pattern. ***");
    }

    public void example1(){
        System.out.println("\n* Example 1. *");

        Rectangle rectangle = new Rectangle(5f,5f);
        FigureAdapter figureAdapter = new FigureAdapter(rectangle);
        figureAdapter.whoAmI();
        System.out.println("Area: " + figureAdapter.getArea());
        System.out.println("Perimeter: " + figureAdapter.getPerimeter());

        figureAdapter.swapFigure();
        System.out.println("Area: " + figureAdapter.getArea());
        System.out.println("Perimeter: " + figureAdapter.getPerimeter());
    }
}
