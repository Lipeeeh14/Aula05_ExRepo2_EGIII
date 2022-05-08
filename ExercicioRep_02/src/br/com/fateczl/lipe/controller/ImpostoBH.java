package br.com.fateczl.lipe.controller;

import javax.swing.JOptionPane;

import br.com.fateczl.lipe.model.Imovel;
import br.com.fateczl.lipe.model.ImovelBuilder;

public class ImpostoBH implements IImpostoStrategy {

	@Override
	public double calcularImposto() throws Exception {
		Imovel imovel = gerarImovel();
		
		return (imovel.getAreaTotal() * 10) + (imovel.getNumQuartos() * 4);
	}

	@Override
	public Imovel gerarImovel() throws Exception {
		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Informe a área total"));
		int numQuartos = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de quartos"));
		
		return ImovelBuilder.builder()
				.addAreaTotal(areaTotal)
				.addQuartos(numQuartos)
				.get();
	}

}
