# 关联销售人员(user_grid_view_relation)  <!-- {docsify-ignore-all} -->



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
  * [用户(USER)](module/crm/user) : [取消关联](module/crm/user#界面行为)
  * [用户(USER)](module/crm/user) : [添加关联销售](module/crm/user#界面行为)

### 关联视图
  * [用户(user_edit_view)](app/view/user_edit_view)
  * [用户(user_m_pickup_view)](app/view/user_m_pickup_view)
  * [用户(user_redirect_view)](app/view/user_redirect_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>