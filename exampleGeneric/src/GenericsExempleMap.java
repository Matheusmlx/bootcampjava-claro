package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GenericsExempleMap {
    public static void main(String[] args) {
        // Exemplo sem Generics
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1", 10);
        mapaSemGenerics.put("Chave 2", "valor"); // permite adicionar qualquer tipo de dado

        //Exemplo com Generics
        Map<String,String> mapaComGenerics = new HashMap<>();
        mapaComGenerics.put("1","Valor 1");
        mapaComGenerics.put("2","Valor 1");

        // Iterando sobre o mapa com Generics
        for(Map.Entry<String, String> entry: mapaComGenerics.entrySet()) {
            String chave = entry.getKey();
            String valor = entry.getValue();
            System.out.println("Chave " + chave + " Valor" + valor);
        }

        // Iterando sobre a mapa sem Generics
        for(Object obj: mapaSemGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();

            System.out.println("Chave Sem Generics " + chave + "Valor " + valor);
        }
    }
}
