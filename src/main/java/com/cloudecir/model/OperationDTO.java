package com.cloudecir.model;

import java.util.ArrayList;
import java.util.List;

public class OperationDTO {

    private String id; 

    private String name;

    private String description;

    private String displayName;

    private boolean requiresApproval;

    private String approver;

    private List<ParameterDTO> parameters;

    public OperationDTO() {
        this.parameters = new ArrayList<ParameterDTO>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ParameterDTO> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterDTO> parameters) {
        this.parameters = parameters;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public boolean isRequiresApproval() {
        return requiresApproval;
    }

    public void setRequiresApproval(boolean requiresApproval) {
        this.requiresApproval = requiresApproval;
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

    public void setName(String name) {
        this.name = name;
    }

    public void addParameter(ParameterDTO parameterDto) {
        this.parameters.add(parameterDto);
    }
    
}
