package cn.ibizlab.crm.crm.productcertificate.dto

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
class ProductCertificateDTO extends GroovyDTO<ProductCertificateDTO> {

    /**
     * 「证书编号」
     */
    @JsonProperty("pc_number")
    String pcNumber
    /**
     * 「颁证机构」
     */
    @JsonProperty("awarding_organization")
    String awardingOrganization
    /**
     * 「受证单位」
     */
    @JsonProperty("accredited_organization")
    String accreditedOrganization
    /**
     * 「认证范围」
     */
    @JsonProperty("scope")
    String scope
    /**
     * 「有效期起」
     */
    @JsonProperty("start_date")
    Timestamp startDate
    /**
     * 「有效期止」
     */
    @JsonProperty("end_date")
    Timestamp endDate
    /**
     * 「签发日期」
     */
    @JsonProperty("issue_date")
    Timestamp issueDate
    /**
     * 「签发人」
     */
    @JsonProperty("issue_man")
    String issueMan
    /**
     * 「产品/服务名称及型号」
     */
    @JsonProperty("service_name")
    String serviceName
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
     * 「证书名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「产品标识」
     */
    @JsonProperty("product_id")
    String productId
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
     * 设置「证书编号」值
     * @param val
     */
    ProductCertificateDTO setPcNumber(String pcNumber) {
        this.pcNumber = pcNumber
        return this
    }


    /**
     * 设置「颁证机构」值
     * @param val
     */
    ProductCertificateDTO setAwardingOrganization(String awardingOrganization) {
        this.awardingOrganization = awardingOrganization
        return this
    }


    /**
     * 设置「受证单位」值
     * @param val
     */
    ProductCertificateDTO setAccreditedOrganization(String accreditedOrganization) {
        this.accreditedOrganization = accreditedOrganization
        return this
    }


    /**
     * 设置「认证范围」值
     * @param val
     */
    ProductCertificateDTO setScope(String scope) {
        this.scope = scope
        return this
    }


    /**
     * 设置「有效期起」值
     * @param val
     */
    ProductCertificateDTO setStartDate(Timestamp startDate) {
        this.startDate = startDate
        return this
    }


    /**
     * 设置「有效期止」值
     * @param val
     */
    ProductCertificateDTO setEndDate(Timestamp endDate) {
        this.endDate = endDate
        return this
    }


    /**
     * 设置「签发日期」值
     * @param val
     */
    ProductCertificateDTO setIssueDate(Timestamp issueDate) {
        this.issueDate = issueDate
        return this
    }


    /**
     * 设置「签发人」值
     * @param val
     */
    ProductCertificateDTO setIssueMan(String issueMan) {
        this.issueMan = issueMan
        return this
    }


    /**
     * 设置「产品/服务名称及型号」值
     * @param val
     */
    ProductCertificateDTO setServiceName(String serviceName) {
        this.serviceName = serviceName
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    ProductCertificateDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProductCertificateDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ProductCertificateDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ProductCertificateDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ProductCertificateDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「证书名称」值
     * @param val
     */
    ProductCertificateDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「产品标识」值
     * @param val
     */
    ProductCertificateDTO setProductId(String productId) {
        this.productId = productId
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProductCertificateDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ProductCertificateDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
