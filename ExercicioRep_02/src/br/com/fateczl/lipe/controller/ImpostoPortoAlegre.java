package br.com.fateczl.lipe.controller;

import javax.swing.JOptionPane;

import br.com.fateczl.lipe.model.Imovel;
import br.com.fateczl.lipe.model.ImovelBuilder;

public class ImpostoPortoAlegre implements IImpostoStrategy {
	@Override
	public double calcularImposto() throws Exception {
		Imovel imovel = gerarImovel();
		double calcIdade = 0;
		
		if (imovel.getIdade() > 50) calcIdade = imovel.getIdade() * 3;
		else if (imovel.getIdade() < 20) calcIdade = imovel.getIdade() * 2;
		else calcIdade = imovel.getIdade() * 2.5;
		
		return imovel.getAreaTotal() * 5 + calcIdade;
	}

	@Override
	public Imovel gerarImovel() throws Exception {
		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Informe a área total"));
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do imóvel"));
		
		return ImovelBuilder.builder()
				.addAreaTotal(areaTotal)
				.addIdade(idade)
				.get();
	}

}
