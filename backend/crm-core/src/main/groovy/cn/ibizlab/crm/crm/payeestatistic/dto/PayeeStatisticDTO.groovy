package cn.ibizlab.crm.crm.payeestatistic.dto

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
class PayeeStatisticDTO extends GroovyDTO<PayeeStatisticDTO> {

    /**
     * 「类型」
     * 字典[收款情况类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「销售人员」
     * 字典[所有者]
     */
    @JsonProperty("owner")
    String owner
    /**
     * 「行业」
     */
    @JsonProperty("sector")
    String sector
    /**
     * 「统计时间」
     */
    @JsonProperty("statistic_date")
    Timestamp statisticDate
    /**
     * 「计划/记录时间」
     */
    @JsonProperty("type_date")
    Timestamp typeDate
    /**
     * 「订单编号」
     */
    @JsonProperty("o_number")
    String oNumber
    /**
     * 「客户名称」
     */
    @JsonProperty("account_name")
    String accountName
    /**
     * 「订单标识」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「订单名称」
     */
    @JsonProperty("project_name")
    String projectName
    /**
     * 「款项说明」
     */
    @JsonProperty("description")
    String description
    /**
     * 「业务条线」
     * 字典[行业]
     */
    @JsonProperty("business_line")
    String businessLine
    /**
     * 「收款金额」
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
     * 设置「类型」值
     * 字典[收款情况类型]
     * @param val
     */
    PayeeStatisticDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「销售人员」值
     * 字典[所有者]
     * @param val
     */
    PayeeStatisticDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「行业」值
     * @param val
     */
    PayeeStatisticDTO setSector(String sector) {
        this.sector = sector
        return this
    }


    /**
     * 设置「统计时间」值
     * @param val
     */
    PayeeStatisticDTO setStatisticDate(Timestamp statisticDate) {
        this.statisticDate = statisticDate
        return this
    }


    /**
     * 设置「计划/记录时间」值
     * @param val
     */
    PayeeStatisticDTO setTypeDate(Timestamp typeDate) {
        this.typeDate = typeDate
        return this
    }


    /**
     * 设置「订单编号」值
     * @param val
     */
    PayeeStatisticDTO setONumber(String oNumber) {
        this.oNumber = oNumber
        return this
    }


    /**
     * 设置「客户名称」值
     * @param val
     */
    PayeeStatisticDTO setAccountName(String accountName) {
        this.accountName = accountName
        return this
    }


    /**
     * 设置「订单标识」值
     * @param val
     */
    PayeeStatisticDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「订单名称」值
     * @param val
     */
    PayeeStatisticDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「款项说明」值
     * @param val
     */
    PayeeStatisticDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「业务条线」值
     * 字典[行业]
     * @param val
     */
    PayeeStatisticDTO setBusinessLine(String businessLine) {
        this.businessLine = businessLine
        return this
    }


    /**
     * 设置「收款金额」值
     * @param val
     */
    PayeeStatisticDTO setAmount(BigDecimal amount) {
        this.amount = amount
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PayeeStatisticDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PayeeStatisticDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    PayeeStatisticDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    PayeeStatisticDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PayeeStatisticDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PayeeStatisticDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
