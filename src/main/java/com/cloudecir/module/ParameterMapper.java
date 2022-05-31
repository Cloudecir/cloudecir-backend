package com.cloudecir.module;

import com.cloudecir.model.ParameterDTO;

public class ParameterMapper {

    public static ParameterDTO fromDatabase(Parameter parameter) {
        
        ParameterDTO result = new ParameterDTO();
        result.setDatatype(parameter.getDatatype());
        result.setDefaultValue(parameter.getDefaultValue());
        result.setDescription(parameter.getDescription());
        result.setDisplayName(parameter.getDisplayName());
        result.setId(parameter.getId());
        result.setMask(parameter.getMask());
        result.setMaxValue(parameter.getMaxValue());
        result.setMinValue(parameter.getMinValue());
        result.setName(parameter.getName());
        result.setRequired(parameter.isRequired());
        result.setSequence(parameter.getSequence());;

        return result;

    }

    
}
