public class Spielfeld {

    Feld[][] f;
    static int hoehe = 4;
    static int breite = 4;

    Spielfeld(int hoehe, int breite){
        this.breite = breite;
        this.hoehe = hoehe;
    }

    void setFeld(){

        for( int i = 0;i<breite;i++){
            for(int j = 0; j<hoehe;j++){
                f[i][j] = new Feld();
            }
        }
    }


}
