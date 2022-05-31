package com.cloudecir.module;

import com.cloudecir.model.ModuleDTO;

class ModuleMapper {

    public static ModuleDTO fromDatabse(Module module) {

        ModuleDTO result  = new ModuleDTO();
        result.setId(module.getId());
        result.setDescription(module.getDescription());
        result.setName(module.getName());

        return result;

    }
    
}
