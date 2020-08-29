package me.xbb123.demojpa.book;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {
    @Id @GeneratedValue
    private Integer  id;
    private String title;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(unique = false)
    private String isbn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
