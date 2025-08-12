package cn.ibizlab.crm.crm.call.dto

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
class CallDTO extends GroovyDTO<CallDTO> {

    /**
     * 「所属数据标识」
     */
    @JsonProperty("owner_id")
    String ownerId
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
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「通话议程」
     */
    @JsonProperty("call_agenda")
    String callAgenda
    /**
     * 「通话持续时间」
     */
    @JsonProperty("call_duration")
    String callDuration
    /**
     * 「通话持续时间(秒)」
     */
    @JsonProperty("call_duration_in_seconds")
    Integer callDurationInSeconds
    /**
     * 「通话目的」
     */
    @JsonProperty("call_purpose")
    String callPurpose
    /**
     * 「通话结果」
     */
    @JsonProperty("call_result")
    String callResult
    /**
     * 「通话开始时间」
     */
    @JsonProperty("call_start_time")
    Timestamp callStartTime
    /**
     * 「通话类型」
     */
    @JsonProperty("call_type")
    String callType
    /**
     * 「呼叫者ID」
     */
    @JsonProperty("caller_id")
    String callerId
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
     * 「CTI条目」
     * 字典[是否]
     */
    @JsonProperty("cti_entry")
    Integer ctiEntry
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「拨打的号码」
     */
    @JsonProperty("dialled_number")
    String dialledNumber
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
     * 「去电通话状态」
     * 字典[去电通话状态]
     */
    @JsonProperty("outgoing_call_status")
    String outgoingCallStatus
    /**
     * 「提醒」
     */
    @JsonProperty("reminder")
    String reminder
    /**
     * 「在CRM中已预定」
     */
    @JsonProperty("scheduled_in_crm")
    String scheduledInCrm
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
     * 「语音录音」
     */
    @JsonProperty("voice_recording_s")
    String voiceRecordingS

    /**
     * 设置「所属数据标识」值
     * @param val
     */
    CallDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    CallDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属对象子类型」值
     * @param val
     */
    CallDTO setOwnerSubtype(String ownerSubtype) {
        this.ownerSubtype = ownerSubtype
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    CallDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「通话议程」值
     * @param val
     */
    CallDTO setCallAgenda(String callAgenda) {
        this.callAgenda = callAgenda
        return this
    }


    /**
     * 设置「通话持续时间」值
     * @param val
     */
    CallDTO setCallDuration(String callDuration) {
        this.callDuration = callDuration
        return this
    }


    /**
     * 设置「通话持续时间(秒)」值
     * @param val
     */
    CallDTO setCallDurationInSeconds(Integer callDurationInSeconds) {
        this.callDurationInSeconds = callDurationInSeconds
        return this
    }


    /**
     * 设置「通话目的」值
     * @param val
     */
    CallDTO setCallPurpose(String callPurpose) {
        this.callPurpose = callPurpose
        return this
    }


    /**
     * 设置「通话结果」值
     * @param val
     */
    CallDTO setCallResult(String callResult) {
        this.callResult = callResult
        return this
    }


    /**
     * 设置「通话开始时间」值
     * @param val
     */
    CallDTO setCallStartTime(Timestamp callStartTime) {
        this.callStartTime = callStartTime
        return this
    }


    /**
     * 设置「通话类型」值
     * @param val
     */
    CallDTO setCallType(String callType) {
        this.callType = callType
        return this
    }


    /**
     * 设置「呼叫者ID」值
     * @param val
     */
    CallDTO setCallerId(String callerId) {
        this.callerId = callerId
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CallDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CallDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「CTI条目」值
     * 字典[是否]
     * @param val
     */
    CallDTO setCtiEntry(Integer ctiEntry) {
        this.ctiEntry = ctiEntry
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    CallDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「拨打的号码」值
     * @param val
     */
    CallDTO setDialledNumber(String dialledNumber) {
        this.dialledNumber = dialledNumber
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CallDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CallDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「去电通话状态」值
     * 字典[去电通话状态]
     * @param val
     */
    CallDTO setOutgoingCallStatus(String outgoingCallStatus) {
        this.outgoingCallStatus = outgoingCallStatus
        return this
    }


    /**
     * 设置「提醒」值
     * @param val
     */
    CallDTO setReminder(String reminder) {
        this.reminder = reminder
        return this
    }


    /**
     * 设置「在CRM中已预定」值
     * @param val
     */
    CallDTO setScheduledInCrm(String scheduledInCrm) {
        this.scheduledInCrm = scheduledInCrm
        return this
    }


    /**
     * 设置「主题」值
     * @param val
     */
    CallDTO setSubject(String subject) {
        this.subject = subject
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    CallDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CallDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CallDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「语音录音」值
     * @param val
     */
    CallDTO setVoiceRecordingS(String voiceRecordingS) {
        this.voiceRecordingS = voiceRecordingS
        return this
    }

}
