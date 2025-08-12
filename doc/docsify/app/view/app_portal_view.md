# 我的工作台(app_portal_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据看板(dashboard)


### 关联界面逻辑
  * [商机(DEAL)](module/crm/deal) : [导航（全部商机含查询条件）](module/crm/deal/uilogic/all_deal_with_query)
  * [商机(DEAL)](module/crm/deal) : [导航到表格视图（图表导航）](module/crm/deal/uilogic/exp_to_gridview)

### 关联视图
  * [商机多模式图表表格导航视图(deal_chart_grid_view_multimode)](app/view/deal_chart_grid_view_multimode)
  * [商机(deal_exp_grid_view)](app/view/deal_exp_grid_view)
  * [商机(deal_tab_exp_view)](app/view/deal_tab_exp_view)
  * [进展评估(note_attach_option_view)](app/view/note_attach_option_view)
  * [门户_我的待办任务(task_portal_my_todo_grid_view)](app/view/task_portal_my_todo_grid_view)
  * [门户_我的本周活动(task_portal_my_weekend_act_grid_view)](app/view/task_portal_my_weekend_act_grid_view)
  * [任务(task_task_edit_view)](app/view/task_task_edit_view)
  * [活动(task_the_maneuver_edit_view)](app/view/task_the_maneuver_edit_view)
  * [个人实时绩效情况(user_custom_view)](app/view/user_custom_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>