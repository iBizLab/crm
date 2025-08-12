package cn.ibizlab.crm.crm.activitiy.dto

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
class ActivitiyDTO extends GroovyDTO<ActivitiyDTO> {

    /**
     * 「审计信息」
     */
    @JsonProperty("audit_info")
    String auditInfo
    /**
     * 「审计类型」
     */
    @JsonProperty("audit_type")
    String auditType
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
     * 「访问地址」
     */
    @JsonProperty("ip_address")
    String ipAddress
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「对象类型」
     */
    @JsonProperty("object_type")
    String objectType
    /**
     * 「对象标识」
     */
    @JsonProperty("objectid")
    String objectid
    /**
     * 「操作人」
     */
    @JsonProperty("op_person_id")
    String opPersonId
    /**
     * 「操作人」
     */
    @JsonProperty("op_person_name")
    String opPersonName
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
     * 设置「审计信息」值
     * @param val
     */
    ActivitiyDTO setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo
        return this
    }


    /**
     * 设置「审计类型」值
     * @param val
     */
    ActivitiyDTO setAuditType(String auditType) {
        this.auditType = auditType
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ActivitiyDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ActivitiyDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ActivitiyDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「访问地址」值
     * @param val
     */
    ActivitiyDTO setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ActivitiyDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「对象类型」值
     * @param val
     */
    ActivitiyDTO setObjectType(String objectType) {
        this.objectType = objectType
        return this
    }


    /**
     * 设置「对象标识」值
     * @param val
     */
    ActivitiyDTO setObjectid(String objectid) {
        this.objectid = objectid
        return this
    }


    /**
     * 设置「操作人」值
     * @param val
     */
    ActivitiyDTO setOpPersonId(String opPersonId) {
        this.opPersonId = opPersonId
        return this
    }


    /**
     * 设置「操作人」值
     * @param val
     */
    ActivitiyDTO setOpPersonName(String opPersonName) {
        this.opPersonName = opPersonName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ActivitiyDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ActivitiyDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
