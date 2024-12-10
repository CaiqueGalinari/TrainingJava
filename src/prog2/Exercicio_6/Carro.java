package prog2.Exercicio_6;

import java.util.Random;
import java.util.Scanner;

public class Carro implements IVeiculo{
    String chave = new String(), testChave = new String();
    boolean aberto = false;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void getChave(Object chave) {
        Random random = new Random();
        chave = random.nextInt(1000, 9999);
        this.chave = chave.toString();
    }

    @Override
    public void verifyChave(Object chave) {
        System.out.println("Qual a chave do carro? ");
        testChave = this.scanner.nextLine();
        if(testChave.equals(chave)){
            System.out.println("Bem vindo!");
            aberto = true;
        } else{
            aberto = false;
            System.out.println("Essa não é a chave");
            for(int i = 0; i < 20; i++){
                System.out.println("\nBEEP");
            }
        }
    }
}
