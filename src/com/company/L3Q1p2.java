package com.company;
import java.util.*;
public class L3Q1p2 {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int dinheironaruto = in.nextInt(), dias = in.nextInt(),diaatual=0,gasto = 0;

        while (dias>diaatual) {
            int tigelas = in.nextInt();

            if (tigelas==0) {
                gasto+=0;
            } else if (tigelas==1) {
                gasto+=10;
            } while (tigelas>1) {
                while (tigelas<10 && tigelas>0) {
                    gasto+=9;
                    tigelas--;
                }while (tigelas>10) {
                    gasto += 8;
                    tigelas--;
                }
                }
                diaatual++;
            } if (gasto>dinheironaruto) {
                System.out.println("Naruto, faltam "+(gasto-dinheironaruto)+" ryos!");
            } else if (dinheironaruto>=gasto && gasto>0) {
                System.out.println("Naruto conseguiu pagar a sua conta!");
            } else if (gasto==0) {
                System.out.println("Naruto nao apareceu para comer");
            }
        }
    }