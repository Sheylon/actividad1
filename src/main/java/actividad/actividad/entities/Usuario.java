package actividad.actividad;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Usuarios")
@NoArgsConstructor
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String email;
    private String nombre;
    private String apellido;
    @Column(unique = true)
    private Integer edad;
    private String password;
    private String repPassword;
    private Boolean enabled;
    private String foto;
    private String rol;
    private LocalDateTime createAt;

    @OneToMany(mappedBy = "usuarios")
    private List<Sugerencia> sugerencias;

    @ManyToMany(cascade = , etchType.EAGER)

    @JoinTable(name= "PartidadUsuario",
    joinColumns= @JoinColumn( name="idUsuario",
    referencedColumnName="id"), inverseJoinColumns=@JoinColumn(
    name="idPartidad",
    referencedColumnName= "id"))
    private List<Partida> Partida;

    @OneToMany(mappedBy = "usuarios")
    private List<Mensaje> Mensaje;
    
}
