package br.com.bytebank.test;

public class TesteArraysDePrimitivos {

	//Array []
    public static void main(String[] args) {

        int[]idades = new int[5]; //inicializa o array com os valores padroes

        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;

        int idade1 = idades[4];
        
        for(int i = 0; i < idades.length; i++) {
        	System.out.println(idades[i] = i * i);
        }

        for(int i = 0; i < idades.length; i++) {
            System.out.println("O valor da casa " + i + " é " + idades[i]);
        }

      System.out.println(idade1);

    }

}
