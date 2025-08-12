# 客户(account_test_tab_search_view)  <!-- {docsify-ignore-all} -->


测试视图



## 控件
#### CAPTIONBAR(captionbar)
#### 搜索栏(searchbar)
#### 分页导航面板(tabexppanel)


### 关联界面行为
  * [客户(ACCOUNT)](module/crm/account) : [过滤](module/crm/account#界面行为)

### 关联视图
  * [客户(account_data_view_multimode)](app/view/account_data_view_multimode)
  * [客户(account_grid_view_multimode)](app/view/account_grid_view_multimode)
  * [客户(account_list_view_multimode)](app/view/account_list_view_multimode)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>