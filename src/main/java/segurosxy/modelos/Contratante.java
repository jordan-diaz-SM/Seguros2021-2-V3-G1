package segurosxy.modelos;

import segurosxy.modelos.patrones.CorreoMediator;
import segurosxy.modelos.patrones.NotificationPushMediator;

public class Contratante extends Cliente {

    public Contratante(String nombre, Integer dni, NotificationPushMediator notificationPushMediator) {
        super(nombre, dni, notificationPushMediator);
       
    }
    
    public void notifica(){
        super.notifica();
        enviaCorreo();
    }

    public void enviaCorreo()    {

        //correoMediator.setServidorCorreoSMTP("smtp.gmail.com");
        notificationPushMediator.enviaNotificationPush(this);
    }
}
