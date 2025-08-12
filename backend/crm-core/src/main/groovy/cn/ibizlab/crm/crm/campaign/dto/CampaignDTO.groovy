package cn.ibizlab.crm.crm.campaign.dto

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
class CampaignDTO extends GroovyDTO<CampaignDTO> {

    /**
     * 「实际成本」
     */
    @JsonProperty("actual_cost")
    String actualCost
    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「预算成本」
     */
    @JsonProperty("budgeted_cost")
    String budgetedCost
    /**
     * 「市场活动名称」
     */
    @JsonProperty("campaign_name")
    String campaignName
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
     * 「结束日期」
     */
    @JsonProperty("end_date")
    Timestamp endDate
    /**
     * 「期望成功率(%)」
     */
    @JsonProperty("expected_response")
    BigInteger expectedResponse
    /**
     * 「预期收益」
     */
    @JsonProperty("expected_revenue")
    String expectedRevenue
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
     * 「部门ID」
     */
    @JsonProperty("native_survey_extn_department_id")
    String nativeSurveyExtnDepartmentId
    /**
     * 「调查」
     */
    @JsonProperty("native_survey_extn_survey")
    String nativeSurveyExtnSurvey
    /**
     * 「调查部门」
     */
    @JsonProperty("native_survey_extn_survey_department")
    String nativeSurveyExtnSurveyDepartment
    /**
     * 「调查类型」
     */
    @JsonProperty("native_survey_extn_survey_type")
    String nativeSurveyExtnSurveyType
    /**
     * 「调查URL」
     */
    @JsonProperty("native_survey_extn_survey_url")
    String nativeSurveyExtnSurveyUrl
    /**
     * 「网络研讨会持续时间」
     */
    @JsonProperty("native_webinar_extn_webinar_duration")
    String nativeWebinarExtnWebinarDuration
    /**
     * 「网络研讨会启动URL」
     */
    @JsonProperty("native_webinar_extn_webinar_launch_url")
    String nativeWebinarExtnWebinarLaunchUrl
    /**
     * 「网络研讨会注册URL」
     */
    @JsonProperty("native_webinar_extn_webinar_registration_url")
    String nativeWebinarExtnWebinarRegistrationUrl
    /**
     * 「网络研讨会时间表」
     */
    @JsonProperty("native_webinar_extn_webinar_schedule")
    Timestamp nativeWebinarExtnWebinarSchedule
    /**
     * 「发出数量」
     */
    @JsonProperty("num_sent")
    BigInteger numSent
    /**
     * 「开始日期」
     */
    @JsonProperty("start_date")
    Timestamp startDate
    /**
     * 「状态」
     * 字典[活动状态]
     */
    @JsonProperty("status")
    String status
    /**
     * 「标签」
     */
    @JsonProperty("tag")
    String tag
    /**
     * 「类型」
     * 字典[市场活动类型]
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
     * 设置「实际成本」值
     * @param val
     */
    CampaignDTO setActualCost(String actualCost) {
        this.actualCost = actualCost
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    CampaignDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「预算成本」值
     * @param val
     */
    CampaignDTO setBudgetedCost(String budgetedCost) {
        this.budgetedCost = budgetedCost
        return this
    }


    /**
     * 设置「市场活动名称」值
     * @param val
     */
    CampaignDTO setCampaignName(String campaignName) {
        this.campaignName = campaignName
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    CampaignDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    CampaignDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    CampaignDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「结束日期」值
     * @param val
     */
    CampaignDTO setEndDate(Timestamp endDate) {
        this.endDate = endDate
        return this
    }


    /**
     * 设置「期望成功率(%)」值
     * @param val
     */
    CampaignDTO setExpectedResponse(BigInteger expectedResponse) {
        this.expectedResponse = expectedResponse
        return this
    }


    /**
     * 设置「预期收益」值
     * @param val
     */
    CampaignDTO setExpectedRevenue(String expectedRevenue) {
        this.expectedRevenue = expectedRevenue
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    CampaignDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    CampaignDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「部门ID」值
     * @param val
     */
    CampaignDTO setNativeSurveyExtnDepartmentId(String nativeSurveyExtnDepartmentId) {
        this.nativeSurveyExtnDepartmentId = nativeSurveyExtnDepartmentId
        return this
    }


    /**
     * 设置「调查」值
     * @param val
     */
    CampaignDTO setNativeSurveyExtnSurvey(String nativeSurveyExtnSurvey) {
        this.nativeSurveyExtnSurvey = nativeSurveyExtnSurvey
        return this
    }


    /**
     * 设置「调查部门」值
     * @param val
     */
    CampaignDTO setNativeSurveyExtnSurveyDepartment(String nativeSurveyExtnSurveyDepartment) {
        this.nativeSurveyExtnSurveyDepartment = nativeSurveyExtnSurveyDepartment
        return this
    }


    /**
     * 设置「调查类型」值
     * @param val
     */
    CampaignDTO setNativeSurveyExtnSurveyType(String nativeSurveyExtnSurveyType) {
        this.nativeSurveyExtnSurveyType = nativeSurveyExtnSurveyType
        return this
    }


    /**
     * 设置「调查URL」值
     * @param val
     */
    CampaignDTO setNativeSurveyExtnSurveyUrl(String nativeSurveyExtnSurveyUrl) {
        this.nativeSurveyExtnSurveyUrl = nativeSurveyExtnSurveyUrl
        return this
    }


    /**
     * 设置「网络研讨会持续时间」值
     * @param val
     */
    CampaignDTO setNativeWebinarExtnWebinarDuration(String nativeWebinarExtnWebinarDuration) {
        this.nativeWebinarExtnWebinarDuration = nativeWebinarExtnWebinarDuration
        return this
    }


    /**
     * 设置「网络研讨会启动URL」值
     * @param val
     */
    CampaignDTO setNativeWebinarExtnWebinarLaunchUrl(String nativeWebinarExtnWebinarLaunchUrl) {
        this.nativeWebinarExtnWebinarLaunchUrl = nativeWebinarExtnWebinarLaunchUrl
        return this
    }


    /**
     * 设置「网络研讨会注册URL」值
     * @param val
     */
    CampaignDTO setNativeWebinarExtnWebinarRegistrationUrl(String nativeWebinarExtnWebinarRegistrationUrl) {
        this.nativeWebinarExtnWebinarRegistrationUrl = nativeWebinarExtnWebinarRegistrationUrl
        return this
    }


    /**
     * 设置「网络研讨会时间表」值
     * @param val
     */
    CampaignDTO setNativeWebinarExtnWebinarSchedule(Timestamp nativeWebinarExtnWebinarSchedule) {
        this.nativeWebinarExtnWebinarSchedule = nativeWebinarExtnWebinarSchedule
        return this
    }


    /**
     * 设置「发出数量」值
     * @param val
     */
    CampaignDTO setNumSent(BigInteger numSent) {
        this.numSent = numSent
        return this
    }


    /**
     * 设置「开始日期」值
     * @param val
     */
    CampaignDTO setStartDate(Timestamp startDate) {
        this.startDate = startDate
        return this
    }


    /**
     * 设置「状态」值
     * 字典[活动状态]
     * @param val
     */
    CampaignDTO setStatus(String status) {
        this.status = status
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    CampaignDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「类型」值
     * 字典[市场活动类型]
     * @param val
     */
    CampaignDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    CampaignDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    CampaignDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
