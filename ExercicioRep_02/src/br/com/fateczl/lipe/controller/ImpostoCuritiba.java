package br.com.fateczl.lipe.controller;

import javax.swing.JOptionPane;

import br.com.fateczl.lipe.model.Imovel;
import br.com.fateczl.lipe.model.ImovelBuilder;

public class ImpostoCuritiba implements IImpostoStrategy {
	
	public double calcularImposto() throws Exception {
		Imovel imovel = gerarImovel();
		
		return imovel.getAreaGaragem() > 0 ?
				(imovel.getAreaTotal() * 7.5) + (imovel.getAreaGaragem() * 2.5) :
					imovel.getAreaTotal() * 8;
	}

	@Override
	public Imovel gerarImovel() throws Exception {
		String possuiGaragem = JOptionPane.showInputDialog("O imóvel possui garagem ? (S / N)");
		double areaGaragem = 0;
		if (possuiGaragem.substring(0).toLowerCase().equals("s"))
			areaGaragem = Double.parseDouble(JOptionPane.showInputDialog("Informe a área da garagem"));
		
		double areaTotal = Double.parseDouble(JOptionPane.showInputDialog("Informe a área total"));
		
		return ImovelBuilder.builder()
				.addAreaTotal(areaTotal)
				.addAreaGaragem(areaGaragem)
				.get();
	}
}
