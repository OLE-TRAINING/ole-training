package Exer13Chapter4;

import java.util.ArrayList;
import java.util.List;

public class Exer13cap4 {

    public static void main(String args[]) {
        List<Register> registrator = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Register aux = new Register();
            aux.cadastrar();
            registrator.add(aux);
        }

        Register.apagarCadastro(registrator,1);

        for (int j = 0; j < registrator.size(); j++){
            System.out.println();
            registrator.get(j).status();
            System.out.println();
        }
    }
}