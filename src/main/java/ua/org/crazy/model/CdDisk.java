package ua.org.crazy.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cd_disk")
public class CdDisk extends AudioItem {
    private String type;

    public CdDisk(Long id, String catalogCode, String name, String author, int numberOfPages, int year, int bitrate, String type) {
        super(id, catalogCode, name, author, numberOfPages, year, bitrate);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + " CdDisk{" +
                "type='" + type + '\'' +
                '}';
    }
}
