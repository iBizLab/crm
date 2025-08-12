package cn.ibizlab.crm.crm.weeklydetail.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class WeeklyDetailDTO extends GroovyDTO<WeeklyDetailDTO> {

    /**
     * 「关联主体标识」
     */
    @JsonProperty("principal_id")
    String principalId
    /**
     * 「关联主体类型」
     */
    @JsonProperty("principal_type")
    String principalType
    /**
     * 「关联目标类型」
     */
    @JsonProperty("target_type")
    String targetType
    /**
     * 「关联目标标识」
     */
    @JsonProperty("target_id")
    String targetId
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("create_man")
    String createMan
    /**
     * 「建立时间」
     */
    @JsonProperty("create_time")
    Timestamp createTime
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("update_man")
    String updateMan
    /**
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime

    /**
     * 设置「关联主体标识」值
     * @param val
     */
    WeeklyDetailDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「关联主体类型」值
     * @param val
     */
    WeeklyDetailDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「关联目标类型」值
     * @param val
     */
    WeeklyDetailDTO setTargetType(String targetType) {
        this.targetType = targetType
        return this
    }


    /**
     * 设置「关联目标标识」值
     * @param val
     */
    WeeklyDetailDTO setTargetId(String targetId) {
        this.targetId = targetId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    WeeklyDetailDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    WeeklyDetailDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    WeeklyDetailDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    WeeklyDetailDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    WeeklyDetailDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    WeeklyDetailDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
