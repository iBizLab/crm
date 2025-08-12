# 新建任务(task_weekly_task_edit_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_保存并新建操作](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_退出操作](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_保存并退出操作](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [打开任务主数据视图](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [新建并打开任务主数据视图](module/crm/task#界面行为)

### 关联视图
  * [任务信息(task_main_view)](app/view/task_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>