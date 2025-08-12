# 商机多模式图表表格导航视图(deal_chart_grid_view_multimode)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 图表视图导航栏(chartexpbar)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)

## 视图界面逻辑
* `onViewMounted`
```javascript
const searchForm = view.getController('searchform');
const xdataControlName = 'chartexpbar_chart';
const xdataControl = view.getController(xdataControlName);
if (searchForm && xdataControl) {
    searchForm.evt.on('onSearch', () => {
      xdataControl.state.searchParams = searchForm.getFilterParams();
      xdataControl.params = searchForm.getFilterParams();
      xdataControl.load({ isInitialLoad: true });
    });
    xdataControl.evt.on('onBeforeLoad', () => {
      console.log(xdataControl);
      xdataControl.state.searchParams = searchForm.getFilterParams();
      xdataControl.params = searchForm.getFilterParams();
    });
}
```
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面逻辑
  * [商机(DEAL)](module/crm/deal) : [导航到表格视图（图表导航）](module/crm/deal/uilogic/exp_to_gridview)
  * [商机(DEAL)](module/crm/deal) : [导航（全部商机含查询条件）](module/crm/deal/uilogic/all_deal_with_query)

### 关联视图
  * [商机(deal_exp_grid_view)](app/view/deal_exp_grid_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>