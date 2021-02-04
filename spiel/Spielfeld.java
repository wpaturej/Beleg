package spiel;

public class Spielfeld {

    Feld[][] f;
    static int hoehe = 4;       //in jede Random spiele ist dem feld 4x4
    static int breite = 4;

    Spielfeld(int hoehe, int breite){
        this.breite = breite;
        this.hoehe = hoehe;

        f = new Feld[this.hoehe][this.breite];

        for( int i = 0;i<breite;i++){
            for(int j = 0; j<hoehe;j++){
                f[i][j] = new Feld();
            }
        }
    }


    Feld[][] feld(){
        return f;
    }

    Feld feld(int x, int y){
        return f[x][y];
    }



    void print(){
        for(int i=0; i<f.length;i++){
            for(int j =0; j<f[0].length;j++){
                System.out.println(" "+f[i][j]);
            }
        }
    }


}
