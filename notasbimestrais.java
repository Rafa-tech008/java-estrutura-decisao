// Ex.21 Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
// Se a média for >= 6,0 exibir “APROVADO”;
// Se a média for >= 3,0 E < 6,0 exibir “EXAME”;
// Se a média for < 3,0 exibir “RETIDO”.
import javax.swing.JOptionPane;
public class notasbimestrais 
{
	public static void main (String argues [])
	{
		double n1, n2, n3, n4, med;
		n1= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do 1º bimestre: "));
		n2= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do 2º bimestre: "));
		n3= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do 3º bimestre: "));
		n4= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do 4º bimestre: "));
		med= ((n1 + n2 + n3 + n4)/4);
		if (med>=6)
		{
			System.out.println("APROVADO;");
		}
		else
		{
			if(med<6 && med>=3)
			{
				System.out.println("EXAME;");
			}
			else {
				if(med<3)
				{
					System.out.println("RETIDO;");
				}
			}
		}
	}
}
