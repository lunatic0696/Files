package q2;

import javax.swing.JOptionPane;

public class Q2 {

	public static void main(String[] args) {
		
		String[] meses = new String[12];
		meses[0] = "Janeiro";
		meses[1] = "Fevereiro";
		meses[2] = "Marco";
		meses[3] = "Abril";
		meses[4] = "Maio";
		meses[5] = "Junho";
		meses[6] = "Julho";
		meses[7] = "Agosto";
		meses[8] = "Setembro";
		meses[9] = "Outubro";
		meses[10] = "Novembro";
		meses[11] = "Dezembro";
		
		int mes = (int) (Math.random() * 10);
		JOptionPane.showMessageDialog(null, meses[mes]);

	}

}
