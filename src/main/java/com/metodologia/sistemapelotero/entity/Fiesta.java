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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import java.util.Date;

@ApiModel(value = "Fiesta", description = "Informacion sobre la fiesta")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Fiesta {

    @Getter
    @Setter
    private int cantChicos;

    @Getter
    @Setter
    private int cantAdultos;

    @Getter
    @Setter
    private double costo;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Getter
    @Setter
    private Date fecha;

    @Getter
    @Setter
    private boolean turno1;

    @Getter
    @Setter
    private boolean turno2;

    @Getter
    @Setter
    @OneToOne(fetch=FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name="servicio_fk", nullable = true)
    private Servicio servicio;

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "fiesta_id")
    private int id;

    @Getter
    @Setter
    @ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name="combo_fk", nullable = true)
    private Combo combo;

    @Getter
    @Setter
    @ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name="tematica_fk", nullable = true)
    private Tematica tematica;

}
