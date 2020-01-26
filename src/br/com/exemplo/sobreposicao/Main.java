package br.com.exemplo.sobreposicao;

public class Main {
	
	public static void main(String[] args) {
		Soma s = new Soma(); 
        System.out.println(s.soma(10, 20)); 
        System.out.println(s.soma(10, 20, 30)); 
        System.out.println(s.soma(10.5, 20.5)); 
	}

}
