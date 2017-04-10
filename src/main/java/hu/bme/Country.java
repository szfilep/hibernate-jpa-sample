package hu.bme;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by szfilep.
 */
@Entity
@Table(name ="country")
public class Country {

    public Country() {
    }

    public Country(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @Column(name ="country_id")
    private Long id;

    @Column(name ="country_name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
