package br.com.fateczl.lipe.model;

public class ImovelBuilder {
	private Imovel imovel;
	
	public ImovelBuilder() {
		this.imovel = new Imovel();
	}
	
	public static ImovelBuilder builder() {
		return new ImovelBuilder();
	}
	
	public ImovelBuilder addAreaTotal(double area) throws Exception {
		if (area <= 0)
			throw new Exception("Área Total inválida!");
		
		imovel.setAreaTotal(area);
		return this;
	}
	
	public ImovelBuilder addComodos(int comodos) throws Exception {
		if (comodos <= 0)
			throw new Exception("Quantidade de comodos inválida!");
		
		imovel.setNumComodos(comodos);
		return this;
	}
	
	public ImovelBuilder addQuartos(int quartos) throws Exception {
		if (quartos <= 0)
			throw new Exception("Quantidade de quartos inválida!");
		
		imovel.setNumComodos(quartos);
		return this;
	}
	
	public ImovelBuilder addAreaGaragem(double area) throws Exception {
		if (area <= 0)
			throw new Exception("Área da garagem inválida!");
		
		imovel.setAreaGaragem(area);
		return this;
	}
	
	public ImovelBuilder addIdade(int idade) throws Exception {
		if (idade <= 0)
			throw new Exception("Idade inválida!");
		
		imovel.setNumComodos(idade);
		return this;
	}
	
	public Imovel get() {
		return this.imovel;
	}
}
