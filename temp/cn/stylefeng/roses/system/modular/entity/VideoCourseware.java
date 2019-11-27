package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 视频课件信息
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_video_courseware")
public class VideoCourseware implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * CourseWareID
     */
    private Long id;

    /**
     * 课程id
     */
    private Long courseId;

    /**
     * 视频课件名称
     */
    private String wareName;

    /**
     * 视频课件说明
     */
    private String wareDesc;

    /**
     * 视频课件存放路径
     */
    private String wareUrl;

    /**
     * 视频时长
     */
    private Integer wareSeconds;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private Long creater;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getWareName() {
        return wareName;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getWareDesc() {
        return wareDesc;
    }

    public void setWareDesc(String wareDesc) {
        this.wareDesc = wareDesc;
    }

    public String getWareUrl() {
        return wareUrl;
    }

    public void setWareUrl(String wareUrl) {
        this.wareUrl = wareUrl;
    }

    public Integer getWareSeconds() {
        return wareSeconds;
    }

    public void setWareSeconds(Integer wareSeconds) {
        this.wareSeconds = wareSeconds;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    @Override
    public String toString() {
        return "VideoCourseware{" +
        "id=" + id +
        ", courseId=" + courseId +
        ", wareName=" + wareName +
        ", wareDesc=" + wareDesc +
        ", wareUrl=" + wareUrl +
        ", wareSeconds=" + wareSeconds +
        ", createTime=" + createTime +
        ", creater=" + creater +
        "}";
    }
}
