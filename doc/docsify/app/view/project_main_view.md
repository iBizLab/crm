# 订单信息(project_main_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 数据关系栏(drbar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [订单(PROJECT)](module/crm/project) : [编辑界面_退出操作](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [编辑界面_下一个记录](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [关闭订单](module/crm/project#界面行为)
  * [日程(SCHEDULE)](module/crm/schedule) : [表格界面_新建操作](module/crm/schedule#界面行为)
  * [日程(SCHEDULE)](module/crm/schedule) : [表格界面_查看操作](module/crm/schedule#界面行为)
  * [订单(PROJECT)](module/crm/project) : [编辑](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [编辑界面_上一个记录](module/crm/project#界面行为)

### 关联视图
  * [时间轴(activitiy_time_line_view)](app/view/activitiy_time_line_view)
  * [附件(project_attachment_view)](app/view/project_attachment_view)
  * [订单(project_edit_view3)](app/view/project_edit_view3)
  * [进展评估(project_note_attach_view)](app/view/project_note_attach_view)
  * [订单详情收款计划和记录(project_pro_pay_and_plan_edit_view)](app/view/project_pro_pay_and_plan_edit_view)
  * [待办任务(schedule_not_close_tab_exp_view9)](app/view/schedule_not_close_tab_exp_view9)
  * [待办任务(schedule_not_close_tab_tabs_exp_view_multimode)](app/view/schedule_not_close_tab_tabs_exp_view_multimode)
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