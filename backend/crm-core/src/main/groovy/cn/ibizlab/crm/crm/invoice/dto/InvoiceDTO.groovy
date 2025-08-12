package cn.ibizlab.crm.crm.invoice.dto

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
class InvoiceDTO extends GroovyDTO<InvoiceDTO> {

    /**
     * 「调整」
     */
    @JsonProperty("adjustment")
    String adjustment
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「开单地址-城市」
     */
    @JsonProperty("billing_city")
    String billingCity
    /**
     * 「开单地址-邮编」
     */
    @JsonProperty("billing_code")
    String billingCode
    /**
     * 「开单地址-国家/地区」
     */
    @JsonProperty("billing_country")
    String billingCountry
    /**
     * 「开单地址-省/市」
     */
    @JsonProperty("billing_state")
    String billingState
    /**
     * 「开单地址-街道」
     */
    @JsonProperty("billing_street")
    String billingStreet
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
     * 「折扣」
     */
    @JsonProperty("discount")
    String discount
    /**
     * 「到期日期」
     */
    @JsonProperty("due_date")
    Timestamp dueDate
    /**
     * 「消费税」
     */
    @JsonProperty("excise_duty")
    String exciseDuty
    /**
     * 「累计」
     */
    @JsonProperty("grand_total")
    String grandTotal
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「发货单日期」
     */
    @JsonProperty("invoice_date")
    Timestamp invoiceDate
    /**
     * 「发货单编号」
     */
    @JsonProperty("invoice_number")
    String invoiceNumber
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
     * 「采购订单」
     */
    @JsonProperty("purchase_order")
    String purchaseOrder
    /**
     * 「销售佣金」
     */
    @JsonProperty("sales_commissio")
    String salesCommissio
    /**
     * 「发货地址-城市」
     */
    @JsonProperty("shipping_city")
    String shippingCity
    /**
     * 「发货地址-邮编」
     */
    @JsonProperty("shipping_code")
    String shippingCode
    /**
     * 「发货地址-国家/地区」
     */
    @JsonProperty("shipping_country")
    String shippingCountry
    /**
     * 「发货地址-省/市」
     */
    @JsonProperty("shipping_state")
    String shippingState
    /**
     * 「发货地址-街道」
     */
    @JsonProperty("shipping_street")
    String shippingStreet
    /**
     * 「状态」
     */
    @JsonProperty("status")
    String status
    /**
     * 「小计」
     */
    @JsonProperty("sub_total")
    String subTotal
    /**
     * 「主题」
     */
    @JsonProperty("subject")
    String subject
    /**
     * 「标签」
     */
    @JsonProperty("tag")
    String tag
    /**
     * 「税」
     */
    @JsonProperty("tax")
    String tax
    /**
     * 「条款及条件」
     */
    @JsonProperty("terms_and_conditions")
    String termsAndConditions
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
     * 设置「调整」值
     * @param val
     */
    InvoiceDTO setAdjustment(String adjustment) {
        this.adjustment = adjustment
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    InvoiceDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「开单地址-城市」值
     * @param val
     */
    InvoiceDTO setBillingCity(String billingCity) {
        this.billingCity = billingCity
        return this
    }


    /**
     * 设置「开单地址-邮编」值
     * @param val
     */
    InvoiceDTO setBillingCode(String billingCode) {
        this.billingCode = billingCode
        return this
    }


    /**
     * 设置「开单地址-国家/地区」值
     * @param val
     */
    InvoiceDTO setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry
        return this
    }


    /**
     * 设置「开单地址-省/市」值
     * @param val
     */
    InvoiceDTO setBillingState(String billingState) {
        this.billingState = billingState
        return this
    }


    /**
     * 设置「开单地址-街道」值
     * @param val
     */
    InvoiceDTO setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    InvoiceDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    InvoiceDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    InvoiceDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「折扣」值
     * @param val
     */
    InvoiceDTO setDiscount(String discount) {
        this.discount = discount
        return this
    }


    /**
     * 设置「到期日期」值
     * @param val
     */
    InvoiceDTO setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate
        return this
    }


    /**
     * 设置「消费税」值
     * @param val
     */
    InvoiceDTO setExciseDuty(String exciseDuty) {
        this.exciseDuty = exciseDuty
        return this
    }


    /**
     * 设置「累计」值
     * @param val
     */
    InvoiceDTO setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    InvoiceDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「发货单日期」值
     * @param val
     */
    InvoiceDTO setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate
        return this
    }


    /**
     * 设置「发货单编号」值
     * @param val
     */
    InvoiceDTO setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber
        return this
    }


    /**
     * 设置「Locked」值
     * 字典[是否]
     * @param val
     */
    InvoiceDTO setLockedS(Integer lockedS) {
        this.lockedS = lockedS
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    InvoiceDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「采购订单」值
     * @param val
     */
    InvoiceDTO setPurchaseOrder(String purchaseOrder) {
        this.purchaseOrder = purchaseOrder
        return this
    }


    /**
     * 设置「销售佣金」值
     * @param val
     */
    InvoiceDTO setSalesCommissio(String salesCommissio) {
        this.salesCommissio = salesCommissio
        return this
    }


    /**
     * 设置「发货地址-城市」值
     * @param val
     */
    InvoiceDTO setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity
        return this
    }


    /**
     * 设置「发货地址-邮编」值
     * @param val
     */
    InvoiceDTO setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode
        return this
    }


    /**
     * 设置「发货地址-国家/地区」值
     * @param val
     */
    InvoiceDTO setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry
        return this
    }


    /**
     * 设置「发货地址-省/市」值
     * @param val
     */
    InvoiceDTO setShippingState(String shippingState) {
        this.shippingState = shippingState
        return this
    }


    /**
     * 设置「发货地址-街道」值
     * @param val
     */
    InvoiceDTO setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    InvoiceDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「小计」值
     * @param val
     */
    InvoiceDTO setSubTotal(String subTotal) {
        this.subTotal = subTotal
        return this
    }


    /**
     * 设置「主题」值
     * @param val
     */
    InvoiceDTO setSubject(String subject) {
        this.subject = subject
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    InvoiceDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「税」值
     * @param val
     */
    InvoiceDTO setTax(String tax) {
        this.tax = tax
        return this
    }


    /**
     * 设置「条款及条件」值
     * @param val
     */
    InvoiceDTO setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    InvoiceDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    InvoiceDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
