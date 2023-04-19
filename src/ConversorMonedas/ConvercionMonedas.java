package ConversorMonedas;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConvercionMonedas {
	
	public void ConvertirPesosColombianosDolares(double valor) {
		double monedaDolar = valor / 4428.50;
		DecimalFormat formato = new DecimalFormat("#0.0000000");
	    String monedaDolarFormateada = formato.format(monedaDolar);
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolarFormateada + " Dolares");
	}
	public void ConvertirPesosColombianosEuros(double valor) {
		double monedaEuro = valor / 4842.83;
		DecimalFormat formato = new DecimalFormat("#0.0000000");
	    String monedaEuroFormateada = formato.format(monedaEuro);
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuroFormateada + " Euros");
	}
	public void ConvertirPesosColombianosLibra(double valor) {
		double monedaLibra = valor / 5483.83;
		DecimalFormat formato = new DecimalFormat("#0.0000000");
	    String monedaLibraFormateada = formato.format(monedaLibra);
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibraFormateada + " Libras Esterlinas");
	}
	public void ConvertirPesosColombianosYen(double valor) {
		double monedaYen = valor / 32.92;
		DecimalFormat formato = new DecimalFormat("#0.0000000");
	    String monedaYenFormateada = formato.format(monedaYen);
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYenFormateada + " Yen Japonés");
	}
	public void ConvertirPesosColombianosWon(double valor) {
		double monedaWon = valor / 3.36;
		DecimalFormat formato = new DecimalFormat("#0.0000000");
	    String monedaWonFormateada = formato.format(monedaWon);
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWonFormateada + " Won sub-coreano");
	}
	
	
	public void ConvertirDolaresPesosColombianos(double valor) {
		double monedaDolar = 4428.50 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Un " + valor +  " Dolar equivale a " + monedaDolar + " pesos");
	}
	public void ConvertirEurosPesosColombianos(double valor) {
		double monedaEuro = valor * 4842.83;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Un " + valor +  " Euro equivale a " + monedaEuro + " pesos");
	}
	public void ConvertirLibraPesosColombianos(double valor) {
		double monedaLibra = valor * 5483.83;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Una " + valor +  " Libra equivale a " + monedaLibra + " pesos");
	}
	public void ConvertirYenPesosColombianos(double valor) {
		double monedaYen = valor * 32.92;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Un " + valor +  " Yen equivale a " + monedaYen + " pesos");
	}
	public void ConvertirWonPesosColombianos(double valor) {
		double monedaWon = valor * 3.36;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Un " + valor +  " Won equivale a " + monedaWon + " pesos");
	}

}