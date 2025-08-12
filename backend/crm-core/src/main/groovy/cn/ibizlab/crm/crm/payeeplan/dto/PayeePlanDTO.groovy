package cn.ibizlab.crm.crm.payeeplan.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.crm.crm.attachment.dto.AttachmentDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class PayeePlanDTO extends GroovyDTO<PayeePlanDTO> {

    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「计划收款时间」
     */
    @JsonProperty("planned_time")
    Timestamp plannedTime
    /**
     * 「未纳入结算计划款」
     * 字典[是否]
     */
    @JsonProperty("is_not_in_plan")
    Integer isNotInPlan
    /**
     * 「订单编号」
     */
    @JsonProperty("o_number")
    String oNumber
    /**
     * 「所有者」
     * 字典[所有者]
     */
    @JsonProperty("owner")
    String owner
    /**
     * 「父订单标识」
     */
    @JsonProperty("pproject_id")
    String pprojectId
    /**
     * 「计划状态」
     * 字典[计划状态]
     */
    @JsonProperty("plan_status")
    String planStatus
    /**
     * 「计划名称」
     */
    @JsonProperty("plan_name")
    String planName
    /**
     * 「订单金额」
     */
    @JsonProperty("project_amount")
    BigDecimal projectAmount
    /**
     * 「业绩结算金额」
     */
    @JsonProperty("settlement_amount")
    BigDecimal settlementAmount
    /**
     * 「订单客户」
     */
    @JsonProperty("account_name")
    String accountName
    /**
     * 「订单日期」
     */
    @JsonProperty("order_date")
    Timestamp orderDate
    /**
     * 「业务条线」
     * 字典[行业]
     */
    @JsonProperty("business_line")
    String businessLine
    /**
     * 「金额」
     */
    @JsonProperty("amount")
    BigDecimal amount
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
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
     * 「款项说明」
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
     * 「订单名称」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「订单名称」
     */
    @JsonProperty("project_name")
    String projectName
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
     * 设置「序号」值
     * @param val
     */
    PayeePlanDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「计划收款时间」值
     * @param val
     */
    PayeePlanDTO setPlannedTime(Timestamp plannedTime) {
        this.plannedTime = plannedTime
        return this
    }


    /**
     * 设置「未纳入结算计划款」值
     * 字典[是否]
     * @param val
     */
    PayeePlanDTO setIsNotInPlan(Integer isNotInPlan) {
        this.isNotInPlan = isNotInPlan
        return this
    }


    /**
     * 设置「订单编号」值
     * @param val
     */
    PayeePlanDTO setONumber(String oNumber) {
        this.oNumber = oNumber
        return this
    }


    /**
     * 设置「所有者」值
     * 字典[所有者]
     * @param val
     */
    PayeePlanDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「父订单标识」值
     * @param val
     */
    PayeePlanDTO setPprojectId(String pprojectId) {
        this.pprojectId = pprojectId
        return this
    }


    /**
     * 设置「计划状态」值
     * 字典[计划状态]
     * @param val
     */
    PayeePlanDTO setPlanStatus(String planStatus) {
        this.planStatus = planStatus
        return this
    }


    /**
     * 设置「计划名称」值
     * @param val
     */
    PayeePlanDTO setPlanName(String planName) {
        this.planName = planName
        return this
    }


    /**
     * 设置「订单金额」值
     * @param val
     */
    PayeePlanDTO setProjectAmount(BigDecimal projectAmount) {
        this.projectAmount = projectAmount
        return this
    }


    /**
     * 设置「业绩结算金额」值
     * @param val
     */
    PayeePlanDTO setSettlementAmount(BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount
        return this
    }


    /**
     * 设置「订单客户」值
     * @param val
     */
    PayeePlanDTO setAccountName(String accountName) {
        this.accountName = accountName
        return this
    }


    /**
     * 设置「订单日期」值
     * @param val
     */
    PayeePlanDTO setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate
        return this
    }


    /**
     * 设置「业务条线」值
     * 字典[行业]
     * @param val
     */
    PayeePlanDTO setBusinessLine(String businessLine) {
        this.businessLine = businessLine
        return this
    }


    /**
     * 设置「金额」值
     * @param val
     */
    PayeePlanDTO setAmount(BigDecimal amount) {
        this.amount = amount
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    PayeePlanDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PayeePlanDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PayeePlanDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「款项说明」值
     * @param val
     */
    PayeePlanDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    PayeePlanDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    PayeePlanDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「订单名称」值
     * @param val
     */
    PayeePlanDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「订单名称」值
     * @param val
     */
    PayeePlanDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PayeePlanDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PayeePlanDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
