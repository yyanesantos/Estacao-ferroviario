import java.util.ArrayList;
public class TestaTrem {
    public static void main (String[] args){
        ArrayList<Trem> trens = new ArrayList<Trem>();
        ArrayList<LinhaFerro> linhasA = new ArrayList<LinhaFerro>();
        ArrayList<LinhaFerro> linhasB = new ArrayList<LinhaFerro>();
        LinhaFerro linhaA = new LinhaFerro("A1");
        LinhaFerro linhaB = new LinhaFerro("A2");
        LinhaFerro linhaC = new LinhaFerro("A3");
        linhasA.add(linhaA);
        linhasA.add(linhaB);
        linhasB.add(linhaC);
        EstacaoFerro estacaoA = new EstacaoFerro(linhasA);
        EstacaoFerro estacaoB = new EstacaoFerro(linhasB);
        estacaoA.inserirLinha(linhaB);
        Vagao vagA = new Vagao();
        Vagao vagB = new Vagao();
        Locomotiva locA = new Locomotiva();
        Locomotiva locB = new Locomotiva();
        Trem tremA = new Trem("ABC1010", vagA, locA, estacaoA, estacaoB, trens);
        trens.add(tremA);
        Trem tremB = new Trem("ABC1009", vagA, locA, estacaoA, estacaoB, trens);
        trens.add(tremB);
        Trem tremC = new Trem("ABC1008", vagA, locA, estacaoA, estacaoB, trens);
        trens.add(tremC);
        Recurso recA = new Recurso(tremA);
        Recurso recB = new Recurso(locA);
        linhaA.inserirRecurso(recA);
        linhaA.inserirRecurso(recB);
        tremA.inserirLocomotiva(locB);
        //System.out.println(linhaA);
        System.out.println(estacaoA);
        //System.out.println(tremA);

        //System.out.println(recA);
        //System.out.println(tremA);
    }
}