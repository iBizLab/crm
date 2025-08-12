# 任务(task_weeklies_edit_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)

##### 部件逻辑
* `onLoadDraftSuccess`
```
if(ctrl.details.due_date.value == undefined){
    // 获取下周五日期
    var today = new Date();
    var nextFriday = new Date(today);
    if (today.getDay() === 5 && today.getHours() >= 12) {
        nextFriday.setDate(today.getDate() + (5 - today.getDay() + 7) % 7 + 7);
    } else {
        nextFriday.setDate(today.getDate() + (5 - today.getDay() + 7) % 7);
    }
    var year = nextFriday.getFullYear();
    var month = (nextFriday.getMonth() + 1).toString().padStart(2, '0');
    var day = nextFriday.getDate().toString().padStart(2, '0');

    var nextFridayDateString = year + '-' + month + '-' + day;
    ctrl.details.due_date.setDataValue(nextFridayDateString);
}


```
#### 工具栏(toolbar)


### 关联界面行为
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_退出操作](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_保存并新建操作](module/crm/task#界面行为)
  * [任务&活动(TASK)](module/crm/task) : [编辑界面_保存并退出操作](module/crm/task#界面行为)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>