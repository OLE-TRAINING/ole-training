import javax.swing.*;

public class exer9cap3 {

    public static void main (String args[]){
        String nome = null;
        int resposta;
        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
        } else {
            JOptionPane.showMessageDialog(null, "Seu nome não é " + nome);
        }
    }
}