package jsj.hhtc.pojo;

import java.util.List;

public class Role {
    private Integer rid;
    private String rname;
    private String rdescribe;
    private String rlevel;
    private List<Operation> operationList;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdescribe() {
        return rdescribe;
    }

    public void setRdescribe(String rdescribe) {
        this.rdescribe = rdescribe;
    }

    public String getRlevel() {
        return rlevel;
    }

    public void setRlevel(String rlevel) {
        this.rlevel = rlevel;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", rdescribe='" + rdescribe + '\'' +
                ", rlevel='" + rlevel + '\'' +
                ", operationList=" + operationList +
                '}';
    }
}
