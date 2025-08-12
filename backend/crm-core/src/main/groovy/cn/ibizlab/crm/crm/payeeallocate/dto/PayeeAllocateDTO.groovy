package cn.ibizlab.crm.crm.payeeallocate.dto

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
class PayeeAllocateDTO extends GroovyDTO<PayeeAllocateDTO> {

    /**
     * 「分配比率」
     */
    @JsonProperty("ratio")
    BigDecimal ratio
    /**
     * 「用户名称」
     */
    @JsonProperty("user_name")
    String userName
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
     * 「回款标识」
     */
    @JsonProperty("payee_id")
    String payeeId
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
     */
    @JsonProperty("user_id")
    String userId

    /**
     * 设置「分配比率」值
     * @param val
     */
    PayeeAllocateDTO setRatio(BigDecimal ratio) {
        this.ratio = ratio
        return this
    }


    /**
     * 设置「用户名称」值
     * @param val
     */
    PayeeAllocateDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「金额」值
     * @param val
     */
    PayeeAllocateDTO setAmount(BigDecimal amount) {
        this.amount = amount
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PayeeAllocateDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PayeeAllocateDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    PayeeAllocateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    PayeeAllocateDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「回款标识」值
     * @param val
     */
    PayeeAllocateDTO setPayeeId(String payeeId) {
        this.payeeId = payeeId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PayeeAllocateDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PayeeAllocateDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「用户标识」值
     * @param val
     */
    PayeeAllocateDTO setUserId(String userId) {
        this.userId = userId
        return this
    }

}
