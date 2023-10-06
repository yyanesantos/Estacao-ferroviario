public class Recurso {
    private Locomotiva locomotiva;
    private Trem trem;
    private Vagao vagao;
    //private LinhaFerro linha;
    
    public Recurso(Locomotiva locomotiva){
        this.locomotiva = locomotiva;
        this.trem = null;
        this.vagao = null;
    }

    public Recurso(Trem trem){
        this.locomotiva = null;
        this.trem = trem;
        this.vagao = null;
    }

    public Recurso(Vagao vagao){
        this.locomotiva = null;
        this.trem = null;
        this.vagao = vagao;
    }

    public void setTrem (Trem trem) {
        this.trem = trem;
    }

    public Trem getTrem () {
        return this.trem;
    }

    public void setLocomotiva (Locomotiva locomotiva) {
        this.locomotiva = locomotiva;
    }

    public Locomotiva getLocomotiva () {
        return this.locomotiva;
    }

    public void setVagao (Vagao vagao) {
        this.vagao = vagao;
    }

    public Vagao getVagao () {
        return this.vagao;
    }

    public String toString () {
        String str = "";
        if(this.trem != null) {
            str += "\n\nTrem: " + this.trem.getPrefixo();;
        }

        if(this.locomotiva != null) {
            str += "\n\nLocomotiva: " + this.locomotiva.getNumSerie();
        }

        if(this.vagao != null) {
            str += "\n\nVagao numero de serie: " + this.vagao.getNumSerie();
        }
        return str;
    }

    

}