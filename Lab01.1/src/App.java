
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        //Nivel 1
        System.out.println("-------------- Nivel 1 --------------");
        int a = 5, b = 1, c = 3;

        int[] numeros = {a, b, c};

        Arrays.sort(numeros);

        for (int i = 0;i < numeros.length; i++) {
            System.out.print(numeros[i] + "\n");
        }
        
        //Nivel 2
        System.out.println("-------------- Nivel 2 --------------");

        int[] valores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        //Nivel 3
        System.out.println("-------------- Nivel 3 --------------");
        int horas = 0, minutos = 0, segundos = 0;

        int intervalo = 5000;

        System.out.println("Antes da soma:");
        System.out.printf("Horas: %02d%nMinutos: %02d%nSegundos: %02d%n",horas, minutos, segundos);

        int totalSegundos = horas * 3600 + minutos * 60 + segundos;

        totalSegundos += intervalo;
        horas = totalSegundos / 3600;
        minutos = (totalSegundos % 3600) / 60;
        segundos = totalSegundos % 60;

        System.out.println("Depois da soma:");
        System.out.printf("Horas: %02d%nMinutos: %02d%nSegundos: %02d%n",horas, minutos, segundos);

        //Nivel 4
        System.out.println("-------------- Nivel 4 --------------");

        double novoValores [] = {2, 6, 13, 24, 9, 15, 43, 27, 35, 19};
        int findNumber = 6;

        System.out.println("Conteudo do array: ");
        for(int i=0; i < novoValores.length; i++){
            System.out.println(novoValores[i] + " ");
        }

        System.out.println("Número a procurar:" + findNumber);

        boolean isFound = false;

        for (int i=0; i < novoValores.length; i++){
            if (novoValores[i] == findNumber){
                isFound = true;
                System.out.println("Numero encontrado no indice: " +i);
                break;
            }
        }

        if (!isFound) {
            System.out.println("Numero não encontrado");
        }

        //Nivel 5
        System.out.println("-------------- Nivel 5 --------------");

        String nomeCompleto = "Jonas Pistolas";

        String [] palavras = nomeCompleto.split(" ");

        System.out.println("Nome: " + palavras[0]);
        System.out.println("Apelido: " + palavras[1]);
        
    }
}