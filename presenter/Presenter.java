package Home_Work6.presenter;

import Home_Work6.model.ComplexCalculator;
import Home_Work6.model.RatioCalculator;
import Home_Work6.model.SetDigits;
import Home_Work6.view.View;

public class Presenter {
    View view;
    SetDigits calc;

    public Presenter(Home_Work6.view.View v, SetDigits s) {
        view = v;
        calc = s;
    }

    public void buttonClick(){
        int operation = view.choiseCase("С какими числами хотите выполнить операцию:\n" +
                "1 - комплексные\n" +
                "2 - рациональные\n");
        switch (operation) {
            case 1 -> buttonClickComplex();
            case 2 -> buttonClickRatio();
        }
    }

    public void buttonClickComplex(){
        calc = new ComplexCalculator();
        calc.setY(view.setValue("y: "));
        calc.setX(view.setValue("x: "));
        calc.setA(view.setValue("a (мнимая часть числа x): "));
        calc.setB(view.setValue("b (мнимая часть числа y): "));
        int operation = view.choiseCase("Введите операцию:\n" +
                                        "1 - sum\n" +
                                        "2 - mult\n" +
                                        "3 - divide\n" +
                                        "4 - difference\n");
        switch (operation) {
            case 1 -> view.print(((ComplexCalculator) calc).sum(), "sum result: ");
            case 2 -> view.print(((ComplexCalculator) calc).mult(), "mult result: ");
            case 3 -> view.print(((ComplexCalculator) calc).divide(), "divide result: ");
            case 4 -> view.print(((ComplexCalculator) calc).difFerence(), "difference result: ");
        }
    }

    public void buttonClickRatio(){
        calc = new RatioCalculator();
        calc.setX(view.setValue("x: "));
        calc.setY(view.setValue("y: "));
        int operation = view.choiseCase("Введите операцию:\n" +
                                        "1 - sum\n" +
                                        "2 - mult\n" +
                                        "3 - divide\n" +
                                        "4 - difference");
        switch (operation) {
            case 1 -> view.print(((RatioCalculator) calc).sum(), "sum result: ");
            case 2 -> view.print(((RatioCalculator) calc).mult(), "mult result: ");
            case 3 -> view.print(((RatioCalculator) calc).divide(), "divide result: ");
            case 4 -> view.print(((RatioCalculator) calc).difFerence(), "difference result: ");
        }
    }

}
