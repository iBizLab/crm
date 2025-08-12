package cn.ibizlab.crm.crm.task.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.crm.crm.relation.dto.RelationDTO
import cn.ibizlab.crm.crm.taskexecutor.dto.TaskExecutorDTO
import cn.ibizlab.crm.crm.attachment.dto.AttachmentDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class TaskDTO extends GroovyDTO<TaskDTO> {

    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
    /**
     * 「所属数据名称」
     */
    @JsonProperty("owner_name")
    String ownerName
    /**
     * 「所属数据对象」
     */
    @JsonProperty("owner_type")
    String ownerType
    /**
     * 「所属对象子类型」
     */
    @JsonProperty("owner_subtype")
    String ownerSubtype
    /**
     * 「类型」
     * 字典[任务活动类型]
     */
    @JsonProperty("type")
    String type
    /**
     * 「费用」
     */
    @JsonProperty("cost")
    BigDecimal cost
    /**
     * 「结束时间」
     */
    @JsonProperty("end_time")
    Timestamp endTime
    /**
     * 「开始时间」
     */
    @JsonProperty("start_time")
    Timestamp startTime
    /**
     * 「任务&活动日期」
     */
    @JsonProperty("task_date")
    Timestamp taskDate
    /**
     * 「是否上周活动」
     */
    @JsonProperty("is_last_week")
    String isLastWeek
    /**
     * 「是否上周新建」
     */
    @JsonProperty("is_new_last_week")
    String isNewLastWeek
    /**
     * 「是否本周新建」
     */
    @JsonProperty("is_new_this_week")
    String isNewThisWeek
    /**
     * 「是否本月活动」
     */
    @JsonProperty("is_this_month")
    String isThisMonth
    /**
     * 「是否本周活动」
     */
    @JsonProperty("is_this_week")
    String isThisWeek
    /**
     * 「最近评估时间」
     */
    @JsonProperty("last_assess_time")
    Timestamp lastAssessTime
    /**
     * 「关联数据」
     */
    @JsonProperty("relations")
    List<RelationDTO> relations
    /**
     * 「执行人」
     */
    @JsonProperty("executors")
    List<TaskExecutorDTO> executors
    /**
     * 「到期时间」
     */
    @JsonProperty("due_date_sort")
    Integer dueDateSort
    /**
     * 「开始时间」
     */
    @JsonProperty("start_time_sort")
    Integer startTimeSort
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「关闭时间」
     */
    @JsonProperty("closed_time")
    Timestamp closedTime
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
     * 「到期日期」
     */
    @JsonProperty("due_date")
    Timestamp dueDate
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
     * 「优先级」
     * 字典[优先级]
     */
    @JsonProperty("priority")
    String priority
    /**
     * 「提醒时间」
     */
    @JsonProperty("remind_at")
    Timestamp remindAt
    /**
     * 「发送通知邮件」
     * 字典[是否]
     */
    @JsonProperty("send_notification_email")
    Integer sendNotificationEmail
    /**
     * 「状态」
     * 字典[任务状态]
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
     * 设置「所属数据标识」值
     * @param val
     */
    TaskDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「所属数据名称」值
     * @param val
     */
    TaskDTO setOwnerName(String ownerName) {
        this.ownerName = ownerName
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    TaskDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属对象子类型」值
     * @param val
     */
    TaskDTO setOwnerSubtype(String ownerSubtype) {
        this.ownerSubtype = ownerSubtype
        return this
    }


    /**
     * 设置「类型」值
     * 字典[任务活动类型]
     * @param val
     */
    TaskDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「费用」值
     * @param val
     */
    TaskDTO setCost(BigDecimal cost) {
        this.cost = cost
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    TaskDTO setEndTime(Timestamp endTime) {
        this.endTime = endTime
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    TaskDTO setStartTime(Timestamp startTime) {
        this.startTime = startTime
        return this
    }


    /**
     * 设置「任务&活动日期」值
     * @param val
     */
    TaskDTO setTaskDate(Timestamp taskDate) {
        this.taskDate = taskDate
        return this
    }


    /**
     * 设置「是否上周活动」值
     * @param val
     */
    TaskDTO setIsLastWeek(String isLastWeek) {
        this.isLastWeek = isLastWeek
        return this
    }


    /**
     * 设置「是否上周新建」值
     * @param val
     */
    TaskDTO setIsNewLastWeek(String isNewLastWeek) {
        this.isNewLastWeek = isNewLastWeek
        return this
    }


    /**
     * 设置「是否本周新建」值
     * @param val
     */
    TaskDTO setIsNewThisWeek(String isNewThisWeek) {
        this.isNewThisWeek = isNewThisWeek
        return this
    }


    /**
     * 设置「是否本月活动」值
     * @param val
     */
    TaskDTO setIsThisMonth(String isThisMonth) {
        this.isThisMonth = isThisMonth
        return this
    }


    /**
     * 设置「是否本周活动」值
     * @param val
     */
    TaskDTO setIsThisWeek(String isThisWeek) {
        this.isThisWeek = isThisWeek
        return this
    }


    /**
     * 设置「最近评估时间」值
     * @param val
     */
    TaskDTO setLastAssessTime(Timestamp lastAssessTime) {
        this.lastAssessTime = lastAssessTime
        return this
    }


    /**
     * 设置「关联数据」值
     * @param val
     */
    TaskDTO setRelations(List<RelationDTO> relations) {
        this.relations = relations
        return this
    }


    /**
     * 设置「执行人」值
     * @param val
     */
    TaskDTO setExecutors(List<TaskExecutorDTO> executors) {
        this.executors = executors
        return this
    }


    /**
     * 设置「到期时间」值
     * @param val
     */
    TaskDTO setDueDateSort(Integer dueDateSort) {
        this.dueDateSort = dueDateSort
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    TaskDTO setStartTimeSort(Integer startTimeSort) {
        this.startTimeSort = startTimeSort
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    TaskDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「关闭时间」值
     * @param val
     */
    TaskDTO setClosedTime(Timestamp closedTime) {
        this.closedTime = closedTime
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    TaskDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    TaskDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    TaskDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「到期日期」值
     * @param val
     */
    TaskDTO setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    TaskDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「Locked」值
     * 字典[是否]
     * @param val
     */
    TaskDTO setLockedS(Integer lockedS) {
        this.lockedS = lockedS
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    TaskDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「所有者」值
     * 字典[所有者]
     * @param val
     */
    TaskDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「优先级」值
     * 字典[优先级]
     * @param val
     */
    TaskDTO setPriority(String priority) {
        this.priority = priority
        return this
    }


    /**
     * 设置「提醒时间」值
     * @param val
     */
    TaskDTO setRemindAt(Timestamp remindAt) {
        this.remindAt = remindAt
        return this
    }


    /**
     * 设置「发送通知邮件」值
     * 字典[是否]
     * @param val
     */
    TaskDTO setSendNotificationEmail(Integer sendNotificationEmail) {
        this.sendNotificationEmail = sendNotificationEmail
        return this
    }


    /**
     * 设置「状态」值
     * 字典[任务状态]
     * @param val
     */
    TaskDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「主题」值
     * @param val
     */
    TaskDTO setSubject(String subject) {
        this.subject = subject
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    TaskDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    TaskDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    TaskDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
