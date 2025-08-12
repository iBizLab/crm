package cn.ibizlab.crm.crm.user.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class UserDTO extends GroovyDTO<UserDTO> {

    /**
     * 「姓名」
     */
    @JsonProperty("first_name")
    String firstName
    /**
     * 「语言」
     */
    @JsonProperty("locale")
    String locale
    /**
     * 「街道」
     */
    @JsonProperty("street")
    String street
    /**
     * 「姓氏」
     */
    @JsonProperty("last_name")
    String lastName
    /**
     * 「国家/地区设置」
     */
    @JsonProperty("country_locale")
    String countryLocale
    /**
     * 「城市」
     */
    @JsonProperty("city")
    String city
    /**
     * 「电子邮件」
     */
    @JsonProperty("email")
    String email
    /**
     * 「省/市」
     */
    @JsonProperty("state")
    String state
    /**
     * 「邮编」
     */
    @JsonProperty("zip")
    String zip
    /**
     * 「国家/地区」
     */
    @JsonProperty("country")
    String country
    /**
     * 「别名」
     */
    @JsonProperty("alias")
    String alias
    /**
     * 「职位」
     */
    @JsonProperty("role")
    String role
    /**
     * 「电话」
     */
    @JsonProperty("phone")
    String phone
    /**
     * 「手机」
     */
    @JsonProperty("mobile")
    String mobile
    /**
     * 「网站」
     */
    @JsonProperty("website")
    String website
    /**
     * 「传真」
     */
    @JsonProperty("fax")
    String fax
    /**
     * 「rt用户标识」
     */
    @JsonProperty("sysuser_id")
    String sysuserId
    /**
     * 「生日」
     */
    @JsonProperty("dob")
    Timestamp dob
    /**
     * 「状态」
     */
    @JsonProperty("status")
    String status
    /**
     * 「全名」
     */
    @JsonProperty("full_name")
    String fullName
    /**
     * 「头像」
     */
    @JsonProperty("image_link")
    String imageLink
    /**
     * 「账号」
     */
    @JsonProperty("user_name")
    String userName
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
     * 设置「姓名」值
     * @param val
     */
    UserDTO setFirstName(String firstName) {
        this.firstName = firstName
        return this
    }


    /**
     * 设置「语言」值
     * @param val
     */
    UserDTO setLocale(String locale) {
        this.locale = locale
        return this
    }


    /**
     * 设置「街道」值
     * @param val
     */
    UserDTO setStreet(String street) {
        this.street = street
        return this
    }


    /**
     * 设置「姓氏」值
     * @param val
     */
    UserDTO setLastName(String lastName) {
        this.lastName = lastName
        return this
    }


    /**
     * 设置「国家/地区设置」值
     * @param val
     */
    UserDTO setCountryLocale(String countryLocale) {
        this.countryLocale = countryLocale
        return this
    }


    /**
     * 设置「城市」值
     * @param val
     */
    UserDTO setCity(String city) {
        this.city = city
        return this
    }


    /**
     * 设置「电子邮件」值
     * @param val
     */
    UserDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「省/市」值
     * @param val
     */
    UserDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「邮编」值
     * @param val
     */
    UserDTO setZip(String zip) {
        this.zip = zip
        return this
    }


    /**
     * 设置「国家/地区」值
     * @param val
     */
    UserDTO setCountry(String country) {
        this.country = country
        return this
    }


    /**
     * 设置「别名」值
     * @param val
     */
    UserDTO setAlias(String alias) {
        this.alias = alias
        return this
    }


    /**
     * 设置「职位」值
     * @param val
     */
    UserDTO setRole(String role) {
        this.role = role
        return this
    }


    /**
     * 设置「电话」值
     * @param val
     */
    UserDTO setPhone(String phone) {
        this.phone = phone
        return this
    }


    /**
     * 设置「手机」值
     * @param val
     */
    UserDTO setMobile(String mobile) {
        this.mobile = mobile
        return this
    }


    /**
     * 设置「网站」值
     * @param val
     */
    UserDTO setWebsite(String website) {
        this.website = website
        return this
    }


    /**
     * 设置「传真」值
     * @param val
     */
    UserDTO setFax(String fax) {
        this.fax = fax
        return this
    }


    /**
     * 设置「rt用户标识」值
     * @param val
     */
    UserDTO setSysuserId(String sysuserId) {
        this.sysuserId = sysuserId
        return this
    }


    /**
     * 设置「生日」值
     * @param val
     */
    UserDTO setDob(Timestamp dob) {
        this.dob = dob
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    UserDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「全名」值
     * @param val
     */
    UserDTO setFullName(String fullName) {
        this.fullName = fullName
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    UserDTO setImageLink(String imageLink) {
        this.imageLink = imageLink
        return this
    }


    /**
     * 设置「账号」值
     * @param val
     */
    UserDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    UserDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    UserDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    UserDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    UserDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    UserDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    UserDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
