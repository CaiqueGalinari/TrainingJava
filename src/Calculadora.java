public class Calculadora {

    float n1, n2;
    float resultado;

    public Calculadora() {
    }

    //Menu interativo (copie e cole na main para testar):
    /*
        //Declarando variáveis
        int choice;
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        //Menu interativo
        while(true){
            System.out.println("Qual operação você deseja fazer?\n1 - Usar a Calculadora\n2 - Sair");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("\nDigite a operação que deseja realizar:\n1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação");
                    choice = scanner.nextInt();
                    System.out.println("Digite o primeiro valor que deseja realizar a operação (em caso de divisão, ele será o dividendo): ");
                    calculadora.n1 = scanner.nextFloat();
                    System.out.println("Digite o segundo valor que deseja realizar a operação: ");
                    calculadora.n2 = scanner.nextFloat();
                    switch(choice){
                        case 1: calculadora.soma(); break;
                        case 2: calculadora.subtracao(); break;
                        case 3: calculadora.divisao(); break;
                        case 4: calculadora.multiplicacao(); break;
                        default:
                            System.out.println("Comando inválido, tente novamente...");
                            continue;
                    }
                    System.out.println("O resultado é: " + calculadora.resultado + "\nGostaria de continuar usando?\n1 - Sim\n2 - Não");
                    choice = scanner.nextInt();
                    switch(choice){
                        case 1: continue;
                        case 2: break;
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
}
