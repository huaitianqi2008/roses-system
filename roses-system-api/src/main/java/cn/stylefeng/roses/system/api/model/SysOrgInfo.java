package cn.stylefeng.roses.system.api.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 机构表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@Data
public class SysOrgInfo{



    /**
     * 编号
     */
    private Long id;

    /**
     * 名称
     */
    private String orgName;

    /**
     * 排序
     */
    private Long seq;

    /**
     * 父级编号
     */
    private Long parentId;

    /**
     * 所有父级编号
     */
    private String parentIds;

    /**
     * 机构等级
     */
    private String orgType;

    /**
     * 创建者
     */
    private String creater;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    private String updater;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 是否删除（0：否，1：是）
     */
    private Integer isDel;

    /**
     * 是否真实存在
     */
    private Integer isRealExist;
}
