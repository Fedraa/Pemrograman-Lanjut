package tugasInterface;

public class Invoice implements Payable {
    String productName;
    int quantity;
    int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public String toString() {
        return "\nNama Produk\t: " + productName 
                + "\nJumlah\t\t: " + quantity + " pcs"
                + "\nHarga\t\t: Rp" + pricePerItem;
    }
    
}
