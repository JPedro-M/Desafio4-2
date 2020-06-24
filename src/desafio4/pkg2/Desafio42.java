package desafio4.pkg2;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class Desafio42 {
    public static void main(String[] args) {
        int numeroDeMatricula;
        double nota;
        
        numeroDeMatricula = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu número de matrícula?"));
        nota = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua nota?"));
        
        if (nota >= 0 && nota < 5) {
            JOptionPane.showMessageDialog(null, "Número de matrícula: "+numeroDeMatricula+"\nConceito: D");
        }else if (nota >= 5 && nota < 7) {
            JOptionPane.showMessageDialog(null, "Número de matrícula: "+numeroDeMatricula+"\nConceito: C");
        }else if (nota >= 7 && nota < 9) {
            JOptionPane.showMessageDialog(null, "Número de matrícula: "+numeroDeMatricula+"\nConceito: B");
        }else{
            JOptionPane.showMessageDialog(null, "Número de matrícula: "+numeroDeMatricula+"\nConceito: A");
        }
    }
}
