package cn.ibizlab.crm.crm.custombutton.dto

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
class CustomButtonDTO extends GroovyDTO<CustomButtonDTO> {

    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
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
     * 「URL」
     */
    @JsonProperty("url")
    String url
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
     * 「所有者」
     * 字典[所有者]
     */
    @JsonProperty("owner")
    String owner
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
    CustomButtonDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    CustomButtonDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属对象子类型」值
     * @param val
     */
    CustomButtonDTO setOwnerSubtype(String ownerSubtype) {
        this.ownerSubtype = ownerSubtype
        return this
    }


    /**
     * 设置「URL」值
     * @param val
     */
    CustomButtonDTO setUrl(String url) {
        this.url = url
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CustomButtonDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CustomButtonDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    CustomButtonDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CustomButtonDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CustomButtonDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「所有者」值
     * 字典[所有者]
     * @param val
     */
    CustomButtonDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CustomButtonDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CustomButtonDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
