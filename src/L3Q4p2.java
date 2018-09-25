import java.util.*;
public class L3Q4p2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String[] sapos = {" Coragem", " Determinacao", " Conviccao"};
        String[] cobras = {" Ambicao", " Astucia", " Expertise"};
        String[] lesmas = {" Analise", " Suporte", " Tecnica"};
        String[] macacos = {" Agilidade", " Inteligencia", " Destreza"};
        String[] caes = {" Experiencia", " Perspicacia", " Pericia"};
        int competidores = Integer.parseInt(in.nextLine());
        String[] ninja = new String[competidores*2];
        String[] caracteristicas = new String[competidores];
        String[] nsapos = new String[competidores];
        String[] ncobras = new String[competidores];
        String[] nlesmas = new String[competidores];
        String[] nmacacos = new String[competidores];
        String[] ncaes = new String[competidores];
        String[] animal = {"Sapos:", "Cobras:", "Lesmas:", "Macacos:", "Caes:"};
        int lel = 0;


        if (competidores == 0) {
            System.out.println("Nao havera Jounins forte esse ano");
        } else {
            for (int i=0,j=0;i<competidores;i++,j++) {
                ninja[i] =in.nextLine();
            }
            for (int i=0;i<competidores*2;i+=2) {
                ninja = ninja[i].split(" ");
            }
            for (int j=0,i=1;i<ninja.length;i+=2,j++) {
                caracteristicas[i] = ninja[j];
            }
            if (lel == ninja.length) {
                System.out.println("Nao havera Jounins forte esse ano");
            } else {
                for (int i = 0, j = 0, k = 0, a = 0, b = 0, c = 0, d = 0; j < ninja.length; i++) {
                    if (caracteristicas[j].equals(sapos[i])) {
                        nsapos[k] = ninja[j];
                        k++;
                        j++;
                        i = -1;
                    } else if (caracteristicas[j].equals(cobras[i])) {
                        ncobras[a] = ninja[j];
                        a++;
                        j++;
                        i = -1;
                    } else if (caracteristicas[j].equals(lesmas[i])) {
                        nlesmas[b] = ninja[j];
                        b++;
                        j++;
                        i = -1;
                    } else if (caracteristicas[j].equals(macacos[i])) {
                        nmacacos[c] = ninja[j];
                        c++;
                        j++;
                        i = -1;
                    } else if (caracteristicas[j].equals(caes[i])) {
                        ncaes[d] = ninja[j];
                        d++;
                        j++;
                        i = -1;
                    } else {
                        if (i == 2) {
                            j++;
                            i = -1;
                        }

                    }
                }


                for (int i = 0; i < animal.length; i++) {
                    if (animal[i].equals("Sapos:")) {
                        System.out.println(animal[i]);
                        for (int j = 0; j < nsapos.length; j++) {
                            if (nsapos[j] != null) {
                                System.out.println(nsapos[j]);
                            }
                        }
                    } else if (animal[i].equals("Cobras:")) {
                        System.out.println(animal[i]);
                        for (int j = 0; j < ncobras.length; j++) {
                            if (ncobras[j] != null) {
                                System.out.println(ncobras[j]);
                            }
                        }
                    } else if (animal[i].equals("Lesmas:")) {
                        System.out.println(animal[i]);
                        for (int j = 0; j < nlesmas.length; j++) {
                            if (nlesmas[j] != null) {
                                System.out.println(nlesmas[j]);
                            }
                        }
                    } else if (animal[i].equals("Macacos:")) {
                        System.out.println(animal[i]);
                        for (int j = 0; j < nmacacos.length; j++) {
                            if (nmacacos[j] != null) {
                                System.out.println(nmacacos[j]);
                            }
                        }
                    } else if (animal[i].equals("Caes:")) {
                        System.out.println(animal[i]);
                        for (int j = 0; j < ncaes.length; j++) {
                            if (ncaes[j] != null) {
                                System.out.println(ncaes[j]);
                            }
                        }

                    }
                }

            }


        }
    }
}