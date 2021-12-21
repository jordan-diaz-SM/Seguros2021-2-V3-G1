package segurosxy.modelos;

import segurosxy.modelos.patrones.CorreoMediator;

public class Contratante extends Cliente {

    public Contratante(String nombre, Integer dni, CorreoMediator correoMediator) {
        super(nombre, dni, correoMediator);
       
    }
    
    public void notifica(){
        super.notifica();
        enviaCorreo();
    }

    public void enviaCorreo()    {

        //correoMediator.setServidorCorreoSMTP("smtp.gmail.com");
        correoMediator.enviaCorreoSMTPContratante(this);
    }
}
