package vagas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class Result {

   
    public static List<Integer> calculation(int maxDigit) {

      List<Integer> digitos21 = new ArrayList<>();

        String n1 = String.valueOf(maxDigit);
        String n2 = String.valueOf(maxDigit);
        String n3 = String.valueOf(maxDigit);
        String n4 = String.valueOf(maxDigit);
        String valorMaxString = n1 + n2 + n3 + n4;
        int valMax = Integer.parseInt(valorMaxString);

        for (int i = 5555; i <= valMax; i++) {

            String numero = String.valueOf(i);
            char dig1 = numero.charAt(3);
            char dig2 = numero.charAt(2);
            char dig3 = numero.charAt(1);
            char dig4 = numero.charAt(0);

            if (VerificaIgual21(dig1, dig2, dig3, dig4, maxDigit)) {
                digitos21.add(Integer.parseInt(numero));
            }

        }

        return digitos21;

    }
    
    public static boolean VerificaIgual21(char n1, char n2, char n3, char n4, int valorDigitado) {
        String caracter1 = String.valueOf(n1);
        int x1 = Integer.parseInt(caracter1);
        String caracter2 = String.valueOf(n2);
        int x2 = Integer.parseInt(caracter2);
        String caracter3 = String.valueOf(n3);
        int x3 = Integer.parseInt(caracter3);
        String caracter4 = String.valueOf(n4);
        int x4 = Integer.parseInt(caracter4);

        if (x1 > valorDigitado || x2 > valorDigitado || x3 > valorDigitado || x4 > valorDigitado) {
            return false;
        }

        int soma = x1 + x2 + x3 + x4;

        if (soma == 21) {
            return true;
        } else {
            return false;
        }

    }
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int valorDigitado;
        System.out.println("Informe o valor maximo");
        valorDigitado = sc.nextInt();
    
        List<Integer> numeros = Result.calculation(valorDigitado);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        sc.close(); 
        
        
      
    }
}
