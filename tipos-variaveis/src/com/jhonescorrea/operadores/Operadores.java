package com.jhonescorrea.operadores;

public class Operadores {
    public static void main (String [] args) {
        String nome = "JHONES"; //Atribuição: utilizando o operador "="
        double soma = 125.52 + 100; //Soma: utilizando o operador "+"
        int subtracao = 100 - 100; //Subtração: utilizando o operador "-"
        double divisao = 15 / 3; //Divisão: utilizando o operador "/"
        int modulo = 18 % 3; //Modulo: utilizando o operador "%"
        double resultado = (15 * 3) + (20 / 4); //resultado : isolando as operações com "()"
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        //Concatenando inteiro com texto

        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        int numeroNegativo = -31;
        numeroNegativo = numeroNegativo * -1;
        System.out.println(numeroNegativo);

        //Operador ternario "?" ":"
        int a, b;
        a = 5;
        b = 6;

        String testarResultado = a==b ? "verdadeiro" : "falso";
        System.out.println(testarResultado);

        //Operadores relacionais

        int numero1 = 5;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Numero 1 é igual ao numero 2?: " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 é igual ao numero 2?: " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero 1 é igual ao numero 2?: " + simNao);

        if(numero1 > numero2){
             System.out.println("Expressão é verdadeira!");
        }else {
            System.out.println("Condição é falsa!");
        }

        //Operadores lógicos && ||

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("Uma de duas condições é verdadeiras");
        }



        System.out.println("fim");


    }

}
