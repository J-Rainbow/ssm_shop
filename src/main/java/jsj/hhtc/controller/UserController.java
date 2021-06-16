package jsj.hhtc.controller;

import com.alibaba.druid.sql.visitor.functions.Char;
import jsj.hhtc.pojo.User;
import jsj.hhtc.service.UserService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @param user
     * @return 登录
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JSONObject login(User user) {
        User result = userService.findUser(user);
        JSONObject object = new JSONObject();
        if (result != null) {
            object.put("msg", 1);
        } else {
            object.put("msg", 0);
        }
        return object;
    }

    /**
     * 获取用户列表
     */
    @ResponseBody
    @RequestMapping(value = "/findAllUser", method = RequestMethod.POST)
    public JSONArray findAllUser(Integer currentPage, Integer pageSize) {
        Integer startIndex = (currentPage - 1) * pageSize;
        List<User> userList = userService.findAllUser(startIndex, pageSize);
        Integer num = userService.findNum();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        for (User u : userList) {
            jsonObject.put("id", u.getId());
            jsonObject.put("username", u.getUsername());
            jsonObject.put("password", u.getPassword());
            jsonObject.put("email", u.getEmail());
            jsonObject.put("mobile", u.getMobile());
            jsonObject.put("create_time", u.getCreate_time());
            jsonObject.put("mg_state", u.getMg_State());
            jsonObject.put("role_name", u.getRole_name());
            jsonObject.put("total", num);
            jsonArray.add(jsonObject);
        }

        return jsonArray;
    }

    /**
     * 修改用户状态
     */
    @ResponseBody
    @RequestMapping(value = "/userStateChange", method = RequestMethod.POST)
    public JSONObject userStateChange(Integer id, Boolean state) {
        Integer num = userService.userStateChange(id, state);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("num",num);
        return jsonObject;
    }

    /**
     * 添加用户
     */
    @ResponseBody
    @RequestMapping(value ="/addUser",method =RequestMethod.POST )
    public JSONObject addUser(User user){
        Integer num = userService.addUser(user);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("num",num);
        return jsonObject;
    }

    /**
     * 删除用户
     */
    @ResponseBody
    @RequestMapping(value ="/deleteUser",method =RequestMethod.POST )
    public JSONObject deleteUser(Integer id){
        System.out.println(id+"******************************************");
        Integer num = userService.deleteUser(id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("num",num);
        return jsonObject;
    }
}