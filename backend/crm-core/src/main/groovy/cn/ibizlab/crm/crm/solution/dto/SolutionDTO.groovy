package cn.ibizlab.crm.crm.solution.dto

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
class SolutionDTO extends GroovyDTO<SolutionDTO> {

    /**
     * 「添加评论」
     */
    @JsonProperty("add_comment")
    String addComment
    /**
     * 「答案」
     */
    @JsonProperty("answer")
    String answer
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
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
     * 「评论数量」
     */
    @JsonProperty("no_of_comments")
    Integer noOfComments
    /**
     * 「已发布」
     * 字典[是否]
     */
    @JsonProperty("published")
    Integer published
    /**
     * 「问题」
     */
    @JsonProperty("question")
    String question
    /**
     * 「解决方案编号」
     */
    @JsonProperty("solution_number")
    String solutionNumber
    /**
     * 「解决方案标题」
     */
    @JsonProperty("solution_title")
    String solutionTitle
    /**
     * 「状态」
     */
    @JsonProperty("status")
    String status
    /**
     * 「标签」
     */
    @JsonProperty("tag")
    String tag
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
    SolutionDTO setAddComment(String addComment) {
        this.addComment = addComment
        return this
    }


    /**
     * 设置「答案」值
     * @param val
     */
    SolutionDTO setAnswer(String answer) {
        this.answer = answer
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    SolutionDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「评论」值
     * @param val
     */
    SolutionDTO setComments(String comments) {
        this.comments = comments
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    SolutionDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    SolutionDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    SolutionDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「Locked」值
     * 字典[是否]
     * @param val
     */
    SolutionDTO setLockedS(Integer lockedS) {
        this.lockedS = lockedS
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    SolutionDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「评论数量」值
     * @param val
     */
    SolutionDTO setNoOfComments(Integer noOfComments) {
        this.noOfComments = noOfComments
        return this
    }


    /**
     * 设置「已发布」值
     * 字典[是否]
     * @param val
     */
    SolutionDTO setPublished(Integer published) {
        this.published = published
        return this
    }


    /**
     * 设置「问题」值
     * @param val
     */
    SolutionDTO setQuestion(String question) {
        this.question = question
        return this
    }


    /**
     * 设置「解决方案编号」值
     * @param val
     */
    SolutionDTO setSolutionNumber(String solutionNumber) {
        this.solutionNumber = solutionNumber
        return this
    }


    /**
     * 设置「解决方案标题」值
     * @param val
     */
    SolutionDTO setSolutionTitle(String solutionTitle) {
        this.solutionTitle = solutionTitle
        return this
    }


    /**
     * 设置「状态」值
     * @param val
     */
    SolutionDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    SolutionDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    SolutionDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    SolutionDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
