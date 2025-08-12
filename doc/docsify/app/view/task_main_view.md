# 任务信息(task_main_view)  <!-- {docsify-ignore-all} -->


自动生成



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 数据关系栏(drbar)
#### 编辑表单(form)
#### 编辑表单(miniform)
#### 工具栏(toolbar)


### 关联界面行为
  * [任务&活动(TASK)](module/crm/task) : [任务设为活动](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_删除并退出操作](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_上一个记录](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_退出操作](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_下一个记录](module/crm/task#界面行为)
  * [日程(SCHEDULE)](module/crm/schedule) : [表格界面_新建操作](module/crm/schedule#界面行为)
  * [日程(SCHEDULE)](module/crm/schedule) : [表格界面_查看操作](module/crm/schedule#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [关闭任务](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [任务编辑](module/crm/task#界面行为)

### 关联视图
  * [时间轴(activitiy_time_line_view)](app/view/activitiy_time_line_view)
  * [待办任务(schedule_not_close_tab_exp_view9)](app/view/schedule_not_close_tab_exp_view9)
  * [待办任务(schedule_not_close_tab_tabs_exp_view_multimode)](app/view/schedule_not_close_tab_tabs_exp_view_multimode)
  * [附件(task_attachment_view)](app/view/task_attachment_view)
  * [任务&活动(task_edit_view)](app/view/task_edit_view)
  * [活动信息(task_maneuver_main_view)](app/view/task_maneuver_main_view)
  * [进展评估(task_note_attach_view)](app/view/task_note_attach_view)
  * [已完成的任务&历史活动(task_task_act_list_view)](app/view/task_task_act_list_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>