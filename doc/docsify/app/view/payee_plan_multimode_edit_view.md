# 收款计划编辑视图(payee_plan_multimode_edit_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [编辑界面_退出操作](module/crm/payee_plan#界面行为)
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [拆分计划](module/crm/payee_plan#界面行为)
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [计划拆分保存](module/crm/payee_plan#界面行为)
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [关闭计划](module/crm/payee_plan#界面行为)
  * [收款计划(PAYEE_PLAN)](module/crm/payee_plan) : [编辑界面_保存并新建操作](module/crm/payee_plan#界面行为)

### 关联视图
  * [收款计划(payee_plan_edit_view)](app/view/payee_plan_edit_view)
  * [订单(project_pickup_view)](app/view/project_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>