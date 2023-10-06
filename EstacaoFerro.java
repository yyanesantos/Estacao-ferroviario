import java.util.ArrayList;
public class EstacaoFerro {
    private String sigla;
    private String descricao;
    private ArrayList<LinhaFerro> linhas;

    public EstacaoFerro (ArrayList<LinhaFerro> linhasA) {
        this.linhas = new ArrayList<LinhaFerro>();
        for(int i = 0 ; i < linhasA.size() - 1; i++ ) {
            this.linhas.add(i, linhasA.get(i));
        }
        
    }

    public void inserirLinha (LinhaFerro linha) {
        this.linhas.add(linha);
    }

    public void removerLinha (LinhaFerro linha) {
        for(LinhaFerro lin : this.linhas) {
            if(lin.getNumero().equals(linha.getNumero())) {
               System.out.println("A linha " + linha.getNumero() + " foi removido.");
               this.linhas.remove(lin);
               return;
               }
            }
    }
  

    public void setSigla (String sigla) {
        this.sigla = sigla;
    }

    public String getSigla () {
        return this.sigla;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String toString () {
        String str = "";
        str += "\n\nSigla: " + this.sigla;
        str += "\nDescricao: " + this.descricao;
        str += "\nNumero de linhas: " + this.linhas.size();
        for(int i = 0; i < linhas.size(); i++) {
            str += "\nLinha numero: " + linhas.get(i).getNumero();
        }
        return str;
    }


}