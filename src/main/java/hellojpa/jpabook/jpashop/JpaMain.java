package hellojpa.jpabook.jpashop;

import hellojpa.jpabook.jpashop.domain.Book;
import hellojpa.jpabook.jpashop.domain.Order;
import hellojpa.jpabook.jpashop.domain.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Book book = new Book();
            book.setName("JPA");
            book.setName("김개똥");

            em.persist(book);

            System.out.println("===========================");

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }


        em.close();
        emf.close();
    }
}
