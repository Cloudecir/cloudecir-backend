package com.cloudecir.module;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "operations")
class Operation {

    @Id
	private String id;

    @ManyToOne
    @JoinColumn(name="moduleid" , nullable=false)
	private Module module;

	@OneToMany(mappedBy = "operation", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Parameter> parameters;

	@Column(name = "name")
	private String name;

	@Column(name = "displayname")
	private String displayName;

	@Column(name = "description")
	private String description;

	@Column(name = "requireapproval")
	private boolean requiresApproval;

	@Column(name = "approver")
	private String approver;

	@Column(name = "validator")
	private String validator;

	public String getValidator() {
		return validator;
	}

	public void setValidator(String validator) {
		this.validator = validator;
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

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isRequiresApproval() {
		return requiresApproval;
	}

	public void setRequiresApproval(boolean requiresApproval) {
		this.requiresApproval = requiresApproval;
	}

	public String getApprover() {
		return approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public Set<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(Set<Parameter> parameters) {
		this.parameters = parameters;
	}

	public void addParameter(Parameter parameter) {
		parameter.setOperation(this);
		this.parameters.add(parameter);
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

    
}
