import org.example.ContoBancario;
import org.example.ImportoNonValidoException;
import org.example.SaldoInsufficienteException;

void main() {
    ContoBancario conto = new ContoBancario(10d);
    try {
        conto.preleva(100d);
    } catch (SaldoInsufficienteException e) {
        IO.println(e.getImportoRichiesto() - e.getSaldoAttuale());
    }

    try {
        conto.preleva(-1d);
    }catch (Exception e) {
        IO.println(e.getMessage());
    }

    try {
        conto.preleva(9d);
        IO.println("Prelevato con successo");
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}