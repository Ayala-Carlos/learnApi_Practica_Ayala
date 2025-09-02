package IntegracionBackFront.backfront.Models.DTO.UsersType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@EqualsAndHashCode @ToString
public class UserTypeDTO {

    private Long id;
    private String nombreTipo;
    private String descripcion;

}
