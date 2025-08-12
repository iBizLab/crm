package cn.ibizlab.crm.runtime.sysperson.dto

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
class SysPersonDTO extends GroovyDTO<SysPersonDTO> {

    /**
     * 「创建人」
     */
    @JsonProperty("creator")
    String creator
    /**
     * 「最后更新人」
     */
    @JsonProperty("updater")
    String updater
    /**
     * 「DC」
     */
    @JsonProperty("dc")
    String dc
    /**
     * 「名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「密码」
     */
    @JsonProperty("user_password")
    String userPassword
    /**
     * 「人员编号」
     */
    @JsonProperty("employee_number")
    String employeeNumber
    /**
     * 「类型」
     */
    @JsonProperty("employee_type")
    String employeeType
    /**
     * 「职位」
     */
    @JsonProperty("title")
    String title
    /**
     * 「电子邮箱」
     */
    @JsonProperty("mail")
    String mail
    /**
     * 「联系电话」
     */
    @JsonProperty("telephone_number")
    String telephoneNumber
    /**
     * 「移动电话」
     */
    @JsonProperty("mobile")
    String mobile
    /**
     * 「证件号」
     */
    @JsonProperty("identification_number")
    String identificationNumber
    /**
     * 「地址」
     */
    @JsonProperty("postal_address")
    String postalAddress
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「主部门」
     */
    @JsonProperty("mdepartment_name")
    String mdepartmentName
    /**
     * 「组织机构标识」
     */
    @JsonProperty("organization_id")
    String organizationId
    /**
     * 「DN」
     */
    @JsonProperty("dn")
    String dn
    /**
     * 「主部门」
     */
    @JsonProperty("mdepartment_id")
    String mdepartmentId
    /**
     * 「uid/loginname」
     */
    @JsonProperty("uid")
    String uid
    /**
     * 「头像」
     */
    @JsonProperty("avatar")
    String avatar
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
     * 「更新时间」
     */
    @JsonProperty("update_time")
    Timestamp updateTime

    /**
     * 设置「创建人」值
     * @param val
     */
    SysPersonDTO setCreator(String creator) {
        this.creator = creator
        return this
    }


    /**
     * 设置「最后更新人」值
     * @param val
     */
    SysPersonDTO setUpdater(String updater) {
        this.updater = updater
        return this
    }


    /**
     * 设置「DC」值
     * @param val
     */
    SysPersonDTO setDc(String dc) {
        this.dc = dc
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    SysPersonDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「密码」值
     * @param val
     */
    SysPersonDTO setUserPassword(String userPassword) {
        this.userPassword = userPassword
        return this
    }


    /**
     * 设置「人员编号」值
     * @param val
     */
    SysPersonDTO setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber
        return this
    }


    /**
     * 设置「类型」值
     * @param val
     */
    SysPersonDTO setEmployeeType(String employeeType) {
        this.employeeType = employeeType
        return this
    }


    /**
     * 设置「职位」值
     * @param val
     */
    SysPersonDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「电子邮箱」值
     * @param val
     */
    SysPersonDTO setMail(String mail) {
        this.mail = mail
        return this
    }


    /**
     * 设置「联系电话」值
     * @param val
     */
    SysPersonDTO setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber
        return this
    }


    /**
     * 设置「移动电话」值
     * @param val
     */
    SysPersonDTO setMobile(String mobile) {
        this.mobile = mobile
        return this
    }


    /**
     * 设置「证件号」值
     * @param val
     */
    SysPersonDTO setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber
        return this
    }


    /**
     * 设置「地址」值
     * @param val
     */
    SysPersonDTO setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    SysPersonDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「主部门」值
     * @param val
     */
    SysPersonDTO setMdepartmentName(String mdepartmentName) {
        this.mdepartmentName = mdepartmentName
        return this
    }


    /**
     * 设置「组织机构标识」值
     * @param val
     */
    SysPersonDTO setOrganizationId(String organizationId) {
        this.organizationId = organizationId
        return this
    }


    /**
     * 设置「DN」值
     * @param val
     */
    SysPersonDTO setDn(String dn) {
        this.dn = dn
        return this
    }


    /**
     * 设置「主部门」值
     * @param val
     */
    SysPersonDTO setMdepartmentId(String mdepartmentId) {
        this.mdepartmentId = mdepartmentId
        return this
    }


    /**
     * 设置「uid/loginname」值
     * @param val
     */
    SysPersonDTO setUid(String uid) {
        this.uid = uid
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    SysPersonDTO setAvatar(String avatar) {
        this.avatar = avatar
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    SysPersonDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    SysPersonDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    SysPersonDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
