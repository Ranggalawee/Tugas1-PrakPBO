package Tugas1PBO;

public class Konversi {
    double celcius, fahrenheit, reamur, kelvin;
    String kondisi;

    public Konversi(double celcius){
        this.celcius = celcius;
    }

    public void ubahCelcius(double celcius) { this.celcius = celcius; }

    public double toFahrenheit() {
        fahrenheit = (9 * this.celcius) / 5 + 32;
        return fahrenheit;
    }

    public double toReamur() {
        reamur = (4 * this.celcius) / 5;
        return reamur;
    }

    public double toKelvin() {
        kelvin = this.celcius + 273.15;
        return kelvin;
    }

    public String kondisiAir() {
        if (this.celcius < 1) {
            kondisi = "Beku.";
        }
        else if (this.celcius > 99) {
            kondisi = "Mendidih.";
        }
        else {
            kondisi = "Normal.";
        }
        return kondisi;
    }
}
