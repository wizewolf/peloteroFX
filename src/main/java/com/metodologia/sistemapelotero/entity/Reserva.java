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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

@ApiModel(value = "Reserva", description = "Reserva")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Reserva {

    @NotNull
    @Temporal(TemporalType.DATE)
    @Getter
    @Setter
    private Date fecha;

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "reserva_id")
    private int id;

    @Getter
    @Setter
    @OneToOne(fetch= FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name="fiesta_fk", nullable = true)
    private Fiesta fiesta;

}
