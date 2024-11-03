package fakedb;

import java.util.ArrayList;

import dominio.Cliente;

public class ClienteFakeDB extends BaseFakeDB<Cliente>{

    public ClienteFakeDB(){
        super();
    }
    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<Cliente>();
        this.tabela.add(new Cliente(1, "Luiz","Rua Tal","6799999999", null));
    }
}
    