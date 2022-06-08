package com.cloudecir.module;

import java.util.UUID;

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

    public static Parameter toDatabase(ParameterDTO parameterDTO) {

        Parameter parameter = new Parameter();
        if (parameterDTO.getId() != null) {
            parameter.setId(parameterDTO.getId());
        } else {
            parameter.setId(UUID.randomUUID().toString());
        }
        parameter.setDatatype(parameterDTO.getDatatype());
        parameter.setDefaultValue(parameterDTO.getDefaultValue());
        parameter.setDescription(parameterDTO.getDescription());
        parameter.setDisplayName(parameterDTO.getDisplayName());
        parameter.setMask(parameterDTO.getMask());
        parameter.setMaxValue(parameterDTO.getMaxValue());
        parameter.setMinValue(parameterDTO.getMinValue());
        parameter.setName(parameterDTO.getName());
        parameter.setRequired(parameterDTO.isRequired());
        parameter.setSequence(parameterDTO.getSequence());

        return parameter;

    }

    
}
