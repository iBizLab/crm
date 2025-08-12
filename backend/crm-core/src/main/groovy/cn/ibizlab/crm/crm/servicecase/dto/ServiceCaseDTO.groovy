package cn.ibizlab.crm.crm.servicecase.dto

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
class ServiceCaseDTO extends GroovyDTO<ServiceCaseDTO> {

    /**
     * 「添加评论」
     */
    @JsonProperty("add_comment")
    String addComment
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「服务支持来源」
     */
    @JsonProperty("case_origin")
    String caseOrigin
    /**
     * 「服务支持原因」
     */
    @JsonProperty("case_reason")
    String caseReason
    /**
     * 「评论」
     */
    @JsonProperty("comments")
    String comments
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
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「内部评论」
     */
    @JsonProperty("internal_comments")
    String internalComments
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
     * 「评论数量」
     */
    @JsonProperty("no_of_comments")
    Integer noOfComments
    /**
     * 「电话」
     */
    @JsonProperty("phone")
    String phone
    /**
     * 「优先级」
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「报告人」
     */
    @JsonProperty("reported_by")
    String reportedBy
    /**
     * 「解决方案」
     */
    @JsonProperty("solution")
    String solution
    /**
     * 「状态」
     */
    @JsonProperty("status")
    String status
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
     * 「类型」
     */
    @JsonProperty("type")
    String type
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
     * 设置「添加评论」值
     * @param val
     */
    ServiceCaseDTO setAddComment(String addComment) {
        this.addComment = addComment
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    ServiceCaseDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「服务支持来源」值
     * @param val
     */
    ServiceCaseDTO setCaseOrigin(String caseOrigin) {
        this.caseOrigin = caseOrigin
        return this
    }


    /**
     * 设置「服务支持原因」值
     * @param val
     */
    ServiceCaseDTO setCaseReason(String caseReason) {
        this.caseReason = caseReason
        return this
    }


    /**
     * 设置「评论」值
     * @param val
     */
    ServiceCaseDTO setComments(String comments) {
        this.comments = comments
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ServiceCaseDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ServiceCaseDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ServiceCaseDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「电子邮件」值
     * @param val
     */
    ServiceCaseDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ServiceCaseDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「内部评论」值
     * @param val
     */
    ServiceCaseDTO setInternalComments(String internalComments) {
        this.internalComments = internalComments
        return this
    }


    /**
     * 设置「Locked」值
     * 字典[是否]
     * @param val
     */
    ServiceCaseDTO setLockedS(Integer lockedS) {
        this.lockedS = lockedS
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ServiceCaseDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「评论数量」值
     * @param val
     */
    ServiceCaseDTO setNoOfComments(Integer noOfComments) {
        this.noOfComments = noOfComments
        return this
    }


    /**
     * 设置「电话」值
     * @param val
     */
    ServiceCaseDTO setPhone(String phone) {
        this.phone = phone
        return this
    }


    /**
     * 设置「优先级」值
     * @param val
     */
    ServiceCaseDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「报告人」值
     * @param val
     */
    ServiceCaseDTO setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy
        return this
    }


    /**
     * 设置「解决方案」值
     * @param val
     */
    ServiceCaseDTO setSolution(String solution) {
        this.solution = solution
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    ServiceCaseDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「主题」值
     * @param val
     */
    ServiceCaseDTO setSubject(String subject) {
        this.subject = subject
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    ServiceCaseDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「类型」值
     * @param val
     */
    ServiceCaseDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ServiceCaseDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ServiceCaseDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
