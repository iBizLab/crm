# 收款记录表格编辑视图(payee_multimode_edit_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [收款记录(PAYEE)](module/crm/payee) : [编辑界面_退出操作](module/crm/payee#界面行为)
  * [收款记录(PAYEE)](module/crm/payee) : [编辑界面_保存并新建操作](module/crm/payee#界面行为)
  * [收款记录(PAYEE)](module/crm/payee) : [编辑界面_保存并退出操作](module/crm/payee#界面行为)

### 关联视图
  * [收款计划(payee_plan_pickup_view)](app/view/payee_plan_pickup_view)
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