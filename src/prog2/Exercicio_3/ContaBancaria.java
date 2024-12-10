package prog2.Exercicio_3;

import java.util.Random;
import java.util.Scanner;

public class ContaBancaria {

    //Cole o código abaixo na main para testar:
    /*

        //O banco armazena 100 contas bancárias
        ContaBancaria[] Banco = new ContaBancaria[100];
        Scanner scanner = new Scanner(System.in);
        int choice, placeHolder, senha;
        while(true){
            System.out.println("\nO que você deseja fazer?\n1 - Criar uma conta\n2 - Entrar na sua conta\n3 - Fechar o programa");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    for (int i = 0; i < 100;i++){
                        //Se a posição checada estiver vazia, vai criar nela, se não, vai continuar checando
                        if(Banco[i] == null){
                            Banco[i] = new ContaBancaria();
                            Banco[i].cadastrar();
                            break;
                        }
                    }
                    //Volta pro início do loop em que está diretamente inserido
                    continue;
                case 2:
                    System.out.println("\nDigite o número da sua conta: ");
                    //A princípio o placeholder vai receber o valor que você diz ser o número da sua conta bancária
                    placeHolder = scanner.nextInt();
                    //Pegando qual conta bancária é a sua
                    for (int i = 0; i < 100; i++){
                        if(Banco[i] == null){
                            placeHolder = 150; //Valor acima de 100, que é o limite, para que "dê erro" mais pra frente e retorne para o início
                        } else if(Banco[i].numeroConta == placeHolder){
                            placeHolder = i; //Agora placeHolder recebe a posição da sua conta bancária no vetor Banco
                            break;

                        }
                    }
                    if(placeHolder != 150){
                        while(true) { //Sempre verdade, só sai do loop por meio do break
                            System.out.println("\nDigite a sua senha: ");
                            senha = scanner.nextInt();
                            if (senha == Banco[placeHolder].getSenha()) { //testa se a senha está correta
                                while(true) {
                                    System.out.println("\nBem vindo " + Banco[placeHolder].titular + "!\nO que deseja fazer?\n1 - Verificar o Saldo\n2 - Depositar\n3 - Sacar\n4 - Fechar o programa");
                                    choice = scanner.nextInt();
                                    switch (choice) {
                                        case 1: Banco[placeHolder].getSaldo(); continue;
                                        case 2: Banco[placeHolder].depositar(); continue;
                                        case 3: Banco[placeHolder].sacar(); continue;
                                        case 4: break;
                                        default:
                                            System.out.println("Comando inválido, tente novamente...");
                                            continue;
                                    }
                                    break;
                                }
                                break;
                            }else {
                                System.out.println("Senha inválida, tente novamente...");
                                //Aqui faremos o usuário esperar 30 segundos, caso tenha errado a senha
                                try {
                                    Thread.sleep(30000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                continue;
                            }
                        }
                        break;
                    }else{
                        //Caso o número digitado no placeHolder não corresponda a nenhuma conta
                        System.out.println("\nEssa conta não existe.");
                        continue;
                    }

                case 3: break;
                default:
                    System.out.println("\nOpção inválida, tente novamente...");
                    continue;
            }
            break;
        }

        */


    private float saldo, intermediadorFloat;
    public String titular;
    public int numeroConta = 0; //É importante inicializar para evitar leash de memória e usar na main
    private int senha, intermediadorInt;
    //Vamos usar esse Random para gerar o numero da conta
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public void getSaldo(){
        System.out.println("\nO saldo atual é: " + this.saldo);
    }

    public void depositar(){
        System.out.println("\nDigite o valor que deseja depositar: ");
        this.saldo += scanner.nextFloat();
        System.out.println("\nDepósito efetuado com sucesso!");
    }

    public void sacar(){
        System.out.println("\nDigite o valor que deseja sacar: ");
        this.intermediadorFloat = scanner.nextFloat();
        //O desafio extra é simplesmente isso aqui
        if (this.intermediadorFloat <= this.saldo){
            this.saldo -= this.intermediadorFloat;
            System.out.println("\nSaque efetuado com sucesso!");
        } else {
            System.out.println("\nValor inválido!");
        }

    }

    //Aqui eu faço coisas extras, como criar um cadastro interativo e definir uma senha, o que não é pedido no exercício
    public void cadastrar(){
        System.out.println("\nDigite o nome do titular: ");
        this.titular = scanner.nextLine();

        //Será um loop caso digite uma senha inválida, caso contrário, funcionará normalmente
        while(true){
            System.out.println("\nDigite a sua senha (ela deve conter 4 dígitos): ");
            this.intermediadorInt = scanner.nextInt();
            //Verificando se a senha tem 4 dígitos
            if(this.intermediadorInt >= 1000 || this.intermediadorInt <= 9999){
                this.senha = this.intermediadorInt;
            } else{
                System.out.println("Senha inválida!");
                continue;
            }
            break;
        }

        //O random vai pegar um numero entre 0 e o que você digitar
        this.numeroConta = random.nextInt(89999);
        //Somando 10000, eu garanto que a conta vai ter a quantidade de dígitos que quero
        this.numeroConta += 10000;
        System.out.println("\nO número da sua conta é: " + this.numeroConta);

        System.out.println("\nCadastro efetuado com sucesso!");
    }

    public int getSenha(){
        return this.senha;
    }
}