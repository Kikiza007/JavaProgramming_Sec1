import javax.swing.*;//import libary for input data from dialog box
import java.text.*;
public class Example4 {

	public static void main(String[] args) {
		//2. input data from dialogbox
		
		DecimalFormat frm = new DecimalFormat("#,###.00");

		String productName = JOptionPane.showInputDialog("Input product name : ");
		
		String strUnit = JOptionPane.showInputDialog("Input product unit : ");
		
		int productUnit = Integer.parseInt(strUnit);
		
		String strPrice = JOptionPane.showInputDialog("Input price per unit : ");
		float pricePerUnit = Float.parseFloat(strPrice);
		
		float totalPrice = productUnit * pricePerUnit;
		
		double vat = totalPrice + (totalPrice*7/100);
		JOptionPane.showMessageDialog(null,"Total price is "
				+frm.format(totalPrice)+ " baht." + "\nAdd VAT 7% is" +frm.format(vat) +" baht.");

	}

}
