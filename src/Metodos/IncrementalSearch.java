package Metodos;

import Otros.Function;

public class IncrementalSearch {

    Function f = new Function();
    
    public String resultText;

    public IncrementalSearch() {
        this.resultText = "";
    }

    public void incrementalSearch(double x0, double deltaX, int iterations){

        double y0 = f.evaluate(x0);
        if (y0 == 0) {
            resultText = "Root is x = " + x0;
            return;
        } else {
            int cont = 0;
            while (cont < iterations) {
                double x1 = x0 + deltaX;
                double y1 = f.evaluate(x1);
                if (y0 * y1 < 0) {
                    resultText = ("The root is in the interval [" + x0 + ", " + x1 + "]");
                    return;
                }
                if (y1 == 0) {
                    resultText = ("The root is x = " + x1);
                    return;
                }
                x0 = x1;
                y0 = y1;
                cont = cont + 1;
            }
            resultText = ("Failed in " + iterations + " iterations");
        }
    }
}
