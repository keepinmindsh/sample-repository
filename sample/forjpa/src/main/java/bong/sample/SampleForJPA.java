package bong.sample;

import bong.sample.code.RoleType;
import bong.sample.model.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Date;
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
            member.setAge(100);
            member.setCreateDate(new Date());
            member.setRegisterDate(new Date());
            member.setRoleType(RoleType.ROLE_TYPE);
            member.setDescription("safasdfasdfasdfasdfasdfasdfsadfasdf");
            member.setUserName("Bong");

            entityManager.persist(member);

            Thread.sleep(1000);

            entityTransaction.commit();
        }catch (Exception exception){
            exception.printStackTrace();
            entityTransaction.rollback();
        }finally {
            entityManager.close();
        }

        entityManagerFactory.close();
    }
}
