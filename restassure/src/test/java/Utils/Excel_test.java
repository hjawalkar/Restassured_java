package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_test {
	static XSSFWorkbook workbook;
	static XSSFSheet st;

	public Excel_test(String excelpa, String sheetn) {
		try {

			workbook = new XSSFWorkbook(excelpa);
			st = workbook.getSheet(sheetn);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
	}

	
	public static void get_Celldata(int rown, int coln) {

 		DataFormatter df = new DataFormatter();
		Object val= df.formatCellValue(st.getRow(rown).getCell(coln));
		System.out.println("First row value:" +val);


	}


	public static void get_Rowcount()  {


		int rowcount = st.getPhysicalNumberOfRows();
		System.out.println("Number of Rows:" +rowcount);


	}
}
