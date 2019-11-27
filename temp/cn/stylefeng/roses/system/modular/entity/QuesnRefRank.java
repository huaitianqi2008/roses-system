package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 调查问卷-问卷与职级关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_quesn_ref_rank")
public class QuesnRefRank implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 问卷id
     */
    private Long quesnId;

    /**
     * 职级id
     */
    private Long rankId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuesnId() {
        return quesnId;
    }

    public void setQuesnId(Long quesnId) {
        this.quesnId = quesnId;
    }

    public Long getRankId() {
        return rankId;
    }

    public void setRankId(Long rankId) {
        this.rankId = rankId;
    }

    @Override
    public String toString() {
        return "QuesnRefRank{" +
        "id=" + id +
        ", quesnId=" + quesnId +
        ", rankId=" + rankId +
        "}";
    }
}
