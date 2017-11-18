package com.metodologia.sistemapelotero.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;


@ApiModel(value = "Item", description = "Item")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "rol",
        indexes = {@Index(name = "name",  columnList="name", unique = true),
                @Index(name = "id", columnList="id",     unique = true)})
public class Rol {

    @Getter
    @Setter
    private String name;

    @ApiModelProperty(name = "ID Usuario", value = "ID del usuario")
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

}
