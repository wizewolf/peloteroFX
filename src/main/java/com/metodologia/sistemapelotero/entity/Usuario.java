package com.metodologia.sistemapelotero.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ApiModel(value = "Usuario", description = "Pass y nickname de los usuarios")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "usuario")
public class Usuario {

    @ApiModelProperty(name = "Nombre de usuario", value = "Nombre de usuario")
    @Getter
    @Setter
    private String name;

    @ApiModelProperty(name = "Contrasena", value = "Contrasena")
    @Getter
    @Setter
    //@Transient
    private String password;

    @Getter
    @Setter
    @OneToOne(fetch=FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name="rol_id", nullable = true)
    private Rol rol_id;

    @Getter
    @Setter
    private boolean isAdmin;

    @Getter
    @Setter
    private String avatar;


    @ApiModelProperty(name = "ID Usuario", value = "ID del usuario")
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Getter
    @Setter
    private int idusuario;

    @Getter
    @Setter
    private String email;


}
