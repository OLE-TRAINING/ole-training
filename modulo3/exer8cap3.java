import javax.swing.JOptionPane;

public class exer8cap3 {

    public static void main (String args[]){
        String nome;
        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String mensagem = nome+" você informou o seu nome";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}