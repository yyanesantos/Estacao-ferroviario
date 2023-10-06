public class Locomotiva {
    private int capacidadeTracao;
    private String numSerie;
    private int comprimento;
    //private Trem trem;

    public Locomotiva () {

    }

    public Locomotiva (int capacidadeTracao, String numSerie, int comprimento) {
        setCapacidadeTracao(capacidadeTracao);
        setNumSerie(numSerie);
        setComprimento(comprimento);
    }

    public void setCapacidadeTracao(int capacidadeTracao){
        this.capacidadeTracao = capacidadeTracao;
    }
    public int getCapacidadeTracao(){
        return this.capacidadeTracao;
    }

    public void setNumSerie(String numSerie){
        this.numSerie = numSerie;
    }
    public String getNumSerie(){
        return this.numSerie;
    }

    public void setComprimento(int comprimento){
        this.capacidadeTracao = capacidadeTracao;
    }
    public int getComprimento(){
        return this.comprimento;
    }

    public String toString () {
        String str = "";
        str += "\n\nCapacidade de tracao: " + this.capacidadeTracao;
        str += "\nNumero de serie: " + this.numSerie;
        str += "\nComprimento: " + this.comprimento;
        return str;
    }

    /*public void setTrem (Trem trem) {
        this.trem = trem;
    }

    public Trem getTrem() {
        return this.trem;
    }*/

    
}