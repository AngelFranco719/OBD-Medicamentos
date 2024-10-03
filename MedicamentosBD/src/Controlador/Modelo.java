package Controlador;
public interface Modelo<T> {
    void InsertAllToBD();
    void InsertToBD(T instance); // Este método acepta un parámetro de tipo T
    void AllInstancesToString();
    void AnInstanceToString(String id);
}
