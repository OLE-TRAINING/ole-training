import java.util.Calendar;

public class Execute {

	public static void main(String[] args) {
		VerificaDatas datas = new VerificaDatas();

		Calendar data1 = Calendar.getInstance();
		data1.set(Calendar.DAY_OF_MONTH, 18);
		data1.set(Calendar.MONTH, 10);
		data1.set(Calendar.YEAR, 2005);
		Calendar data2 = Calendar.getInstance();
		data2.set(Calendar.DAY_OF_MONTH, 12);
		data2.set(Calendar.MONTH, 8);
		data2.set(Calendar.YEAR, 2007);
		
		datas.verificaDatas(data1,data2);

	}

}
