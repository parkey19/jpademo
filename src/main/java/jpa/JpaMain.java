package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by parkey19 on 2019/12/23.
 */
public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction ts = em.getTransaction();
        ts.begin();
        try {

            Member member = new Member();
            member.setId(1L);
            member.setName("1");
            member.setRoleType(RoleType.ADMIN);

            em.persist(member);

            ts.commit();
        } catch (Exception e) {
            ts.rollback();
        } finally {
            em.close();
        }
    }
}
