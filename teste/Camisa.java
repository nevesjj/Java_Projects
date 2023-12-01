package teste;

public class Camisa extends Mae{
	public int quant;
	public double valor() {
		return ((getCamiseta() * getQuant()) * getComissao());
	}

}
