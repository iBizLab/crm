# 已完成的任务&历史活动(deal_task_list_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 列表(list)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [商机(DEAL)](module/crm/deal) : [取消关联（商机）](module/crm/deal#界面行为)
  * [商机(DEAL)](module/crm/deal) : [打开关联活动任务视图](module/crm/deal#界面行为)

### 关联视图
  * [商机(deal_edit_view_origin)](app/view/deal_edit_view_origin)
  * [任务&活动(task_deal_re_mpick_up_view)](app/view/task_deal_re_mpick_up_view)
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