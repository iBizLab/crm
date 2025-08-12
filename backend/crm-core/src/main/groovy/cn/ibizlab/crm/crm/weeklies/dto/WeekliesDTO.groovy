package cn.ibizlab.crm.crm.weeklies.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.crm.crm.noteattach.dto.NoteAttachDTO
import cn.ibizlab.crm.crm.task.dto.TaskDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class WeekliesDTO extends GroovyDTO<WeekliesDTO> {

    /**
     * 「活动」
     */
    @JsonProperty("activities")
    List<IEntity> activities
    /**
     * 「进展评估」
     */
    @JsonProperty("notes")
    List<NoteAttachDTO> notes
    /**
     * 「开始时间」
     */
    @JsonProperty("start_date")
    Timestamp startDate
    /**
     * 「结束时间」
     */
    @JsonProperty("end_date")
    Timestamp endDate
    /**
     * 「下周任务计划」
     */
    @JsonProperty("tasks")
    List<TaskDTO> tasks
    /**
     * 「周报文件」
     */
    @JsonProperty("attachment")
    String attachment
    /**
     * 「统计期间」
     * 字典[周报期间]
     */
    @JsonProperty("statistical_period")
    String statisticalPeriod
    /**
     * 「新建数据」
     */
    @JsonProperty("news")
    List<IEntity> news
    /**
     * 「链接类型」
     */
    @JsonProperty("link_type")
    String linkType
    /**
     * 「本周工作」
     */
    @JsonProperty("works")
    List<IEntity> works
    /**
     * 「开始时间」
     */
    @JsonProperty("start_date_sort")
    Integer startDateSort
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
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「销售人员」
     * 字典[所有者]
     */
    @JsonProperty("owner")
    String owner
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
     * 设置「活动」值
     * @param val
     */
    WeekliesDTO setActivities(List<IEntity> activities) {
        this.activities = activities
        return this
    }


    /**
     * 设置「进展评估」值
     * @param val
     */
    WeekliesDTO setNotes(List<NoteAttachDTO> notes) {
        this.notes = notes
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    WeekliesDTO setStartDate(Timestamp startDate) {
        this.startDate = startDate
        return this
    }


    /**
     * 设置「结束时间」值
     * @param val
     */
    WeekliesDTO setEndDate(Timestamp endDate) {
        this.endDate = endDate
        return this
    }


    /**
     * 设置「下周任务计划」值
     * @param val
     */
    WeekliesDTO setTasks(List<TaskDTO> tasks) {
        this.tasks = tasks
        return this
    }


    /**
     * 设置「周报文件」值
     * @param val
     */
    WeekliesDTO setAttachment(String attachment) {
        this.attachment = attachment
        return this
    }


    /**
     * 设置「统计期间」值
     * 字典[周报期间]
     * @param val
     */
    WeekliesDTO setStatisticalPeriod(String statisticalPeriod) {
        this.statisticalPeriod = statisticalPeriod
        return this
    }


    /**
     * 设置「新建数据」值
     * @param val
     */
    WeekliesDTO setNews(List<IEntity> news) {
        this.news = news
        return this
    }


    /**
     * 设置「链接类型」值
     * @param val
     */
    WeekliesDTO setLinkType(String linkType) {
        this.linkType = linkType
        return this
    }


    /**
     * 设置「本周工作」值
     * @param val
     */
    WeekliesDTO setWorks(List<IEntity> works) {
        this.works = works
        return this
    }


    /**
     * 设置「开始时间」值
     * @param val
     */
    WeekliesDTO setStartDateSort(Integer startDateSort) {
        this.startDateSort = startDateSort
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    WeekliesDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    WeekliesDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    WeekliesDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    WeekliesDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    WeekliesDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「销售人员」值
     * 字典[所有者]
     * @param val
     */
    WeekliesDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    WeekliesDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    WeekliesDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
