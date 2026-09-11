// Ex.27 Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h;
import javax.swing.JOptionPane;
public class velocmedia
{
    public static void main (String argues[])
    {
        int nvol, ext, temp;
        double vm, dist;
        nvol=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de voltas percorridas: "));
        temp=Integer.parseInt(JOptionPane.showInputDialog("Digite a o tempo em minutos que a pista foi percorrida: "));
        ext=Integer.parseInt(JOptionPane.showInputDialog("Digite a extensão em metros da pista que foi percorrida: "));
        dist= ext*nvol;
        vm= ((dist/1000)/(temp/60));
        System.out.println("A velocidade média do trajeto equivale a: " +vm+ " km/h;");
    }
}