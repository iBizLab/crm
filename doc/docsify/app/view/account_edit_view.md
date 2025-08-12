# 客户(account_edit_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [客户(ACCOUNT)](module/crm/account) : [编辑界面_保存并新建操作](module/crm/account#界面行为)
  * [客户(ACCOUNT)](module/crm/account) : [打开客户主数据视图](module/crm/account#界面行为)
  * [客户(ACCOUNT)](module/crm/account) : [编辑界面_退出操作](module/crm/account#界面行为)
  * [客户(ACCOUNT)](module/crm/account) : [编辑界面_保存并退出操作](module/crm/account#界面行为)
  * [客户(ACCOUNT)](module/crm/account) : [保存并打开线索主信息界面](module/crm/account#界面行为)

### 关联视图
  * [客户(account_pickup_view)](app/view/account_pickup_view)
  * [客户信息(account_test_main_view)](app/view/account_test_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>