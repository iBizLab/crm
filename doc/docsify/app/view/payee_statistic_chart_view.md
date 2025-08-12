# 收款情况统计(payee_statistic_chart_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据图表(chart)

##### 部件逻辑
* `onActive`
```
const { _groupName, _catalog } = data[0];
const { series } = ctrl.options;
if (series && series.length > 0) {
	// 取消选中
	const seriesName = series.map(x => x.name);
    const maxLength = Math.max(...series.map(x => x.data.length))
	ctrl.chart.dispatchAction({
        type: 'unselect',
        seriesName,
        dataIndex: [...Array(maxLength).keys()],
    });
    // 设置选中
    ctrl.chart.dispatchAction({
        type: 'select',
        seriesName: _groupName,
        name: _catalog,
    });
}
```
* `onBeforeUpdate`
```
const { series } = ctrl.options;
if (series && series.length > 0) {
    series.forEach(item => {
        if (item.label) {
            item.label.formatter = function (params) {
                if(params.value[1] === 0)
                {
                    return '';
                }
                else
                {
                    return ibiz.util.text.format(params.value[1], '#,##0.00');
                }
            };
        }
    });
};
```
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)


### 关联界面行为
  * [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic) : [导航收款统计表格视图(只传搜索表单参数)](module/crm/payee_statistic#界面行为)
  * [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic) : [生成收款情况统计](module/crm/payee_statistic#界面行为)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>