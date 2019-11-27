package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 培训班-班级风采表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_trainstyle")
public class TrainTrainstyle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 班级id
     */
    private Long classid;

    /**
     * 图片
     */
    private String imageurl;

    /**
     * 创建人id
     */
    private Long createrid;

    /**
     * 创建时间（格式:yyyyMMddHHmmss）
     */
    private String createtime;

    /**
     * 备注
     */
    private String remark;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClassid() {
        return classid;
    }

    public void setClassid(Long classid) {
        this.classid = classid;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Long getCreaterid() {
        return createrid;
    }

    public void setCreaterid(Long createrid) {
        this.createrid = createrid;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TrainTrainstyle{" +
        "id=" + id +
        ", classid=" + classid +
        ", imageurl=" + imageurl +
        ", createrid=" + createrid +
        ", createtime=" + createtime +
        ", remark=" + remark +
        "}";
    }
}
