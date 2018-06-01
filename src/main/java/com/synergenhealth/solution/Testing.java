package com.synergenhealth.solution;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "testing")
public class Testing implements Serializable{

    @Id
    private String id;
    private String name;
    private LocalDate birth;
    private LocalDate death;
    private List<String> contribs= new ArrayList<>();

    public Testing() {
    }

    public Testing(String name, LocalDate birth, LocalDate death, List<String> contribs) {
        this.name = name;
        this.birth = birth;
        this.death = death;
        this.contribs = contribs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public LocalDate getDeath() {
        return death;
    }

    public void setDeath(LocalDate death) {
        this.death = death;
    }

    public List<String> getContribs() {
        return contribs;
    }

    public void setContribs(List<String> contribs) {
        this.contribs = contribs;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("name : "+name).toString();
    }
}
