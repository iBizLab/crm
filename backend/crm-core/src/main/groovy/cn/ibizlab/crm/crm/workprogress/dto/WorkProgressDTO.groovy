package cn.ibizlab.crm.crm.workprogress.dto

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
class WorkProgressDTO extends GroovyDTO<WorkProgressDTO> {

    /**
     * 「操作类型」
     * 字典[工作进行操作类型]
     */
    @JsonProperty("actiontype")
    String actiontype
    /**
     * 「关联目标类型」
     * 字典[工作进展对象类型]
     */
    @JsonProperty("target_type")
    String targetType
    /**
     * 「关联目标标识」
     */
    @JsonProperty("target_id")
    String targetId
    /**
     * 「关联目标名称」
     */
    @JsonProperty("target_name")
    String targetName
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
     * 「描述」
     */
    @JsonProperty("description")
    String description
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
     * 设置「操作类型」值
     * 字典[工作进行操作类型]
     * @param val
     */
    WorkProgressDTO setActiontype(String actiontype) {
        this.actiontype = actiontype
        return this
    }


    /**
     * 设置「关联目标类型」值
     * 字典[工作进展对象类型]
     * @param val
     */
    WorkProgressDTO setTargetType(String targetType) {
        this.targetType = targetType
        return this
    }


    /**
     * 设置「关联目标标识」值
     * @param val
     */
    WorkProgressDTO setTargetId(String targetId) {
        this.targetId = targetId
        return this
    }


    /**
     * 设置「关联目标名称」值
     * @param val
     */
    WorkProgressDTO setTargetName(String targetName) {
        this.targetName = targetName
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkProgressDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    WorkProgressDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    WorkProgressDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    WorkProgressDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    WorkProgressDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    WorkProgressDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    WorkProgressDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
