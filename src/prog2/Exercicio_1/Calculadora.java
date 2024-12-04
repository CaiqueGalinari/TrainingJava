package prog2.Exercicio_1;

public class Calculadora {

    public double n1, n2;
    protected double resultado;

    public Calculadora() {}

    //Menu interativo (já implementado o exercício 4) (copie e cole na main para testar):
    /*
    //Declarando variáveis
        int choice;
        Scanner scanner = new Scanner(System.in);
        prog2.Exercicio_1.Exercicio_2.Exercicio_4.CalculadoraAvancada calculadora = new prog2.Exercicio_1.Exercicio_2.Exercicio_4.CalculadoraAvancada();

        //Menu interativo
        while (true) {
            System.out.println("Qual operação você deseja fazer?\n1 - Usar a prog2.Exercicio_1.Calculadora\n2 - Sair");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nDigite a operação que deseja realizar:\n1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação\n5 - Raiz Quadrada\n6 - Exponencial\n7 - Logaritmo");
                    choice = scanner.nextInt();
                    System.out.println("Digite o primeiro valor que deseja realizar a operação (em caso de divisão, ele será o dividendo): ");
                    calculadora.n1 = scanner.nextFloat();
                    if(choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 6) {
                        System.out.println("Digite o segundo valor que deseja realizar a operação: ");
                        calculadora.n2 = scanner.nextFloat();
                    }
                    switch (choice) {
                        case 1:
                            calculadora.soma();
                            break;
                        case 2:
                            calculadora.subtracao();
                            break;
                        case 3:
                            calculadora.divisao();
                            break;
                        case 4:
                            calculadora.multiplicacao();
                            break;
                        case 5:
                            calculadora.raizQuadrada();
                            break;
                        case 6:
                            calculadora.exponencial();
                            break;
                        case 7:
                            calculadora.logaritmo();
                            break;
                        default:
                            System.out.println("Comando inválido, tente novamente...");
                            continue;
                    }
                    calculadora.getResult();
                    System.out.println("\nGostaria de continuar usando?\n1 - Sim\n2 - Não");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            continue;
                        case 2:
                            break;
                        default:
                            System.out.println("Comando inválido, tente novamente...");
                            continue;
                    }
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Comando inválido, digite novamente");
                    continue;
            }
            break;
        }
    * */

    //soma
    public void soma(){
        this.resultado = this.n1 + this.n2;
    }

    //subtração
    public void subtracao(){
        this.resultado = this.n1 - this.n2;
    }

    //multiplicação
    public void multiplicacao(){
        this.resultado = this.n1 * this.n2;
    }

    //divisão
    public void divisao(){
        this.resultado = this.n1 / this.n2;
    }

    //resultado
    public void getResult(){System.out.println("\nO resultado é: " + this.resultado);}
}
