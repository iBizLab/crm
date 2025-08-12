# 收款记录(payee_payee_edit_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)

## 视图界面逻辑
  * [收款记录保存之前](module/crm/payee/uilogic/before_save_payee)


### 关联界面行为
  * [收款记录(PAYEE)](module/crm/payee) : [编辑界面_保存并退出操作](module/crm/payee#界面行为)
  * [收款记录(PAYEE)](module/crm/payee) : [编辑界面_保存并新建操作](module/crm/payee#界面行为)
  * [收款记录(PAYEE)](module/crm/payee) : [编辑界面_退出操作](module/crm/payee#界面行为)

### 关联界面逻辑
  * [收款记录(PAYEE)](module/crm/payee) : [收款记录保存之前](module/crm/payee/uilogic/before_save_payee)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>