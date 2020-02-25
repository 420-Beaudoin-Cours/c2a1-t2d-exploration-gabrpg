/**
 * Author Gabriel Raymond-Plourde
 */


public class TableauxExploration {

    public static void initTen(int[][] tab){

        int nbLignes = tab.length;
        int nbColonnes = tab[0].length;

        for(int i = 0; i < nbLignes; i++){
            for(int j = 0; j < nbColonnes; j++){
                tab[i][j] = 10;
            }
        }
    }

    public static void initDiagonaleTen(int[][] tab){

        int nbLignes =tab.length;
        int nbColonnes = 0;

        for (int i = 0; i < nbLignes; i++){
         tab[i][nbColonnes] = 10;
         nbColonnes++;
        }
    }

    public static void initPosition(String[][] tab){

        int nbLignes = tab.length;
        int nbColonnes =tab[0].length;

        for (int i = 0; i < nbLignes; i++){
            for (int j = 0; j < nbColonnes; j++){
                tab[i][j] = i + ":" + j;
            }
        }
    }

    public static boolean isTabCarre(int[][] tab){

        int nbLignes = tab.length;
        int nbColonnes = tab[0].length;

        if (nbLignes == nbColonnes){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isTabDimEgal(int[][] tab, int[][] tab2){

        int nbLignes = tab.length;
        int nbColonnes = tab[0].length;

        int nbLignes2 = tab2.length;
        int nbColonnes2 = tab2[0].length;

        if (nbLignes == nbLignes2 && nbColonnes == nbColonnes2){
            return true;
        }else{
            return false;
        }
    }

    public static int[][] getSommeMatrices(int[][] matrice1, int[][] matrice2){

        int[][] sommeMatrice = new int[matrice1.length][matrice1[0].length];
            for (int i = 0; i < sommeMatrice.length; i++)
                for (int j = 0; j < sommeMatrice[0].length; j++){
                    sommeMatrice[i][j] = matrice1[i][j] + matrice2[i][j];
                }
            return sommeMatrice;
        }
    }


