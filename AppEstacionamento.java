import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class AppEstacionamento {
	public static void main(String[] args) {
		
		String vaga_livre = "Vaga Disponível.";
		String[] vagas = new String[10];
		Arrays.fill(vagas, vaga_livre);
		String menu = "1 - Entrada\n2 - Saida\n3 - Estado\n 4 - Sair";
		
		while(true) {
			
			int opcao = Integer.valueOf
					(JOptionPane.showInputDialog(null, menu));
			
			switch(opcao) {
				
			case 1: //Entrada
				
				int vaga = Integer.valueOf
				(JOptionPane.showInputDialog("Posição da vaga: "));
				String placa = JOptionPane.showInputDialog("Número da Placa: ");
				vagas[vaga - 1] = placa;
				JOptionPane.showMessageDialog(null, "Veículo estacionado com sucesso!");
				break;
			
			case 2: //Saída
				
				vaga = Integer.valueOf(JOptionPane.showInputDialog("Vaga: "));
				
				vaga_livre = "Liberado";
				vagas[vaga] = vaga_livre;
				JOptionPane.showMessageDialog
				(null, "O veículo foi retirado com sucesso!");
				break;
			
			case 3: //Estado
				
				String resultado = "Estado do Estacionamento: \n";
				for (int i = 0; i < vagas.length; i++) {
					resultado += "Vaga " + i + 1 + " --> " + vagas[i] + "\n";
				}
				
				JOptionPane.showMessageDialog(null, resultado);
				break;
			
			case 4: //Sair do Programa
				
				JOptionPane.showMessageDialog(null, "O PROGRAMA SERÁ AGORA ENCERRADO...");
				return;
			
			default: //Opcao Invalida.
				
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
				
				break;
			}
		}
	}
}
