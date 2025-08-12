package cn.ibizlab.crm.crm.quote.dto

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
class QuoteDTO extends GroovyDTO<QuoteDTO> {

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
     * 「记录ID」
     */
    @JsonProperty("billing_street")
    String billingStreet
    /**
     * 「运输」
     */
    @JsonProperty("carrier")
    String carrier
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
     * 「报价编号」
     */
    @JsonProperty("quote_number")
    String quoteNumber
    /**
     * 「报价阶段」
     */
    @JsonProperty("quote_stage")
    String quoteStage
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
     * 「团队」
     */
    @JsonProperty("team")
    String team
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
     * 「有效期至」
     */
    @JsonProperty("valid_till")
    Timestamp validTill

    /**
     * 设置「调整」值
     * @param val
     */
    QuoteDTO setAdjustment(String adjustment) {
        this.adjustment = adjustment
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    QuoteDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「开单地址-城市」值
     * @param val
     */
    QuoteDTO setBillingCity(String billingCity) {
        this.billingCity = billingCity
        return this
    }


    /**
     * 设置「开单地址-邮编」值
     * @param val
     */
    QuoteDTO setBillingCode(String billingCode) {
        this.billingCode = billingCode
        return this
    }


    /**
     * 设置「开单地址-国家/地区」值
     * @param val
     */
    QuoteDTO setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry
        return this
    }


    /**
     * 设置「开单地址-省/市」值
     * @param val
     */
    QuoteDTO setBillingState(String billingState) {
        this.billingState = billingState
        return this
    }


    /**
     * 设置「记录ID」值
     * @param val
     */
    QuoteDTO setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet
        return this
    }


    /**
     * 设置「运输」值
     * @param val
     */
    QuoteDTO setCarrier(String carrier) {
        this.carrier = carrier
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    QuoteDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    QuoteDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    QuoteDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「折扣」值
     * @param val
     */
    QuoteDTO setDiscount(String discount) {
        this.discount = discount
        return this
    }


    /**
     * 设置「累计」值
     * @param val
     */
    QuoteDTO setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    QuoteDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「Locked」值
     * 字典[是否]
     * @param val
     */
    QuoteDTO setLockedS(Integer lockedS) {
        this.lockedS = lockedS
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    QuoteDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「报价编号」值
     * @param val
     */
    QuoteDTO setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber
        return this
    }


    /**
     * 设置「报价阶段」值
     * @param val
     */
    QuoteDTO setQuoteStage(String quoteStage) {
        this.quoteStage = quoteStage
        return this
    }


    /**
     * 设置「发货地址-城市」值
     * @param val
     */
    QuoteDTO setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity
        return this
    }


    /**
     * 设置「发货地址-邮编」值
     * @param val
     */
    QuoteDTO setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode
        return this
    }


    /**
     * 设置「发货地址-国家/地区」值
     * @param val
     */
    QuoteDTO setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry
        return this
    }


    /**
     * 设置「发货地址-省/市」值
     * @param val
     */
    QuoteDTO setShippingState(String shippingState) {
        this.shippingState = shippingState
        return this
    }


    /**
     * 设置「发货地址-街道」值
     * @param val
     */
    QuoteDTO setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet
        return this
    }


    /**
     * 设置「小计」值
     * @param val
     */
    QuoteDTO setSubTotal(String subTotal) {
        this.subTotal = subTotal
        return this
    }


    /**
     * 设置「主题」值
     * @param val
     */
    QuoteDTO setSubject(String subject) {
        this.subject = subject
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    QuoteDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「税」值
     * @param val
     */
    QuoteDTO setTax(String tax) {
        this.tax = tax
        return this
    }


    /**
     * 设置「团队」值
     * @param val
     */
    QuoteDTO setTeam(String team) {
        this.team = team
        return this
    }


    /**
     * 设置「条款及条件」值
     * @param val
     */
    QuoteDTO setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    QuoteDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    QuoteDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「有效期至」值
     * @param val
     */
    QuoteDTO setValidTill(Timestamp validTill) {
        this.validTill = validTill
        return this
    }

}
