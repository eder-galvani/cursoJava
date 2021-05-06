package fundamentos;

import javax.swing.JOptionPane;

public class Temperatura {
	public static void main(String[] args) {
		final double CONST1 = 32;
		final double CONST2 = 5 / 9.0;
		double temperaturaFah = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit"));
		double temperaturaCels = (temperaturaFah - CONST1) * CONST2;
		System.out.println("A temperatura em Celsius é: " + temperaturaCels + "°C");
	}
}
