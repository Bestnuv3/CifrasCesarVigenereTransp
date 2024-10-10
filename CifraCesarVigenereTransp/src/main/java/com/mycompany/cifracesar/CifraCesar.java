package com.mycompany.cifracesar;

public class CifraCesar {
    public static String encriptar(String textoOriginal, int chave) {
    String textoCifrado = "";
 
    for (int i = 0; i < textoOriginal.length(); i++) {
        textoCifrado += encriptar(textoOriginal.charAt(i), chave);
    }
 
    return textoCifrado;
} // Junta caractéres criptografados
 
    public static char encriptar(char charOriginal, int chave) {
        char charCifrado;

        if (charOriginal >= 97 && charOriginal <= 122) {
            charCifrado = (char) ((charOriginal - 97 + chave) % 26 + 97);
        }
        else if (charOriginal >= 65 && charOriginal <= 90) {
            charCifrado = (char) ((charOriginal - 65 + chave) % 26 + 65);
        }
        else {
            charCifrado = charOriginal;
        }

        return charCifrado;
    }// Criptografa os caractéres
    
    public static String desencriptar(String textoCifrado, int chave){
        String textoOriginal = "";
        
        for (int i = 0; i < textoCifrado.length(); i++) {
            textoOriginal += desencriptar(textoCifrado.charAt(i), chave);
    }
        
        return textoOriginal;
    }// Junta caractéres descriptografados
    
    public static char desencriptar(char charCifrado, int chave){
        char charOriginal;

        if (charCifrado >= 97 && charCifrado <= 122) {
            charOriginal = (char) ((charCifrado - 97 - chave + 26) % 26 + 97);
        }
        else if (charCifrado >= 65 && charCifrado <= 90) {
            charOriginal = (char) ((charCifrado - 65 - chave + 26) % 26 + 65);
        }
        else {
            charOriginal = charCifrado;
        }
        
        return charOriginal;
    }// Descriptografa os caractéres
}
