import java.util.*;
public class L3Q7 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int pessoas = Integer.parseInt(in.nextLine());
        int[] poder = new int[pessoas];
        int[] resultados = new int[pessoas];
        int inimigos = 0;

        for (int i=0;i<pessoas;i++) {
            poder[i] = Integer.parseInt(in.nextLine());
        }
            int i,j,k,soma=0,somatemp;
            int[] diferenca = new int[2];
            for (i=0;i<poder.length;i++) {
                for (j=i;j<poder.length;j++) {
                    for (k=i,somatemp=0; k<=j;k++) {
                        somatemp+=poder[k];
                    }
                    if (somatemp>=soma) {
                        soma = somatemp;
                        diferenca[0] = i;
                        diferenca[1] = j;
                    }

                }
            }
        if (soma == 0) {
            System.out.println("E uma armadilha");
        } else if (soma != 0 && diferenca[0] == diferenca[1]) {
            System.out.println("Naruto deve libertar somente a posicao " + (diferenca[0]+1));
        } else if (soma !=0 && diferenca[0] != diferenca[1]) {
            System.out.println("Naruto deve libertar da posicao " + (diferenca[0]+1) + " ate a posicao " + (diferenca[1]+1));
        }

        }
    }