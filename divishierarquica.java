// Ex.26 Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor;
import javax.swing.JOptionPane;
public class divishierarquica
{
    public static void main (String argues[])
    {
        int x, y, div;
        x= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para x: "));
        y= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para y: "));
        if (x>y)
        {
            div= (x%y);
            if (div==0)
            {
                System.out.println("O valor de x é divisível por y;");
            }
            else
            {
                System.out.println("O valor de x não é divisível por y;");
            }
        }
        else{
                div= (y%x);
                if(div==0)
                {
                    System.out.println("O valor de y é divisível por x;");
                }
                else
                {
                    System.out.println("O valor de y não é divisível por x;");
                }
        }
    }
}