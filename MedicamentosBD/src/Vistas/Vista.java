package Vistas;
import Controlador.Controlador;
public abstract class Vista <T>{
    public abstract T getControlador();
    public void ImprimirInstancias(){
        Controlador C=(Controlador)this.getControlador();
        C.AllInstancesToString();
    }
}
