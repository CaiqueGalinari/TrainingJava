import prog2.Exercicio_3.ContaBancaria;
import prog2.Exercicio_4.CalculadoraAvancada;

import java.util.Scanner;

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
    // 1 - Modularização - (Classe prog2.Exercicio_1.Calculadora) 30/11/24
    /*
    Descrição:
Implemente uma classe chamada prog2.Exercicio_1.Calculadora com métodos para soma, subtração,
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

    // 3 - Encapsulamento - prog2.Exercicio_1.Exercicio_2.Exercicio_3.ContaBancaria 03/12/24
    /*
    Descrição:
Crie a classe prog2.Exercicio_1.Exercicio_2.Exercicio_3.ContaBancaria com os atributos saldo (privado), titular e numeroConta.
Adicione métodos públicos para depositar, sacar e exibirSaldo. No méttodo main, crie uma
instância de prog2.Exercicio_1.Exercicio_2.Exercicio_3.ContaBancaria, realize operações e exiba os resultados.

    Desafio Extra:
Adicione uma validação para evitar saques superiores ao saldo disponível
*/

    // 4 - Reúso de Código - calculadora avançada 04/12/24
    /*
    Descrição:
    Use a classe prog2.Exercicio_1.Calculadora criada no exercício de Modularização. Crie uma nova classe
chamada prog2.Exercicio_1.Exercicio_2.Exercicio_4.CalculadoraAvancada que herda de prog2.Exercicio_1.Calculadora e adicione métodos para cálculos
avançados, como raiz quadrada, exponencial, logaritmo e potência. Teste os novos métodos
no méttodo main.
*/

    // 5 - Classes - pessoa e estudante 04/12/24
    /*
    Descrição:
Crie uma classe Pessoa com atributos nome e idade, ambos privados. Adicione um méttodo
construtor para inicializar os atributos e métodos para obter e modificar os valores dos
atributos. Crie um méttodo apresentar() que exibe uma mensagem com o nome e a idade da
pessoa. No méttodo main, crie várias instâncias de Pessoa e exiba suas informações.

    Desafio Extra:
Crie uma subclasse Aluno que herda de Pessoa e adicione o atributo matricula.
*/

    //6 - Exercício Integrado - generics e subclasses 10/12/24 (NÃO ESTÁ COMPLETO AINDA)
    /*
    Descrição:
Crie um programa que gerencie uma frota de veículos. Implemente uma interface Veiculo
com métodos genéricos. Crie classes concretas Carro e Caminhao que implementam a
interface. Crie uma classe Frota para armazenar e gerenciar veículos, com métodos para
adicionar e listar veículos. No méttodo main, simule operações como adicionar veículos à
frota e listar detalhes.
    Desafio Extra:
Use herança para criar subclasses de Carro e Caminhao, como CarroEsportivo e
CaminhaoCarga.
*/