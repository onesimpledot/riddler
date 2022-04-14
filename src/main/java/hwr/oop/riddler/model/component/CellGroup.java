package hwr.oop.riddler.model.component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class CellGroup {
    protected Set<Cell> cells = new HashSet<>();

    protected CellGroup(Cell[] cells) {
        this.cells.addAll(List.of(cells));
    }

    public void whittleDownPossibles(){

    }
}
