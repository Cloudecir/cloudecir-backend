package com.cloudecir.module;

import java.util.ArrayList;

import com.cloudecir.model.OperationDTO;
import com.cloudecir.model.ParameterDTO;

import java.util.List;
import java.util.UUID;

public class OperationMapper {

    public static OperationDTO fromDatabase(Operation operation) {
        
        OperationDTO operationDTO = new OperationDTO();
        operationDTO.setId(operation.getId());
        operationDTO.setName(operation.getName());
        operationDTO.setDisplayName(operation.getDisplayName());
        operationDTO.setDescription(operation.getDescription());
        operationDTO.setApprover(operation.getApprover());
        operationDTO.setRequiresApproval(operation.isRequiresApproval());
        operationDTO.setValidator(operation.getValidator());

        List<ParameterDTO> parameters = new ArrayList<ParameterDTO>();
        for(Parameter parameter : operation.getParameters()) {
            parameters.add(ParameterMapper.fromDatabase(parameter));
        }
        operationDTO.setParameters(parameters);

        return operationDTO;
    }

    public static Operation toDatabase(OperationDTO operationDTO) {

        Operation operation = new Operation();
        operation.setApprover(operationDTO.getApprover());
        operation.setDescription(operationDTO.getDescription());
        operation.setDisplayName(operationDTO.getDisplayName());
        if (operationDTO.getId() != null) {
            operation.setId(operationDTO.getId());
        } else {
            operation.setId(UUID.randomUUID().toString());
        }
        operation.setName(operationDTO.getName());
        operation.setRequiresApproval(operationDTO.isRequiresApproval());
        operation.setValidator(operationDTO.getValidator());
        for(ParameterDTO parameter: operationDTO.getParameters()) {
            operation.addParameter(ParameterMapper.toDatabase(parameter));
        }

        return operation;
    }
    
}
