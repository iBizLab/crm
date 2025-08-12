# 收款统计(payee_statistic_chart_exp_view_leader)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 图表视图导航栏(chartexpbar)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)

## 视图界面逻辑
* `onCreated`
```javascript
view.ctx.evt.on('onRegister', (name, c) => {
    if(name==='searchform'){
        const time = new Date();
				const currentYear = time.getFullYear();
				const nextYear = currentYear + 1;
				const gt = currentYear + '-01-01'
        const lt = nextYear+ '-03-01'
        const date_range = gt + ',' + lt;
        Object.assign(c.params, {gt,lt,date_range})
    }
    if(name==='chartexpbar_chart'){
        const searchForm = view.getController('searchform');
        c.evt.on('onBeforeLoad', () => {
            c.state.searchParams = searchForm.getFilterParams();
            c.params = searchForm.getFilterParams();
        });
    }
});
```
* `onViewMounted`
```javascript
const searchForm = view.getController('searchform');
const xdataControlName = 'chartexpbar_chart';
const xdataControl = view.getController(xdataControlName);
if (searchForm && xdataControl) {
    searchForm.evt.on('onSearch', () => {
      xdataControl.state.searchParams={};
      xdataControl.params={};
        xdataControl.load({ isInitialLoad: true });
    });
}
// 点击图表空白区域
xdataControl.chart.getZr().on('click', function(event) {
  if (!event.target) {
    const { series } = xdataControl.options;
    if (series && series.length > 0) {
      // 取消选中
      const seriesName = series.map(x => x.name);
      const maxLength = Math.max(...series.map(x => x.data.length))
	    xdataControl.chart.dispatchAction({
          type: 'unselect',
          seriesName,
          dataIndex: [...Array(maxLength).keys()],
      });
    }
    // 刷新表格
    ibiz.util.action.execAndResolved(
      'nav_statistic_grid@payee_statistic',
      {
        context: view.context,
        data: [],
        view: view,
      },
      view.context.srfappid,
    );
  }
});
```
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic) : [导航收款统计表格视图(只传搜索表单参数)](module/crm/payee_statistic#界面行为)

### 关联视图
  * [收款统计表格(payee_statistic_chart_grid_view)](app/view/payee_statistic_chart_grid_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>