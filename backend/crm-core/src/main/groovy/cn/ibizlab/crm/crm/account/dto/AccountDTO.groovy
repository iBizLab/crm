package cn.ibizlab.crm.crm.account.dto

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
class AccountDTO extends GroovyDTO<AccountDTO> {

    /**
     * 「开单地址-街道」
     */
    @JsonProperty("billing_street")
    String billingStreet
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「客户图片」
     */
    @JsonProperty("record_image")
    String recordImage
    /**
     * 「父客户」
     */
    @JsonProperty("p_account_name")
    String pAccountName
    /**
     * 「客户名称」
     */
    @JsonProperty("account_name")
    String accountName
    /**
     * 「客户编号」
     */
    @JsonProperty("account_number")
    String accountNumber
    /**
     * 「客户所在地」
     */
    @JsonProperty("account_site")
    String accountSite
    /**
     * 「客户类型」
     * 字典[客户类型]
     */
    @JsonProperty("account_type")
    String accountType
    /**
     * 「年收入」
     */
    @JsonProperty("annual_revenue")
    String annualRevenue
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
     * 「Change_Log_Time」
     */
    @JsonProperty("change_log_time_s")
    Timestamp changeLogTimeS
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
     * 「员工数」
     */
    @JsonProperty("employees")
    Integer employees
    /**
     * 「充实状态」
     */
    @JsonProperty("enrich_status_s")
    String enrichStatusS
    /**
     * 「传真」
     */
    @JsonProperty("fax")
    String fax
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「所属行业」
     * 字典[行业]
     */
    @JsonProperty("industry")
    String industry
    /**
     * 「最近操作时间」
     */
    @JsonProperty("last_activity_time")
    Timestamp lastActivityTime
    /**
     * 「最后充实时间」
     */
    @JsonProperty("last_enriched_time_s")
    Timestamp lastEnrichedTimeS
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
     * 「所有者」
     * 字典[所有者]
     */
    @JsonProperty("owner")
    String owner
    /**
     * 「公司所有权」
     * 字典[公司所有权]
     */
    @JsonProperty("ownership")
    String ownership
    /**
     * 「电话」
     */
    @JsonProperty("phone")
    String phone
    /**
     * 「父标识」
     */
    @JsonProperty("pid")
    String pid
    /**
     * 「等级」
     * 字典[等级]
     */
    @JsonProperty("rating")
    String rating
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
     * 「SIC代码」
     */
    @JsonProperty("sic_code")
    Integer sicCode
    /**
     * 「标签」
     */
    @JsonProperty("tag")
    String tag
    /**
     * 「股票代码」
     */
    @JsonProperty("ticker_symbol")
    String tickerSymbol
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
     * 「网站」
     */
    @JsonProperty("website")
    String website

    /**
     * 设置「开单地址-街道」值
     * @param val
     */
    AccountDTO setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    AccountDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「客户图片」值
     * @param val
     */
    AccountDTO setRecordImage(String recordImage) {
        this.recordImage = recordImage
        return this
    }


    /**
     * 设置「父客户」值
     * @param val
     */
    AccountDTO setPAccountName(String pAccountName) {
        this.pAccountName = pAccountName
        return this
    }


    /**
     * 设置「客户名称」值
     * @param val
     */
    AccountDTO setAccountName(String accountName) {
        this.accountName = accountName
        return this
    }


