package practiceprograms;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;

import utils.XLUtils;

public class excelData {

	public static void main(String[] args) throws IOException {

		String sheetname = "API_Rest_TD";
		String name = "Jayesh";

		String TestCaseID = "TCAPI001";
		String id = "123456";
		String file = "D:\\excel\\comparingdata.xlsx";

		String newname = "YashMant";

		int rows = XLUtils.getRowCount(file, sheetname);

		int col = XLUtils.getColumnCount(file, sheetname, 0);

		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < col; i++) {

			String str = XLUtils.getStringCellData(file, sheetname, 0, i);
			map.put(i, str);

		}

		for (int j = 1; j < rows; j++) {

			String str1 = "", str2 = "", str3 = "";
			int idindex = 0;
			for (int k = 0; k < col; k++) {
				switch (map.get(k)) {
				case "TestCaseID": {

					Cell cell1 = XLUtils.getCellvalue(file, sheetname, j, k);
					str1 = cell1.toString();
				}
				case "id": {
					int cell2 = (int) XLUtils.getNumericCellData(file, sheetname, j, k);
					str2 = String.valueOf(cell2);

				}
				case "name": {

					Cell cell3 = XLUtils.getCellvalue(file, sheetname, j, k);
					str3 = cell3.toString();
					idindex = k;
				}
				default: {
					break;
				}

				}

			}
			System.out.println(str1 + " " + str2 + " " + str3);
			if (str1.equals(TestCaseID) && str2.equals(id) && str3.equals(name)) {
				XLUtils.setCellData(file, sheetname, j, idindex, newname);

			} else {
				System.out.println("not replaced");
			}
		}
	}

}
