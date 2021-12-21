package segurosxy.modelos;

import segurosxy.modelos.patrones.CorreoMediator;
import segurosxy.modelos.patrones.NotificationPushMediator;

public class ClienteAsegurado extends Cliente {

    public ClienteAsegurado(String nombre, Integer dni, NotificationPushMediator notificationPushMediator) {

        super(nombre, dni, notificationPushMediator);
    }

    public void notifica(){
        super.notifica();
        enviaNotificacion();
    }

    public void enviaNotificacion()    {

        //correoMediator.setServidorCorreoSMTP("smtp.gmail.com");
        notificationPushMediator.enviaNotificationPush(this);
    }
}
