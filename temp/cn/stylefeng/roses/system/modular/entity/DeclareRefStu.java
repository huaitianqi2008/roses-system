package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 申报学分和学员关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_declare_ref_stu")
public class DeclareRefStu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 申报学分表id
     */
    private Long declareId;

    private Long orgId;

    /**
     * 学员id
     */
    private Long userId;

    /**
     * 0:否,1:是
     */
    private Integer isDel;

    /**
     * 培训开始时间
     */
    private LocalDateTime trainStarttime;

    /**
     * 培训结束时间
     */
    private LocalDateTime trainEndtime;

    private Integer trainScore;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeclareId() {
        return declareId;
    }

    public void setDeclareId(Long declareId) {
        this.declareId = declareId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public LocalDateTime getTrainStarttime() {
        return trainStarttime;
    }

    public void setTrainStarttime(LocalDateTime trainStarttime) {
        this.trainStarttime = trainStarttime;
    }

    public LocalDateTime getTrainEndtime() {
        return trainEndtime;
    }

    public void setTrainEndtime(LocalDateTime trainEndtime) {
        this.trainEndtime = trainEndtime;
    }

    public Integer getTrainScore() {
        return trainScore;
    }

    public void setTrainScore(Integer trainScore) {
        this.trainScore = trainScore;
    }

    @Override
    public String toString() {
        return "DeclareRefStu{" +
        "id=" + id +
        ", declareId=" + declareId +
        ", orgId=" + orgId +
        ", userId=" + userId +
        ", isDel=" + isDel +
        ", trainStarttime=" + trainStarttime +
        ", trainEndtime=" + trainEndtime +
        ", trainScore=" + trainScore +
        "}";
    }
}
