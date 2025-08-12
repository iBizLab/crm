# 签单分析(project_order_analysis_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [订单(PROJECT)](module/crm/project) : [打开订单主数据视图](module/crm/project#界面行为)

### 关联视图
  * [订单(project_edit_view3)](app/view/project_edit_view3)
  * [订单信息(project_main_view)](app/view/project_main_view)
  * [订单(project_redirect_view)](app/view/project_redirect_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>