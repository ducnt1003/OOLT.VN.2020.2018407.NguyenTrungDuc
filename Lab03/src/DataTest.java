
public class DataTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate();
		date1.print();
		MyDate date2 = new MyDate(03,10,2020);
		date2.print();
		MyDate date3 = new MyDate("October 3rd 2020");
		date3.print();
		date3.Accept();
		date3.print();

	}

}
