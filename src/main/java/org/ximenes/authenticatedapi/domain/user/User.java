package org.ximenes.authenticatedapi.domain.user;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_users")
@Data
public class User {

    @Id @GeneratedValue(strategy = GenerationType.UUID )
    private String id;
    private String name;
    private String email;
    private String password;
}
