package com.ecommerce.services.categories_service.entity;

public class Error {

    private String error_description;
    private String documentation;

    public Error(String error_description,String documentation){
        this.error_description=error_description;
        this.documentation=documentation;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    @Override
    public String toString() {
        return "{" +
                "error_description='" + error_description + '\'' +
                ",documentation='" + documentation + '\'' +
                '}';
    }
}
