package hwr.oop.riddler.io;

import java.io.*;

public class FileConverter {
    public int[][] parseInputFile(String filePath) {
        try (var bufferedReader = new BufferedReader(new FileReader(filePath))){
            var sudoku = new int[9][9];
            int rowIndex = 0;
            for (String line; (line = bufferedReader.readLine()) != null; rowIndex++) {
                line = line.replaceAll(" ", "");
                for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                    char field = line.charAt(columnIndex);
                    if(field == '_') {
                        sudoku[rowIndex][columnIndex] = 0;
                    } else {
                        sudoku[rowIndex][columnIndex] = Character.getNumericValue(field);
                    }
                }
            }
            return sudoku;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
