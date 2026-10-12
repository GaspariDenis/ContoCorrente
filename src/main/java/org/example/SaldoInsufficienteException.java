package org.example;

public class SaldoInsufficienteException extends Exception {
    private Double saldoAttuale;
    private Double importoRichiesto;

    public SaldoInsufficienteException(String message, Double saldoAttuale, Double importoRichiesto) {
        super(message);
        this.importoRichiesto = importoRichiesto;
        this.saldoAttuale = saldoAttuale;
    }

    public Double getSaldoAttuale() {
        return saldoAttuale;
    }

    public Double getImportoRichiesto() {
        return importoRichiesto;
    }
}
