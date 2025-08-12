package cn.ibizlab.crm.crm.dealhistory.dto

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
class DealHistoryDTO extends GroovyDTO<DealHistoryDTO> {

    /**
     * 「金额」
     */
    @JsonProperty("amount")
    BigDecimal amount
    /**
     * 「预计成交日期」
     */
    @JsonProperty("closing_date")
    Timestamp closingDate
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
     * 「商机标识」
     */
    @JsonProperty("deal_id")
    String dealId
    /**
     * 「预期收益」
     */
    @JsonProperty("expected_revenue")
    BigDecimal expectedRevenue
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「最近操作时间」
     */
    @JsonProperty("last_activity_time")
    Timestamp lastActivityTime
    /**
     * 「移动到」
     */
    @JsonProperty("moved_to_s")
    String movedToS
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「可能性」
     */
    @JsonProperty("probability")
    Integer probability
    /**
     * 「阶段」
     */
    @JsonProperty("stage")
    String stage
    /**
     * 「阶段持续时间(日历天数)」
     */
    @JsonProperty("stage_duration_calendar_days")
    Integer stageDurationCalendarDays
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
     * 设置「金额」值
     * @param val
     */
    DealHistoryDTO setAmount(BigDecimal amount) {
        this.amount = amount
        return this
    }


    /**
     * 设置「预计成交日期」值
     * @param val
     */
    DealHistoryDTO setClosingDate(Timestamp closingDate) {
        this.closingDate = closingDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    DealHistoryDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    DealHistoryDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「商机标识」值
     * @param val
     */
    DealHistoryDTO setDealId(String dealId) {
        this.dealId = dealId
        return this
    }


    /**
     * 设置「预期收益」值
     * @param val
     */
    DealHistoryDTO setExpectedRevenue(BigDecimal expectedRevenue) {
        this.expectedRevenue = expectedRevenue
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DealHistoryDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「最近操作时间」值
     * @param val
     */
    DealHistoryDTO setLastActivityTime(Timestamp lastActivityTime) {
        this.lastActivityTime = lastActivityTime
        return this
    }


    /**
     * 设置「移动到」值
     * @param val
     */
    DealHistoryDTO setMovedToS(String movedToS) {
        this.movedToS = movedToS
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    DealHistoryDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「可能性」值
     * @param val
     */
    DealHistoryDTO setProbability(Integer probability) {
        this.probability = probability
        return this
    }


    /**
     * 设置「阶段」值
     * @param val
     */
    DealHistoryDTO setStage(String stage) {
        this.stage = stage
        return this
    }


    /**
     * 设置「阶段持续时间(日历天数)」值
     * @param val
     */
    DealHistoryDTO setStageDurationCalendarDays(Integer stageDurationCalendarDays) {
        this.stageDurationCalendarDays = stageDurationCalendarDays
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    DealHistoryDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DealHistoryDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
