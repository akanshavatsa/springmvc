package springmvc.user.model;


import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class UserDTO {
    private String username;
    private String password;
}
