package ua.org.crazy.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "newspaper")
public class Newspaper extends PaperItem {
    private int number;

    public Newspaper(Long id, String catalogCode, String name, String author, int numberOfPages, int year, String typeOfPaper, int number) {
        super(id, catalogCode, name, author, numberOfPages, year, typeOfPaper);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return super.toString() + " Newspaper{" +
                "number=" + number +
                '}';
    }
}
