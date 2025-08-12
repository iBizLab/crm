# 工作进展(work_progress_menu_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
* `onCreated`
```javascript
view.ctx.evt.on('onRegister', (name, c) => {
    if(name==='searchform'){
        const time = new Date();
        const preTime = new Date(time.getTime() - 518400000);
        const starttime_gt = preTime.getFullYear() +'-' +(preTime.getMonth() + 1 < 10 ? '0' + (preTime.getMonth() + 1): preTime.getMonth() + 1) +'-' +(preTime.getDate() < 10 ? '0' + preTime.getDate() : preTime.getDate()) 
        const endtime_lt = time.getFullYear() +'-' +(time.getMonth() + 1 < 10 ? '0' + (time.getMonth() + 1): time.getMonth() + 1) +'-' +(time.getDate() < 10 ? '0' + time.getDate() : time.getDate())
        const date_range = starttime_gt + ',' + endtime_lt;
        Object.assign(c.params, {starttime_gt,endtime_lt,date_range})
    }
});
```
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [工作进展(WORK_PROGRESS)](module/crm/work_progress) : [打开主数据视图](module/crm/work_progress#界面行为)

### 关联视图
  * [工作进展(work_progress_edit_view)](app/view/work_progress_edit_view)
  * [工作进展(work_progress_redirect_view)](app/view/work_progress_redirect_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>