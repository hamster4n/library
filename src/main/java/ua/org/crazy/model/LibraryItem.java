package ua.org.crazy.model;

import javax.persistence.*;

@Entity
@Table(name = "library_item")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class LibraryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "library_item_id")
    private Long id;
    @Column(name = "catalog_code")
    private String catalogCode;
    private String name;
    private String author;
    @Column(name = "number_of_pages")
    private int numberOfPages;
    private int year;

    public LibraryItem(Long id, String catalogCode, String name, String author, int numberOfPages, int year) {
        this.id = id;
        this.catalogCode = catalogCode;
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "id=" + id +
                ", catalogCode='" + catalogCode + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", year=" + year +
                '}';
    }
}
