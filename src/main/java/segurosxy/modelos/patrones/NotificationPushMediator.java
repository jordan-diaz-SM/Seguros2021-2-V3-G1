package segurosxy.modelos.patrones;

import segurosxy.modelos.Cliente;
import segurosxy.modelos.email.NotificationPush;
import segurosxy.modelos.interfaces.INotificationPushMediator;

public class NotificationPushMediator implements INotificationPushMediator {

    private String preparaMensaje(String nombre)  {
        final StringBuffer salida = new StringBuffer();

        //salida.append("\n================================================================\n");
        salida.append("[NotificationPushMediator] Enviando notificacion, servidor IP: " );
        salida.append("\n[NotificationPushMediator]                                  Cliente: "+ nombre );
        //salida.append("\n================================================================\n");


        return salida.toString();
    }

    public void enviaNotificationPush(Cliente cliente) {
        //setServidorCorreoSMTP("smtp.gmail.com");
        
        
        // enviando Notificacion...
        System.out.println( preparaMensaje(cliente.getNombre()) );

        try {
            NotificationPush.pushFCMNotification("key", "tittle", "message");
        }catch (Exception e){
            System.out.println("[NotificationPushMediator][Error] "+ e.toString());
        }
        
    }
    
}
