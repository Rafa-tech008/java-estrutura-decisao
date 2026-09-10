// Ex.22 Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente;
import javax.swing.JOptionPane;
public class ordcrescente 
{
	public static void main (String argues [])
	{
		int x, y;
		x= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para x: "));
		y= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para y: "));
		if (x==y)
		{
			System.out.println("Valores iguais, operação inválida;");
		}
		else
		{
			if(x>y)
			{
				System.out.println("A ordem é a seguinte: " +y+ "," +x);
			}
			else{
				{
					System.out.println("A ordem é a seguinte: " +x+ "," +y);
				}
			}
		}
	}
}
