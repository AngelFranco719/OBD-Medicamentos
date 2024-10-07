package BD;
import java.util.*;
import javax.persistence.*;
public class ConexionBD <T>{
    private EntityManagerFactory emf; 
    private EntityManager em;
    public ConexionBD(){
        try{
            emf = Persistence.createEntityManagerFactory("$objectdb/db/Medicamentos.odb");
            em=emf.createEntityManager();
        }catch(Exception e){
            System.out.println("Error al Conectar con la Base de Datos."); 
        }
    }
    public void addPersist(Object Registro){
        try{
            em.getTransaction().begin();
            em.persist(Registro);
            em.getTransaction().commit();
        }catch(Exception e){
            System.out.println("Error al Ingresar los Datos:"+e.toString()); 
        }        
    }
    public List<T> SelectAllFrom(String Entidad, Class<T> TipoClase){
        List<T>Resultados=new ArrayList(); 
        String Sentencia="SELECT o FROM "+Entidad+" o";
        try{
            TypedQuery<T> query =
                    em.createQuery(Sentencia,TipoClase);
            Resultados=query.getResultList();
        }catch(Exception e){
            System.out.println("Error al obtener los datos: "+e.toString()); 
        }
        return Resultados; 
    }
}
