# 待办任务(task_my_todo_tab_search_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 搜索栏(searchbar)
#### 分页导航面板(tabexppanel)


### 关联界面行为
  * [任务&活动(TASK)](module/crm/task) : [过滤](module/crm/task#界面行为)

### 关联视图
  * [待办任务(task_my_todo_grid_view)](app/view/task_my_todo_grid_view)
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