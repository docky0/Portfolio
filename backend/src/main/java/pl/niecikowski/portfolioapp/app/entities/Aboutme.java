package pl.niecikowski.portfolioapp.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aboutme {

    @Id
    @GeneratedValue
    private long id;

    private String description;

    public Aboutme(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Aboutme() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    @Override
    public String toString() {
        return "Aboutme{" +
                "id=" + id +
                ", desc='" + description + '\'' +
                '}';
    }

}
