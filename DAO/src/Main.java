import dao.HospedeDAO;
import dao.ReservaDAO;
import model.Hospede;
import model.Reserva;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        HospedeDAO hospedeDAO = new HospedeDAO();
        ReservaDAO reservaDAO = new ReservaDAO();

        // Inserir um hóspede
        Hospede h = new Hospede("Carlos Souza", "11111-2222");
        hospedeDAO.inserir(h);

        // Inserir uma reserva para esse hóspede
        Reserva r = new Reserva(1, LocalDate.now()); // supondo hospede_id = 1
        reservaDAO.inserir(r);

        // Listar hóspedes
        System.out.println("=== Hóspedes ===");
        for (Hospede hosp : hospedeDAO.listar()) {
            System.out.println(hosp.getId() + " - " + hosp.getNome() + " - " + hosp.getTelefone());
        }

        // Listar reservas
        System.out.println("=== Reservas ===");
        for (Reserva res : reservaDAO.listar()) {
            System.out.println(res.getId() + " - Hóspede: " + res.getHospedeId() + " - Check-in: " + res.getDataCheckin());
        }
    }
}
