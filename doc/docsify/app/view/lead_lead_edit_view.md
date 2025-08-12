# 线索(lead_lead_edit_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [线索(LEAD)](module/crm/lead) : [保存并打开线索主信息界面](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [编辑界面_退出操作](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [编辑界面_保存并新建操作](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [编辑界面_保存并退出操作](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [打开线索主数据视图](module/crm/lead#界面行为)

### 关联视图
  * [客户(account_pickup_view)](app/view/account_pickup_view)
  * [线索信息(lead_main_view)](app/view/lead_main_view)
  * [线索(lead_pickup_view)](app/view/lead_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>