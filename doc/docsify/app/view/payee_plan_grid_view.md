# 收款计划(payee_plan_grid_view)  <!-- {docsify-ignore-all} -->



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
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [关闭计划](module/crm/payee_plan#界面行为)
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [生成收款记录](module/crm/payee_plan#界面行为)
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [拆分计划](module/crm/payee_plan#界面行为)
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [移除标签](module/crm/payee_plan#界面行为)
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [表格界面_新建操作](module/crm/payee_plan#界面行为)
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [创建任务](module/crm/payee_plan#界面行为)
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [表格界面_刷新操作](module/crm/payee_plan#界面行为)
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [删除](module/crm/payee_plan#界面行为)
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [添加标签](module/crm/payee_plan#界面行为)
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [批量更新](module/crm/payee_plan#界面行为)

### 关联视图
  * [收款记录(payee_payee_edit_view)](app/view/payee_payee_edit_view)
  * [收款计划(payee_plan_edit_view)](app/view/payee_plan_edit_view)
  * [添加标签(tag_add_tag)](app/view/tag_add_tag)
  * [移除标签(tag_remove_tag)](app/view/tag_remove_tag)
  * [批创建(task_batch_create_view)](app/view/task_batch_create_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>