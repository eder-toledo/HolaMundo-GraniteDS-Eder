package org.test;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Welcome implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    private Integer id;

    @Basic
    private String name;

    public Welcome() {
    }

    public Welcome(String name) {
        this.name = name;
    }
	
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}