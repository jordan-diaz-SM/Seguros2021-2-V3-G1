package segurosxy.modelos;

import segurosxy.modelos.patrones.CorreoMediator;

public class ServicioTecnico extends Cliente{

    public ServicioTecnico(String nombre, Integer dni, CorreoMediator correoMediator) {
        super(nombre, dni,correoMediator);
        //TODO Auto-generated constructor stub
    }
    public void notifica(){
        super.notifica();
        enviaCorreo();
    }

    public void enviaCorreo()    {

        //correoMediator.setServidorCorreoSMTP("smtp.gmail.com");
        correoMediator.enviaCorreoSMTP(this);
    }

}
