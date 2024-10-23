package com.mycompany.cifracesar;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CifraTransp {
    public static String criptografar(String mensagem, String chave) {
        // Remover espaços da mensagem
        mensagem = mensagem.replaceAll(" ", "");

        // Determinar o número de colunas com base no comprimento da chave
        int numColunas = chave.length();

        // Preencher a mensagem com 'x' se necessário
        while (mensagem.length() % numColunas != 0) {
            mensagem += 'x';
        }

        // Dividir a mensagem em uma matriz de caracteres
        int numLinhas = mensagem.length() / numColunas;
        char[][] matriz = new char[numLinhas][numColunas];
        int index = 0;
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                matriz[i][j] = mensagem.charAt(index++);
            }
        }

        // Criar um array para representar a ordem das colunas com base na chave
        Integer[] ordem = new Integer[numColunas];
        for (int i = 0; i < numColunas; i++) {
            ordem[i] = i;
        }

        // Ordenar a chave alfabeticamente e reordenar as colunas
        Arrays.sort(ordem, Comparator.comparingInt(i -> chave.charAt(i)));

        // Construir o texto cifrado lendo as linhas da matriz reorganizada
        StringBuilder textoCifrado = new StringBuilder();
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                textoCifrado.append(matriz[i][ordem[j]]);
            }
        }

        return textoCifrado.toString();
    }
    public static String decriptografar(String mensagem, String chave){
        // Determinar o número de colunas com base no comprimento da chave
        int numColunas = chave.length();

        // Calcular o número de linhas
        int numLinhas = textoCifrado.length() / numColunas;

        // Criar uma matriz vazia para armazenar os caracteres
        char[][] matriz = new char[numLinhas][numColunas];

        // Criar um array para representar a ordem das colunas com base na chave
        Integer[] ordem = new Integer[numColunas];
        for (int i = 0; i < numColunas; i++) {
            ordem[i] = i;
        }

        // Ordenar a chave alfabeticamente e descobrir a ordem original das colunas
        Arrays.sort(ordem, Comparator.comparingInt(i -> chave.charAt(i)));

        // Preencher a matriz com o texto cifrado com base na ordem das colunas
        int index = 0;
        for (int i = 0; i < numColunas; i++) {
            int colunaOriginal = ordem[i]; // Coluna na ordem original
            for (int j = 0; j < numLinhas; j++) {
                matriz[j][colunaOriginal] = textoCifrado.charAt(index++);
            }
        }

        // Construir o texto decifrado lendo a matriz linha por linha
        StringBuilder textoDecifrado = new StringBuilder();
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                textoDecifrado.append(matriz[i][j]);
            }
        }

        return textoDecifrado.toString();
    }
}
