package exercicioentrega;

import java.util.Scanner;

public class Destino {

	 public String[] pais= new String[2];
	 public String [] estado = new String [2];
	 public String [] municipio = new String [2];
	 public String [] datachegada = new String[2];
	 public String [] datasaida = new String[2];
	
	 Scanner scan = new Scanner(System.in);
	 
	 public void cadastrar() {
		 for (int contador = 0; contador<pais.length; contador++) {
				System.out.println("Cadastre as seguintes informações do destino: ");
				System.out.println("País");
				pais[contador]= scan.nextLine();
				System.out.println("Estado");
				estado[contador]= scan.nextLine();
				System.out.println("Municipio");
				municipio[contador] = scan.nextLine();
				System.out.println("Data de chegada, digite os números sem espaços ou /");
				datachegada[contador] = scan.nextLine();
				System.out.println("Data de saída, digite os números sem espaços ou /");
				datasaida[contador] = scan.nextLine();
		 }		
		 }

	public String[] getPais() {
		return pais;
	}
	public void setPais(String[] pais) {
		this.pais = pais;
	}
	public String[] getEstado() {
		return estado;
	}
	public void setEstado(String[] estado) {
		this.estado = estado;
	}
	public String[] getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String[] municipio) {
		this.municipio = municipio;
	}
	public String[] getDatachegada() {
		return datachegada;
	}
	public void setDatachegada(String[] datachegada) {
		this.datachegada = datachegada;
	}
	public String[] getDatasaida() {
		return datasaida;
	}
	public void setDatasaida(String[] datasaida) {
		this.datasaida = datasaida;
	}
	 
	public void consultar(){
		for (int contador=0; contador<pais.length;contador++) {
			System.out.println("País +" + this.pais[contador]);
			System.out.println("Estado +" + this.estado[contador]);
			System.out.println("Município +" + this.municipio[contador]);
			System.out.println("Data de chegada +" + this.datachegada[contador]);
			System.out.println("Data de saída +" + this.datasaida[contador]);
		}
	}
}
	