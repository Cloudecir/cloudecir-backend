package com.cloudecir.module;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="module")
class Module {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="name", length = 128)
    private String name;

    @Column(name="description", length=512)
    private String description;

    @OneToMany(mappedBy = "module", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Operation> operations;

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }

    public Set<Operation> getOperations() {
        return this.operations;
    }

}

