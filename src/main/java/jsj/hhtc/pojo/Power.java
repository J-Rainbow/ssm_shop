package jsj.hhtc.pojo;

import java.util.List;

public class Power {
    private Integer pid;
    private String pname;
    private String path;
    private Integer level;
    private List<Operation> operationList;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
    }

    @Override
    public String toString() {
        return "Power{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", path='" + path + '\'' +
                ", level=" + level +
                ", operationList=" + operationList +
                '}';
    }
}
