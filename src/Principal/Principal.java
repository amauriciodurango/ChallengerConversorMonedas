package Principal;

import javax.swing.*;

import ConversorMonedas.OpcionesMonedas;
import ConversorTemperatura.OpcionesTemperatura;


public class Principal {

	public static void main(String[] args) {
		
		OpcionesMonedas conversion = new OpcionesMonedas();
		OpcionesTemperatura conversionTemp = new OpcionesTemperatura();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Elija el tipo de conversión", "Menú", JOptionPane.QUESTION_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			
			
			switch(opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);
				
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				break;
				
			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionTemp.ConvertirTemperaturas(valorRecibidoT);
				
				
				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuestaT) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				
				
				
		}
		break;
	}
	
}
	
}