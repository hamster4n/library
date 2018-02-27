package ua.org.crazy.dao;


import ua.org.crazy.model.CdDisk;

import java.util.List;

public interface CdDiskDao {

    public void addCdDisk(CdDisk cdDisk);

    public void updateCdDisk(CdDisk cdDisk);

    public void removeCdDisk(Long id);

    public CdDisk getCdDiskById(Long id);

    public List<CdDisk> listCdDisks();
}
