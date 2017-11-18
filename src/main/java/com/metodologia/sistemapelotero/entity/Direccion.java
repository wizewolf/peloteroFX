package com.metodologia.sistemapelotero.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ApiModel(value = "Direccion", description = "Direccion detallada")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Direccion {

    @ApiModelProperty(name = "Nombre de la Calle", value = "Nombre de la calle", example = "Obligado" )
    @Setter
    @Getter
    private String calle;

    @ApiModelProperty(name = "Altura de la Calle", value = "Altura de la calle", example = "1512" )
    @Setter
    @Getter
    private  String altura;

    @ApiModelProperty(name = "Numero o letra del departamento", value = "Numero o letra del departamento", example = "a" )
    @Setter
    @Getter
    private String nroDepartamento;

    @ApiModelProperty(name = "Numero de piso", value = "Numero de piso",  example = "2", notes = "0 para planta baja y negativos para pisos subterraneos" )
    @Setter
    @Getter
    private int piso;

    @ApiModelProperty(name = "ID Cliente", value = "ID del cliente", required = false)
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "direccion_id")
    private int id;

}
