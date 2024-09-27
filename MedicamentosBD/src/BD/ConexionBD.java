package BD;
import javax.persistence.*;
public class ConexionBD {
    private EntityManagerFactory emf; 
    private EntityManager em;
    public ConexionBD(){
        try{
            emf = Persistence.createEntityManagerFactory("$objectdb/db/cinedb.odb");
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
}
