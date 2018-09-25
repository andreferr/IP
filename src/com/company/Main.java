package com.company;
import java.util.*;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lotacao = Integer.parseInt(in.nextLine()), pessoas = 0, fila = 0, filaentrou = 0, nvip = 0, nvipentrou = 0;

        while(in.hasNext()) {
            String movimentacao = in.next(), tipo = in.next();

            if (tipo.equals("VIP")) {
                pessoas++;
                System.out.println("1 pessoas entraram na casa. Atualmente ha "+pessoas+" pessoas no evento.");
            }

            else {
                nvip = Integer.parseInt(tipo);

                if (movimentacao.equals("Entraram")) {
                    while (lotacao>pessoas) {
                        nvip--;
                        pessoas++;
                        nvipentrou++;
                    }
                    while ((pessoas+nvip)>lotacao) {
                        nvip--;
                        fila++;
                    }
                    if (lotacao>=pessoas && nvipentrou>0) {
                        System.out.println(nvipentrou+" pessoas entraram na casa. Atualmente ha "+pessoas+" pessoas no evento.");
                        nvipentrou=0;
                    }
                    if (lotacao>=pessoas && (pessoas+fila)>lotacao) {
                        System.out.println("Infelizmente a casa esta lotada, " + fila + " pessoas foram redirecionadas para a fila.");
                        if (lotacao == pessoas) {
                            System.out.println("A fila agora contem " + fila + " pessoas.");
                        }
                    }
                     else if ((pessoas+fila)>lotacao){
                        System.out.println("Infelizmente a casa esta lotada, "+fila+" pessoas foram redirecionadas para a fila.");
                        if (lotacao==pessoas) {
                            System.out.println("A fila agora contem "+fila+" pessoas.");
                        }
                    }
                }

                else {
                    pessoas-=nvip;
                    System.out.println(nvip+" pessoas sairam da casa. Atualmente ha "+pessoas+" pessoas no evento.");
                    if (fila>0) {
                        while (fila>0 && lotacao>pessoas) {
                            filaentrou++;
                            fila--;
                            pessoas++;
                        } System.out.println(filaentrou+" pessoas da fila entraram na casa.");
                        filaentrou=0;
                    } if (fila==0) {
                        System.out.println("Todos que estavam na fila de espera conseguiram entrar, atualmente nao ha fila de espera.");
                    } else {
                        System.out.println("A fila agora contem "+fila+" pessoas.");
                    }
                }




            } System.out.print("\n");





        } System.out.println("Vai Troinha, agora pede o ubii!");



    }

}