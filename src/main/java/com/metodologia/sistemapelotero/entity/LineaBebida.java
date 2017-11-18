package com.metodologia.sistemapelotero.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@ApiModel(value = "Linea de Bebida", description = "Linea de Bebida")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class LineaBebida {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "linea_bebida_id")
    private int id;

    @Setter
    @Getter
    private int cantidad;

    @Setter
    @Getter
    @OneToOne(fetch= FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name="bebida_fk", nullable = false)
    private Bebida bebida;
}
