package ua.org.crazy.dao;


import org.springframework.stereotype.Repository;
import ua.org.crazy.model.CdDisk;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class CdDiskDaoImpl implements CdDiskDao{

    private final EntityManagerFactory emf;

    public CdDiskDaoImpl(EntityManagerFactory emf){
        this.emf = emf;
    }

    @Override
    public void addCdDisk(CdDisk cdDisk) {
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cdDisk);
        System.out.println(cdDisk.toString() + " saccesfully saved!");
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void updateCdDisk(CdDisk cdDisk) {
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(cdDisk);
        System.out.println(cdDisk.toString() + " saccesfully updated!");
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void removeCdDisk(Long id) {
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        CdDisk disk = getCdDiskById(id);
        if (disk != null){
            System.out.println(disk.toString() + " saccesfully deleted!");
            em.remove(disk);
        } else System.out.println("No such disk.");
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public CdDisk getCdDiskById(Long id) {
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        //ругается на название таблицы. Также возможно неправильно назвал в запросе id
        CdDisk queryCdDisk = em.createQuery("select cd from cd_disk cd where cd.id=:id", CdDisk.class)
                .setParameter("id", id)
                .getSingleResult();
        em.getTransaction().commit();
        em.close();
        return queryCdDisk;
    }

    @Override
    public List<CdDisk> listCdDisks() {
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        List<CdDisk> queryCdDiskList = em.createQuery("select cd from cd_disk cd", CdDisk.class)
                .getResultList();
        em.getTransaction().commit();
        em.close();
        return queryCdDiskList;
    }
}
