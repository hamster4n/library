package ua.org.crazy.model;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "audio_item")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AudioItem extends LibraryItem {
    private int bitrate;

    public AudioItem(Long id, String catalogCode, String name, String author, int numberOfPages, int year, int bitrate) {
        super(id, catalogCode, name, author, numberOfPages, year);
        this.bitrate = bitrate;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }

    @Override
    public String toString() {
        return super.toString() + " AudioItem{" +
                "bitrate=" + bitrate +
                '}';
    }
}

