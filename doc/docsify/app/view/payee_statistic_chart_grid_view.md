# 收款统计表格(payee_statistic_chart_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic) : [订单号反查](module/crm/payee_statistic#界面行为)
  * [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic) : [反查数据打开编辑视图](module/crm/payee_statistic#界面行为)

### 关联视图
  * [收款情况统计(payee_statistic_edit_view)](app/view/payee_statistic_edit_view)
  * [订单信息(project_main_view)](app/view/project_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>