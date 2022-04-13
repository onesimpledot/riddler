package hwr.oop.riddler;

import hwr.oop.riddler.io.SudokuConverter;
import hwr.oop.riddler.model.Sudoku;

import java.io.File;

public class Riddler {
    public static void main(String[] args) throws IllegalArgumentException {
        var converter = new SudokuConverter();

        if (args.length != 1) {
            throw new IllegalArgumentException("USAGE: java Riddler [filepath]");
        }
        String filepath = args[args.length-1];

        //var sudoku = new Sudoku(converter.parseInputFile(filepath));
    }
}
