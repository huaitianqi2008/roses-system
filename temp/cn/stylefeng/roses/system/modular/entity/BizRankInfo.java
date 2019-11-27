package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 职级分类表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_biz_rank_info")
public class BizRankInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 父类id
     */
    private String rankName;

    /**
     * 当前职级父id
     */
    private Long pId;

    /**
     * 当前职级父id集合
     */
    private String pIds;

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

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getpIds() {
        return pIds;
    }

    public void setpIds(String pIds) {
        this.pIds = pIds;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "BizRankInfo{" +
        "id=" + id +
        ", rankName=" + rankName +
        ", pId=" + pId +
        ", pIds=" + pIds +
        ", seq=" + seq +
        "}";
    }
}
