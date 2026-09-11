// Ex.24 Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3;
import javax.swing.JOptionPane;
public class divisibilidade
{
    public static void main (String argues[])
    {
        int valor;
        valor= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor aleatório: "));
        if (valor % 2 != 0 && valor % 3 != 0)
        {
            System.out.println("O valor não é divísivel nem por 2, nem por 3;");
            //JOptionPane.showMessageDialog(null, "O valor não é divísivel nem por 2, nem por 3;");
        }
        else
        {
            if (valor % 2 == 0 && valor % 3 != 0)
            {
                System.out.println("O valor é divísivel por 2;");
                }
            else
            {
                if (valor % 3 == 0 && valor % 2 != 0)
                {
                    System.out.println("O valor é divísivel por 3;");
                }
                else
                {
                    if (valor % 2 == 0 && valor % 3 == 0)
                    {
                        System.out.println("O valor é divísivel por 2 e 3;");
                    }
                }
            }
        }
    }
}