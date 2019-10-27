package ru.pavel_zhukoff.desk.entity;

import org.springframework.beans.factory.annotation.Autowired;
import ru.pavel_zhukoff.desk.service.UserService;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Desk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "desk_id")
    private int deskId;

    @Column(length = 30)
    private String title;

    @Column(length = 200)
    private String text;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    private int author;

    public int getDeskId() {
        return deskId;
    }

    public void setDeskId(int deskId) {
        this.deskId = deskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

}
