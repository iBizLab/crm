# 工作(task_work_task_edit_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)

## 视图界面逻辑
* `onMDCtrlNew`
```javascript
setTimeout(() => {
	const scroll = document.getElementsByClassName('ibiz-panel-view-content--scroll_container')[0];
	if (scroll) {
		scroll.scrollTop = scroll.scrollHeight;
	}
	console.log("任务的数据变化" + scroll.scrollTop)
}, 0);
```


### 关联界面行为
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_退出操作](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_保存并新建操作](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_保存并退出操作](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [打开任务主数据视图(工作任务)](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [新建并打开任务主数据视图（工作）](module/crm/task#界面行为)

### 关联视图
  * [工作信息(task_work_task_main_view)](app/view/task_work_task_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>