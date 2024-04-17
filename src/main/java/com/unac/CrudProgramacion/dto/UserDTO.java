import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;

import java.util.Date;
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
    private Integer idUser; //va a ser la llave primaria
    private String name;
    private String email;

    @Temporal(TemporalType.DATE)
    private Date birthdate;
}