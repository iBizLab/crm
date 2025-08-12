package cn.ibizlab.crm.crm.event.dto

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
class EventDTO extends GroovyDTO<EventDTO> {

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
     * 「全天」
     * 字典[是否]
     */
    @JsonProperty("all_day")
    Integer allDay
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「签到地址」
     */
    @JsonProperty("check_in_addres")
    String checkInAddres
    /**
     * 「签到城市」
     */
    @JsonProperty("check_in_city")
    String checkInCity
    /**
     * 「签到评注」
     */
    @JsonProperty("check_in_comment")
    String checkInComment
    /**
     * 「签到国家」
     */
    @JsonProperty("check_in_country")
    String checkInCountry
    /**
     * 「签到省份」
     */
    @JsonProperty("check_in_state")
    String checkInState
    /**
     * 「签到状态」
     */
    @JsonProperty("check_in_status")
    String checkInStatus
    /**
     * 「签到地区」
     */
    @JsonProperty("check_in_sub_locality")
    String checkInSubLocality
    /**
     * 「签到时间」
     */
    @JsonProperty("check_in_time")
    Timestamp checkInTime
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
     * 「结束日期时间」
     */
    @JsonProperty("end_date_time")
    Timestamp endDateTime
    /**
     * 「标题」
     */
    @JsonProperty("event_title")
    String eventTitle
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「纬度」
     */
    @JsonProperty("latitude")
    BigDecimal latitude
    /**
     * 「经度」
     */
    @JsonProperty("longitude")
    BigDecimal longitude
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
     * 「参与者」
     */
    @JsonProperty("participants")
    BigInteger participants
    /**
     * 「起始日期时间」
     */
    @JsonProperty("start_date_time")
    Timestamp startDateTime
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
     * 「地点」
     */
    @JsonProperty("venue")
    String venue
    /**
     * 「邮政编码」
     */
    @JsonProperty("zip_code")
    String zipCode

    /**
     * 设置「所属数据标识」值
     * @param val
     */
    EventDTO setOwnerId(String ownerId) {
        this.ownerId = ownerId
        return this
    }


    /**
     * 设置「所属数据对象」值
     * @param val
     */
    EventDTO setOwnerType(String ownerType) {
        this.ownerType = ownerType
        return this
    }


    /**
     * 设置「所属对象子类型」值
     * @param val
     */
    EventDTO setOwnerSubtype(String ownerSubtype) {
        this.ownerSubtype = ownerSubtype
        return this
    }


    /**
     * 设置「全天」值
     * 字典[是否]
     * @param val
     */
    EventDTO setAllDay(Integer allDay) {
        this.allDay = allDay
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    EventDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「签到地址」值
     * @param val
     */
    EventDTO setCheckInAddres(String checkInAddres) {
        this.checkInAddres = checkInAddres
        return this
    }


    /**
     * 设置「签到城市」值
     * @param val
     */
    EventDTO setCheckInCity(String checkInCity) {
        this.checkInCity = checkInCity
        return this
    }


    /**
     * 设置「签到评注」值
     * @param val
     */
    EventDTO setCheckInComment(String checkInComment) {
        this.checkInComment = checkInComment
        return this
    }


    /**
     * 设置「签到国家」值
     * @param val
     */
    EventDTO setCheckInCountry(String checkInCountry) {
        this.checkInCountry = checkInCountry
        return this
    }


    /**
     * 设置「签到省份」值
     * @param val
     */
    EventDTO setCheckInState(String checkInState) {
        this.checkInState = checkInState
        return this
    }


    /**
     * 设置「签到状态」值
     * @param val
     */
    EventDTO setCheckInStatus(String checkInStatus) {
        this.checkInStatus = checkInStatus
        return this
    }


    /**
     * 设置「签到地区」值
     * @param val
     */
    EventDTO setCheckInSubLocality(String checkInSubLocality) {
        this.checkInSubLocality = checkInSubLocality
        return this
    }


    /**
     * 设置「签到时间」值
     * @param val
     */
    EventDTO setCheckInTime(Timestamp checkInTime) {
        this.checkInTime = checkInTime
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    EventDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    EventDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    EventDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「结束日期时间」值
     * @param val
     */
    EventDTO setEndDateTime(Timestamp endDateTime) {
        this.endDateTime = endDateTime
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    EventDTO setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    EventDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「纬度」值
     * @param val
     */
    EventDTO setLatitude(BigDecimal latitude) {
        this.latitude = latitude
        return this
    }


    /**
     * 设置「经度」值
     * @param val
     */
    EventDTO setLongitude(BigDecimal longitude) {
        this.longitude = longitude
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    EventDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「所有者」值
     * 字典[所有者]
     * @param val
     */
    EventDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「参与者」值
     * @param val
     */
    EventDTO setParticipants(BigInteger participants) {
        this.participants = participants
        return this
    }


    /**
     * 设置「起始日期时间」值
     * @param val
     */
    EventDTO setStartDateTime(Timestamp startDateTime) {
        this.startDateTime = startDateTime
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    EventDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    EventDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    EventDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「地点」值
     * @param val
     */
    EventDTO setVenue(String venue) {
        this.venue = venue
        return this
    }


    /**
     * 设置「邮政编码」值
     * @param val
     */
    EventDTO setZipCode(String zipCode) {
        this.zipCode = zipCode
        return this
    }

}
