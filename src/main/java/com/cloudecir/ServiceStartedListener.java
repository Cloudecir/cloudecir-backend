package com.cloudecir;

import java.util.concurrent.CompletionStage;

import javax.enterprise.context.ApplicationScoped;

import com.cloudecir.model.ModuleDTO;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Message;

import io.vertx.core.json.JsonObject;

@ApplicationScoped
public class ServiceStartedListener {
    
        @Incoming("serviceStarted")
        public void consume(JsonObject moduleMetadata) {

            ModuleDTO module = moduleMetadata.mapTo(ModuleDTO.class);
            System.out.println(module.getName());
    
        }
        
}