    /**
     * 设置「客户编号」值
     * @param val
     */
    AccountDTO setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber
        return this
    }


    /**
     * 设置「客户所在地」值
     * @param val
     */
    AccountDTO setAccountSite(String accountSite) {
        this.accountSite = accountSite
        return this
    }


    /**
     * 设置「客户类型」值
     * 字典[客户类型]
     * @param val
     */
    AccountDTO setAccountType(String accountType) {
        this.accountType = accountType
        return this
    }


    /**
     * 设置「年收入」值
     * @param val
     */
    AccountDTO setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    AccountDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「开单地址-城市」值
     * @param val
     */
    AccountDTO setBillingCity(String billingCity) {
        this.billingCity = billingCity
        return this
    }


    /**
     * 设置「开单地址-邮编」值
     * @param val
     */
    AccountDTO setBillingCode(String billingCode) {
        this.billingCode = billingCode
        return this
    }


    /**
     * 设置「开单地址-国家/地区」值
     * @param val
     */
    AccountDTO setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry
        return this
    }


    /**
     * 设置「开单地址-省/市」值
     * @param val
     */
    AccountDTO setBillingState(String billingState) {
        this.billingState = billingState
        return this
    }


    /**
     * 设置「Change_Log_Time」值
     * @param val
     */
    AccountDTO setChangeLogTimeS(Timestamp changeLogTimeS) {
        this.changeLogTimeS = changeLogTimeS
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    AccountDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    AccountDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「员工数」值
     * @param val
     */
    AccountDTO setEmployees(Integer employees) {
        this.employees = employees
        return this
    }


    /**
     * 设置「充实状态」值
     * @param val
     */
    AccountDTO setEnrichStatusS(String enrichStatusS) {
        this.enrichStatusS = enrichStatusS
        return this
    }


    /**
     * 设置「传真」值
     * @param val
     */
    AccountDTO setFax(String fax) {
        this.fax = fax
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    AccountDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「所属行业」值
     * 字典[行业]
     * @param val
     */
    AccountDTO setIndustry(String industry) {
        this.industry = industry
        return this
    }


    /**
     * 设置「最近操作时间」值
     * @param val
     */
    AccountDTO setLastActivityTime(Timestamp lastActivityTime) {
        this.lastActivityTime = lastActivityTime
        return this
    }


    /**
     * 设置「最后充实时间」值
     * @param val
     */
    AccountDTO setLastEnrichedTimeS(Timestamp lastEnrichedTimeS) {
        this.lastEnrichedTimeS = lastEnrichedTimeS
        return this
    }


    /**
     * 设置「Locked」值
     * 字典[是否]
     * @param val
     */
    AccountDTO setLockedS(Integer lockedS) {
        this.lockedS = lockedS
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AccountDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「所有者」值
     * 字典[所有者]
     * @param val
     */
    AccountDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「公司所有权」值
     * 字典[公司所有权]
     * @param val
     */
    AccountDTO setOwnership(String ownership) {
        this.ownership = ownership
        return this
    }


    /**
     * 设置「电话」值
     * @param val
     */
    AccountDTO setPhone(String phone) {
        this.phone = phone
        return this
    }


    /**
     * 设置「父标识」值
     * @param val
     */
    AccountDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「等级」值
     * 字典[等级]
     * @param val
     */
    AccountDTO setRating(String rating) {
        this.rating = rating
        return this
    }


    /**
     * 设置「发货地址-城市」值
     * @param val
     */
    AccountDTO setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity
        return this
    }


    /**
     * 设置「发货地址-邮编」值
     * @param val
     */
    AccountDTO setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode
        return this
    }


    /**
     * 设置「发货地址-国家/地区」值
     * @param val
     */
    AccountDTO setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry
        return this
    }


    /**
     * 设置「发货地址-省/市」值
     * @param val
     */
    AccountDTO setShippingState(String shippingState) {
        this.shippingState = shippingState
        return this
    }


    /**
     * 设置「发货地址-街道」值
     * @param val
     */
    AccountDTO setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet
        return this
    }


    /**
     * 设置「SIC代码」值
     * @param val
     */
    AccountDTO setSicCode(Integer sicCode) {
        this.sicCode = sicCode
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    AccountDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「股票代码」值
     * @param val
     */
    AccountDTO setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    AccountDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    AccountDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「网站」值
     * @param val
     */
    AccountDTO setWebsite(String website) {
        this.website = website
        return this
    }

}
