package com.tuya.zhurong.biz.smart.vo;


import com.tuya.zhurong.infrastructure.common.enums.ZhurongI18nErrorCode;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author feixiangming
 * @date 2020年 11月18日
 */
@Data
public class SmartVO implements java.io.Serializable{

    /**
     * 智能联动侧的ruleId,更新时使用
     */
    private String ruleId;
    /**
     * 名称 true
     */
    @NotNull(message = ZhurongI18nErrorCode.ValidationMessage.PARAM_REQUIRES)
    @Length(max = 100, message = ZhurongI18nErrorCode.ValidationMessage.LENGTH_OVER_THE_LIMIT)
    private String name;

    /**
     * 项目ID true
     */
    private String projectId;

    /**
     * 背景图
     */
    private String background;

    /**
     * 用于主界面显示的图标
     */
    private String displayIcon;

    /**
     * 颜色
     */
    private String displayColor;

    /**
     * 联动执行对象信息 true
     */
    private List<ActionVO> actions;

    /**
     * 扩展信息
     */
    private String extendInfo;

    /**
     * 是否高亮显示
     */
    private Boolean highlight;

    /**
     * 智能联动类型 1:"定时",2:"场景",3:自动化"
     */
    private Integer type;

}
