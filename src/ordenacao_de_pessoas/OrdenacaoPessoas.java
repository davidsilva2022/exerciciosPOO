package ordenacao_de_pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

	List<Pessoas> listaPessoas;
	
	public OrdenacaoPessoas() {
		this.listaPessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaPessoas.add(new Pessoas(nome, idade, altura));
	}
	
	public List<Pessoas> ordenarPorIdade() {
		List<Pessoas> pessoasPorIdade = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoas> ordenarPorAltura(){
		List<Pessoas> pessoasPorAltura = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorAltura , new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	
	
	public static void main(String[] args) {
		
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
		
		ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.56);
		ordenacaoPessoas.adicionarPessoa("Nome 2", 30, 1.80);
		ordenacaoPessoas.adicionarPessoa("Nome 3", 25, 1.70);
		ordenacaoPessoas.adicionarPessoa("Nome 4", 20, 1.56);
		ordenacaoPessoas.adicionarPessoa("Nome 5", 17, 1.90);
		
		System.out.println(ordenacaoPessoas.listaPessoas);
		
		System.out.println(ordenacaoPessoas.ordenarPorIdade());
		System.out.println(ordenacaoPessoas.ordenarPorAltura());
		
	}

}
