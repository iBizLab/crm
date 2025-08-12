package cn.ibizlab.crm.crm.product.dto

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
class ProductDTO extends GroovyDTO<ProductDTO> {

    /**
     * 「附件」
     */
    @JsonProperty("attachments")
    List<AttachmentDTO> attachments
    /**
     * 「佣金比例」
     */
    @JsonProperty("commission_rate")
    String commissionRate
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
     * 「制造商」
     * 字典[制造商]
     */
    @JsonProperty("manufacturer")
    String manufacturer
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
     * 「产品有效」
     * 字典[是否]
     */
    @JsonProperty("product_active")
    Integer productActive
    /**
     * 「产品分类」
     * 字典[产品分类]
     */
    @JsonProperty("product_category")
    String productCategory
    /**
     * 「产品编码」
     */
    @JsonProperty("product_code")
    String productCode
    /**
     * 「产品名称」
     */
    @JsonProperty("product_name")
    String productName
    /**
     * 「需求数量」
     */
    @JsonProperty("qty_in_demand")
    BigDecimal qtyInDemand
    /**
     * 「库存数量」
     */
    @JsonProperty("qty_in_stock")
    BigDecimal qtyInStock
    /**
     * 「订购数量」
     */
    @JsonProperty("qty_ordered")
    BigDecimal qtyOrdered
    /**
     * 「产品图片」
     */
    @JsonProperty("record_image")
    String recordImage
    /**
     * 「库存警戒线」
     */
    @JsonProperty("reorder_level")
    BigDecimal reorderLevel
    /**
     * 「销售结束日期」
     */
    @JsonProperty("sales_end_date")
    Timestamp salesEndDate
    /**
     * 「错售开始日期」
     */
    @JsonProperty("sales_start_date")
    Timestamp salesStartDate
    /**
     * 「支持过期日期」
     */
    @JsonProperty("support_expiry_date")
    Timestamp supportExpiryDate
    /**
     * 「支持开始日期」
     */
    @JsonProperty("support_start_date")
    Timestamp supportStartDate
    /**
     * 「标签」
     */
    @JsonProperty("tag")
    String tag
    /**
     * 「税」
     * 字典[税]
     */
    @JsonProperty("tax")
    String tax
    /**
     * 「应纳税」
     * 字典[是否]
     */
    @JsonProperty("taxable")
    Integer taxable
    /**
     * 「定价」
     */
    @JsonProperty("unit_price")
    String unitPrice
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
     * 「使用单位」
     */
    @JsonProperty("usage_unit")
    String usageUnit
    /**
     * 「供应商标识」
     */
    @JsonProperty("vendor_id")
    String vendorId
    /**
     * 「供应商名称」
     */
    @JsonProperty("vendor_name")
    String vendorName

    /**
     * 设置「附件」值
     * @param val
     */
    ProductDTO setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments
        return this
    }


    /**
     * 设置「佣金比例」值
     * @param val
     */
    ProductDTO setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProductDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    ProductDTO setCreateTime(Timestamp createTime) {
        this.createTime = createTime
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    ProductDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ProductDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「Locked」值
     * 字典[是否]
     * @param val
     */
    ProductDTO setLockedS(Integer lockedS) {
        this.lockedS = lockedS
        return this
    }


    /**
     * 设置「制造商」值
     * 字典[制造商]
     * @param val
     */
    ProductDTO setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ProductDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「所有者」值
     * 字典[所有者]
     * @param val
     */
    ProductDTO setOwner(String owner) {
        this.owner = owner
        return this
    }


    /**
     * 设置「产品有效」值
     * 字典[是否]
     * @param val
     */
    ProductDTO setProductActive(Integer productActive) {
        this.productActive = productActive
        return this
    }


    /**
     * 设置「产品分类」值
     * 字典[产品分类]
     * @param val
     */
    ProductDTO setProductCategory(String productCategory) {
        this.productCategory = productCategory
        return this
    }


    /**
     * 设置「产品编码」值
     * @param val
     */
    ProductDTO setProductCode(String productCode) {
        this.productCode = productCode
        return this
    }


    /**
     * 设置「产品名称」值
     * @param val
     */
    ProductDTO setProductName(String productName) {
        this.productName = productName
        return this
    }


    /**
     * 设置「需求数量」值
     * @param val
     */
    ProductDTO setQtyInDemand(BigDecimal qtyInDemand) {
        this.qtyInDemand = qtyInDemand
        return this
    }


    /**
     * 设置「库存数量」值
     * @param val
     */
    ProductDTO setQtyInStock(BigDecimal qtyInStock) {
        this.qtyInStock = qtyInStock
        return this
    }


    /**
     * 设置「订购数量」值
     * @param val
     */
    ProductDTO setQtyOrdered(BigDecimal qtyOrdered) {
        this.qtyOrdered = qtyOrdered
        return this
    }


    /**
     * 设置「产品图片」值
     * @param val
     */
    ProductDTO setRecordImage(String recordImage) {
        this.recordImage = recordImage
        return this
    }


    /**
     * 设置「库存警戒线」值
     * @param val
     */
    ProductDTO setReorderLevel(BigDecimal reorderLevel) {
        this.reorderLevel = reorderLevel
        return this
    }


    /**
     * 设置「销售结束日期」值
     * @param val
     */
    ProductDTO setSalesEndDate(Timestamp salesEndDate) {
        this.salesEndDate = salesEndDate
        return this
    }


    /**
     * 设置「错售开始日期」值
     * @param val
     */
    ProductDTO setSalesStartDate(Timestamp salesStartDate) {
        this.salesStartDate = salesStartDate
        return this
    }


    /**
     * 设置「支持过期日期」值
     * @param val
     */
    ProductDTO setSupportExpiryDate(Timestamp supportExpiryDate) {
        this.supportExpiryDate = supportExpiryDate
        return this
    }


    /**
     * 设置「支持开始日期」值
     * @param val
     */
    ProductDTO setSupportStartDate(Timestamp supportStartDate) {
        this.supportStartDate = supportStartDate
        return this
    }


    /**
     * 设置「标签」值
     * @param val
     */
    ProductDTO setTag(String tag) {
        this.tag = tag
        return this
    }


    /**
     * 设置「税」值
     * 字典[税]
     * @param val
     */
    ProductDTO setTax(String tax) {
        this.tax = tax
        return this
    }


    /**
     * 设置「应纳税」值
     * 字典[是否]
     * @param val
     */
    ProductDTO setTaxable(Integer taxable) {
        this.taxable = taxable
        return this
    }


    /**
     * 设置「定价」值
     * @param val
     */
    ProductDTO setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    ProductDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    ProductDTO setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime
        return this
    }


    /**
     * 设置「使用单位」值
     * @param val
     */
    ProductDTO setUsageUnit(String usageUnit) {
        this.usageUnit = usageUnit
        return this
    }


    /**
     * 设置「供应商标识」值
     * @param val
     */
    ProductDTO setVendorId(String vendorId) {
        this.vendorId = vendorId
        return this
    }


    /**
     * 设置「供应商名称」值
     * @param val
     */
    ProductDTO setVendorName(String vendorName) {
        this.vendorName = vendorName
        return this
    }

}
