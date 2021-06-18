package jsj.hhtc.service;
import jsj.hhtc.pojo.Role;
import java.util.List;

public interface RoleService {
    List<Role> findAllRole();

    Integer addRole(Role role);

    Integer deleteRole(Integer rid);

    Role findIdRole(Integer rid);

    Integer editRole(Role role);
}
