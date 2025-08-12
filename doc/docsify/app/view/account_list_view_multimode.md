# 客户(account_list_view_multimode)  <!-- {docsify-ignore-all} -->


自动生成



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
  * [客户(ACCOUNT)](module/crm/account) : [表格界面_新建操作](module/crm/account#界面行为)
  * [客户(ACCOUNT)](module/crm/account) : [导入数据](module/crm/account#界面行为)
  * [客户(ACCOUNT)](module/crm/account) : [导入备注](module/crm/account#界面行为)
  * [客户(ACCOUNT)](module/crm/account) : [管理标签](module/crm/account#界面行为)

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