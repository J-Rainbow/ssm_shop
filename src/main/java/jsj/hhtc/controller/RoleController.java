package jsj.hhtc.controller;

import jsj.hhtc.pojo.Power;
import jsj.hhtc.pojo.Role;
import jsj.hhtc.pojo.User;
import jsj.hhtc.service.RoleService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    /**
     * 获取权限列表
     */
    @ResponseBody
    @RequestMapping(value = "/findAllRole", method = RequestMethod.GET)
    public JSONArray findAllRole() {
        List<Role> roleList = roleService.findAllRole();

        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        for (Role r : roleList) {
            jsonObject.put("rid", r.getRid());
            jsonObject.put("rname", r.getRname());
            jsonObject.put("rdescribe", r.getRdescribe());
            jsonObject.put("rlevel", r.getRlevel());
            jsonObject.put("operationList", r.getOperationList());
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }
    @ResponseBody
    @RequestMapping(value ="/addRole",method =RequestMethod.POST )
    public JSONObject addRole(Role role){
        System.out.println(role);
        Integer num = roleService.addRole(role);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("num",num);
        return jsonObject;
    }

    @ResponseBody
    @RequestMapping(value ="/deleteRole",method =RequestMethod.GET )
    public JSONObject deleteRole(Integer rid){
        System.out.println(rid);
        Integer num = roleService.deleteRole(rid);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("num",num);
        return jsonObject;
    }

    @ResponseBody
    @RequestMapping(value ="/findIdRole",method =RequestMethod.GET )
    public JSONObject findIdRole(Integer rid){
        Role role = roleService.findIdRole(rid);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rid", role.getRid());
        jsonObject.put("rname", role.getRname());
        jsonObject.put("rdescribe", role.getRdescribe());
        jsonObject.put("rlevel", role.getRlevel());
        return jsonObject;
    }


    @ResponseBody
    @RequestMapping(value ="/editRole",method =RequestMethod.POST )
    public JSONObject editRole(Role role){
        Integer num = roleService.editRole(role);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("num",num);
        return jsonObject;
    }
}
