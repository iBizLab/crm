# 任务(task_data_view_multimode)  <!-- {docsify-ignore-all} -->


自动生成



## 控件
#### CAPTIONBAR(captionbar)
#### 数据视图(dataview)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [任务&活动(TASK)](module/crm/task) : [导入备注](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [导入数据](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [表格界面_新建操作](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [管理标签](module/crm/task#界面行为)

### 关联视图
  * [标签管理(tag_mgr_grid_view)](app/view/tag_mgr_grid_view)
  * [任务信息(task_main_view)](app/view/task_main_view)
  * [任务(task_task_edit_view)](app/view/task_task_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>