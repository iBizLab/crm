# 周报(weeklies_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [周报(WEEKLIES)](module/crm/weeklies) : [表格界面_删除操作](module/crm/weeklies#界面行为)
  * [周报(WEEKLIES)](module/crm/weeklies) : [新建周报](module/crm/weeklies#界面行为)
  * [周报(WEEKLIES)](module/crm/weeklies) : [编辑界面_打印操作](module/crm/weeklies#界面行为)

### 关联视图
  * [周报(weeklies_edit_view)](app/view/weeklies_edit_view)
  * [新建周报(weeklies_quick_create_view)](app/view/weeklies_quick_create_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>