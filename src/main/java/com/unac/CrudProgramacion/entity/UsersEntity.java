package com.unac.CrudProgramacion.entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Table(name = "Users")
@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsersEntity implements Serializable{

    @Id
    @Column(name="id_user")

    private Integer idUser;

    private String name;

    private String email;

    @Temporal(TemporalType.DATE)
    private String date;
}
