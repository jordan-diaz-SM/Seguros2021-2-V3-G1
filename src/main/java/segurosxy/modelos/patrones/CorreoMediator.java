package segurosxy.modelos.patrones;

import segurosxy.modelos.Cliente;
import segurosxy.modelos.Contratante;
import segurosxy.modelos.Mediador;
import segurosxy.modelos.email.EmailUtil;
import segurosxy.modelos.interfaces.ICorredorMediator;


public class CorreoMediator implements ICorredorMediator {

    private String servidorSMTP;

    public void setServidorCorreoSMTP(String servidorIP) {

        this.servidorSMTP = servidorIP;
    }

    private String preparaMensaje(String nombre)  {
        final StringBuffer salida = new StringBuffer();

        //salida.append("\n================================================================\n");
        salida.append("[CorreoMediator] Enviando mensaje por Correo, servidor IP: "+ servidorSMTP );
        salida.append("\n[CorreoMediator]                                  Cliente: "+ nombre );
        //salida.append("\n================================================================\n");


        return salida.toString();
    }

    public void enviaCorreoSMTP(Cliente cliente) {

        setServidorCorreoSMTP("smtp.gmail.com");
        
        // enviando correo...
        System.out.println( preparaMensaje(cliente.getNombre()) );

        try {
            EmailUtil.send(servidorSMTP, "example@gmail.com", "password", "jartokodro@vusra.com", "hello", preparaMensaje(cliente.getNombre()));
        }catch (Exception e){
            System.out.println("[CorreoMediator][Error] "+ e.toString());
        }
    }

    private String preparaMensajeContratante(String nombre)  {
        final StringBuffer salida = new StringBuffer();

        //salida.append("\n================================================================\n");
        salida.append("[CorreoMediator] Enviando mensaje por Correo, servidor IP: "+ servidorSMTP );
        salida.append("\n[CorreoMediator]                                  Contratante: "+ nombre );
        //salida.append("\n================================================================\n");


        return salida.toString();
    }

    public void enviaCorreoSMTPContratante(Contratante contratante) {

        setServidorCorreoSMTP("smtp.gmail.com");
        
        // enviando correo...
        System.out.println( preparaMensajeContratante(contratante.getNombre()) );

        try {
            EmailUtil.send(servidorSMTP, "example@gmail.com", "password", "jartokodro@vusra.com", "hello", preparaMensaje(contratante.getNombre()));
        }catch (Exception e){
            System.out.println("[CorreoMediator][Error] "+ e.toString());
        }
    }

    private String preparaMensajeMediador(String nombre)  {
        final StringBuffer salida = new StringBuffer();

        //salida.append("\n================================================================\n");
        salida.append("[CorreoMediator] Enviando mensaje por Correo, servidor IP: "+ servidorSMTP );
        salida.append("\n[CorreoMediator]                                  Mediador: "+ nombre );
        //salida.append("\n================================================================\n");


        return salida.toString();
    }

    public void enviaCorreoSMTPMediador(Mediador mediador) {

        setServidorCorreoSMTP("smtp.gmail.com");
        
        // enviando correo...
        System.out.println( preparaMensajeMediador(mediador.getNombre()) );

        try {
            EmailUtil.send(servidorSMTP, "example@gmail.com", "password", "jartokodro@vusra.com", "hello", preparaMensaje(mediador.getNombre()));
        }catch (Exception e){
            System.out.println("[CorreoMediator][Error] "+ e.toString());
        }
    }

}
