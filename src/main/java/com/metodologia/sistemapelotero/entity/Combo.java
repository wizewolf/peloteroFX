package com.metodologia.sistemapelotero.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@ApiModel(value = "Combo", description = "Combo")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Combo {

    @ApiModelProperty(name = "Precio", value = "Precio", required = true, example = "377.00" )
    @Getter
    @Setter
    private double precio;

    @ApiModelProperty(name = "ID comobo", value = "Identificador del combo", required = true, example = "34" )
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "combo_id")
    private int id;

    @Setter
    @Getter
    @OneToMany(fetch= FetchType.EAGER, cascade = CascadeType.MERGE )
    @ElementCollection(targetClass=Item.class)
    private Set<Item> items;

}
