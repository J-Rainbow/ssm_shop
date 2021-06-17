package jsj.hhtc.controller;

import jsj.hhtc.pojo.Power;
import jsj.hhtc.pojo.User;
import jsj.hhtc.service.PowerService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/power")
public class PowerController {

    @Autowired
    private PowerService powerService;

    /**
     * 获取权限列表
     */
    @ResponseBody
    @RequestMapping(value = "/findAllPower", method = RequestMethod.POST)
    public JSONArray findAllPower() {
        List<Power> powerList = powerService.findAllPower();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        for (Power p : powerList) {
            jsonObject.put("id", p.getPid());
            jsonObject.put("name", p.getName());
            jsonObject.put("path", p.getPath());
            jsonObject.put("level", p.getLevel());
            jsonArray.add(jsonObject);
        }

        return jsonArray;
    }
}
