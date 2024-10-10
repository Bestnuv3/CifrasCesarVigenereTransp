package com.mycompany.cifracesar;

public class CifraVigenere {
    public static String criptografar(String texto, String chave) {
        StringBuilder resultado = new StringBuilder();
        chave = chave.toLowerCase();
        
        int chaveIndex = 0;
        for (int i = 0; i < texto.length(); i++) {
            char charTexto = texto.charAt(i);
            if (Character.isLetter(charTexto)) {
                char base = Character.isLowerCase(charTexto) ? 'a' : 'A';
                int deslocamento = chave.charAt(chaveIndex % chave.length()) - 'a';
                char charCifrado = (char) ((charTexto - base + deslocamento) % 26 + base);
                resultado.append(charCifrado);
                chaveIndex++;
            } else {
                resultado.append(charTexto); // Não altera caracteres não alfabéticos
            }
        }
        return resultado.toString();
    }
    public static String descriptografar(String texto, String chave) {
        StringBuilder resultado = new StringBuilder();
        chave = chave.toLowerCase();

        int chaveIndex = 0;
        for (int i = 0; i < texto.length(); i++) {
            char charTexto = texto.charAt(i);
            if (Character.isLetter(charTexto)) {
                char base = Character.isLowerCase(charTexto) ? 'a' : 'A';
                int deslocamento = chave.charAt(chaveIndex % chave.length()) - 'a';
                char charDecifrado = (char) ((charTexto - base - deslocamento + 26) % 26 + base);
                resultado.append(charDecifrado);
                chaveIndex++;
            } else {
                resultado.append(charTexto); // Não altera caracteres não alfabéticos
            }
        }
        return resultado.toString();
    }
}
