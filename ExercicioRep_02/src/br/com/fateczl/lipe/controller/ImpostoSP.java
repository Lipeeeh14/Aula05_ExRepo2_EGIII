package br.com.fateczl.lipe.controller;

import javax.swing.JOptionPane;

import br.com.fateczl.lipe.model.Imovel;
import br.com.fateczl.lipe.model.ImovelBuilder;

public class ImpostoSP implements IImpostoStrategy {

	@Override
	public double calcularImposto() throws Exception {
		Imovel imovel = gerarImovel();
		
		return (imovel.getAreaTotal() * 10) + (imovel.getNumComodos() * 2);
	}

	@Override
	public Imovel gerarImovel() throws Exception {
		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Informe a área total"));
		int numComodos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de comodos"));
		
		return ImovelBuilder.builder()
				.addAreaTotal(areaTotal)
				.addComodos(numComodos)
				.get();
	}

}
