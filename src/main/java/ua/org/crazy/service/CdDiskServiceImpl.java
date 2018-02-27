package ua.org.crazy.service;


import org.springframework.stereotype.Service;
import ua.org.crazy.dao.CdDiskDao;
import ua.org.crazy.model.CdDisk;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CdDiskServiceImpl implements CdDiskService {

    private CdDiskDao cdDiskDao;

    private void setCdDiskDao(CdDiskDao cdDiskDao) {
        this.cdDiskDao = cdDiskDao;
    }

    @Override
    @Transactional
    public void addCdDisk(CdDisk cdDisk) {
        this.cdDiskDao.addCdDisk(cdDisk);
    }

    @Override
    @Transactional
    public void updateCdDisk(CdDisk cdDisk) {
        this.cdDiskDao.updateCdDisk(cdDisk);
    }

    @Override
    @Transactional
    public void removeCdDisk(Long id) {
        this.cdDiskDao.removeCdDisk(id);
    }


    @Override
    @Transactional
    public CdDisk getCdDiskById(Long id) {
        return this.cdDiskDao.getCdDiskById(id);
    }

    @Override //not work
    @Transactional(readOnly = true) //not work
    public List<CdDisk> listCdDisks() {
        return this.cdDiskDao.listCdDisks();
    }
}
