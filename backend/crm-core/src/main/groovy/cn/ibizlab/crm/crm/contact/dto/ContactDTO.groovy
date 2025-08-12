package cn.ibizlab.crm.crm.contact.dto

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
class ContactDTO extends GroovyDTO<ContactDTO> {

    /**
     * 「客户名称」
     */
    @JsonProperty("account_name")
    String accountName
    /**
     * 「客户ID」
     */
    @JsonProperty("account_id")
    String accountId
    /**
     * 「助理」
     */
    @JsonProperty("assistant")
    String assistant
    /**
     * 「助理电话」
     */
    @JsonProperty("asst_phone")
    String asstPhone
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
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
     * 「生日」
     */
    @JsonProperty("date_of_birth")
    Timestamp dateOfBirth
    /**
     * 「部门」
     */
    @JsonProperty("department")
    String department
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
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
     * 「传真」
     */
    @JsonProperty("fax")
    String fax
    /**
     * 「名字」
     */
    @JsonProperty("first_name")
    String firstName
    /**
     * 「全名」
     */
    @JsonProperty("full_name")
    String fullName
    /**
     * 「住宅电话」
     */
    @JsonProperty("home_phone")
    String homePhone
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
     * 「最后充实时间」
     */
    @JsonProperty("last_enriched_time_s")
    Timestamp lastEnrichedTimeS
    /**
     * 「姓氏」
     */
    @JsonProperty("last_name")
    String lastName
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
     * 「邮寄地址-城市」
     */
    @JsonProperty("mailing_city")
    String mailingCity
    /**
     * 「邮寄地址-国家/地」
     */
    @JsonProperty("mailing_country")
    String mailingCountry
    /**
     * 「邮寄地址-省/市」
     */
    @JsonProperty("mailing_state")
    String mailingState
    /**
     * 「邮寄地址-街道」
     */
    @JsonProperty("mailing_street")
    String mailingStreet
    /**
     * 「邮寄地址-邮编」
     */
    @JsonProperty("mailing_zip")
    String mailingZip
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
     * 「其它城市」
     */
    @JsonProperty("other_city")
    String otherCity
    /**
     * 「其它国家/地区」
     */
    @JsonProperty("other_country")
    String otherCountry
    /**
     * 「其它省/市」
     */
    @JsonProperty("other_state")
    String otherState
    /**
     * 「其它街道」
     */
    @JsonProperty("other_street")
    String otherStreet
    /**
     * 「其他邮编」
     */
    @JsonProperty("other_zip")
    String otherZip
    /**
     * 「所有者」
     * 字典[所有者]
     */
    @JsonProperty("owner")
    String owner
    /**
     * 「电话」
     */
    @JsonProperty("phone")
    String phone
    /**
     * 「联系人图片」
     */
    @JsonProperty("record_image")
    String recordImage
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
     * 「Skype_ID」
     */
    @JsonProperty("skype_id")
    String skypeId
    /**
     * 「标签」
     */
    @JsonProperty("tag")
    String tag
    /**
     * 「职位/职称」
     */
    @JsonProperty("title")
    String title
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
     * 设置「客户名称」值
     * @param val
     */
    ContactDTO setAccountName(String accountName) {
        this.accountName = accountName
        return this
    }


    /**
     * 设置「客户ID」值
     * @param val
     */
    ContactDTO setAccountId(String accountId) {
        this.accountId = accountId
        return this
    }


    /**
     * 设置「助理」值
     * @param val
     */
    ContactDTO setAssistant(String assistant) {
        this.assistant = assistant
        return this
    }


