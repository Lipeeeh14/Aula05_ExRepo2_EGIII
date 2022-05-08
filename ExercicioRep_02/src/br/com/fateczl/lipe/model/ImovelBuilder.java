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
			throw new Exception("�rea Total inv�lida!");
		
		imovel.setAreaTotal(area);
		return this;
	}
	
	public ImovelBuilder addComodos(int comodos) throws Exception {
		if (comodos <= 0)
			throw new Exception("Quantidade de comodos inv�lida!");
		
		imovel.setNumComodos(comodos);
		return this;
	}
	
	public ImovelBuilder addQuartos(int quartos) throws Exception {
		if (quartos <= 0)
			throw new Exception("Quantidade de quartos inv�lida!");
		
		imovel.setNumComodos(quartos);
		return this;
	}
	
	public ImovelBuilder addAreaGaragem(double area) throws Exception {
		if (area <= 0)
			throw new Exception("�rea da garagem inv�lida!");
		
		imovel.setAreaGaragem(area);
		return this;
	}
	
	public ImovelBuilder addIdade(int idade) throws Exception {
		if (idade <= 0)
			throw new Exception("Idade inv�lida!");
		
		imovel.setNumComodos(idade);
		return this;
	}
	
	public Imovel get() {
		return this.imovel;
	}
}
