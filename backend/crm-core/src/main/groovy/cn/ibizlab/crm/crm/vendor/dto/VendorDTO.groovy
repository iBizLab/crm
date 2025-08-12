package cn.ibizlab.crm.crm.vendor.dto

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
class VendorDTO extends GroovyDTO<VendorDTO> {

    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「分类」
     */
    @JsonProperty("category")
    String category
    /**
     * 「城市」
     */
    @JsonProperty("city")
    String city
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
     * 「总分类账户」
     */
    @JsonProperty("gl_account")
    String glAccount
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
     * 「供应商图片」
     */
    @JsonProperty("record_lmage")
    String recordLmage
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
     * 「标签」
     */
    @JsonProperty("tag")
    String tag
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
     * 「供应商名称」
     */
    @JsonProperty("vendor_name")
    String vendorName
    /**
     * 「网站」
     */
    @JsonProperty("website")
    String website
    /**
     * 「邮编」
     */
    @JsonProperty("zip_code")
    String zipCode

    /**
     * 设置「附件」值
     * @param val
     */
    VendorDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「分类」值
     * @param val
     */
    VendorDTO setCategory(String category) {
        this.category = category
        return this
    }


    /**
     * 设置「城市」值
     * @param val
     */
    VendorDTO setCity(String city) {
        this.city = city
        return this
    }


    /**
     * 设置「国家/地区」值
     * @param val
     */
    VendorDTO setCountry(String country) {
        this.country = country
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    VendorDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    VendorDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    VendorDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「电子邮件」值
     * @param val
     */
    VendorDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「不发营销邮件」值
     * 字典[是否]
     * @param val
     */
    VendorDTO setEmailOptOut(Integer emailOptOut) {
        this.emailOptOut = emailOptOut
        return this
    }


    /**
     * 设置「总分类账户」值
     * @param val
     */
    VendorDTO setGlAccount(String glAccount) {
        this.glAccount = glAccount
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    VendorDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「Locked」值
     * 字典[是否]
     * @param val
     */
    VendorDTO setLockedS(Integer lockedS) {
        this.lockedS = lockedS
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    VendorDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「所有者」值
     * 字典[所有者]
     * @param val
     */
    VendorDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「电话」值
     * @param val
     */
    VendorDTO setPhone(String phone) {
        this.phone = phone
        return this
    }


    /**
     * 设置「供应商图片」值
     * @param val
     */
    VendorDTO setRecordLmage(String recordLmage) {
        this.recordLmage = recordLmage
        return this
    }


    /**
     * 设置「省/市」值
     * @param val
     */
    VendorDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「街道」值
     * @param val
     */
    VendorDTO setStreet(String street) {
        this.street = street
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    VendorDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「退订的方式」值
     * @param val
     */
    VendorDTO setUnsubscribedMode(String unsubscribedMode) {
        this.unsubscribedMode = unsubscribedMode
        return this
    }


    /**
     * 设置「退订的时间」值
     * @param val
     */
    VendorDTO setUnsubscribedTime(Timestamp unsubscribedTime) {
        this.unsubscribedTime = unsubscribedTime
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    VendorDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    VendorDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「供应商名称」值
     * @param val
     */
    VendorDTO setVendorName(String vendorName) {
        this.vendorName = vendorName
        return this
    }


    /**
     * 设置「网站」值
     * @param val
     */
    VendorDTO setWebsite(String website) {
        this.website = website
        return this
    }


    /**
     * 设置「邮编」值
     * @param val
     */
    VendorDTO setZipCode(String zipCode) {
        this.zipCode = zipCode
        return this
    }

}
