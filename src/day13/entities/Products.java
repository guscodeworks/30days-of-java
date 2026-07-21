package day13.entities;

public class Products {

    // Atributos
    public String name;
    public double price;
    public int quantity;

    // Metodo para verificar a quantidade
    public double totalValueInStock() {
        return price * quantity;
    }

    // Metodo para adicionar produtos
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    // Metodo para remover produtos
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // Metodo utilizando o metodo toString da classe Object
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", " + quantity + " unidades, "
                + "Total: "
                + String.format("%.2f", totalValueInStock());
    }
}
