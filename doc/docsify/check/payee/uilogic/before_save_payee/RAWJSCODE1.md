<p class="panel-title"><b>执行代码</b></p>

```javascript
var form_data = view.layoutPanel.panelItems.form.control.data;
var planned_amount = form_data.planned_amount; // 收款计划金额 
var amount = form_data.amount; // 收款记录金额 
if (planned_amount != undefined  && planned_amount != null) {
    if( amount < planned_amount ){
        util.message.warning('收款金额小于计划金额，请降低原收款计划金额！');
    }
}
```
