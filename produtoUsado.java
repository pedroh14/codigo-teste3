package codigo3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class produtoUsado  extends produto{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    private Date data_fab;

    public produtoUsado(){
    }

    public produtoUsado(String nome, double preco, Date data_fab) {
        super(nome, preco);
        this.data_fab = data_fab;
    }

    public Date getData_fab() {
        return data_fab;
    }

    public void setData_fab(Date data_fab) {
        this.data_fab = data_fab;
    }

    @Override
    public String preço_tag() {
        StringBuilder c = new StringBuilder();
        c.append(getNome()+"(usado)" +" "+ String.format("%.2f" ,getPreco()) + " data: " + sdf.format(getData_fab()));
        return c.toString();
    }
}
