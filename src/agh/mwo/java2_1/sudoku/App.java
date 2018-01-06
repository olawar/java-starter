package agh.mwo.java2_1.sudoku;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class App {

	public static void main(String[] args) {
		try {
			Workbook wb = WorkbookFactory.create(new File("sudoku.xlsx"));
			SudokuBoardChecker sudokuTest = new SudokuBoardChecker(wb);
			sudokuTest.verifyBoard(0);
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			e.printStackTrace();
		}

	}
}
