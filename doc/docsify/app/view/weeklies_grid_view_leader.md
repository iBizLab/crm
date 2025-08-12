# 销售工作报告(weeklies_grid_view_leader)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)

## 视图界面逻辑
* `onCreated`
```javascript
view.ctx.evt.on('onRegister', (name, c) => {
    if(name==='searchform'){
        const time = new Date();
        const oneDayInMilliseconds = 1000 * 60 * 60 * 24;
        const twentyOneDaysInMilliseconds = oneDayInMilliseconds * 21;
        const preTime = new Date(time.getTime() - twentyOneDaysInMilliseconds);
        const n_start_date_gtandeq = preTime.getFullYear() +'-' +(preTime.getMonth() + 1 < 10 ? '0' + (preTime.getMonth() + 1): preTime.getMonth() + 1) +'-' +(preTime.getDate() < 10 ? '0' + preTime.getDate() : preTime.getDate()) 
        const n_start_date_lt = time.getFullYear() +'-' +(time.getMonth() + 1 < 10 ? '0' + (time.getMonth() + 1): time.getMonth() + 1) +'-' +(time.getDate() < 10 ? '0' + time.getDate() : time.getDate())
        const date_range = n_start_date_gtandeq + ',' + n_start_date_lt;
        Object.assign(c.params, {n_start_date_gtandeq,n_start_date_lt,date_range})
    }
});
```
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联视图
  * [销售工作报告详情(weeklies_edit_view_leader)](app/view/weeklies_edit_view_leader)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>