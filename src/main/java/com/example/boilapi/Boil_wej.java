package com.example.boilapi;

public class Boil_wej {
    public int[] dostawca = new int[2];
    public int[] odbiorca = new int[3];
    public int[] ceny_zakupu = new int[2];
    public int[] ceny_sprzedazy = new int[3];
    public int[][] ceny_transportu = new int[2][3];

    public int[] getDostawca() {
        return dostawca;
    }

    public void setDostawca(int[] dostawca) {
        this.dostawca = dostawca;
    }

    public int[] getOdbiorca() {
        return odbiorca;
    }

    public void setOdbiorca(int[] odbiorca) {
        this.odbiorca = odbiorca;
    }

    public int[] getCeny_zakupu() {
        return ceny_zakupu;
    }

    public void setCeny_zakupu(int[] ceny_zakupu) {
        this.ceny_zakupu = ceny_zakupu;
    }

    public int[] getCeny_sprzedazy() {
        return ceny_sprzedazy;
    }

    public void setCeny_sprzedazy(int[] ceny_sprzedazy) {
        this.ceny_sprzedazy = ceny_sprzedazy;
    }

    public int[][] getCeny_transportu() {
        return ceny_transportu;
    }

    public void setCeny_transportu(int[][] ceny_transportu) {
        this.ceny_transportu = ceny_transportu;
    }


}
