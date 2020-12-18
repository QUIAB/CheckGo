package DAO;
import Modelos.Inventario.Articulo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public interface DaoArticulo {

        static Session getSession(){
            Configuration configuration = new  Configuration();
            SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
            return sessionFactory.openSession();
        }

        static int save(Articulo articuloToSave) {
            Session session = getSession();
            Transaction transaction = session.beginTransaction();
            int generatedId = (int) session.save(articuloToSave);
            transaction.commit();
            session.close();
            return generatedId;
        }

        static Articulo getById(int id) {
            Session session = getSession();
            Transaction transaction = session.beginTransaction();
            Articulo animal = session.get(Articulo.class, id);
            transaction.commit();
            session.close();
            return animal;
        }

        static int update(Articulo articuloToUpdate) {
            Session session = getSession();
            Transaction transaction = session.beginTransaction();
            session.update(String.valueOf(articuloToUpdate.getId()), articuloToUpdate);
            transaction.commit();
            session.close();
            return articuloToUpdate.getId();
        }

        static void delete(Articulo animalToDelete){
            Session session = getSession();
            Transaction transaction = session.beginTransaction();
            session.delete(animalToDelete);
            transaction.commit();
            session.close();
        }

}
