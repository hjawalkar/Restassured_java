package Utils;

public class Excel_Utiltest {
	public static void main(String[] args) { 
		
		String excelpa = "./data/test.xlsx";
		String sheetn = "Sheet1";
		Excel_test et = new Excel_test(excelpa, sheetn);
		et.get_Rowcount();
		et.get_Celldata(1, 0);
		et.get_Celldata(1, 1);
		et.get_Celldata(1, 2);
		
	}

}
