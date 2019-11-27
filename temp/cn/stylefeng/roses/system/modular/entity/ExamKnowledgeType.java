package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 在线考试-题目分类表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_exam_knowledge_type")
public class ExamKnowledgeType implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 名称
     */
    private String kndName;

    /**
     * 描述
     */
    private String remark;

    /**
     * 知识分类父id
     */
    private Long pid;

    /**
     * 创建人id
     */
    private Long creater;

    /**
     * 是否删除(0：否，1：是)
     */
    private Integer isDel;

    /**
     * 知识分类父id集合
     */
    private String pids;

    /**
     * 排序
     */
    private Integer seq;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKndName() {
        return kndName;
    }

    public void setKndName(String kndName) {
        this.kndName = kndName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getPids() {
        return pids;
    }

    public void setPids(String pids) {
        this.pids = pids;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "ExamKnowledgeType{" +
        "id=" + id +
        ", kndName=" + kndName +
        ", remark=" + remark +
        ", pid=" + pid +
        ", creater=" + creater +
        ", isDel=" + isDel +
        ", pids=" + pids +
        ", seq=" + seq +
        "}";
    }
}
