package com.mycompany.cifracesar;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CifraTransp {
    public static String criptografar(String texto, String chave) {
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
}
