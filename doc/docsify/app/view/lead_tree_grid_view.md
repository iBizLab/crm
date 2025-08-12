# 线索树表格视图(lead_tree_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)
#### 数据树表格(treegrid)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [线索(LEAD)](module/crm/lead) : [表格界面_刷新操作](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [打开商机主数据视图](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [线索转为商机](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [创建任务](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [创建子线索](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [表格界面_新建操作](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [批量更新](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [编辑](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [添加标签](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [删除](module/crm/lead#界面行为)
  * [线索(LEAD)](module/crm/lead) : [移除标签](module/crm/lead#界面行为)

### 关联视图
  * [商机信息(deal_main_view)](app/view/deal_main_view)
  * [线索(lead_lead_edit_view)](app/view/lead_lead_edit_view)
  * [线索信息(lead_main_view)](app/view/lead_main_view)
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