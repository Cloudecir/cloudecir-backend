package com.cloudecir.module;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
class ModuleRepository  implements PanacheRepository<Module> {

}