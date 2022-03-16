package exercicioentrega;

import java.util.Scanner;

public class Cliente {

	 private String [] nome = new String[2];
	 private String[] telefone = new String [2];
	 private String[] email = new String [2];
	 private String[] endereco = new String [2];
	 private String[] uf = new String [2];
	 
	 Scanner scan = new Scanner(System.in);
	 
	 public void cadastrar() {
		 for (int contador = 0; contador<nome.length; contador++) {
				System.out.println("Cadastre o cliente que irá viajar com as seguintes informações: ");
				System.out.println("Nome");
				nome[contador]= scan.nextLine();
				System.out.println("Telefone");
				telefone[contador]= scan.nextLine();
				System.out.println("E-mail");
				email[contador] = scan.nextLine();
				System.out.println("Endereço");
				endereco[contador] = scan.nextLine();
				System.out.println("UF");
				uf[contador] = scan.nextLine();
			
		 }	 
	 }

	public String[] getNome() {
		return nome;
	}

	public void setNome(String[] nome) {
		this.nome = nome;
	}

	public String[] getTelefone() {
		return telefone;
	}

	public void setTelefone(String[] telefone) {
		this.telefone = telefone;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	public String[] getEndereco() {
		return endereco;
	}

	public void setEndereco(String[] endereco) {
		this.endereco = endereco;
	}
	

	public String[] getUf() {
		return uf;
	}

	public void setUf(String[] uf) {
		this.uf = uf;
	}

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	
	public void consultar(){
		for (int contador=0; contador< nome.length;contador++) {
			System.out.println("Nome +" + this.nome[contador]);
			System.out.println("Telefone +" + this.telefone[contador]);
			System.out.println("E-mail +" + this.email[contador]);
			System.out.println("Endereço +" + this.endereco[contador]);
			System.out.println("UF +" + this.uf[contador]);
		}
	}


}