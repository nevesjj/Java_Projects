package entidades;

public class Sorteando {
	private String membros;
	private int quantidade;
	
	public Sorteando(int quantidade, String membros) {
		this.membros = membros;
		this.quantidade = quantidade;
	}
	public String getMembros() {
		return membros;
	}
	public void setMembros(String membros) {
		this.membros = membros;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
