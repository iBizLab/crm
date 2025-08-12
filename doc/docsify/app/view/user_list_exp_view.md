# 用户管理(user_list_exp_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 列表视图导航栏(listexpbar)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [用户(USER)](module/crm/user) : [表格界面_新建操作](module/crm/user#界面行为)
  * [用户(USER)](module/crm/user) : [表格界面_编辑操作](module/crm/user#界面行为)
  * [用户(USER)](module/crm/user) : [表格界面_拷贝操作](module/crm/user#界面行为)
  * [用户(USER)](module/crm/user) : [表格界面_导出数据模型](module/crm/user#界面行为)
  * [用户(USER)](module/crm/user) : [表格界面_帮助操作](module/crm/user#界面行为)
  * [用户(USER)](module/crm/user) : [新建用户](module/crm/user#界面行为)
  * [用户(USER)](module/crm/user) : [表格界面_删除操作](module/crm/user#界面行为)
  * [用户(USER)](module/crm/user) : [修改密码](module/crm/user#界面行为)

### 关联视图
  * [个人详情信息(user_info_view)](app/view/user_info_view)
  * [新建用户(user_quick_new_view)](app/view/user_quick_new_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>