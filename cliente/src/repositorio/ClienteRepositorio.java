package repositorio;

import dominio.Cliente;
import fakedb.ClienteFakeDB;

public class ClienteRepositorio extends BaseRepositorio<Cliente> {

    private ClienteFakeDB db;

    public ClienteRepositorio(){
        this.db = new ClienteFakeDB();
        this.dados = this.db.getTabela();
    }

    @Override
    public Cliente Read(int chave) {
        for (Cliente cp : this.dados) {
            if (cp.getCodigo() == chave){
                return cp;
            }
        }
        return null;
    }

    @Override
    public Cliente Edit(Cliente instancia) {
        Cliente cp = this.Read(instancia.getCodigo());
        if (cp != null){
            cp.setEndereco(instancia.getEndereco());
            cp.setNome(instancia.getNome());
            cp.setTelefone(instancia.getTelefone());
            return cp;
        }
        else{
            return null;
        }
    }

    @Override
    public Cliente Add(Cliente instancia) {
        int pos = this.dados.size() - 1;
        Cliente cp = this.dados.get(pos);
        int proxChave = cp.getCodigo() + 1;
        
        //ClasseProduto cp = this.dados.getLast();
        //int proxChave = cp.getCodigo() + 1;

        instancia.setCodigo(proxChave);
        this.dados.add(instancia);
        return instancia;
    }

    @Override
    public Cliente Delete(int chave) {
        Cliente cp = this.Read(chave);
        if (cp != null){
            this.dados.remove(cp);
            return cp;
        }
        else{
            return null;
        }
    }    
}