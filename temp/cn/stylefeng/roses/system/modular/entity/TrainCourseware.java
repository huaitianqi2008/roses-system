package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 班级（课件提纲）信息表（新增）
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_courseware")
public class TrainCourseware implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 班级id
     */
    private Long classId;

    /**
     * 课件名称
     */
    private String name;

    /**
     * 课件内容
     */
    private String content;

    /**
     * 创建人id
     */
    private Long creater;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 是否删除(0:否,1:是)
     */
    private Integer isDel;

    /**
     * 审核人id
     */
    private Long checker;

    /**
     * 审核状态
     */
    private Integer checkStatus;

    /**
     * 审核意见
     */
    private String checkContent;

    /**
     * 审核时间
     */
    private LocalDateTime checkTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Long getChecker() {
        return checker;
    }

    public void setChecker(Long checker) {
        this.checker = checker;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    @Override
    public String toString() {
        return "TrainCourseware{" +
        "id=" + id +
        ", classId=" + classId +
        ", name=" + name +
        ", content=" + content +
        ", creater=" + creater +
        ", createTime=" + createTime +
        ", isDel=" + isDel +
        ", checker=" + checker +
        ", checkStatus=" + checkStatus +
        ", checkContent=" + checkContent +
        ", checkTime=" + checkTime +
        "}";
    }
}
