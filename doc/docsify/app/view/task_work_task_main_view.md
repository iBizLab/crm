# 工作信息(task_work_task_main_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 数据关系栏(drbar)
#### 编辑表单(form)
#### 编辑表单(miniform)
#### 工具栏(toolbar)


### 关联界面行为
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_删除并退出操作](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_退出操作](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_上一个记录](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_下一个记录](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [任务编辑（工作任务）](module/crm/task#界面行为)

### 关联视图
  * [时间轴(activitiy_time_line_view)](app/view/activitiy_time_line_view)
  * [附件(task_attachment_view)](app/view/task_attachment_view)
  * [进展情况(task_note_condition_view)](app/view/task_note_condition_view)
  * [工作(task_work_task_edit_view)](app/view/task_work_task_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>