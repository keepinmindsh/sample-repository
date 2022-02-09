package bong.sample;

import bong.sample.model.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class SampleForJPA {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("hello");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        try {

            Member member = new Member();
            member.setId(1L);
            member.setUserName("Bongs");

            entityManager.persist(member);

            Member findMember = entityManager.find(Member.class, 1L);
            findMember.setUserName("Bongs");

            entityTransaction.commit();
        }catch (Exception exception){
            entityTransaction.rollback();
        }finally {
            entityManager.close();
        }

        entityManagerFactory.close();
    }
}
