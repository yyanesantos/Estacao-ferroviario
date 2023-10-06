import java.util.ArrayList;
public class LinhaFerro {
    private String numero;
    private int extensao;
    private String descricao;
    //private EstacaoFerro estacao;
    private ArrayList<Recurso> recursos;
    
    public LinhaFerro (String numero) {
        setNumero(numero);
    }

    public LinhaFerro (String numero, Recurso recurso) {
        this.recursos = new ArrayList<Recurso>();
        this.recursos.add(recurso);
        setNumero(numero);
    }

    public void inserirRecurso (Recurso recurso) {
        if(this.recursos == null) {
            this.recursos = new ArrayList<Recurso>();
        }
        this.recursos.add(recurso);
    }

    public void removerRecurso (Recurso recurso) {
        if(this.recursos == null || this.recursos.isEmpty()) {
            System.out.println("Nao ha recurso a ser removido da linha.");
        }

        for(Recurso rec : this.recursos) {
            if(rec.getTrem().getPrefixo().equals(recurso.getTrem().getPrefixo())) {
               System.out.println("O trem " + recurso.getTrem().getPrefixo() + " foi removido.");
               this.recursos.remove(rec);
               return;
            }
        }

        for(Recurso rec : this.recursos) {
            if(rec.getLocomotiva().getNumSerie().equals(recurso.getLocomotiva().getNumSerie())) {
               System.out.println("A locomotiva " + recurso.getLocomotiva().getNumSerie() + " foi removida.");
               this.recursos.remove(rec);
               return;
            }
        }

        for(Recurso rec : this.recursos) {
            if(rec.getVagao().getNumSerie().equals(recurso.getVagao().getNumSerie())) {
               System.out.println("O vagao " + recurso.getVagao().getNumSerie() + " foi removido.");
               this.recursos.remove(rec);
               return;
            }
        }

        System.out.println("Esse recurso não está na linha.");
    }

    public void setNumero (String numero) {
        this.numero = numero;
    }

    public String getNumero () {
        return this.numero;
    }

    public void setExtensao (int extensao) {
        this.extensao = extensao;
    }

    public int getExtensao () {
        return this.extensao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao () {
        return this.descricao;
    }

    public String toString () {
        String str = "";
        str += "\n\nNumero: " + this.numero;
        str += "\nExtensao: " + this.extensao;
        str += "\nDescricao: " + this.descricao;
        str += "\nNumero de recursos: " + this.recursos.size();
        if(recursos != null) {
            for(int i = 0 ; i < this.recursos.size(); i++) {
                if(this.recursos.get(i).getTrem() != null) {
                    str += "\nRecurso trem prefixo: " + this.recursos.get(i).getTrem().getPrefixo();
                }
                
                if(this.recursos.get(i).getLocomotiva() != null) {
                    str += "\nRecurso locomotiva numero de serie: " + this.recursos.get(i).getLocomotiva().getNumSerie();
                }

                if(this.recursos.get(i).getVagao() != null) {
                    str += "\nRecurso vagao numero de serie: " + this.recursos.get(i).getVagao().getNumSerie();
                }
            }
        }
        return str;
    }

    /*public void setEstacao (EstacaoFerro estacao) {
        this.estacao = estacao;
    }

    public EstacaoFerro getEstacao () {
        return this.estacao;
    }*/
}