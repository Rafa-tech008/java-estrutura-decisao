// Ex.28 Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
//Venda Mensal	Preço Atual	Preço Novo
//< 500	< 30	+ 10%
//>= 500 e < 1000	>= 30 e < 80	+15%
//>= 1000	>= 80	- 5%
//Obs.: para outras condições, preço novo será igual ao preço atual.
import javax.swing.JOptionPane;
public class tabeladeprecos
{
    public static void main (String argues[])
    {
        int pat, mms;
        double pcn;
        pat=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do preço atual do produto: "));
        mms=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da média mensal de um produto: "));
        if (pat < 30 && mms < 500)
        {
            pcn= (pat+(pat*0.1));
            System.out.println("O novo valor equivale a: " +pcn);
        }
        else
            if (pat >= 30 && pat<80 && mms >= 500 && mms < 1000)
            {
                pcn= (pat+(pat*0.15));
                System.out.println("O novo valor equivale a: " +pcn);
            }
            else
            {
                if (pat >= 80 && mms >= 1000)
                {
                    pcn= (pat-(pat*0.05));
                    System.out.println("O novo valor equivale a: " +pcn);
                }
                else
                {
                   System.out.println("O valor se mantém o mesmo, sendo: " +pat);
                }
        }
    }
}