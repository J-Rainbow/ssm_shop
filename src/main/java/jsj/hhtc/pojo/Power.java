package jsj.hhtc.pojo;

public class Power {
    private Integer pid;
    private String name;
    private String path;
    private Integer level;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Power{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", level=" + level +
                '}';
    }
}
