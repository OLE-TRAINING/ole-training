package Exer13Chapter4;

import java.util.Scanner;
import java.util.List;

public class Register extends Person{

    public void cadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("CADASTRO ");
        System.out.println("Nome: ");
        setNome(sc.nextLine());
        System.out.println("Idade: ");
        setIdade(sc.nextInt());
        sc.nextLine();
        System.out.println("CPF: ");
        setCpf(sc.nextLine());
        setEndereco(new Address());
        System.out.println("Telefone: ");
        getEndereco().setTelefone(sc.nextLine());
        System.out.println("ENDEREÇO:");
        System.out.println("Rua e Número da Casa: ");
        getEndereco().setRua(sc.nextLine());
        System.out.println("Bairro: ");
        getEndereco().setBairro(sc.nextLine());
        System.out.println("CEP: ");
        getEndereco().setCep(sc.nextLine());
        System.out.println("Cidade: ");
        getEndereco().setCidade(sc.nextLine());
        System.out.println("Estado: ");
        getEndereco().setEstado(sc.nextLine());
    }

    public static void apagarCadastro(List reg, int posicao){
        reg.remove(posicao);
    }
}