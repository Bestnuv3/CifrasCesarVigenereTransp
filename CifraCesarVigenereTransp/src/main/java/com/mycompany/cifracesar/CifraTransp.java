package com.mycompany.cifracesar;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CifraTransp {
    public static String criptografar(String texto, String chave) {
        int numColunas = chave.length();
        int numLinhas = (int) Math.ceil((double) texto.length() / numColunas);
        char[][] matriz = new char[numLinhas][numColunas];

        // Preencher a matriz
        int index = 0;
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                if (index < texto.length()) {
                    matriz[i][j] = texto.charAt(index++);
                } else {
                    matriz[i][j] = '\0'; // Preencher com caracteres nulos
                }
            }
        }

        // Criptografar com a chave
        StringBuilder resultado = new StringBuilder();
        char[] chaveC = chave.toCharArray();
        Arrays.sort(chaveC);
        for (int k : chaveC) {
            for (int i = 0; i < numLinhas; i++) {
                if (matriz[i][k] != '\0') {
                    resultado.append(matriz[i][k]);
                    System.out.println(resultado);
                }
            }
        }
        return resultado.toString();
    }
    // Função para descriptografar
    public static String descriptografar(String texto, String chave) {
        int numColunas = chave.length();
        int numLinhas = (int) Math.ceil((double) texto.length() / numColunas);
        char[][] matriz = new char[numLinhas][numColunas];

        // Preencher a matriz na ordem da chave
        int index = 0;
//        for (int k : chave) {
//            for (int i = 0; i < numLinhas; i++) {
//                if (index < texto.length()) {
//                    matriz[i][k] = texto.charAt(index++);
//                }
//            }
//        }
        // Ler a matriz linha por linha para recuperar o texto original
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                if (matriz[i][j] != '\0') {
                    resultado.append(matriz[i][j]);
                }
            }
        }
        return resultado.toString();
    }
}
