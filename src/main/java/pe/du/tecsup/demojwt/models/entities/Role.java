package pe.du.tecsup.demojwt.models.entities;


import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "authorities", uniqueConstraints= {@UniqueConstraint(columnNames= {"user_id", "authority"})})
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String authority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    // contructor vacio
    public Role() {
    }
    // constructor con parametros
    public Role(String authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", authority='" + authority + '\'' +
                '}';
    }

    private static final long serialVersionUID = 1L;

}
