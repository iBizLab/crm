# 联系人(contact_edit_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [联系人(CONTACT)](module/crm/contact) : [编辑界面_保存并新建操作](module/crm/contact#界面行为)
  * [联系人(CONTACT)](module/crm/contact) : [编辑界面_退出操作](module/crm/contact#界面行为)
  * [联系人(CONTACT)](module/crm/contact) : [打开联系人主数据页面](module/crm/contact#界面行为)
  * [联系人(CONTACT)](module/crm/contact) : [保存并打开联系人主数据页面](module/crm/contact#界面行为)
  * [联系人(CONTACT)](module/crm/contact) : [编辑界面_保存并退出操作](module/crm/contact#界面行为)

### 关联视图
  * [客户(account_pickup_view)](app/view/account_pickup_view)
  * [联系人信息(contact_main_view)](app/view/contact_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>