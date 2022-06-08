package com.cloudecir.module;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.cloudecir.model.ModuleDTO;
import com.cloudecir.model.OperationDTO;

class ModuleMapper {

    public static ModuleDTO fromDatabse(Module module) {

        ModuleDTO result  = new ModuleDTO();
        result.setId(module.getId());
        result.setDescription(module.getDescription());
        result.setName(module.getName());
        List<OperationDTO> operations = new ArrayList<OperationDTO>();
        
        for (Operation operation : module.getOperations()) {
            operations.add(OperationMapper.fromDatabase(operation));
        }
        result.setOperations(operations);

        return result;

    }

    public static Module toDatabase(ModuleDTO moduleDTO) {

        Module module = new Module();
        module.setDescription(moduleDTO.getDescription());
        if (moduleDTO.getId() != null) {
            module.setId(moduleDTO.getId());
        } else {
            module.setId(UUID.randomUUID().toString());
        }
        module.setName(moduleDTO.getName());
        Set<Operation> operations = new HashSet<Operation>();
        for(OperationDTO operationDTO : moduleDTO.getOperations()) {
            operations.add(OperationMapper.toDatabase(operationDTO));
        }
        module.setOperations(operations);

        return module;

    }
    
}
