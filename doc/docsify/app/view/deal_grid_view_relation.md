# 商机(deal_grid_view_relation)  <!-- {docsify-ignore-all} -->



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
  * [商机(DEAL)](module/crm/deal) : [表格界面_新建操作](module/crm/deal#界面行为)
  * [商机(DEAL)](module/crm/deal) : [编辑](module/crm/deal#界面行为)

### 关联视图
  * [商机(deal_edit_view)](app/view/deal_edit_view)
  * [商机(deal_redirect_view)](app/view/deal_redirect_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>