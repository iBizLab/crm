package cn.ibizlab.crm.crm.payee.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.crm.crm.payeeallocate.dto.PayeeAllocateDTO
import cn.ibizlab.crm.crm.attachment.dto.AttachmentDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class PayeeDTO extends GroovyDTO<PayeeDTO> {

    /**
     * 「序号」
     */
    @JsonProperty("sequence")
    BigDecimal sequence
    /**
     * 「收款方式」
     */
    @JsonProperty("method")
    String method
    /**
     * 「收款日期」
     */
    @JsonProperty("payee_date")
    Timestamp payeeDate
    /**
     * 「原计划金额」
     */
    @JsonProperty("plan_amount")
    BigDecimal planAmount
    /**
     * 「原计划时间」
     */
    @JsonProperty("planned_time")
    Timestamp plannedTime
    /**
     * 「原计划说明」
     */
    @JsonProperty("plan_description")
    String planDescription
    /**
     * 「回款分配」
     */
    @JsonProperty("payee_allocates")
    List<PayeeAllocateDTO> payeeAllocates
    /**
     * 「所属年度」
     */
    @JsonProperty("year")
    String year
    /**
     * 「订单编号」
     */
    @JsonProperty("o_number")
    String oNumber
    /**
     * 「分配模式」
     * 字典[分配模式]
     */
    @JsonProperty("allocate_model")
    String allocateModel
    /**
     * 「所有者」
     * 字典[所有者]
     */
    @JsonProperty("owner")
    String owner
    /**
     * 「父标识」
     */
    @JsonProperty("pproject_id")
    String pprojectId
    /**
     * 「订单名称」
     */
    @JsonProperty("project_name")
    String projectName
    /**
     * 「客户名称」
     */
    @JsonProperty("account_name")
    String accountName
    /**
     * 「业绩结算金额」
     */
    @JsonProperty("settlement_amount")
    BigDecimal settlementAmount
    /**
     * 「业务条线」
     * 字典[行业]
     */
    @JsonProperty("business_line")
    String businessLine
    /**
     * 「订单日期」
     */
    @JsonProperty("order_date")
    Timestamp orderDate
    /**
     * 「计划名称」
     */
    @JsonProperty("plan_name")
    String planName
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
     * 「编号」
     */
    @JsonProperty("payee_number")
    String payeeNumber
    /**
     * 「收款计划标识」
     */
    @JsonProperty("payee_plan_id")
    String payeePlanId
    /**
     * 「订单标识」
     */
    @JsonProperty("project_id")
    String projectId
    /**
     * 「状态」
     * 字典[收款状态]
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
     * 设置「序号」值
     * @param val
     */
    PayeeDTO setSequence(BigDecimal sequence) {
        this.sequence = sequence
        return this
    }


    /**
     * 设置「收款方式」值
     * @param val
     */
    PayeeDTO setMethod(String method) {
        this.method = method
        return this
    }


    /**
     * 设置「收款日期」值
     * @param val
     */
    PayeeDTO setPayeeDate(Timestamp payeeDate) {
        this.payeeDate = payeeDate
        return this
    }


    /**
     * 设置「原计划金额」值
     * @param val
     */
    PayeeDTO setPlanAmount(BigDecimal planAmount) {
        this.planAmount = planAmount
        return this
    }


    /**
     * 设置「原计划时间」值
     * @param val
     */
    PayeeDTO setPlannedTime(Timestamp plannedTime) {
        this.plannedTime = plannedTime
        return this
    }


    /**
     * 设置「原计划说明」值
     * @param val
     */
    PayeeDTO setPlanDescription(String planDescription) {
        this.planDescription = planDescription
        return this
    }


    /**
     * 设置「回款分配」值
     * @param val
     */
    PayeeDTO setPayeeAllocates(List<PayeeAllocateDTO> payeeAllocates) {
        this.payeeAllocates = payeeAllocates
        return this
    }


    /**
     * 设置「所属年度」值
     * @param val
     */
    PayeeDTO setYear(String year) {
        this.year = year
        return this
    }


    /**
     * 设置「订单编号」值
     * @param val
     */
    PayeeDTO setONumber(String oNumber) {
        this.oNumber = oNumber
        return this
    }


    /**
     * 设置「分配模式」值
     * 字典[分配模式]
     * @param val
     */
    PayeeDTO setAllocateModel(String allocateModel) {
        this.allocateModel = allocateModel
        return this
    }


    /**
     * 设置「所有者」值
     * 字典[所有者]
     * @param val
     */
    PayeeDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    PayeeDTO setPprojectId(String pprojectId) {
        this.pprojectId = pprojectId
        return this
    }


    /**
     * 设置「订单名称」值
     * @param val
     */
    PayeeDTO setProjectName(String projectName) {
        this.projectName = projectName
        return this
    }


    /**
     * 设置「客户名称」值
     * @param val
     */
    PayeeDTO setAccountName(String accountName) {
        this.accountName = accountName
        return this
    }


    /**
     * 设置「业绩结算金额」值
     * @param val
     */
    PayeeDTO setSettlementAmount(BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount
        return this
    }


    /**
     * 设置「业务条线」值
     * 字典[行业]
     * @param val
     */
    PayeeDTO setBusinessLine(String businessLine) {
        this.businessLine = businessLine
        return this
    }


    /**
     * 设置「订单日期」值
     * @param val
     */
    PayeeDTO setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate
        return this
    }


    /**
     * 设置「计划名称」值
     * @param val
     */
    PayeeDTO setPlanName(String planName) {
        this.planName = planName
        return this
    }


    /**
     * 设置「金额」值
     * @param val
     */
    PayeeDTO setAmount(BigDecimal amount) {
        this.amount = amount
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    PayeeDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PayeeDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PayeeDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「款项说明」值
     * @param val
     */
    PayeeDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    PayeeDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    PayeeDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「编号」值
     * @param val
     */
    PayeeDTO setPayeeNumber(String payeeNumber) {
        this.payeeNumber = payeeNumber
        return this
    }


    /**
     * 设置「收款计划标识」值
     * @param val
     */
    PayeeDTO setPayeePlanId(String payeePlanId) {
        this.payeePlanId = payeePlanId
        return this
    }


    /**
     * 设置「订单标识」值
     * @param val
     */
    PayeeDTO setProjectId(String projectId) {
        this.projectId = projectId
        return this
    }


    /**
     * 设置「状态」值
     * 字典[收款状态]
     * @param val
     */
    PayeeDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PayeeDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PayeeDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
