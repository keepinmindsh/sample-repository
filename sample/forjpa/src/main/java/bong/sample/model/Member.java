package bong.sample.model;

import bong.sample.code.RoleType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "MEMBER")
@SequenceGenerator(name="Member_Seq_Generator", sequenceName = "Member_Seq", allocationSize = 1)
public class Member {

    @Id
    @Column(name = "MEMBER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "Member_Seq_Generator")
    private Long id;

    @Column(name = "USER_NAME", nullable = false, length = 500)
    private String userName;

    @Column(name = "REGISTER_DATE", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date registerDate;  // yyyy-MM-dd

    @Column(name = "AGE")
    private Integer age;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE_TYPE")
    private RoleType roleType;

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE")
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MODIFIED_DATE")
    private Date lastModifiedDate;

    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    @Transient
    private String forNotMapping;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
