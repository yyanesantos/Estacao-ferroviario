import java.util.ArrayList;
public class Trem {
    private String prefixo;
    private String dataForm;
    private String estacaoOrigem;
    private String estacaoDestino;
    private ArrayList<Vagao> vagao;
    private ArrayList<Locomotiva> locomotiva;
    //private LinhaFerro linha;
    
    public Trem (String prefixo, Vagao vagaoPrincipal, Locomotiva locomotivaPrincipal, EstacaoFerro estacaoOrigem, EstacaoFerro estacaoDestino, ArrayList <Trem> trens) {
        if(estacaoOrigem == estacaoDestino) {
            //System.out.println("Estacoes de origem e destino nao podem ser iguais.");
            throw new IllegalArgumentException("Estacoes de origem e destino nao podem ser iguais.");
        }
        if(!(trens.isEmpty())) {
          for(int i = 0; i < trens.size(); i++) {
                if(trens.get(i).getPrefixo() == prefixo) {
                    throw new IllegalArgumentException("Ja existe trem com este prefixo.");
                }
            } 
        }
        this.prefixo = prefixo;
        this.vagao = new ArrayList<Vagao>();
        this.locomotiva = new ArrayList<Locomotiva>();
          this.vagao.add(vagaoPrincipal);
          this.locomotiva.add(locomotivaPrincipal);

        

        setEstacaoOrigem(estacaoOrigem.getSigla());
        setEstacaoDestino(estacaoDestino.getSigla());
    }
    
    public void inserirVagao (Vagao vagao) {
            if(this.vagao.size() + this.locomotiva.size() == 150) {
               System.out.println("Nao eh possivel adicionar o vagao.");
            } else {
               this.vagao.add(vagao);
            }
    }

    public void removerVagao (Vagao vagao) {
        if(this.vagao.size() <= 1 || this.vagao == null) {
            System.out.println("Nao eh possivel retirar o vagao.");
        } else {
            for(Vagao vag : this.vagao) {
            if(vag.getNumSerie().equals(vagao.getNumSerie())) {
               System.out.println("O vagao " + vagao.getNumSerie() + " foi removido.");
               this.vagao.remove(vag);
               return;
               }
            }
        }
    }

    public void inserirLocomotiva (Locomotiva locomotiva) {
        if(this.locomotiva != null) {
           if(this.vagao.size() + this.locomotiva.size() == 150) {
              System.out.println("Nao eh possivel adicionar a locomotiva."); 
            } else {
              this.locomotiva.add(locomotiva);
            }
        }
    }

    public void removerLocomotiva (Locomotiva locomotiva) {
        if(this.locomotiva.size() <= 1 || this.locomotiva == null) {
            System.out.println("Nao eh possivel retirar o vagao.");
        } else {
            for(Locomotiva loc : this.locomotiva) {
            if(loc.getNumSerie().equals(locomotiva.getNumSerie())) {
               System.out.println("A locomotiva " + locomotiva.getNumSerie() + " foi removida.");
               this.locomotiva.remove(loc);
               return;
               }
            }
        }
    }

    public void setPrefixo (String prefixo) {
        this.prefixo = prefixo;
    }

    public String getPrefixo() {
        return this.prefixo;
    }

    public void setDataForm (String dataForm) {
        this.dataForm = dataForm;
    }

    public String getDataForm () {
        return this.dataForm;
    }

    public void setEstacaoOrigem (String estacaoOrigem) {
        this.estacaoOrigem = estacaoOrigem;
    }

    public String getEstacaoOrigem () {
        return this.estacaoOrigem;
    }

    public void setEstacaoDestino (String estacaoDestino) {
        this.estacaoDestino = estacaoDestino;
    }

    public String getEstacaoDestino () {
        return this.estacaoDestino;
    }

    public String toString () {
        String str = "";
        str += "\n\nPrefixo: " + this.prefixo;
        str += "\nData de formacao: " + this.dataForm;
        str += "\nEstacao origem: " + this.estacaoOrigem;
        str += "\nEstacao destino: " + this.estacaoDestino;
        str += "\nNumero de vagoes: " + this.vagao.size();
        for(int i = 0; i < this.vagao.size() ; i++) {
            str += "\nVagao numero de serie: " + this.vagao.get(i).getNumSerie();
        }
        str += "\nNumero de locomotivas: " + this.locomotiva.size();
        for (int i = 0 ; i < this.locomotiva.size(); i++) {
            str += "\nLocomotiva numero de serie: " + this.locomotiva.get(i).getNumSerie();
        }
        
        return str;
    }


}