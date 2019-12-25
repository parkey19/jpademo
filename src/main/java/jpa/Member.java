package jpa;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by parkey19 on 2019/12/16.
 */
@Entity
@Table(name = "MBR", uniqueConstraints={
        @UniqueConstraint(name = "MBR_idx1",
                columnNames={"name"}
        )
})
public class Member {

    @Id
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    private LocalDateTime createTime;
    private LocalDateTime lastModifiedTime;
    @Lob
    private String desc;

    public Member() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(LocalDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
