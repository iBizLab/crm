# 商机(deal_exp_grid_view)  <!-- {docsify-ignore-all} -->



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
  * [商机(DEAL)](module/crm/deal) : [创建商机](module/crm/deal#界面行为)

### 关联视图
  * [商机(deal_edit_view)](app/view/deal_edit_view)
  * [商机(deal_edit_view_origin)](app/view/deal_edit_view_origin)
  * [商机信息(deal_main_view)](app/view/deal_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>