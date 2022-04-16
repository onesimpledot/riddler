package hwr.oop.riddler.model.component;

import java.util.HashSet;
import java.util.Set;

public class Cell {
    public int value;
    public Set<Integer> possibles;
    
    public Cell(int value) {
        this.value = value;
        if (value == 0) {
            possibles = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        }
    }
}
