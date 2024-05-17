package adapter;

import adapter.adapters.FigureAdapter;
import adapter.models.Figure;
import adapter.models.Rectangle;
import builder.builders.OrderFormBuilder;
import builder.builders.SignInFormBuilder;
import builder.models.OrderForm;
import builder.models.SignInForm;

public class AdapterPattern {

    public void example1(){
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
