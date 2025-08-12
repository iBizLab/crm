package cn.ibizlab.crm.crm.project.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.crm.crm.orderallocate.dto.OrderAllocateDTO
import cn.ibizlab.crm.crm.executor.dto.ExecutorDTO
import cn.ibizlab.crm.crm.attachment.dto.AttachmentDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class ProjectDTO extends GroovyDTO<ProjectDTO> {

    /**
     * 「客户名称」
     */
    @JsonProperty("account_name")
    String accountName
    /**
     * 「关闭日期」
     */
    @JsonProperty("closed_date")
    Timestamp closedDate
    /**
     * 「订单日期」
     */
    @JsonProperty("order_date")
    Timestamp orderDate
    /**
     * 「纳入销售业绩计算」
     * 字典[是否]
     */
    @JsonProperty("is_in_sales_cal")
    Integer isInSalesCal
    /**
     * 「所属年度」
     */
    @JsonProperty("year")
    String year
    /**
     * 「分配人员」
     */
    @JsonProperty("order_allocates")
    List<OrderAllocateDTO> orderAllocates
    /**
     * 「分配模式」
     */
    @JsonProperty("allocate_model")
    String allocateModel
    /**
     * 「业务条线」
     * 字典[行业]
     */
    @JsonProperty("business_line")
    String businessLine
    /**
     * 「执行人」
     */
    @JsonProperty("executors")
    List<ExecutorDTO> executors
    /**
     * 「对应实体订单」
     * 字典[是否]
     */
    @JsonProperty("is_physical_order")
    Integer isPhysicalOrder
    /**
     * 「最近评估时间」
     */
    @JsonProperty("last_assess_time")
    Timestamp lastAssessTime
    /**
     * 「客户标识」
     */
    @JsonProperty("account_id")
    String accountId
    /**
     * 「订单金额」
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
     * 「是否本年执行」
     */
    @JsonProperty("is_close_this_year")
    String isCloseThisYear
    /**
     * 「是否本年新签」
     */
    @JsonProperty("is_new_this_year")
    String isNewThisYear
    /**
     * 「订单名称」
     */
    @JsonProperty("name")
    String name
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
     * 「父标识」
     */
    @JsonProperty("pid")
    String pid
    /**
     * 「父订单」
     */
    @JsonProperty("pname")
    String pname
    /**
     * 「业绩结算金额」
     */
    @JsonProperty("settlement_amount")
    BigDecimal settlementAmount
    /**
     * 「结算成本」
     */
    @JsonProperty("settlement_cost")
    BigDecimal settlementCost
    /**
     * 「状态」
     * 字典[订单状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「税率」
     */
    @JsonProperty("tax")
    BigDecimal tax
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
    ProjectDTO setAccountName(String accountName) {
        this.accountName = accountName
        return this
    }


    /**
     * 设置「关闭日期」值
     * @param val
     */
    ProjectDTO setClosedDate(Timestamp closedDate) {
        this.closedDate = closedDate
        return this
    }


    /**
     * 设置「订单日期」值
     * @param val
     */
    ProjectDTO setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate
        return this
    }


    /**
     * 设置「纳入销售业绩计算」值
     * 字典[是否]
     * @param val
     */
    ProjectDTO setIsInSalesCal(Integer isInSalesCal) {
        this.isInSalesCal = isInSalesCal
        return this
    }


    /**
     * 设置「所属年度」值
     * @param val
     */
    ProjectDTO setYear(String year) {
        this.year = year
        return this
    }


    /**
     * 设置「分配人员」值
     * @param val
     */
    ProjectDTO setOrderAllocates(List<OrderAllocateDTO> orderAllocates) {
        this.orderAllocates = orderAllocates
        return this
    }


    /**
     * 设置「分配模式」值
     * @param val
     */
    ProjectDTO setAllocateModel(String allocateModel) {
        this.allocateModel = allocateModel
        return this
    }


    /**
     * 设置「业务条线」值
     * 字典[行业]
     * @param val
     */
    ProjectDTO setBusinessLine(String businessLine) {
        this.businessLine = businessLine
        return this
    }


    /**
     * 设置「执行人」值
     * @param val
     */
    ProjectDTO setExecutors(List<ExecutorDTO> executors) {
        this.executors = executors
        return this
    }


    /**
     * 设置「对应实体订单」值
     * 字典[是否]
     * @param val
     */
    ProjectDTO setIsPhysicalOrder(Integer isPhysicalOrder) {
        this.isPhysicalOrder = isPhysicalOrder
        return this
    }


    /**
     * 设置「最近评估时间」值
     * @param val
     */
    ProjectDTO setLastAssessTime(Timestamp lastAssessTime) {
        this.lastAssessTime = lastAssessTime
        return this
    }


    /**
     * 设置「客户标识」值
     * @param val
     */
    ProjectDTO setAccountId(String accountId) {
        this.accountId = accountId
        return this
    }


    /**
     * 设置「订单金额」值
     * @param val
     */
    ProjectDTO setAmount(BigDecimal amount) {
        this.amount = amount
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    ProjectDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ProjectDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ProjectDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ProjectDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「是否本年执行」值
     * @param val
     */
    ProjectDTO setIsCloseThisYear(String isCloseThisYear) {
        this.isCloseThisYear = isCloseThisYear
        return this
    }


    /**
     * 设置「是否本年新签」值
     * @param val
     */
    ProjectDTO setIsNewThisYear(String isNewThisYear) {
        this.isNewThisYear = isNewThisYear
        return this
    }


    /**
     * 设置「订单名称」值
     * @param val
     */
    ProjectDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「订单编号」值
     * @param val
     */
    ProjectDTO setONumber(String oNumber) {
        this.oNumber = oNumber
        return this
    }


    /**
     * 设置「所有者」值
     * 字典[所有者]
     * @param val
     */
    ProjectDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    ProjectDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「父订单」值
     * @param val
     */
    ProjectDTO setPname(String pname) {
        this.pname = pname
        return this
    }


    /**
     * 设置「业绩结算金额」值
     * @param val
     */
    ProjectDTO setSettlementAmount(BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount
        return this
    }


    /**
     * 设置「结算成本」值
     * @param val
     */
    ProjectDTO setSettlementCost(BigDecimal settlementCost) {
        this.settlementCost = settlementCost
        return this
    }


    /**
     * 设置「状态」值
     * 字典[订单状态]
     * @param val
     */
    ProjectDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「税率」值
     * @param val
     */
    ProjectDTO setTax(BigDecimal tax) {
        this.tax = tax
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProjectDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ProjectDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
