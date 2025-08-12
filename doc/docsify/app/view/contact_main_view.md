# 联系人信息(contact_main_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 数据关系栏(drbar)
#### 编辑表单(form)
#### 编辑表单(miniform)
#### 工具栏(toolbar)


### 关联界面行为
  * [联系人(CONTACT)](module/crm/contact) : [编辑](module/crm/contact#界面行为)
  * [联系人(CONTACT)](module/crm/contact) : [编辑界面_下一个记录](module/crm/contact#界面行为)
  * [联系人(CONTACT)](module/crm/contact) : [编辑界面_删除并退出操作](module/crm/contact#界面行为)
  * [日程(SCHEDULE)](module/crm/schedule) : [表格界面_新建操作](module/crm/schedule#界面行为)
  * [日程(SCHEDULE)](module/crm/schedule) : [表格界面_查看操作](module/crm/schedule#界面行为)
  * [联系人(CONTACT)](module/crm/contact) : [编辑界面_退出操作](module/crm/contact#界面行为)
  * [联系人(CONTACT)](module/crm/contact) : [编辑界面_上一个记录](module/crm/contact#界面行为)
  * [联系人(CONTACT)](module/crm/contact) : [编辑界面_拷贝操作](module/crm/contact#界面行为)

### 关联视图
  * [时间轴(activitiy_time_line_view)](app/view/activitiy_time_line_view)
  * [附件(contact_attachment_view)](app/view/contact_attachment_view)
  * [联系人(contact_edit_view)](app/view/contact_edit_view)
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