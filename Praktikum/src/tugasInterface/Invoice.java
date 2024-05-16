package tugasInterface;

public class Invoice implements Payable {
    String productName;
    int quantity;
    int pricePerItem;

    public Invoice(){
        
    }

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    public String toString() {
        return "\nProduk\t: " + productName 
                + "\nJumlah\t: " + quantity + " pcs"
                + "\nHarga\t: Rp" + pricePerItem;
    }
    
}
