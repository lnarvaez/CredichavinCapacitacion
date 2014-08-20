package ejercicios03_1.fflores;

import java.util.*;

/**
 *
 * @author ffloresj
 */
public class Criptografia {

    //186    
    public static String getNumeroCifrado(int nNumero) {

        int u = nNumero % 10;
        u += 7;
        u %= 10;

        nNumero = nNumero / 10;
        int d = nNumero % 10;
        d += 7;
        d %= 10;

        nNumero = nNumero / 10;
        int c = nNumero % 10;
        c += 7;
        c %= 10;

        nNumero = nNumero / 10;
        int m = nNumero % 10;
        m += 7;
        m %= 10;

        String res = d + "" + u + "" + m + "" + c;

        return res;

    }

    public static String getNumeroNormal(int nNumero) {

        int u = nNumero % 10;
        if (u == 0) {
            u += 10;
            u = (u * 10) + (u % 10);
            u -= 7;
            u %= 10;
        } else {
            u = (u * 10) + (u % 10);
            u -= 7;
            u %= 10;
        }

        nNumero = nNumero / 10;
        int d = nNumero % 10;
        if (d == 0) {
            d += 10;
            d = (d * 10) + (d % 10);
            d -= 7;
            d %= 10;
        } else {
            d = (d * 10) + (d % 10);
            d -= 7;
            d %= 10;
        }

        nNumero = nNumero / 10;
        int c = nNumero % 10;
        if (c == 0) {
            c += 10;
            c = (c * 10) + (c % 10);
            c -= 7;
            c %= 10;
        } else {
            c = (c * 10) + (c % 10);
            c -= 7;
            c %= 10;
        }

        nNumero = nNumero / 10;
        int m = nNumero % 10;
        if (m == 0) {
            m += 10;
            m = (m * 10) + (m % 10);
            m -= 7;
            m %= 10;
        } else {
            m = (m * 10) + (m % 10);
            m -= 7;
            m %= 10;
        }
        String res2 = d + "" + u + "" + m + "" + c;
        return res2;

    }

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba un número:  ");
        int nNum = entrada.nextInt();
        Criptografia.getNumeroCifrado(nNum);
        System.out.println("El número cifrado es:   " + getNumeroCifrado(nNum));

        System.out.println("--------------------------------------------------------");
        System.out.println("Escriba número cifrado: ");
        int nNumCi = entrada.nextInt();
        Criptografia.getNumeroNormal(nNumCi);
        System.out.println("El número normal es:    " + getNumeroNormal(nNumCi));

    }

}
