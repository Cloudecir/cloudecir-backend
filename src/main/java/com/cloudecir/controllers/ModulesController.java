package com.cloudecir.controllers;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cloudecir.model.ModuleDTO;
import com.cloudecir.module.ModuleService;

@Path("/modules")
public class ModulesController {

    @Inject
    ModuleService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ModuleDTO> listModules() {
        return service.listModules();
    }
}