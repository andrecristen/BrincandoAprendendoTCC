package com.example.andrecristen.brincandoeaprendendo;


public class RacicinioLogico {

    private String mQuestoes [] = {
            "Uma caixa de ovos é composta por 12 ovos. Quantas caixas necessito para ter 84 ovos ?", //1
            "Fui à uma loja e comprei 300 balas. Comi 173 e dei 94 para meu irmão. Quantas balas me restaram?", //2
            "Meu pai me comprou um violão de 300 reais, 8 CD's de 10 reais e uma camiseta de 30 reais. Entregando 500 reais ao caixa, quanto lhe restou de troco ?\n", //3
            "O Sítio de Aline, em uma semana, produziu 900 ovos, a serem vendidos em bandejas com 10 ovos, cada. Se todas as bandejas foram vendidas por R$ 4,00, cada uma; no total, quanto o Sítio de Aline faturou com essa venda?   \n", //4
            "Sabendo que um pato tem 2 patas, quantas patas tem 35 patos ?", //5
            "Sabendo que 1Km tem 1000 metros, quantos quilômetros tem 3500 metros ?\n", //6
            "André tem três notas em provas de matemática. Na primeira tirou 8, na segunda 6 e na terceira 4. Determine a média de André no bimestre!    \n", //7
            "Adrian nasceu no ano de 1997, quando estivermos no ano 2060, qual será sua idade?", //8
            "Morgana  tem três maçãs. Se ela pegar as três sementes que cada maçã que possui e plantar, cada nova árvore no futuro irá gerar 17 maçãs, quantas maçãs Morgana terá?\n", //9
            "Tendo-se um retângulo de base 5 e altura 4, calcule sua área.", //10
            "O que representa uma dízima periódica. Ex: 5,5444 ?\n", //11
            "Considerando um mês de 30 dias, 15 dias representam quanto por cento de 1 bimestre? Sabe-se que 1 bimestre é igual a 2 meses", //12
            "Um metro corresponde a 100 centímetros. Quanto corresponde um quarto de um metro ?\n", //13
            "Coloque os números a seguir em ordem CRESCENTE: 7, 10, 40, 4, 15, 29\n",//14
            "Agora os escreva em ordem DECRESCENTE: 1, 3, 20, 12, 7, 19\n",//15
            "Rosa tem 30 rosas para distribuir em 5 vasos. Sabendo que todos os vasos devem ter a mesma quantia de rosas, quantas rosas cada vaso deve ter ? \n",//16
            "Continue a sequência a seguir até chegar ao número 32: 4-8-12-16",//17
            "Quantos números tem entre 1 e 45 \n",//18
            "Um quadrado tem 4 lados. Um cubo é composto por 6 quadrados. Quantos lados tem um cubo ?\n",//19
            "Lúcia tem três notas de 10 reais, três de 5 reais e  três moedas de 1 real, e resolveu dividir essa quantia entre outros dois amigos. Quando cada um recebeu ?\n",//20
            "Lucas tem 410 reais, Jaspion tem 100 reais e Lúcio tem 315 reais, e querem alcançar 1000 reais para comprar seu videogame novo. Quanto eles ainda precisam ?\n",//21
            "Sabe-se que 1km é equivalente a 1000 metros. 7,2km equivalem a ?",//22
            "Uma caixa de ovos contém 12 ovos. Quantos ovos tenho com 7 caixas ?\n",//23
            "Ainda sabendo que um caixa contém 12 ovos. Quantas caixas preciso com 84 ovos ?\n",//24
            "Marcelo tem 65 brinquedos divididos em 3 prateleiras dentro de seu quarto. Na primeira estão guardados 16 brinquedos e na segunda 12. Quantos estão na terceira prateleira ?\n"//25





    };


    private String mOpcoes [][] = {
            {"6", "7", "8"},//1
            {"37", "26", "33"},//2
            {"90 reais", "80 reais", "70 reais"},//3
            {"360 reais", "370 reais", "160 reais"},//4
            {"80", "74", "70"},//5
            {"3,5Km", "5Km", "4,5Km"},//6
            {"4", "6", "8"},//7
            {"36", "45", "63"},//8
            {"155", "154", "153"},//9
            {"20m²", "25m²", "30m²"},//10
            {"Quando um número após a vírgula repete infinitamente", "Quando o número é indivisível por ele mesmo", "Quando a multiplicação de um número por 0, resulta em 0"},//11
            {"35%", "30%", "25%"},//12
            {"50cm", "25cm", "30cm"},//13
            {"4, 7, 10, 15, 29, 40\n", "4, 29, 15, 10, 7, 40\n", "40, 29, 15, 10, 7, 4"},//14
            {"19, 20, 12, 7, 1, 3", "20, 19, 7, 12, 1, 3", "20, 19, 12, 7, 3, 1\n"},//15
            {"6", "5", "7"},//16
            {"4-8-12-16-20-24-28-32", "4-8-12-16-20-22-24-32", "2-4-8-16-20-24-28-32"},//17
            {"27", "34", "43"},//18
            {"6", "7", "24"},//19
            {"14 reais", "16 reais", "19 reais"},//20
            {"200 reais", "180 reais", "190 reais"},//21
            {"7200 metros", "7300 metros", "7350 metros"},//22
            {"89", "80", "84"},//23
            {"6", "7", "9"},//24
            {"37", "27", "47"}//25

    };




    private String mRespostaCorreta[] = {"7", "33", "90 reais", "360 reais","70","3,5Km","6","63","153","20m²","Quando um número após a vírgula repete infinitamente","25%","25cm","4, 7, 10, 15, 29, 40\n","20, 19, 12, 7, 3, 1\n","6","4-8-12-16-20-24-28-32","43","6","16 reais","180 reais","7200 metros","84","7","37"};




    public String getQuestao(int a) {
        String questao = mQuestoes[a];
        return questao;
    }


    public String getOpcao1(int a) {
        String Opcao0 = mOpcoes[a][0];
        return Opcao0;
    }


    public String getOpcao2(int a) {
        String Opcao1 = mOpcoes[a][1];
        return Opcao1;
    }

    public String getOpcao3(int a) {
        String Opcao2 = mOpcoes[a][2];
        return Opcao2;
    }

    public String getRespostaCorreta(int a) {
        String Resposta = mRespostaCorreta[a];
        return Resposta;
    }

}
