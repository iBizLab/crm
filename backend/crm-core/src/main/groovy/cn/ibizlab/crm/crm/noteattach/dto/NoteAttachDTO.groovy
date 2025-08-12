package cn.ibizlab.crm.crm.noteattach.dto

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
class NoteAttachDTO extends GroovyDTO<NoteAttachDTO> {

    /**
     * 「备注主体标识」
     */
    @JsonProperty("principal_id")
    String principalId
    /**
     * 「备注主体名称」
     */
    @JsonProperty("principal_name")
    String principalName
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「备注主体类型」
     */
    @JsonProperty("principal_type")
    String principalType
    /**
     * 「内容」
     */
    @JsonProperty("content")
    String content
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
     * 设置「备注主体标识」值
     * @param val
     */
    NoteAttachDTO setPrincipalId(String principalId) {
        this.principalId = principalId
        return this
    }


    /**
     * 设置「备注主体名称」值
     * @param val
     */
    NoteAttachDTO setPrincipalName(String principalName) {
        this.principalName = principalName
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    NoteAttachDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「备注主体类型」值
     * @param val
     */
    NoteAttachDTO setPrincipalType(String principalType) {
        this.principalType = principalType
        return this
    }


    /**
     * 设置「内容」值
     * @param val
     */
    NoteAttachDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    NoteAttachDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    NoteAttachDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    NoteAttachDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    NoteAttachDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    NoteAttachDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    NoteAttachDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
