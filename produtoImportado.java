package codigo3;

public class produtoImportado extends produto {
    private double custom_imp;

    public produtoImportado(){
    }

    public produtoImportado(String nome, double preco, double custom_imp) {
        super(nome, preco);
        this.custom_imp = custom_imp;
    }

    public double getCustom_imp() {
        return custom_imp;
    }

    public void setCustom_imp(double custom_imp) {
        this.custom_imp = custom_imp;
    }

    public double total_preco(){
        return getPreco() + getCustom_imp();
    }

    @Override
    public String preço_tag() {
        StringBuilder b = new StringBuilder();
        b.append(getNome()+" "+ String.format(" $",total_preco()) +String.format("valor entrega: %.2f",getCustom_imp()));
        return b.toString();
    }
}
