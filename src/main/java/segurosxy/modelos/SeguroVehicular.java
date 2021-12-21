package segurosxy.modelos;

import java.util.ArrayList;
import java.util.List;

import segurosxy.modelos.interfaces.IClienteObserver;
import segurosxy.modelos.interfaces.ICobertura;

public class SeguroVehicular extends Seguro{

    private ICobertura cobertura;

    protected List<IClienteObserver> clienteAsegurado;

    public SeguroVehicular(String marca, String modelo, Double prima)    {

        super();
        this.marca = marca;
        this.modelo = modelo;
        this.prima = prima;
        this.clienteAsegurado = new ArrayList<IClienteObserver>();
    }

    @Override
    public void cacularRiesgo()   {

        if (this.marca.equals("Toyota") && this.modelo.equals("Yaris")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        }
    }

    @Override
    public String getDetalleSeguro()    {

        return "Seg. Vehicular Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }

    public void calcularCobeturaVehicular( ICobertura cobertura )  {
        cobertura.calculaCobertura();
        
        System.out.println();
    }
    

    public void cubrirIncidente(){
        // notify contratante
        //System.out.println("***********************************************************");
        System.out.println("[Seguro] Autorizado por la aseguradora para cubrir incidente... ");
        //System.out.println("***********************************************************");
        for( IClienteObserver a : this.clienteAsegurado) {
            a.notifica();
        }
    }
    public void addObserver(IClienteObserver observer) {
        this.clienteAsegurado.add( observer );
    }

    public void removeObserver(IClienteObserver observer) {
        this.clienteAsegurado.remove( observer );
    }
}
