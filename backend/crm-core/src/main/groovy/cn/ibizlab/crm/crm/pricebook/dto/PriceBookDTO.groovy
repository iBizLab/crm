package cn.ibizlab.crm.crm.pricebook.dto

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
class PriceBookDTO extends GroovyDTO<PriceBookDTO> {

    /**
     * 「活跃」
     * 字典[是否]
     */
    @JsonProperty("active")
    Integer active
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
     * 「价格表名称」
     */
    @JsonProperty("price_book_name")
    String priceBookName
    /**
     * 「价格明细」
     */
    @JsonProperty("pricing_details")
    String pricingDetails
    /**
     * 「价格模型」
     */
    @JsonProperty("pricing_model")
    String pricingModel
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
     * 设置「活跃」值
     * 字典[是否]
     * @param val
     */
    PriceBookDTO setActive(Integer active) {
        this.active = active
        return this
    }


    /**
     * 设置「附件」值
     * @param val
     */
    PriceBookDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PriceBookDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PriceBookDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    PriceBookDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    PriceBookDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「Locked」值
     * 字典[是否]
     * @param val
     */
    PriceBookDTO setLockedS(Integer lockedS) {
        this.lockedS = lockedS
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    PriceBookDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「价格表名称」值
     * @param val
     */
    PriceBookDTO setPriceBookName(String priceBookName) {
        this.priceBookName = priceBookName
        return this
    }


    /**
     * 设置「价格明细」值
     * @param val
     */
    PriceBookDTO setPricingDetails(String pricingDetails) {
        this.pricingDetails = pricingDetails
        return this
    }


    /**
     * 设置「价格模型」值
     * @param val
     */
    PriceBookDTO setPricingModel(String pricingModel) {
        this.pricingModel = pricingModel
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    PriceBookDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PriceBookDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PriceBookDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }

}
