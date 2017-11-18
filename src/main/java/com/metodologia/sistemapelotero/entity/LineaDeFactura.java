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

@ApiModel(value = "Linea de Factura", description = "Linea de Factura detallada")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class LineaDeFactura {

    @ApiModelProperty(name = "id", value = "identificador", required = false, example = "4" )
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "linea_factura_id")
    private int id;

    @ApiModelProperty(name = "Precio Unitario",  required = true )
    @Getter
    @Setter
    private double precioUnitario;

    @ApiModelProperty(name = "Detalle",  required = true )
    @Getter
    @Setter
    private String descripcion;

    @ApiModelProperty(name = "Cantidad del producto",  required = true )
    @Getter
    @Setter
    private int cantidad = 1;
}
