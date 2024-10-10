package com.mycompany.cifracesar;

import com.mycompany.telas.Janela;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Janela janela = new Janela();
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        
//        int cifra = 0, criptoDescripto=0;
//        String textoModificado="";
//        Scanner input = new Scanner(System.in);
//        
//        String content = new String(Files.readAllBytes(Paths.get("src/texto.txt")));  
//        
//        System.out.println("Qual algoritmo de criptografia voce gostaria de usar?\nCifra de Cesar [1]\nCifra de Vigenere [2]\nCifra de Transposicao [3]");
//        while (cifra!=1&&cifra!=2&&cifra!=3){
//            cifra = Integer.parseInt(input.nextLine());
//        }
//            
//        System.out.println("Você quer criptografar[1] ou descriptografar[2]");
//        while (criptoDescripto!=1&&criptoDescripto!=2){
//            criptoDescripto = Integer.parseInt(input.nextLine());
//        }
//        
//        switch (cifra) {
//            case 1 -> {//Cifra de Cesar---------------------
//                System.out.println("Digite a chave: ");
//                int chaveCesar = Integer.parseInt(input.nextLine());
//                switch (criptoDescripto) {
//                    case 1 -> //Criptografa
//                        textoModificado = CifraCesar.encriptar(content, chaveCesar);
//                    case 2 -> //Descriptografa
//                        textoModificado = CifraCesar.desencriptar(content, chaveCesar);
//                    default -> //Tratamento de Erro
//                        System.out.println("Algo deu errado na Cifra de Cesar");
//                }
//            }
//            case 2 -> {//Cifra de Vinegere------------------
//                System.out.println("Digite a chave: ");
//                String chaveVigenere = input.nextLine();
//                switch (criptoDescripto) { 
//                    case 1 -> {//Criptografa
//                        textoModificado = CifraVigenere.criptografar(content, chaveVigenere);
//                    }
//                    case 2 -> {//Descriptografa
//                        textoModificado = CifraVigenere.descriptografar(content, chaveVigenere);
//                    }
//                    default ->//Tratamento de Erro
//                        System.out.println("Algo deu errado na Cifra de Vigenere");
//                }
//            }
//            case 3 -> {
//                //Cifra de Transposicao--------------
//                System.out.println("Digite o tamanho da chave (número de colunas):");
//                int numColunas = input.nextInt();
//                int[] chaveTransp = new int[numColunas];
//                
//                System.out.println("Digite os índices da chave (separados por espaço):");
//                for (int i = 0; i < numColunas; i++) {
//                    if(numColunas>=input.nextInt()){
//                        i--;
//                        System.out.println("Seu índice não pode ser maior que o número de colunas!");
//                    }else{
//                        chaveTransp[i] = input.nextInt();
//                    }
//                }
//            switch (criptoDescripto) {
//                case 1 -> {//Criptografa
//                    textoModificado = CifraTransp.criptografar(content, chaveTransp);
//                }
//                case 2 -> {//Descriptografa
//                    textoModificado = CifraTransp.descriptografar(content, chaveTransp);
//                }
//                default ->//Tratamento de Erro
//                    System.out.println("Algo deu errado na Cifra de Transposicao");
//            }
//                        }
//            default -> {
//                System.out.println("Ocorreu um erro nas cifras");
//            }
//        }
//        
//        System.out.println(textoModificado);
    }

}
