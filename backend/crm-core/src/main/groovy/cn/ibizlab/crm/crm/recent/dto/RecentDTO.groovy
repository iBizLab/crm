package cn.ibizlab.crm.crm.recent.dto

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
class RecentDTO extends GroovyDTO<RecentDTO> {

    /**
     * 「编号」
     */
    @JsonProperty("identifier")
    String identifier
    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「所有者类型」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「所属对象子类型」
     */
    @JsonProperty("owner_subtype")
    String ownerSubtype
    /**
     * 「访问类型」
     */
    @JsonProperty("type")
    String type
    /**
     * 「是否已删除」
     * 字典[是否]
     */
    @JsonProperty("is_deleted")
    Integer isDeleted
    /**
     * 「访问父类名称」
     */
    @JsonProperty("recent_parent_name")
    String recentParentName
    /**
     * 「访问父类」
     */
    @JsonProperty("recent_parent")
    String recentParent
    /**
     * 「编号」
     */
    @JsonProperty("show_identifier")
    String showIdentifier
    /**
     * 「访问父类编号」
     */
    @JsonProperty("recent_parent_identifier")
    String recentParentIdentifier
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
     * 设置「编号」值
     * @param val
     */
    RecentDTO setIdentifier(String identifier) {
        this.identifier = identifier
        return this
    }


    /**
     * 设置「所属数据标识」值
     * @param val
     */
    RecentDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「所有者类型」值
     * @param val
     */
    RecentDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属对象子类型」值
     * @param val
     */
    RecentDTO setOwnerSubtype(String ownerSubtype) {
        this.ownerSubtype = ownerSubtype
        return this
    }


    /**
     * 设置「访问类型」值
     * @param val
     */
    RecentDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「是否已删除」值
     * 字典[是否]
     * @param val
     */
    RecentDTO setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted
        return this
    }


    /**
     * 设置「访问父类名称」值
     * @param val
     */
    RecentDTO setRecentParentName(String recentParentName) {
        this.recentParentName = recentParentName
        return this
    }


    /**
     * 设置「访问父类」值
     * @param val
     */
    RecentDTO setRecentParent(String recentParent) {
        this.recentParent = recentParent
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    RecentDTO setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier
        return this
    }


    /**
     * 设置「访问父类编号」值
     * @param val
     */
    RecentDTO setRecentParentIdentifier(String recentParentIdentifier) {
        this.recentParentIdentifier = recentParentIdentifier
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    RecentDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    RecentDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    RecentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    RecentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    RecentDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    RecentDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
