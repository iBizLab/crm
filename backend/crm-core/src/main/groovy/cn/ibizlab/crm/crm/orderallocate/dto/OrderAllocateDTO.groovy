package cn.ibizlab.crm.crm.orderallocate.dto

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
class OrderAllocateDTO extends GroovyDTO<OrderAllocateDTO> {

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
     * 「用户名称」
     */
    @JsonProperty("user_name")
    String userName
    /**
     * 「分配比率」
     */
    @JsonProperty("ratio")
    BigDecimal ratio
    /**
     * 「金额」
     */
    @JsonProperty("amount")
    BigDecimal amount
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
     * 「用户标识」
     * 字典[所有者]
     */
    @JsonProperty("user_id")
    String userId

    /**
     * 设置「所属数据标识」值
     * @param val
     */
    OrderAllocateDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    OrderAllocateDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「用户名称」值
     * @param val
     */
    OrderAllocateDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「分配比率」值
     * @param val
     */
    OrderAllocateDTO setRatio(BigDecimal ratio) {
        this.ratio = ratio
        return this
    }


    /**
     * 设置「金额」值
     * @param val
     */
    OrderAllocateDTO setAmount(BigDecimal amount) {
        this.amount = amount
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    OrderAllocateDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    OrderAllocateDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    OrderAllocateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    OrderAllocateDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    OrderAllocateDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    OrderAllocateDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「用户标识」值
     * 字典[所有者]
     * @param val
     */
    OrderAllocateDTO setUserId(String userId) {
        this.userId = userId
        return this
    }

}
