package jsj.hhtc.pojo;

public class Operation {
    private Integer oid;
    private String oname;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                '}';
    }
}
