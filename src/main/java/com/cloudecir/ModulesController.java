package com.cloudecir;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cloudecir.model.ModuleDTO;
import com.cloudecir.module.ModuleService;

import org.eclipse.microprofile.faulttolerance.Retry;

@Path("/modules")
public class ModulesController {

    @Inject
    ModuleService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Retry
 //   @RolesAllowed("user")
    public List<ModuleDTO> listModules() {
        return service.listModules();
    }
}