package practiceprograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Cal
{
	public boolean leap(int year)//find given year is leap year are not
	{
		boolean b=false;
		 if(year % 400 == 0)
	        {
	            b = true;
	        }
	        else if (year % 100 == 0)
	        {
	            b = false;
	        }
	        else if(year % 4 == 0)
	        {
	            b = true;
	        }
	        else 
	        {
	            b = false;
	        }
		return b;
	}
	public int ODD_days_allyears(int year)
	{
		int num=0;
		int r=(year-1)%400;//to remove multiple 400 years because each have 
		if(r>300)
		{
			num=1;
			r=r-300;
		}
		if(r>200&&r<=300)
		{
			num=3;
			r=r-200;
		}
		if(r>100&&r<=200)
		{
			num=5;
			r=r-100;
			
		}
		
		int lr=(r/4);//remaining leap years
		int oddlr=lr*2;//l leap year have 2 odd days
		int oddnlr=r-lr;//remaining non leap years&& l non-leap year have 1 odd day
		int odd_days=(oddlr+oddnlr+num)%7;//Total Odd days in years
		return odd_days;
	}
	public int  ODD_days_leapyear_allmonths(int month)// for leap year
	{
		int m=month-1;//number of months odd days
		int odddays=0;
		int oddmth=0;
		for(int i=0;i<=m;i++)
		{
			if (i==0)          //null
				odddays=odddays+0;
			if (i==1)          //jan
				odddays=odddays+3;
			if (i==2)          //feb
				odddays=odddays+1;
			if (i==3)          //mar
				odddays=odddays+3;
			if (i==4)          //apr
				odddays=odddays+2;
			if (i==5)          //may
				odddays=odddays+3;
			if (i==6)          //jun
				odddays=odddays+2;
			if (i==7)          //jly
				odddays=odddays+3;
			if (i==8)          //aug
				odddays=odddays+3;
			if (i==9)          //sep
				odddays=odddays+2;
			if (i==10)         //oct
				odddays=odddays+3;
			if (i==11)         //nov
				odddays=odddays+2;
			if (i==12)         //dec
				odddays=odddays+3;
		}
		oddmth=odddays%7;//total odd days for months
		return odddays;
	}
  public int  ODD_days_nonleapyear_allmonths(int month)// for non leap year
   {
	int m=month-1;//number of months odd days
	int odddays=0;
	int oddmth=0;
	for(int i=0;i<=m;i++)
	{
		if (i==0)          //null
			odddays=odddays+0;
		if (i==1)          //jan
			odddays=odddays+3;
		if (i==2)          //feb
			odddays=odddays+0;
		if (i==3)          //mar
			odddays=odddays+3;
		if (i==4)          //apr
			odddays=odddays+2;
		if (i==5)          //may
			odddays=odddays+3;
		if (i==6)          //jun
			odddays=odddays+2;
		if (i==7)          //jly
			odddays=odddays+3;
		if (i==8)          //aug
			odddays=odddays+3;
		if (i==9)          //sep
			odddays=odddays+2;
		if (i==10)         //oct
			odddays=odddays+3;
		if (i==11)         //nov
			odddays=odddays+2;
		if (i==12)         //dec
			odddays=odddays+3;
	}
	oddmth=odddays%7;//total odd days for months
	return odddays;
  }
  public int Odd_days(int date)
  {
	  int oddays=date%7;//total odd days
	  return oddays;
  }
  public String Day(int odd)//resultent day
  {
	  String s=" ";
	  switch(odd)
	  {
	  case 0:
		   s="Sunday"; 
		   break;
	  case 1:
		   s="Monday";
		   break;
	  case 2:
		   s="Tuesday";
		   break;
	  case 3:
		   s="Wednesday";
		   break;
	  case 4:
		   s="Thursday";
		   break;
	  case 5:
		   s="Friday";
		   break;
	  case 6:
		   s="Saturday";
		   break;
	  }
	  return s;
  }
  public String print_month_1day(Cal c,int year_odd_days,int month_odd_days)//to print months calender starts with
  {
	  int odd=(year_odd_days+month_odd_days+1)%7;
	  String S=c.Day(odd);
	  return S;
  }
  public int month_span_leapyear(int month)//leapyear
  { 
	  int days=0;
	  switch(month)
	  {
	  case 1:case 3:case 5:case 7:case 8:case 10:case 12:
		  days=31;break;
	  case 4:case 6:case 9:case 11:
		  days=30;break;
	  case 2:
		  days=29;
	  }
	  return days;
  }
  public int month_span_non_leapyear(int month)//non-leapyear
  { 
	  int days = 0;
	  switch(month)
	  {
	  case 1:case 3:case 5:case 7:case 8:case 10:case 12:
		  days=31;break;
	  case 4:case 6:case 9:case 11:
		  days=30;break;
	  case 2:
		  days=28;
	  }
	  return days;
  }
  public void Month_print(int days,String Ms)
  {
		String s[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        String Monthday=Ms;
        int n=0;
        for(int i=0;i<=s.length-1;i++)
        {
        	if (s[i]==Monthday)
        	{
        		n=i;
        	    break;
        	}
        }
        for(int j=1;j<=31;j++)
        {
        	if(j>days)
        		break;
        	System.out.println("Day  "+j+"   falls on:"+s[n]);
        	n++;
        	
        }  	 
  }
}
public class Calender {

	public static void main(String[] args) {
		
		int year=2022;
        int month=11;
        int date=30;
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, date);
        java.util.Date df=cal.getTime();
        DateFormat dff=new SimpleDateFormat("EEEEEEEE");
        String day=dff.format(df);
        System.out.println(day);
//	    int date=Integer.parseInt(args[0]);
//		int month=Integer.parseInt(args[1]);
//		int year=Integer.parseInt(args[2]);
//      
//		 int date=28;
//			int month=12;
//			int year=2022;
//	      
//      Cal c=new Cal();
//      boolean b=c.leap(year);//given year is leap year are not
//      if(b==true)
//      {
//    	  int year_odd_days=c.ODD_days_allyears(year);
//    	  int month_odd_days=c.ODD_days_leapyear_allmonths(month);
//    	  int date_odd_days=c.Odd_days(date);
//    	  int odd=(year_odd_days+month_odd_days+date_odd_days)%7;
//    	  String s=c.Day(odd);
//    	  System.out.println(date+"-"+month+"-"+year+"  Is a leap year falls on:  "+s);
//    	  String Ms=c.print_month_1day(c, year_odd_days, month_odd_days);
//    	  int days=c.month_span_leapyear(month);
//    	  System.out.println();
//    	  System.out.println(" "+month+"-"+year+" Month calender is:");
//    	  System.out.println();
//    	  c.Month_print(days, Ms);
//    	 
//      }
//      if(b==false)
//      {
//    	  int year_odd_days=c.ODD_days_allyears(year);
//    	  int month_odd_days=c.ODD_days_nonleapyear_allmonths(month);
//    	  int date_odd_days=c.Odd_days(date);
//    	  int odd=(year_odd_days+month_odd_days+date_odd_days)%7;
//    	  String s=c.Day(odd);
//    	  System.out.println(date+"-"+month+"-"+year+"  Is a non-leap year falls on:  "+s);
//    	  String Ms=c.print_month_1day(c, year_odd_days, month_odd_days);
//    	  int days=c.month_span_non_leapyear(month);
//    	  System.out.println();
//    	  System.out.println(" "+month+"-"+year+" Month calender is:");
//    	  System.out.println();
//    	  c.Month_print(days, Ms);
//      }
//    
	}

}
