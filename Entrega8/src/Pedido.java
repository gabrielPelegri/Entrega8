import java.util.ArrayList;

import Obras.*;

public class Pedido {
    Cliente cliente;
    ArrayList<Obra> pedidos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        pedidos = new ArrayList<>();
    }

    public void setObras(Obra obra) {
        pedidos.add(obra);
    }

    public String toString() {
        String s = "";
        s += "Pedidos de " + this.cliente.getNombre() + ":";
        for (Obra o : pedidos) {
            s+="\n";
            s += o.toString();
        }

        return s;
    }
}
