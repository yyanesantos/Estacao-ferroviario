public class Vagao {
    private String numSerie;
    private String tipo;
    private int capacidadeCarga;
    private int comprimentoTesteiras;
    private int comprimentoEngates;

    public Vagao () {

    }

    public Vagao (String numSerie, String tipo, int capacidadeCarga, int comprimentoTesteiras, int comprimentoEngates) {
        setNumSerie(numSerie);
        setTipo(tipo);
        setCapacidadeCarga(capacidadeCarga);
        setComprimentoTesteiras(comprimentoTesteiras);
        setComprimentoEngates(comprimentoEngates);
    }

    public void setNumSerie(String numSerie){
        this.numSerie = numSerie;
    }
    public String getNumSerie(){
        return this.numSerie;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    
    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga () {
        return this.capacidadeCarga;
    }

    public void setComprimentoTesteiras (int comprimentoTesteiras) {
        this.comprimentoTesteiras = comprimentoTesteiras;
    }

    public int getComprimentoTesteiras () {
        return this.comprimentoTesteiras;
    }

    public void setComprimentoEngates (int comprimentoEngates) {
        this.comprimentoEngates = comprimentoEngates;
    }

    public int getComprimentoEngates () {
        return this.comprimentoEngates;
    }

    public String toString () {
        String str = "";
        str += "\n\nNumero de serie: " + this.numSerie;
        str += "\nTipo: " + this.tipo;
        str += "\nCapacidade de carga: " + this.capacidadeCarga;
        str += "\nComprimento entre as testeiras: " + this.comprimentoTesteiras;
        str += "\nComprimento entre os engates: " + this.comprimentoEngates;
        return str;
    }

    
}