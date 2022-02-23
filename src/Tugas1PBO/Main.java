package Tugas1PBO;

import java.util.Scanner;

class Data{
    double Fahrenheit, Reamur, Celcius, Kelvin;
    double suhuAwal;

    Data(double suhuAwal){
        this.suhuAwal = suhuAwal;
    }
}

public class Main {
    public static void main(String[] args) {

        int pilih;
        double suhuAwal;
        String kondisi;
        boolean ulang = true;

        Scanner input = new Scanner(System.in);
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius       : ");
        suhuAwal = input.nextDouble();
        Data dataAir = new Data(suhuAwal);
        Konversi konversi = new Konversi(suhuAwal);

        while (ulang) {
            dataAir.Celcius = konversi.celcius;
            dataAir.Fahrenheit = konversi.toFahrenheit();
            dataAir.Reamur = konversi.toReamur();
            dataAir.Kelvin = konversi.toKelvin();
            kondisi = konversi.kondisiAir();

            System.out.println("\nOpsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih    : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nSuhu Dalam Celcius     : " + dataAir.Celcius + " C");
                    System.out.println("Dalam Fahrenheit       : " + dataAir.Fahrenheit + " F");
                    System.out.println("Dalam Reamur           : " + dataAir.Reamur + " R");
                    System.out.println("Dalam Kelvin           : " + dataAir.Kelvin + " K");
                    System.out.println("Kondisi Air " + kondisi);
                    break;

                case 2:
                    System.out.println("\nInput Data");
                    System.out.println("----------");
                    System.out.print("Suhu Dalam Celcius     : ");
                    suhuAwal = input.nextDouble();
                    konversi.ubahCelcius(suhuAwal);
                    break;

                case 3:
                    ulang = false;
                    break;

                default:
                    System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
        }
    }
}
