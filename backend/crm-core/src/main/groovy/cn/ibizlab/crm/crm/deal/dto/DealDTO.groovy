package cn.ibizlab.crm.crm.deal.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.crm.crm.executor.dto.ExecutorDTO
import cn.ibizlab.crm.crm.attachment.dto.AttachmentDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class DealDTO extends GroovyDTO<DealDTO> {

    /**
     * 「客户名称」
     */
    @JsonProperty("account_name")
    String accountName
    /**
     * 「执行人」
     */
    @JsonProperty("executors")
    List<ExecutorDTO> executors
    /**
     * 「是否有效」
     */
    @JsonProperty("validity")
    String validity
    /**
     * 「业务条线」
     * 字典[行业]
     */
    @JsonProperty("business_line")
    String businessLine
    /**
     * 「最近评估时间」
     */
    @JsonProperty("last_assess_time")
    Timestamp lastAssessTime
    /**
     * 「商机阶段概率」
     */
    @JsonProperty("stage_probability")
    BigDecimal stageProbability
    /**
     * 「客户ID」
     */
    @JsonProperty("account_id")
    String accountId
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
     * 「Change Log Time」
     */
    @JsonProperty("change_log_time_s")
    Timestamp changeLogTimeS
    /**
     * 「预计成交日期」
     */
    @JsonProperty("closing_date")
    Timestamp closingDate
    /**
     * 「联系人标识」
     */
    @JsonProperty("contact_id")
    String contactId
    /**
     * 「联系人名称」
     */
    @JsonProperty("contact_name")
    String contactName
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
     * 「商机名称」
     */
    @JsonProperty("deal_name")
    String dealName
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「预期收益」
     */
    @JsonProperty("expected_revenue")
    BigDecimal expectedRevenue
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「最近操作时间」
     */
    @JsonProperty("last_activity_time")
    Timestamp lastActivityTime
    /**
     * 「线索转换用时」
     */
    @JsonProperty("lead_conversion_time")
    Integer leadConversionTime
    /**
     * 「线索来源」
     * 字典[线索来源]
     */
    @JsonProperty("lead_source")
    String leadSource
    /**
     * 「Locked」
     * 字典[是否]
     */
    @JsonProperty("locked_s")
    Integer lockedS
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「下一步」
     */
    @JsonProperty("next_step")
    String nextStep
    /**
     * 「总销售时间」
     */
    @JsonProperty("overall_sales_duration")
    Integer overallSalesDuration
    /**
     * 「所有者」
     * 字典[所有者]
     */
    @JsonProperty("owner")
    String owner
    /**
     * 「可能性」
     */
    @JsonProperty("probability")
    BigDecimal probability
    /**
     * 「丢单原因」
     */
    @JsonProperty("reason_for_loss_s")
    String reasonForLossS
    /**
     * 「销售周期的持续时间」
     */
    @JsonProperty("sales_cycle_duration")
    Integer salesCycleDuration
    /**
     * 「阶段标识」
     */
    @JsonProperty("stage")
    String stage
    /**
     * 「标签」
     */
    @JsonProperty("tag")
    String tag
    /**
     * 「类型」
     * 字典[类型]
     */
    @JsonProperty("type")
    String type
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
     * 设置「客户名称」值
     * @param val
     */
    DealDTO setAccountName(String accountName) {
        this.accountName = accountName
        return this
    }


    /**
     * 设置「执行人」值
     * @param val
     */
    DealDTO setExecutors(List<ExecutorDTO> executors) {
        this.executors = executors
        return this
    }


    /**
     * 设置「是否有效」值
     * @param val
     */
    DealDTO setValidity(String validity) {
        this.validity = validity
        return this
    }


    /**
     * 设置「业务条线」值
     * 字典[行业]
     * @param val
     */
    DealDTO setBusinessLine(String businessLine) {
        this.businessLine = businessLine
        return this
    }


    /**
     * 设置「最近评估时间」值
     * @param val
     */
    DealDTO setLastAssessTime(Timestamp lastAssessTime) {
        this.lastAssessTime = lastAssessTime
        return this
    }


    /**
     * 设置「商机阶段概率」值
     * @param val
     */
    DealDTO setStageProbability(BigDecimal stageProbability) {
        this.stageProbability = stageProbability
        return this
    }


    /**
     * 设置「客户ID」值
     * @param val
     */
    DealDTO setAccountId(String accountId) {
        this.accountId = accountId
        return this
    }


    /**
     * 设置「金额」值
     * @param val
     */
    DealDTO setAmount(BigDecimal amount) {
        this.amount = amount
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    DealDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「Change Log Time」值
     * @param val
     */
    DealDTO setChangeLogTimeS(Timestamp changeLogTimeS) {
        this.changeLogTimeS = changeLogTimeS
        return this
    }


    /**
     * 设置「预计成交日期」值
     * @param val
     */
    DealDTO setClosingDate(Timestamp closingDate) {
        this.closingDate = closingDate
        return this
    }


    /**
     * 设置「联系人标识」值
     * @param val
     */
    DealDTO setContactId(String contactId) {
        this.contactId = contactId
        return this
    }


    /**
     * 设置「联系人名称」值
     * @param val
     */
    DealDTO setContactName(String contactName) {
        this.contactName = contactName
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    DealDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DealDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「商机名称」值
     * @param val
     */
    DealDTO setDealName(String dealName) {
        this.dealName = dealName
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    DealDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「预期收益」值
     * @param val
     */
    DealDTO setExpectedRevenue(BigDecimal expectedRevenue) {
        this.expectedRevenue = expectedRevenue
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DealDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「最近操作时间」值
     * @param val
     */
    DealDTO setLastActivityTime(Timestamp lastActivityTime) {
        this.lastActivityTime = lastActivityTime
        return this
    }


    /**
     * 设置「线索转换用时」值
     * @param val
     */
    DealDTO setLeadConversionTime(Integer leadConversionTime) {
        this.leadConversionTime = leadConversionTime
        return this
    }


    /**
     * 设置「线索来源」值
     * 字典[线索来源]
     * @param val
     */
    DealDTO setLeadSource(String leadSource) {
        this.leadSource = leadSource
        return this
    }


    /**
     * 设置「Locked」值
     * 字典[是否]
     * @param val
     */
    DealDTO setLockedS(Integer lockedS) {
        this.lockedS = lockedS
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    DealDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「下一步」值
     * @param val
     */
    DealDTO setNextStep(String nextStep) {
        this.nextStep = nextStep
        return this
    }


    /**
     * 设置「总销售时间」值
     * @param val
     */
    DealDTO setOverallSalesDuration(Integer overallSalesDuration) {
        this.overallSalesDuration = overallSalesDuration
        return this
    }


    /**
     * 设置「所有者」值
     * 字典[所有者]
     * @param val
     */
    DealDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「可能性」值
     * @param val
     */
    DealDTO setProbability(BigDecimal probability) {
        this.probability = probability
        return this
    }


    /**
     * 设置「丢单原因」值
     * @param val
     */
    DealDTO setReasonForLossS(String reasonForLossS) {
        this.reasonForLossS = reasonForLossS
        return this
    }


    /**
     * 设置「销售周期的持续时间」值
     * @param val
     */
    DealDTO setSalesCycleDuration(Integer salesCycleDuration) {
        this.salesCycleDuration = salesCycleDuration
        return this
    }


    /**
     * 设置「阶段标识」值
     * @param val
     */
    DealDTO setStage(String stage) {
        this.stage = stage
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    DealDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「类型」值
     * 字典[类型]
     * @param val
     */
    DealDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    DealDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DealDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
