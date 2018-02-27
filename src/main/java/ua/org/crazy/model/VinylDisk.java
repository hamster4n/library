package ua.org.crazy.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vinyl_disk")
public class VinylDisk extends AudioItem {
    private String size;

    public VinylDisk(Long id, String catalogCode, String name, String author, int numberOfPages, int year, int bitrate, String size) {
        super(id, catalogCode, name, author, numberOfPages, year, bitrate);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " VinylDisk{" +
                "size='" + size + '\'' +
                '}';
    }
}
