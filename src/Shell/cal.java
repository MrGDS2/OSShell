package Shell;

import java.util.Calendar;

public class cal {

	
	public static void cal(){
		switch(Calendar.getInstance().get(Calendar.MONTH))
		{
		case 0:
			System.out.println("January" + Calendar.YEAR);
			break;
			
		case 1:
			System.out.println("Febuary");
			break;
		case 2:
			System.out.println("March");
			break;
		case 3:
			System.out.println("April");
			break;
		case 4:
			System.out.println("May");
			break;
		case 5:
			System.out.println("June");
			break;
		case 6:
			System.out.println("July");
			break;
		case 7:
			System.out.println("August");
			break;
		case 8:
			System.out.println("September");
			break;
		case 9:
			System.out.println("October "+ Calendar.YEAR);
			break;
		case 10:
			System.out.println("November");
			break;
		case 11:
			System.out.println("December");
			break;
			
		}
		
	
		
		//get month translator
    }
}
