package org.example;

public class ContoBancario
{
    private Double saldo;

    public ContoBancario(Double saldo){
        if(saldo < 0){
            throw new RuntimeException("Saldo non valido");
        }
        this.saldo = saldo;
    }

    public void preleva(Double importo) throws SaldoInsufficienteException {
        if(importo < 0)
            throw new ImportoNonValidoException("Importo non valido");

        if(saldo - importo < 0){
            throw new SaldoInsufficienteException("Saldo insufficente", saldo, importo);
        }
    }
}
