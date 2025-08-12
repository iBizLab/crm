package cn.ibizlab.crm.crm.schedule.dto

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
class ScheduleDTO extends GroovyDTO<ScheduleDTO> {

    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「类型」
     * 字典[日程类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「所属对象子类型」
     */
    @JsonProperty("owner_subtype")
    String ownerSubtype
    /**
     * 「是否关闭」
     */
    @JsonProperty("is_close")
    String isClose
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
     * 「结束日期时间」
     */
    @JsonProperty("end_date_time")
    Timestamp endDateTime
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
     * 「所有者」
     * 字典[所有者]
     */
    @JsonProperty("owner")
    String owner
    /**
     * 「起始日期时间」
     */
    @JsonProperty("start_date_time")
    Timestamp startDateTime
    /**
     * 「状态」
     */
    @JsonProperty("status")
    String status
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
     * 设置「所属数据标识」值
     * @param val
     */
    ScheduleDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「类型」值
     * 字典[日程类型]
     * @param val
     */
    ScheduleDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    ScheduleDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属对象子类型」值
     * @param val
     */
    ScheduleDTO setOwnerSubtype(String ownerSubtype) {
        this.ownerSubtype = ownerSubtype
        return this
    }


    /**
     * 设置「是否关闭」值
     * @param val
     */
    ScheduleDTO setIsClose(String isClose) {
        this.isClose = isClose
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ScheduleDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ScheduleDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「结束日期时间」值
     * @param val
     */
    ScheduleDTO setEndDateTime(Timestamp endDateTime) {
        this.endDateTime = endDateTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ScheduleDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ScheduleDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「所有者」值
     * 字典[所有者]
     * @param val
     */
    ScheduleDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「起始日期时间」值
     * @param val
     */
    ScheduleDTO setStartDateTime(Timestamp startDateTime) {
        this.startDateTime = startDateTime
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    ScheduleDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ScheduleDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ScheduleDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
