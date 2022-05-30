package com.cloudecir.module;

import java.util.List; 

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parameters")
class Parameter {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "operationid", nullable = false)
    private Operation operation;

    @Column(name = "sequence")
    private Byte sequence;

    @Column(name = "name")
    private String name;

    @Column(name = "displayname")
    private String displayName;

    @Column(name = "description")
    private String description;

    @Column(name = "datatype")
    @Enumerated(EnumType.STRING)
    private Datatype datatype;

    @Column(name = "required")
    private boolean required;

    @Column(name = "minvalue")
    private Double minValue;

    @Column(name = "maxvalue")
    private Double maxValue;

    @Column(name = "mask")
    private String mask;

    @Column(name = "values")
    @Convert(converter = StringListConverter.class)
    private List<String> values;

    @Column(name = "defaultvalue")
    private String defaultValue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Byte getSequence() {
        return sequence;
    }

    public void setSequence(Byte sequence) {
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Datatype getDatatype() {
        return datatype;
    }

    public void setDatatype(Datatype datatype) {
        this.datatype = datatype;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

}
