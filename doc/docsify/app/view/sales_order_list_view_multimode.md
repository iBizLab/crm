# 销售订单(sales_order_list_view_multimode)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 列表(list)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [销售订单(SALES_ORDER)](module/crm/sales_order) : [表格界面_新建操作](module/crm/sales_order#界面行为)
  * [销售订单(SALES_ORDER)](module/crm/sales_order) : [导入数据](module/crm/sales_order#界面行为)
  * [销售订单(SALES_ORDER)](module/crm/sales_order) : [导入备注](module/crm/sales_order#界面行为)
  * [销售订单(SALES_ORDER)](module/crm/sales_order) : [管理标签](module/crm/sales_order#界面行为)

### 关联视图
  * [标签管理(tag_mgr_grid_view)](app/view/tag_mgr_grid_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>