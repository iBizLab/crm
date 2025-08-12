package cn.ibizlab.crm.crm.lead.dto

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
class LeadDTO extends GroovyDTO<LeadDTO> {

    /**
     * 「跟踪人」
     */
    @JsonProperty("executors")
    List<ExecutorDTO> executors
    /**
     * 「客户名称」
     */
    @JsonProperty("account_name")
    String accountName
    /**
     * 「父线索」
     */
    @JsonProperty("pname")
    String pname
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
     * 「城市」
     */
    @JsonProperty("city")
    String city
    /**
     * 「公司」
     */
    @JsonProperty("company")
    String company
    /**
     * 「转换的日期时间」
     */
    @JsonProperty("converted_date_time")
    Timestamp convertedDateTime
    /**
     * 「为“已转换”」
     * 字典[是否]
     */
    @JsonProperty("converted_s")
    Integer convertedS
    /**
     * 「国家/地区」
     */
    @JsonProperty("country")
    String country
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
     * 「职位/职称」
     */
    @JsonProperty("designation")
    String designation
    /**
     * 「电子邮件」
     */
    @JsonProperty("email")
    String email
    /**
     * 「不发营销邮件」
     * 字典[是否]
     */
    @JsonProperty("email_opt_out")
    Integer emailOptOut
    /**
     * 「充实状态」
     */
    @JsonProperty("enrich_status_s")
    String enrichStatusS
    /**
     * 「名字」
     */
    @JsonProperty("first_name")
    String firstName
    /**
     * 「联系人姓名」
     */
    @JsonProperty("full_name")
    String fullName
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「姓氏」
     */
    @JsonProperty("last_name")
    String lastName
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
     * 「线索状态」
     * 字典[线索状态]
     */
    @JsonProperty("lead_status")
    String leadStatus
    /**
     * 「手机」
     */
    @JsonProperty("mobile")
    String mobile
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「员工数」
     */
    @JsonProperty("no_of_employees")
    Integer noOfEmployees
    /**
     * 「所有者」
     * 字典[所有者]
     */
    @JsonProperty("owner")
    String owner
    /**
     * 「父线索标识」
     */
    @JsonProperty("pid")
    String pid
    /**
     * 「称呼」
     */
    @JsonProperty("salutation")
    String salutation
    /**
     * 「备用邮箱」
     */
    @JsonProperty("secondary_email")
    String secondaryEmail
    /**
     * 「Skype lD」
     */
    @JsonProperty("skype_id")
    String skypeId
    /**
     * 「省/市」
     */
    @JsonProperty("state")
    String state
    /**
     * 「街道」
     */
    @JsonProperty("street")
    String street
    /**
     * 「主题」
     */
    @JsonProperty("subject")
    String subject
    /**
     * 「退订的方式」
     */
    @JsonProperty("unsubscribed_mode")
    String unsubscribedMode
    /**
     * 「退订的时间」
     */
    @JsonProperty("unsubscribed_time")
    Timestamp unsubscribedTime
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
     * 「邮编」
     */
    @JsonProperty("zip_code")
    String zipCode

    /**
     * 设置「跟踪人」值
     * @param val
     */
    LeadDTO setExecutors(List<ExecutorDTO> executors) {
        this.executors = executors
        return this
    }


    /**
     * 设置「客户名称」值
     * @param val
     */
    LeadDTO setAccountName(String accountName) {
        this.accountName = accountName
        return this
    }


    /**
     * 设置「父线索」值
     * @param val
     */
    LeadDTO setPname(String pname) {
        this.pname = pname
        return this
    }


    /**
     * 设置「最近评估时间」值
     * @param val
     */
    LeadDTO setLastAssessTime(Timestamp lastAssessTime) {
        this.lastAssessTime = lastAssessTime
        return this
    }


    /**
     * 设置「客户标识」值
     * @param val
     */
    LeadDTO setAccountId(String accountId) {
        this.accountId = accountId
        return this
    }


