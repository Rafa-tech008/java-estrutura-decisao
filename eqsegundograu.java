// Ex.20 Receba 3 coeficientes A, B e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre;
import javax.swing.JOptionPane;
public class eqsegundograu 
{
	public static void main (String argues[])
	{
		int a, b, c, delta;
		double x1, x2;
		a= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a na equação: "));
		b= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b na equação: "));
		c= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c na equação: "));
		delta= ((b*b)-(4*a*c));
		
		if (delta<0)
		{
			System.out.println("Não existem raízes");
		}
		else
		{
			x1= ((-b+Math.sqrt(delta))/(2*a));
			x2= ((-b-Math.sqrt(delta))/(2*a));	
			
			if (delta==0)
			{
				System.out.println("Apenas existe uma raíz na equação: " +x1);
			}
			else
			{
				System.out.println("Existem mais de uma raíz na equação, sendo que");
				System.out.println("A raíz 1 equivale a: " +x1);
				System.out.println("A raíz 2 equivale a: " +x2);
			}
		}
	}
}
