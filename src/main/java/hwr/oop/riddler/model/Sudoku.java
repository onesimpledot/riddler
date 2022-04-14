package hwr.oop.riddler.model;

import hwr.oop.riddler.model.component.Box;
import hwr.oop.riddler.model.component.Cell;
import hwr.oop.riddler.model.component.Column;
import hwr.oop.riddler.model.component.Row;

import java.util.ArrayList;

public class Sudoku {
    public Cell[][] cells = new Cell[9][9];
    public Row[] rows = new Row[9];
    public Column[] columns = new Column[9];
    public Box[] boxes = new Box[9];

    public Sudoku(int[][] input) {
        this.fillCells(input);
        this.interpretRows();
        this.interpretColumns();
        this.interpretBoxes();
    }

    private void fillCells(int[][] input) {
        for (int rowIndex = 0; rowIndex < input.length; rowIndex++) {
            int[] row = input[rowIndex];
            for (int columnIndex = 0; columnIndex < row.length; columnIndex++) {
                int cellValue = row[columnIndex];
                this.cells[rowIndex][columnIndex] = new Cell(cellValue);
            }
        }
    }

    private void interpretRows() {
        for (int rowIndex = 0; rowIndex < this.cells.length; rowIndex++) {
            this.rows[rowIndex] = new Row(cells[rowIndex]);
        }
    }

    private void interpretColumns() {
        for (int columnIndex = 0; columnIndex < this.cells[0].length; columnIndex++) {
            var column = new ArrayList<Cell>();
            for (Cell[] row : this.cells) {
                column.add(row[columnIndex]);
            }

            var columnArray = new Cell[column.size()];
            this.columns[columnIndex] = new Column(column.toArray(columnArray));
        }
    }

    private void interpretBoxes() {
        for (int boxIndex = 0; boxIndex < this.boxes.length; boxIndex++) {
            var box = new ArrayList<Cell>();
            int boxLattitude = boxIndex / 3;
            int boxLongitude = boxIndex % 3;

            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    box.add(cells[boxLattitude+x][boxLongitude+y]);
                }
            }

            var boxArray = new Cell[box.size()];
            this.boxes[boxIndex] = new Box(box.toArray(boxArray));
        }
    }
}