    /**
     * 设置「助理电话」值
     * @param val
     */
    ContactDTO setAsstPhone(String asstPhone) {
        this.asstPhone = asstPhone
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    ContactDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「Change_Log_Time」值
     * @param val
     */
    ContactDTO setChangeLogTimeS(Timestamp changeLogTimeS) {
        this.changeLogTimeS = changeLogTimeS
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ContactDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ContactDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「生日」值
     * @param val
     */
    ContactDTO setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth
        return this
    }


    /**
     * 设置「部门」值
     * @param val
     */
    ContactDTO setDepartment(String department) {
        this.department = department
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ContactDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「电子邮件」值
     * @param val
     */
    ContactDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「不发营销邮件」值
     * 字典[是否]
     * @param val
     */
    ContactDTO setEmailOptOut(Integer emailOptOut) {
        this.emailOptOut = emailOptOut
        return this
    }


    /**
     * 设置「充实状态」值
     * @param val
     */
    ContactDTO setEnrichStatusS(String enrichStatusS) {
        this.enrichStatusS = enrichStatusS
        return this
    }


    /**
     * 设置「传真」值
     * @param val
     */
    ContactDTO setFax(String fax) {
        this.fax = fax
        return this
    }


    /**
     * 设置「名字」值
     * @param val
     */
    ContactDTO setFirstName(String firstName) {
        this.firstName = firstName
        return this
    }


    /**
     * 设置「全名」值
     * @param val
     */
    ContactDTO setFullName(String fullName) {
        this.fullName = fullName
        return this
    }


    /**
     * 设置「住宅电话」值
     * @param val
     */
    ContactDTO setHomePhone(String homePhone) {
        this.homePhone = homePhone
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ContactDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「最近操作时间」值
     * @param val
     */
    ContactDTO setLastActivityTime(Timestamp lastActivityTime) {
        this.lastActivityTime = lastActivityTime
        return this
    }


    /**
     * 设置「最后充实时间」值
     * @param val
     */
    ContactDTO setLastEnrichedTimeS(Timestamp lastEnrichedTimeS) {
        this.lastEnrichedTimeS = lastEnrichedTimeS
        return this
    }


    /**
     * 设置「姓氏」值
     * @param val
     */
    ContactDTO setLastName(String lastName) {
        this.lastName = lastName
        return this
    }


    /**
     * 设置「线索来源」值
     * 字典[线索来源]
     * @param val
     */
    ContactDTO setLeadSource(String leadSource) {
        this.leadSource = leadSource
        return this
    }


    /**
     * 设置「Locked」值
     * 字典[是否]
     * @param val
     */
    ContactDTO setLockedS(Integer lockedS) {
        this.lockedS = lockedS
        return this
    }


    /**
     * 设置「邮寄地址-城市」值
     * @param val
     */
    ContactDTO setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity
        return this
    }


    /**
     * 设置「邮寄地址-国家/地」值
     * @param val
     */
    ContactDTO setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry
        return this
    }


    /**
     * 设置「邮寄地址-省/市」值
     * @param val
     */
    ContactDTO setMailingState(String mailingState) {
        this.mailingState = mailingState
        return this
    }


    /**
     * 设置「邮寄地址-街道」值
     * @param val
     */
    ContactDTO setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet
        return this
    }


    /**
     * 设置「邮寄地址-邮编」值
     * @param val
     */
    ContactDTO setMailingZip(String mailingZip) {
        this.mailingZip = mailingZip
        return this
    }


    /**
     * 设置「手机」值
     * @param val
     */
    ContactDTO setMobile(String mobile) {
        this.mobile = mobile
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ContactDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「其它城市」值
     * @param val
     */
    ContactDTO setOtherCity(String otherCity) {
        this.otherCity = otherCity
        return this
    }


    /**
     * 设置「其它国家/地区」值
     * @param val
     */
    ContactDTO setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry
        return this
    }


    /**
     * 设置「其它省/市」值
     * @param val
     */
    ContactDTO setOtherState(String otherState) {
        this.otherState = otherState
        return this
    }


    /**
     * 设置「其它街道」值
     * @param val
     */
    ContactDTO setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet
        return this
    }


    /**
     * 设置「其他邮编」值
     * @param val
     */
    ContactDTO setOtherZip(String otherZip) {
        this.otherZip = otherZip
        return this
    }


    /**
     * 设置「所有者」值
     * 字典[所有者]
     * @param val
     */
    ContactDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「电话」值
     * @param val
     */
    ContactDTO setPhone(String phone) {
        this.phone = phone
        return this
    }


    /**
     * 设置「联系人图片」值
     * @param val
     */
    ContactDTO setRecordImage(String recordImage) {
        this.recordImage = recordImage
        return this
    }


    /**
     * 设置「称呼」值
     * @param val
     */
    ContactDTO setSalutation(String salutation) {
        this.salutation = salutation
        return this
    }


    /**
     * 设置「备用邮箱」值
     * @param val
     */
    ContactDTO setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail
        return this
    }


    /**
     * 设置「Skype_ID」值
     * @param val
     */
    ContactDTO setSkypeId(String skypeId) {
        this.skypeId = skypeId
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    ContactDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「职位/职称」值
     * @param val
     */
    ContactDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「退订的方式」值
     * @param val
     */
    ContactDTO setUnsubscribedMode(String unsubscribedMode) {
        this.unsubscribedMode = unsubscribedMode
        return this
    }


    /**
     * 设置「退订的时间」值
     * @param val
     */
    ContactDTO setUnsubscribedTime(Timestamp unsubscribedTime) {
        this.unsubscribedTime = unsubscribedTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ContactDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ContactDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
