# 关联商品(product_grid_view_relation)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [产品(PRODUCT)](module/crm/product) : [取消关联](module/crm/product#界面行为)
  * [产品(PRODUCT)](module/crm/product) : [添加产品](module/crm/product#界面行为)

### 关联视图
  * [产品(product_edit_view)](app/view/product_edit_view)
  * [产品(product_m_pickup_view)](app/view/product_m_pickup_view)
  * [产品(product_redirect_view)](app/view/product_redirect_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>