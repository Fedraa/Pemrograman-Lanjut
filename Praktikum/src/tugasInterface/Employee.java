package tugasInterface;

import java.util.Arrays;

public class Employee implements Payable {
    String name;
    int registrationNumber;
    int salaryPerMonth;
    Invoice[] invoices;

    public Employee(String name, int registrationNumber, int salaryPerMonth, Invoice[] invoices) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    double totalBelanjaan = 0;
    public double getPaymentAmount() {
        for (Invoice invoice : invoices) {
            totalBelanjaan += invoice.getPaymentAmount();
        }
        return salaryPerMonth - totalBelanjaan;
    }

    public void displayInvoice() {
        System.out.println("\n--- Invoice ---");
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }

    public String toString() {
        return "\n========= Informasi Karyawan =========\n" +
                "\nNomor Registrasi\t: " + registrationNumber +
                "\nNama\t\t\t: " + name +
                "\nGaji per Bulan\t\t: Rp" + salaryPerMonth; 

    }

}
