package com.company;
import java.util.*;
public class teste {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int lotacao = Integer.parseInt(in.nextLine()), pessoas = 0, fila = 0,nvip=0,filaentrou=0,nvipentrou=0;
        System.out.println();

        while (in.hasNext()) {
            String movimentacao = in.next(), tipo = in.next();
            System.out.println("\n");
            if (tipo.equals("VIP")){
                pessoas++;
                System.out.println(" 1 pessoas entraram na casa. Atualmente ha " + pessoas + " pessoas no evento.");
            } else {
                nvip = Integer.parseInt(tipo);
                if (movimentacao.equals("Sairam")) {
                    pessoas -= nvip;
                    System.out.println(nvip+" pessoas sairam da casa. Atualmente ha " +pessoas+ " pessoas no evento.");
                } else {
                    if (lotacao>pessoas) {
                        while (nvip>1 && lotacao>=pessoas) {
                            nvip--;
                            nvipentrou++;
                            pessoas++;
                        }
                        System.out.println(nvipentrou+" pessoas entraram na casa. Atualmente ha "+pessoas+" pessoas no evento.");
                    } else {
                        System.out.println();
                        fila += nvip;
                        System.out.println("Infelizmente a casa esta lotada, "+nvip+" pessoas foram redirecionadas para a fila.");
                        System.out.println("A fila agora contem "+fila+" pessoas.");
                    }
                }
                if (movimentacao.equals("Sairam")) {
                    while (fila>1 && lotacao>=pessoas) {
                        fila--;
                        filaentrou++;
                        pessoas++;
                    }
                    System.out.println("\n");
                    System.out.println(filaentrou+" pessoas da fila entraram na casa.");
                    if (fila>0) {
                        System.out.println();
                        System.out.println("A fila agora contem "+fila+" pessoas.");
                    } else {
                        System.out.println();
                        System.out.println("Todos que estavam na fila de espera conseguiram entrar, atualmente nao ha fila de espera.");
                    }
                }
            }
        } System.out.println("Vai Troinha, agora pede o ubii!");


    }

}