# 活动与任务(task_index_view)  <!-- {docsify-ignore-all} -->



## 控件
#### 应用菜单(appmenu)
#### CAPTIONBAR(captionbar)


### 关联界面行为
  * [任务&活动(TASK)](module/crm/task) : [过滤](module/crm/task#界面行为)

### 关联视图
  * [已取消任务(task_my_cancelled_grid_view)](app/view/task_my_cancelled_grid_view)
  * [已完成的任务(task_my_done_grid_view)](app/view/task_my_done_grid_view)
  * [待办任务(task_my_todo_grid_view)](app/view/task_my_todo_grid_view)
  * [待办任务(task_my_todo_tab_search_view)](app/view/task_my_todo_tab_search_view)
  * [追踪中的任务(task_my_tracing_grid_view)](app/view/task_my_tracing_grid_view)
  * [待办任务看板视图(task_todo_task_kanban_view)](app/view/task_todo_task_kanban_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>