package com.cloudecir.module;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.cloudecir.model.ModuleDTO;

@ApplicationScoped
public class ModuleService {

    @Inject
    ModuleRepository repository;

    public List<ModuleDTO> listModules() {

        List<ModuleDTO> result = new ArrayList<ModuleDTO>();

        ModuleDTO module = new ModuleDTO();
        module.setId(UUID.randomUUID().toString());
        module.setName("module 1");
        module.setDescription("description 1");
        result.add(module);

        module = new ModuleDTO();
        module.setId(UUID.randomUUID().toString());
        module.setName("module 2");
        module.setDescription("description 2");
        result.add(module);

        return result;

    }
    
}
