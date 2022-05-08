package br.com.fateczl.lipe.controller;

import br.com.fateczl.lipe.model.Imovel;

public interface IImpostoStrategy {
	public double calcularImposto() throws Exception;
	public Imovel gerarImovel() throws Exception;
}
