package dominio;

public abstract class BaseParametro {
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public BaseParametro() {

    }

    public BaseParametro(int codigo) {
        this.codigo = codigo;
    }
}
