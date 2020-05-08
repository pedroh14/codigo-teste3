package codigo3;

public class produto {
    private String nome;
    private double preco;

    public produto(){
    }

    public produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String preço_tag(){
        StringBuilder a = new StringBuilder();
        a.append(getNome() + "$ " + String.format(" %.2f",getPreco()));
        return a.toString();
    }

}
