import Exercise2Prog2.Carro;
import Exercise2Prog2.Moto;
import org.w3c.dom.ls.LSOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Dev!");
    }

    //Exercícios CodeWars
    // 1 - 25/11/24 - "Like System" //// used: switch case
    public static String whoLikesIt(String... names) {
        //I already made that in C, so I'll try to use switch case now, since I made with If-else
        switch(names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return (names[0] + " likes this");
            case 2:
                return (names[0] + " and " + names[1] + " like this");
            case 3:
                return (names[0] + ", " + names[1] + " and " + names[2] + " like this");
            default:
                return (names[0] + ", " + names[1] + " and " + (names.length - 2) + " like this");
        }
    }


    //Fim Exercícios CodeWars
}

    //Exercícios de prog 2 da faculdade:
    // 1 - Modularização - (Classe Calculadora) 30/11/24
    /*
    Descrição:
Implemente uma classe chamada Calculadora com métodos para soma, subtração,
multiplicação e divisão. Crie uma classe Principal para chamar e testar os métodos da
calculadora.

Desafio Extra:
Adicione um menu interativo no méttodo main que permita o usuário escolher qual operação
realizar*/

    // 2 - Abstração - implementação de interface em classe (carro implements veiculo) (Não completei por não ver sentido em continuar) 01/12/24
    /*
    Descrição:
Implemente uma interface chamada Veiculo com os métodos acelerar(), frear(), buzinar(),
debrear(), passarMarcha(), ligarSom(), abrirVidro(), fecharVidro(), ligarAlarme(),
desligarAlarme(), ligarVeiculo(), desligarVeiculo(). Crie as classes Carro e Moto que
implementam a interface Veiculo. No méttodo main, crie instâncias de Carro e Moto e chame
seus métodos.
*/

    // 3 - Encapsulamento - ContaBancaria 03/12/24
    /*
    Descrição:
Crie a classe ContaBancaria com os atributos saldo (privado), titular e numeroConta.
Adicione métodos públicos para depositar, sacar e exibirSaldo. No méttodo main, crie uma
instância de ContaBancaria, realize operações e exiba os resultados.

    Desafio Extra:
Adicione uma validação para evitar saques superiores ao saldo disponível
*/

    // 4 - Reúso de Código 04/12/24
    /*
    Use a classe Calculadora criada no exercício de Modularização. Crie uma nova classe
chamada CalculadoraAvancada que herda de Calculadora e adicione métodos para cálculos
avançados, como raiz quadrada, exponencial, logaritmo e potência. Teste os novos métodos
no méttodo main.
*/