    /**
     * 设置「年收入」值
     * @param val
     */
    LeadDTO setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    LeadDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「城市」值
     * @param val
     */
    LeadDTO setCity(String city) {
        this.city = city
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    LeadDTO setCompany(String company) {
        this.company = company
        return this
    }


    /**
     * 设置「转换的日期时间」值
     * @param val
     */
    LeadDTO setConvertedDateTime(Timestamp convertedDateTime) {
        this.convertedDateTime = convertedDateTime
        return this
    }


    /**
     * 设置「为“已转换”」值
     * 字典[是否]
     * @param val
     */
    LeadDTO setConvertedS(Integer convertedS) {
        this.convertedS = convertedS
        return this
    }


    /**
     * 设置「国家/地区」值
     * @param val
     */
    LeadDTO setCountry(String country) {
        this.country = country
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    LeadDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    LeadDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    LeadDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「职位/职称」值
     * @param val
     */
    LeadDTO setDesignation(String designation) {
        this.designation = designation
        return this
    }


    /**
     * 设置「电子邮件」值
     * @param val
     */
    LeadDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「不发营销邮件」值
     * 字典[是否]
     * @param val
     */
    LeadDTO setEmailOptOut(Integer emailOptOut) {
        this.emailOptOut = emailOptOut
        return this
    }


    /**
     * 设置「充实状态」值
     * @param val
     */
    LeadDTO setEnrichStatusS(String enrichStatusS) {
        this.enrichStatusS = enrichStatusS
        return this
    }


    /**
     * 设置「名字」值
     * @param val
     */
    LeadDTO setFirstName(String firstName) {
        this.firstName = firstName
        return this
    }


    /**
     * 设置「联系人姓名」值
     * @param val
     */
    LeadDTO setFullName(String fullName) {
        this.fullName = fullName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    LeadDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「姓氏」值
     * @param val
     */
    LeadDTO setLastName(String lastName) {
        this.lastName = lastName
        return this
    }


    /**
     * 设置「线索转换用时」值
     * @param val
     */
    LeadDTO setLeadConversionTime(Integer leadConversionTime) {
        this.leadConversionTime = leadConversionTime
        return this
    }


    /**
     * 设置「线索来源」值
     * 字典[线索来源]
     * @param val
     */
    LeadDTO setLeadSource(String leadSource) {
        this.leadSource = leadSource
        return this
    }


    /**
     * 设置「线索状态」值
     * 字典[线索状态]
     * @param val
     */
    LeadDTO setLeadStatus(String leadStatus) {
        this.leadStatus = leadStatus
        return this
    }


    /**
     * 设置「手机」值
     * @param val
     */
    LeadDTO setMobile(String mobile) {
        this.mobile = mobile
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    LeadDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「员工数」值
     * @param val
     */
    LeadDTO setNoOfEmployees(Integer noOfEmployees) {
        this.noOfEmployees = noOfEmployees
        return this
    }


    /**
     * 设置「所有者」值
     * 字典[所有者]
     * @param val
     */
    LeadDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「父线索标识」值
     * @param val
     */
    LeadDTO setPid(String pid) {
        this.pid = pid
        return this
    }


    /**
     * 设置「称呼」值
     * @param val
     */
    LeadDTO setSalutation(String salutation) {
        this.salutation = salutation
        return this
    }


    /**
     * 设置「备用邮箱」值
     * @param val
     */
    LeadDTO setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail
        return this
    }


    /**
     * 设置「Skype lD」值
     * @param val
     */
    LeadDTO setSkypeId(String skypeId) {
        this.skypeId = skypeId
        return this
    }


    /**
     * 设置「省/市」值
     * @param val
     */
    LeadDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「街道」值
     * @param val
     */
    LeadDTO setStreet(String street) {
        this.street = street
        return this
    }


    /**
     * 设置「主题」值
     * @param val
     */
    LeadDTO setSubject(String subject) {
        this.subject = subject
        return this
    }


    /**
     * 设置「退订的方式」值
     * @param val
     */
    LeadDTO setUnsubscribedMode(String unsubscribedMode) {
        this.unsubscribedMode = unsubscribedMode
        return this
    }


    /**
     * 设置「退订的时间」值
     * @param val
     */
    LeadDTO setUnsubscribedTime(Timestamp unsubscribedTime) {
        this.unsubscribedTime = unsubscribedTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    LeadDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    LeadDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「邮编」值
     * @param val
     */
    LeadDTO setZipCode(String zipCode) {
        this.zipCode = zipCode
        return this
    }

}
