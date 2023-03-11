package Home_Work6;

import Home_Work6.model.SetDigits;
import Home_Work6.presenter.Presenter;
import Home_Work6.view.View;

public class Main {
    public static void main(String[] args) {

        Presenter pr = new Presenter(new View(), new SetDigits());
        pr.buttonClick();
    }
}
