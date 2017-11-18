package com.metodologia.sistemapelotero.entity;

import io.swagger.annotations.ApiModel;
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

@ApiModel(value = "Bebida", description = "Bebida")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Bebida {

    //@Setter
    //private Set<Pago> pagos;

    @Getter
    @Setter
    private double precio;

    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private String marca;

    @Getter
    @Setter
    private int stock;

    @Id
    @Setter
    @Getter
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "bebida_id")
    private int id;

}
