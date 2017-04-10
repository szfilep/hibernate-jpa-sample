package hu.bme;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by szfilep.
 */
@Entity
public class Person {

    public Person() {
    }

    public Person(Long id, String name, Integer age, Country country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Id
    private Long id;

    private String name;

    private Integer age;

    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
