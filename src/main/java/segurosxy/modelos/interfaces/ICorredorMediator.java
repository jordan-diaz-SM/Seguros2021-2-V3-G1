package segurosxy.modelos.interfaces;

import segurosxy.modelos.Cliente;
import segurosxy.modelos.Contratante;
import segurosxy.modelos.Mediador;

public interface ICorredorMediator {

    void setServidorCorreoSMTP(String servidorIP);

    void enviaCorreoSMTP(Cliente cliente);

    void enviaCorreoSMTPContratante(Contratante contratante);

    void enviaCorreoSMTPMediador(Mediador mediador);

}
