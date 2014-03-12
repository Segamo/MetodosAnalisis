package Main;

import Metodos.IncrementalSearch;

public class Main {

    public static void main(String args[]){

        IncrementalSearch ic = new IncrementalSearch();
        ic.incrementalSearch(1,1,30);
        System.out.println(ic.resultText);
    }

}
