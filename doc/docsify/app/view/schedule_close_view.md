# 已完成的任务&历史活动(schedule_close_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联视图
  * [通话(call_edit_view)](app/view/call_edit_view)
  * [会议(event_edit_view)](app/view/event_edit_view)
  * [预留(reservation_edit_view)](app/view/reservation_edit_view)
  * [日程(schedule_edit_view)](app/view/schedule_edit_view)
  * [日程(schedule_index_pickup_view)](app/view/schedule_index_pickup_view)
  * [日程(schedule_redirect_view)](app/view/schedule_redirect_view)
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