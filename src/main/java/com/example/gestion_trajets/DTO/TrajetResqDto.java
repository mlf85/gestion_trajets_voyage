package com.example.gestion_trajets.DTO;

import jakarta.validation.constraints.NotEmpty;

public class TrajetResqDto {

    @NotEmpty(message = "name is required")
    private String name

}


/*@NotEmpty(message = "name is required")
private String name;

@NotEmpty(message = "description is required")
private String description;

public CategoryReqDTO() {
}

public CategoryReqDTO(String name, String description) {
    this.name = name;
    this.description = description; */
}