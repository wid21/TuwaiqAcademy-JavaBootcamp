package com.example.springboothw21.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class Address {
    @Id
    private Integer id ;
    @NotEmpty(message = "area should not be empty ")
    private String area;
    @NotEmpty(message = "street should not be empty ")
    private String street;
    @NotNull(message = "building Number should not be empty ")
    private int buildingNumber;


    @OneToOne
    @JsonIgnore
    @MapsId
    private Teacher teacher;
}
