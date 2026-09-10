// Ex.18 Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor;
import javax.swing.JOptionPane;
public class difmaiormenor
{
	public static void main(String[] args) 
	{
		int x, y, sub;
		x= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para x: "));
		y= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para y: "));
		if(x>y) 
		{
			sub= x-y;
			System.out.println("O valor da subtração de x por y equivale a: " +sub);
		}
		else
		{
			sub= y-x;
			System.out.println("O valor da subtração de y por x equivale a: " +sub);
		}
	}

}
