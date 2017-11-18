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

@ApiModel(value = "Item", description = "Item")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Item {

    @ApiModelProperty(name = "Nombre", value = "Nombre del item incluidp", required = true, example = "Torta de 3kg" )
    @Getter
    @Setter
    private String name;

    @ApiModelProperty(name = "id", value = "identificador", required = false, example = "4" )
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "Item_id")
    private int id;

}
