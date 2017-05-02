import javax.swing.*;
public class exercicio4 {


	public static void main(String[] args){
			float result = 0.0f;
			String temp;
			float cel;
			temp = JOptionPane.showInputDialog("Digite uma temperatura em Celsius: ");
			cel = Float.parseFloat(temp);
			result = (9 * (float) cel + 160) / 5;
			JOptionPane.showMessageDialog(null, "A temperatura em Farenheit e: " + result + " ºF");
		}
	}


