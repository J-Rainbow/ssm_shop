package jsj.hhtc.service.impl;

import jsj.hhtc.mapper.RoleMapper;
import jsj.hhtc.pojo.Role;
import jsj.hhtc.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("RoleService")
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public List<Role> findAllRole() {
        return roleMapper.findAllRole();
    }

    @Override
    public Integer addRole(Role role) {
        return roleMapper.addRole(role);
    }

    @Override
    public Integer deleteRole(Integer rid) {
        return roleMapper.deleteRole(rid);
    }

    @Override
    public Role findIdRole(Integer rid) {
        return roleMapper.findIdRole(rid);
    }

    @Override
    public Integer editRole(Role role) {
        return roleMapper.editRole(role);
    }
}
