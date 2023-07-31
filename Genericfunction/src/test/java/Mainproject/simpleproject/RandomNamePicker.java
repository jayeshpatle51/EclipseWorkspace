package Mainproject.simpleproject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import utils.XLUtils;

//Hello world
//olleH dlrow

public class RandomNamePicker {

	public static String reversewordbyword(String sentence) {
		
		String arr[] =sentence.split(" ");
		String newstr="";
		for(int i=0;i<arr.length;i++) {
			StringBuilder st=new StringBuilder();
			st.append(arr[i]);
		st=	st.reverse();
		arr[i]=st.toString();
		newstr=newstr+arr[i]+" ";
		}
		
		return newstr;
	}
	
	public static void main(String[] args) throws IOException {
		
		String file="D:\\excel\\RandomNamesList.xlsx";
		String sheetname="Sheet1";
		
		int rows=XLUtils.getRowCount(file,sheetname);
		
		//int cols=XLUtils.getColumnCount(file, sheetname, 0);
		System.out.println(rows);
		List<String> members=new ArrayList<>();
		for(int i=1;i<=rows;i++) {
			
		String name=XLUtils.getStringCellData(file,sheetname,i,0);
		String status=XLUtils.getStringCellData(file,sheetname,i,1);
		 // System.out.println(name+" "+status);
		if(!status.equals("Done")) {
		members.add(name.toString());
		
		}else {
			continue;
		}
		
		}
		
	   
			
	   int index=1;
	
			Random r=new Random();
		int random=r.nextInt(1, members.size());
		System.out.println(members);
	System.out.println(index++ +") Given random index is :- "+ random+", " +members.get(random));
	
	Date d= new Date();
	SimpleDateFormat df=new SimpleDateFormat("DD/MM/YYYY");
	String currdate=df.format(d);
	System.out.println(currdate);
	
	for(int k=1;k<=rows;k++) {
		
		String name=	XLUtils.getStringCellData(file, sheetname, k, 0);
		if(name.equals(members.get(random))) {
			XLUtils.setCellData(file, sheetname, k, 1, "Done");
			XLUtils.setCellData(file, sheetname, k, 2, currdate);
			XLUtils.setCellData(file, sheetname, k, 3, "comment");
			break;
		}
		
	}
	
		
	}

}
