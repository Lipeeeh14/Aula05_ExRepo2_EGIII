package br.com.fateczl.lipe.view;

import javax.swing.JOptionPane;

import br.com.fateczl.lipe.controller.IImpostoStrategy;
import br.com.fateczl.lipe.controller.ImpostoBH;
import br.com.fateczl.lipe.controller.ImpostoCuritiba;
import br.com.fateczl.lipe.controller.ImpostoPortoAlegre;
import br.com.fateczl.lipe.controller.ImpostoSP;

public class View {
	public static void main(String[] args) {
		try {
			IImpostoStrategy stg;
			stg = new ImpostoSP();
			exibirImposto(stg.calcularImposto());
			
			stg = new ImpostoBH();
			exibirImposto(stg.calcularImposto());
			
			stg = new ImpostoCuritiba();
			exibirImposto(stg.calcularImposto());
			
			stg = new ImpostoPortoAlegre();
			exibirImposto(stg.calcularImposto());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	private static void exibirImposto(double imposto) {
		JOptionPane.showMessageDialog(null, "Resultado do calculo do imposto: " + imposto);
	}
}
