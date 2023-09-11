package ordenacao_de_pessoas;

import java.util.Comparator;

public class Pessoas implements Comparable<Pessoas>{
	
	private String nome;
	private Integer idade;
	private Double altura;
	
	

	public Pessoas(String nome, int idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	@Override
	public int compareTo(Pessoas p) {
		return Integer.compare(idade, p.getIdade());
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public Double getAltura() {
		return altura;
	}

	public String toString() {
		return "Pessoa{" +
				"nome='" + nome + '\'' +
				", idade=" + idade +
				", altura=" + altura +
				'}';
	}


}

class ComparatorPorAltura implements Comparator<Pessoas>{

	@Override
	public int compare(Pessoas p1, Pessoas p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}
	
}
