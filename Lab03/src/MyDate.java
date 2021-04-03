import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MyDate {
	private int day;
    private int month;
    private int year;
    
    public MyDate() {
        Calendar currentDate = Calendar.getInstance();
        this.day = currentDate.get(Calendar.DAY_OF_MONTH);
        this.month = currentDate.get(Calendar.MONTH);
        this.year = currentDate.get(Calendar.YEAR);
    }
    public MyDate(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.year = year;
            this.month = month-1;
            this.day = day;
            print();
        } 
        else 
            System.out.println("INVALID YEAR, MONTH OR DAY!");
    }
    public MyDate(String strDate) {
        Date tmpDate;
        SimpleDateFormat formatter = new SimpleDateFormat("MMMMM dd yyyy");
        Calendar cDate = Calendar.getInstance();
        formatter.setLenient(false);
        System.out.println(strDate);
        try {
            tmpDate = formatter.parse((strDate.replaceAll("st|nd|rd|th", "")).trim());
        } catch (ParseException e) {
            System.out.println("Invalid date or wrong format");
            return;
        }
        cDate.setTime(tmpDate);
        this.day = cDate.get(Calendar.DAY_OF_MONTH);
        this.month = cDate.get(Calendar.MONTH);
        this.year = cDate.get(Calendar.YEAR);
        print();
    } 
    public static boolean isValidDate(int day, int month, int year) {
        Calendar cDate = Calendar.getInstance();
        cDate.set(year, month-1, 1);
        return ((year >= 1) && (year <= 9999)) && ((month >= 1) && (month <= 12)) && ((day >= 1) && (day <= cDate.getActualMaximum(Calendar.DAY_OF_MONTH)));
    }
    public void Accept() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the date: ");
        String strDate = keyboard.nextLine();
        Date tmpDate;
        SimpleDateFormat formatter = new SimpleDateFormat("MMMMM dd yyyy");
        Calendar cDate = Calendar.getInstance();
        formatter.setLenient(false);
        try {
            tmpDate = formatter.parse((strDate.replaceAll("st|nd|rd|th", "")).trim());
        } catch (ParseException e) {
            System.out.println("INVALID DATE WRONG FORMAT");
            keyboard.close();
            return;
        }
        cDate.setTime(tmpDate);
        this.day = cDate.get(Calendar.DAY_OF_MONTH);
        this.month = cDate.get(Calendar.MONTH);
        this.year = cDate.get(Calendar.YEAR);
        keyboard.close();
        print();
    }
    public void print() {
        Calendar fDate = Calendar.getInstance();
        fDate.set(year, month, day);
        String dateFormat;
        
        switch (day) {
            case 1:
                dateFormat = "MMMMM d'st' yyyy";
                break;
            case 2:
                dateFormat = "MMMMM d'nd' yyyy";
                break;
            case 3:
                dateFormat = "MMMMM d'rd' yyyy";
                break;
            default:
                dateFormat = "MMMMM dd'th' yyyy";
                break;
        }
        
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        System.out.println(formatter.format(fDate.getTime())); 
                                                                
    }
}
