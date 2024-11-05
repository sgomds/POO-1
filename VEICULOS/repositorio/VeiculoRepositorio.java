package repositorio;

import dominio.Veiculo;
import fakedb.VeiculoFakeDB;

public class VeiculoRepositorio extends BaseRepositorio<Veiculo> {
    private VeiculoFakeDB db;

    public VeiculoRepositorio() {
        this.db = new VeiculoFakeDB();
        this.dados = this.db.getTabela();
    }

    @Override
    public Veiculo Add(Veiculo instancia) {
        int pos = this.dados.size() - 1;
        Veiculo cp = this.dados.get(pos);
        int proxChave = cp.getCodigo() + 1;
        instancia.setCodigo(proxChave);
        this.dados.add(instancia);
        return instancia;
    }

    @Override
    public Veiculo Read(int chave) {
        for (Veiculo cv : dados) {
            if (cv.getCodigo() == chave) {
                return cv;
            }
        }
        return null;
    }

    @Override
    public Veiculo Edit(Veiculo instancia) {
        Veiculo cv = this.Read(instancia.getCodigo());
        if (cv != null) {
            cv.setMarca(instancia.getMarca());
            cv.setModelo(instancia.getModelo());
            cv.setAnoDeFabricacao(instancia.getAnoDeFabricacao());
            cv.setPreco(instancia.getPreco());
            return cv;
        } else {
            return null;
        }
    }

    @Override
    public Veiculo Delete(int chave) {
        Veiculo cv = this.Read(chave);
        if (cv != null) {
            this.dados.remove(cv);
            return cv;
        } else {
            return null;
        }
    }

}
