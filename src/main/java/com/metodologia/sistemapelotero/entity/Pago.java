package com.metodologia.sistemapelotero.entity;

import com.metodologia.sistemapelotero.enums.MedioDePago;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

@ApiModel(value = "Pago", description = "Pago")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Pago {

    @Getter
    @Setter
    private double monto;

    @Getter
    @Setter
    private MedioDePago medioDePago;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Getter
    @Setter
    private Date fecha;

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "pago_id")
    private int id;
}
