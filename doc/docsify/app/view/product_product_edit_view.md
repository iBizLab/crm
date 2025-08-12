# 产品(product_product_edit_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [产品(PRODUCT)](module/crm/product) : [保存并打开产品主数据界面](module/crm/product#界面行为)
  * [产品(PRODUCT)](module/crm/product) : [打开产品主数据视图](module/crm/product#界面行为)
  * [产品(PRODUCT)](module/crm/product) : [编辑界面_保存并新建操作](module/crm/product#界面行为)
  * [产品(PRODUCT)](module/crm/product) : [编辑界面_保存并退出操作](module/crm/product#界面行为)
  * [产品(PRODUCT)](module/crm/product) : [编辑界面_退出操作](module/crm/product#界面行为)

### 关联视图
  * [产品信息(product_main_view)](app/view/product_main_view)
  * [供应商(vendor_pickup_view)](app/view/vendor_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>