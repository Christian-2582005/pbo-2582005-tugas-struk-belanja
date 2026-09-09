import java.util.Scanner;

public class StrukBelanja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama barang 1 : ");
        String namaBarang1 = scanner.nextLine();
        System.out.print("Harga satuan  : ");
        int hargaBarang1 = scanner.nextInt();
        System.out.print("Jumlah        : ");
        int jumlahBarang1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama barang 2 : ");
        String namaBarang2 = scanner.nextLine();
        System.out.print("Harga satuan  : ");
        int hargaBarang2 = scanner.nextInt();
        System.out.print("Jumlah        : ");
        int jumlahBarang2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama barang 3 : ");
        String namaBarang3 = scanner.nextLine();
        System.out.print("Harga satuan  : ");
        int hargaBarang3 = scanner.nextInt();
        System.out.print("Jumlah        : ");
        int jumlahBarang3 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama barang 4 : ");
        String namaBarang4 = scanner.nextLine();
        System.out.print("Harga satuan  : ");
        int hargaBarang4 = scanner.nextInt();
        System.out.print("Jumlah        : ");
        int jumlahBarang4 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama barang 5 : ");
        String namaBarang5 = scanner.nextLine();
        System.out.print("Harga satuan  : ");
        int hargaBarang5 = scanner.nextInt();
        System.out.print("Jumlah        : ");
        int jumlahBarang5 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Uang dibayar  : ");
        int uangDibayar = scanner.nextInt();

        int subtotalBarang1 = hargaBarang1 * jumlahBarang1;
        int subtotalBarang2 = hargaBarang2 * jumlahBarang2;
        int subtotalBarang3 = hargaBarang3 * jumlahBarang3;
        int subtotalBarang4 = hargaBarang4 * jumlahBarang4;
        int subtotalBarang5 = hargaBarang5 * jumlahBarang5;
        int totalBelanja = subtotalBarang1 + subtotalBarang2 + subtotalBarang3 + subtotalBarang4 + subtotalBarang5;
        int kembalian = uangDibayar - totalBelanja;

        System.out.println();
        System.out.println("STRUK BELANJA");
        System.out.println(namaBarang1 + " " + jumlahBarang1 + "x" + hargaBarang1 + " = " + subtotalBarang1);
        System.out.println(namaBarang2 + " " + jumlahBarang2 + "x" + hargaBarang2 + " = " + subtotalBarang2);
        System.out.println(namaBarang3 + " " + jumlahBarang3 + "x" + hargaBarang3 + " = " + subtotalBarang3);
        System.out.println(namaBarang4 + " " + jumlahBarang4 + "x" + hargaBarang4 + " = " + subtotalBarang4);
        System.out.println(namaBarang5 + " " + jumlahBarang5 + "x" + hargaBarang5 + " = " + subtotalBarang5);
        System.out.println("Total belanja = " + totalBelanja);
        System.out.println("Uang dibayar = " + uangDibayar);
        System.out.println("Kembalian = " + kembalian);

        scanner.close();
    }
}