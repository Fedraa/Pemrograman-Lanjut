package tugasInterface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==================== Detail Karyawan ====================");

        System.out.print("\nMasukkan nomor registrasi karyawan\t: ");
        int registrationNumber = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan nama karyawan\t\t\t: ");
        String name = input.nextLine();
        
        System.out.print("Masukkan gaji karyawan per bulan\t: ");
        int salaryPerMonth = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan jumlah invoice\t\t\t: ");
        int numberOfInvoices = input.nextInt();
        input.nextLine();

        Invoice[] invoices = new Invoice[numberOfInvoices];

        for (int i = 0; i < numberOfInvoices; i++) {
            System.out.println("\nMasukkan detail invoice " + (i + 1));
            System.out.print("Nama Produk\t: ");
            String productName = input.nextLine();

            System.out.print("Jumlah\t\t: ");
            int quantity = input.nextInt();
            input.nextLine();

            System.out.print("Harga\t\t: ");
            int pricePerItem = input.nextInt();
            input.nextLine();

            invoices[i] = new Invoice(productName, quantity, pricePerItem);
        }

        Employee employee = new Employee(name, registrationNumber, salaryPerMonth, invoices);

        System.out.println(employee.toString());
        employee.displayInvoice();
        System.out.println("\nPendapatan Bersih\t: Rp" + employee.getPayableAmount());

        input.close();
    } 
}
