package jsj.hhtc.service.impl;

import jsj.hhtc.mapper.PowerMapper;
import jsj.hhtc.pojo.Power;
import jsj.hhtc.service.PowerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("PowerService")
public class PowerServiceImpl implements PowerService {

    @Resource
    private PowerMapper powerMapper;

    @Override
    public List<Power> findAllPower() {
        return powerMapper.findAllPower();
    }
}
