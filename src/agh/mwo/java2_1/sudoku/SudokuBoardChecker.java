package agh.mwo.java2_1.sudoku;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class SudokuBoardChecker {

	private Workbook workbook;

	public SudokuBoardChecker(Workbook workbook) {
		this.workbook = workbook;
	}

	public Workbook getWorkbook() {
		return workbook;
	}

	public void setWorkbook(Workbook workbook) {
		this.workbook = workbook;
	}

	public boolean verifyBoardStructure(int sheetIndex) {
		Sheet sheet = workbook.getSheetAt(sheetIndex);

		for (int i = 0; i < 9; i++) {
			Row row = sheet.getRow(i);
			if (row == null) {
				System.out.println("Empty row, cannot continue");
				return false;
			}

			for (int j = 0; j < 9; j++) {
				Cell cell = row.getCell(j);
				if (cell == null) {
					System.out.println("Wrong cell value at sheet " + sheetIndex + "position: " + i + ", " + j );
					return false;
				}
				CellType cellType = cell.getCellTypeEnum();
				double value = 0.0;
				switch (cellType) {
				case BLANK:
					break;
				case BOOLEAN:
					return false;
				case STRING:
					return false;
				case NUMERIC:
					value = cell.getNumericCellValue();
					if (value > 10.0 || value < 0.0 || value != (int) value) {
						return false;
					}
					break;
				case FORMULA:
					return false;
				case ERROR:
					return false;
				default:
					break;
				}

				System.out.println("Row: " + i + " Cell: " + j + " Value: " + value);
			}
		}
		System.out.println("Poprawne wartosci!");
		return true;
	}

	public boolean verifyBoard(int sheetIndex) {

		if (verifyBoardStructure(sheetIndex)) {
			Sheet sheet = workbook.getSheetAt(sheetIndex);

			for (int i = 0; i < 9; i++) {
				Row row = sheet.getRow(i);

				for (int j = 0; j < 9; j++) {
					Cell cell = row.getCell(j);
					CellType cellType = cell.getCellTypeEnum();
					double value = 0.0;
					switch (cellType) {
					case BLANK:
						break;
					case NUMERIC:
						value = cell.getNumericCellValue();
					case BOOLEAN:
						break;
					case ERROR:
						break;
					case FORMULA:
						break;
					case STRING:
						break;
					case _NONE:
						break;
					default:
						break;
					}
					//
					// System.out.println("Row: " + i + " Cell: " + j + " Value: " + value);
				}
			}

			System.out.println("Poprawna plansza!");
			return true;
		}
		System.out.println("Zle wartosci!");
		return false;

	}

}
