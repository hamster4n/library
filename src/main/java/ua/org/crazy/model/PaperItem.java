package ua.org.crazy.model;

import javax.persistence.*;

@Entity
@Table (name = "paper_item")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PaperItem extends LibraryItem {
    @Column(name = "paper_item_id")
    private String typeOfPaper;

    public PaperItem(Long id, String catalogCode, String name, String author, int numberOfPages, int year, String typeOfPaper) {
        super(id, catalogCode, name, author, numberOfPages, year);
        this.typeOfPaper = typeOfPaper;
    }

    public String getTypeOfPaper() {
        return typeOfPaper;
    }

    public void setTypeOfPaper(String typeOfPaper) {
        this.typeOfPaper = typeOfPaper;
    }

    @Override
    public String toString() {
        return super.toString() + " PaperItem{" +
                "typeOfPaper='" + typeOfPaper + '\'' +
                '}';
    }
}
