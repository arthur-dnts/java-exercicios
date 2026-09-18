import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;
    private boolean fechado = false;

    // Construtor
    public Pedido() {
        itens = new ArrayList<>();
    }

    // Métodos
    public void fechar() {
        fechado = true;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        if (!fechado) {
            for (ItemPedido item : itens) {
                if (item.representa(produto)) {
                    item.alterarQuantidade(quantidade);
                    return;
                }
            }

            ItemPedido item = new ItemPedido(produto, quantidade);
            itens.add(item);
        }
    }

    public void removerItem(Produto produto) {
        if (!fechado) {
            for (int i = 0; i < itens.size(); i++) {
                ItemPedido item = itens.get(i);

                if (item.representa(produto)) {
                    itens.remove(i);
                    return;
                }
            }
        }
    }

    public void alterarQuantidade(Produto produto, int novaQuantidade) {
        if (!fechado) {
            for (int i = 0; i < itens.size(); i++) {
                ItemPedido item = itens.get(i);

                if (item.representa(produto)) {
                    if (novaQuantidade == 0) {
                        itens.remove(i);
                    } else if (novaQuantidade > 0) {
                        item.alterarQuantidade(novaQuantidade);
                    }
                    return;
                }
            }
        }
    }

    public double calcularTotal() {
        double total = 0.0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}
