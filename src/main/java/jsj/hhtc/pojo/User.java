package jsj.hhtc.pojo;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String mobile;
    private Date create_time;
    private Boolean mg_State;
    private String role_name;
    private String spare_A;
    private String spare_B;
    private Integer spare_C;
    private Integer spare_D;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Boolean getMg_State() {
        return mg_State;
    }

    public void setMg_State(Boolean mg_State) {
        this.mg_State = mg_State;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getSpare_A() {
        return spare_A;
    }

    public void setSpare_A(String spare_A) {
        this.spare_A = spare_A;
    }

    public String getSpare_B() {
        return spare_B;
    }

    public void setSpare_B(String spare_B) {
        this.spare_B = spare_B;
    }

    public Integer getSpare_C() {
        return spare_C;
    }

    public void setSpare_C(Integer spare_C) {
        this.spare_C = spare_C;
    }

    public Integer getSpare_D() {
        return spare_D;
    }

    public void setSpare_D(Integer spare_D) {
        this.spare_D = spare_D;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", create_time=" + create_time +
                ", mg_State=" + mg_State +
                ", role_name='" + role_name + '\'' +
                ", spare_A='" + spare_A + '\'' +
                ", spare_B='" + spare_B + '\'' +
                ", spare_C=" + spare_C +
                ", spare_D=" + spare_D +
                '}';
    }
}
