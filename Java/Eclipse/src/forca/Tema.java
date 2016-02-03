package forca;
import java.util.ArrayList;
import java.util.Scanner;

public class Tema {
	private String palavras[];
	private ArrayList<String> listaPalavras = new ArrayList<String>();


	public void addpalavra(String str){
		listaPalavras.add(str);
	}


	public String[] getPalavras() {
		return palavras;
	}


	public void setPalavras(String palavras[]) {
		this.palavras = palavras;
	}
}