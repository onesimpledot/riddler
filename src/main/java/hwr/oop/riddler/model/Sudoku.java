package hwr.oop.riddler.model;

import hwr.oop.riddler.model.component.Box;
import hwr.oop.riddler.model.component.Column;
import hwr.oop.riddler.model.component.Row;

public class Sudoku {
    public Row[] rows = new Row[9];
    public Column[] columns = new Column[9];
    public Box[] box = new Box[9];

    public Sudoku(int[][] input) {
    }
}
