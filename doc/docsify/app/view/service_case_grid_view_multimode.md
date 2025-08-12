# 服务支持(service_case_grid_view_multimode)  <!-- {docsify-ignore-all} -->


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
  * [服务支持(CASE)](module/crm/service_case) : [表格界面_新建操作](module/crm/service_case#界面行为)
  * [服务支持(CASE)](module/crm/service_case) : [移除标签](module/crm/service_case#界面行为)
  * [服务支持(CASE)](module/crm/service_case) : [批量更新](module/crm/service_case#界面行为)
  * [服务支持(CASE)](module/crm/service_case) : [创建任务](module/crm/service_case#界面行为)
  * [服务支持(CASE)](module/crm/service_case) : [删除](module/crm/service_case#界面行为)
  * [服务支持(CASE)](module/crm/service_case) : [添加标签](module/crm/service_case#界面行为)
  * [服务支持(CASE)](module/crm/service_case) : [导入数据](module/crm/service_case#界面行为)
  * [服务支持(CASE)](module/crm/service_case) : [导入备注](module/crm/service_case#界面行为)

### 关联视图
  * [服务支持(service_case_edit_view)](app/view/service_case_edit_view)
  * [服务支持信息(service_case_main_view)](app/view/service_case_main_view)
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