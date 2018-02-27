package ua.org.crazy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book extends PaperItem {
    @Column (name = "cover_type")
    private String coverType;

    public Book(Long id, String catalogCode, String name, String author, int numberOfPages, int year, String typeOfPaper, String coverType) {
        super(id, catalogCode, name, author, numberOfPages, year, typeOfPaper);
        this.coverType = coverType;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return super.toString() + " Book{" +
                "coverType='" + coverType + '\'' +
                '}';
    }
}
