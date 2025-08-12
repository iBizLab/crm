# 商机(deal_weeklies_edit_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)

##### 值规则
* `probability` : [概率](index/value_rule_index)
#### 工具栏(toolbar)


### 关联界面行为
  * [商机(DEAL)](module/crm/deal) : [编辑界面_退出操作](module/crm/deal#界面行为)
  * [商机(DEAL)](module/crm/deal) : [编辑界面_保存并新建操作](module/crm/deal#界面行为)
  * [商机(DEAL)](module/crm/deal) : [编辑界面_保存并退出操作](module/crm/deal#界面行为)

### 关联视图
  * [客户(account_pickup_view)](app/view/account_pickup_view)
  * [联系人(contact_pickup_view)](app/view/contact_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>