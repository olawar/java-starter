package agh.mwo.java2_1;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App {

	public static void main(String[] args) {
		Workbook wb = new XSSFWorkbook();
		fillNewSheet(wb);
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream("workbook.xlsx");
			wb.write(fileOut);
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fillNewSheet(Workbook wb) {
		Sheet sheet = wb.createSheet("pierwszy");
		for (int i = 0; i < 10; i++) {
			Row row = sheet.createRow(i);
			row.createCell(0).setCellValue(i + 1);
		}
	}

}
