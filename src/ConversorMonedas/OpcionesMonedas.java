package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesMonedas {
	
	ConvercionMonedas monedas = new ConvercionMonedas();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elija la moneda que deseas convertir ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Pesos a D�lar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japon�s", "De Pesos a Won sub-coreano", "De D�lar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japon�s a Pesos", "De Won sub-coreano a Pesos"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Pesos a D�lar": 
		monedas.ConvertirPesosColombianosDolares(valor);
		break;
	
	case "De Pesos a Euro": 
		monedas.ConvertirPesosColombianosEuros(valor);
		break;
		
	case "De Pesos a Libras Esterlinas":
		monedas.ConvertirPesosColombianosLibra(valor);
		break;
		
	case "De Pesos a Yen Japon�s":
		monedas.ConvertirPesosColombianosYen(valor);
		break;
		
	case "De Pesos a Won sub-coreano":
		monedas.ConvertirPesosColombianosWon(valor);
		break;
	
	case "De D�lar a Pesos":
		monedas.ConvertirDolaresPesosColombianos(valor);
		break;
		
	case "De Euro a Pesos":
		monedas.ConvertirEurosPesosColombianos(valor);
		break;
		
	case "De Libras Esterlinas a Pesos":
		monedas.ConvertirLibraPesosColombianos(valor);
		break;
	 
	case "De Yen Japon�s a Pesos":
		monedas.ConvertirYenPesosColombianos(valor);
		break;
		
	case "De Won sub-coreano a Pesos":
		monedas.ConvertirWonPesosColombianos(valor);
		break;
	}
	}

}