// Ex. 25 Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro;
import javax.swing.JOptionPane;
public class tempodeumjogo
{
    public static void main (String argues[])
    {
        int hin, hfi, min, mfi;
        double end, ini, dur;
        hin=Integer.parseInt(JOptionPane.showInputDialog("Receba a hora inicial: "));
        hfi=Integer.parseInt(JOptionPane.showInputDialog("Receba a hora final: "));
        min=Integer.parseInt(JOptionPane.showInputDialog("Receba o minuto inicial: "));
        mfi=Integer.parseInt(JOptionPane.showInputDialog("Receba o minuto final: "));
        ini=((hin*60)+min);
        end=((hfi*60)+mfi);
        dur= (end-ini);
        if (dur<=0)
        {
            dur=(dur+1440);
        }    
        hfi=(int)(dur/60);
        mfi=(int)(dur%60);
        System.out.println("A duração do jogo foi de " +hfi+ " horas e " +mfi+ " minutos;");
    }
}