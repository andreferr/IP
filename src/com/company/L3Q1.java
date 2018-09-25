package com.company;
import java.util.*;
public class L3Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dinheironaruto = in.nextInt(), dias = in.nextInt();
        int[] tigelas = new int[dias];
        int gasto = 0;

        for (int diaatual = 0; dias>diaatual;diaatual++) {
            tigelas[diaatual] = in.nextInt();
        }

        for (int diaatual = 0; dias>diaatual;diaatual++) {
            if (tigelas[diaatual]==1) {
                gasto+=10;
            } else if (tigelas[diaatual] > 1 && tigelas[diaatual] < 10) {
                gasto+= tigelas[diaatual] * 9;
            } else if (tigelas[diaatual] > 10) {
                gasto+= tigelas[diaatual] * 8;
            }
        }
       if (gasto>dinheironaruto) {
            System.out.println("Naruto, faltam "+(gasto-dinheironaruto)+" ryos!");
        } else if (dinheironaruto>=gasto && gasto>0) {
            System.out.println("Naruto conseguiu pagar a sua conta!");
        } else if (gasto==0) {
            System.out.println("Naruto nao apareceu para comer");
        }

    }
}