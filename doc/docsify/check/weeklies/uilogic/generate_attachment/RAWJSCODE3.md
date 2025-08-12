<p class="panel-title"><b>执行代码</b></p>

```javascript
const form = uiLogic.form;
if (form) {
    const data = uiLogic.form.state.data;
    const name = `${data.name || '周报'}.pdf`;
    const id = uiLogic.attachment.id;
    const value = [{name, id}];
    form.setDataValue('attachment', JSON.stringify(value));
}
```
