package ua.org.crazy.dao;

import ua.org.crazy.model.VinylDisk;

import java.util.List;

public interface VinylDiskDao {

    public void addVinylDisk(VinylDisk vinylDisk);

    public void updateVinylDisk(VinylDisk vinylDisk);

    public void removeVinylDisk(VinylDisk vinylDisk);

    public VinylDisk getVinylDiskById(Long id);

    public List<VinylDisk> listVinylDisk();
}
