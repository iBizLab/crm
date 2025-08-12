# 订单(project_grid_view_multimode)  <!-- {docsify-ignore-all} -->


系统自动添加



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
  * [订单(PROJECT)](module/crm/project) : [编辑](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [表格界面_刷新操作](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [批量更新](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [导入数据](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [添加标签](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [移除标签](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [删除](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [创建订单/子订单](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [导入备注](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [创建任务](module/crm/project#界面行为)

### 关联视图
  * [订单(project_edit_view3)](app/view/project_edit_view3)
  * [订单信息(project_main_view)](app/view/project_main_view)
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