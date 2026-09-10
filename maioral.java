// Ex.19 Receba 2 valores reais. Calcule e mostre o maior deles;
import javax.swing.JOptionPane;
public class maioral 
{
	public static void main (String argues [])
	{
		int x,y;
		x= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para x: "));
		y= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para y: "));
		if(x<y)
		{
			System.out.println("O valor de y é o maior: " +y);
		}
		else
		{
			System.out.println("O valor de x é o maior: " +x);
		}
	}
}
