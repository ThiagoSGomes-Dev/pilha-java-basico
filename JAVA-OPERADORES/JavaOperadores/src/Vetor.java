public class Vetor {
    private String[] comprimentoTotal;
    private int tamanhoTotal;

    // construtor
    public Vetor(int capacidade) {
        this.comprimentoTotal = new String[capacidade];
        this.tamanhoTotal = 0;
    }

    // método 
    public void adicionar(String elemento) {
        if(this.tamanhoTotal < this.comprimentoTotal.length) {
            this.comprimentoTotal[this.tamanhoTotal] = elemento;
            this.tamanhoTotal++;

            System.out.println("Adicionado a caixa com sucesso!");
        }else {
            System.out.println("Não a espaço na caixa!");
        }
    }
}