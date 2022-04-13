package hwr.oop.riddler.model.component;

import java.util.ArrayList;
import java.util.Arrays;

public class Cell {
    public int value;
    public ArrayList<Integer> possibles = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    
    Cell(int _value) {
        value = _value;
    }
}
