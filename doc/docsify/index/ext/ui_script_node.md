
## 使用脚本的界面逻辑节点<sup class="footnote-symbol"> <font color=orange>[30]</font></sup>

#### [客户(ACCOUNT)](module/crm/account)的处理逻辑[添加附件(add_attachment)](module/crm/account/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [附件(ATTACHMENT)](module/crm/attachment)的处理逻辑[附件_删除(remove_attachment_sc)](module/crm/attachment/uilogic/remove_attachment_sc)

节点：设置附件数据
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.attach = { data: uiLogic.default, silent: true };
```
#### [市场活动(CAMPAIGN)](module/crm/campaign)的处理逻辑[添加附件(add_attachment)](module/crm/campaign/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [服务支持(CASE)](module/crm/service_case)的处理逻辑[添加附件(add_attachment)](module/crm/service_case/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [联系人(CONTACT)](module/crm/contact)的处理逻辑[添加附件(add_attachment)](module/crm/contact/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [商机(DEAL)](module/crm/deal)的处理逻辑[添加附件(add_attachment)](module/crm/deal/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [发货单(INVOICE)](module/crm/invoice)的处理逻辑[添加附件(add_attachment)](module/crm/invoice/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [线索(LEAD)](module/crm/lead)的处理逻辑[添加附件(add_attachment)](module/crm/lead/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [备注(NOTE_ATTACH)](module/crm/note_attach)的处理逻辑[编辑备注(edit_note)](module/crm/note_attach/uilogic/edit_note)

节点：展开评论输入框并设值
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.comment.toggleCollapse(true);
uiLogic.comment.setValue(uiLogic.default.content);
uiLogic.comment.reply.value = null;
```
#### [备注(NOTE_ATTACH)](module/crm/note_attach)的处理逻辑[清空评论(clear_comment)](module/crm/note_attach/uilogic/clear_comment)

节点：注入脚本代码
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.view.layoutPanel.panelItems.field_textbox.editor.clear();
uiLogic.view.edit_comment_id = null;
uiLogic.view.reply_comment_id = null;
```
#### [备注(NOTE_ATTACH)](module/crm/note_attach)的处理逻辑[发送评论(send_comment)](module/crm/note_attach/uilogic/send_comment)

节点：获取评论框内容
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.comment.content = uiLogic.view.layoutPanel.panelItems.field_textbox.value;
```
#### [备注(NOTE_ATTACH)](module/crm/note_attach)的处理逻辑[发送评论(send_comment)](module/crm/note_attach/uilogic/send_comment)

节点：注入脚本代码
<p class="panel-title"><b>执行代码</b></p>

```javascript
console.log("ceSsasasa")
```
#### [备注(NOTE_ATTACH)](module/crm/note_attach)的处理逻辑[发送评论(send_comment)](module/crm/note_attach/uilogic/send_comment)

节点：清空评论框与评论id
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.view.layoutPanel.panelItems.field_textbox.value = '';
uiLogic.view.layoutPanel.panelItems.field_textbox.data.field_textbox = '';
uiLogic.view.edit_comment_id = null;
uiLogic.view.reply_comment_id = null;
uiLogic.editor.reply.value = null;
```
#### [收款记录(PAYEE)](module/crm/payee)的处理逻辑[收款记录保存之前(before_save_payee)](module/crm/payee/uilogic/before_save_payee)

节点：判断金额，是否提示
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
#### [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)的处理逻辑[导航到表格视图（统计图表导航）(exp_to_gridview)](module/crm/payee_statistic/uilogic/exp_to_gridview)

节点：注入脚本代码
<p class="panel-title"><b>执行代码</b></p>

```javascript
console.log("在这停顿")
```
#### [价格表(PRICE_BOOK)](module/crm/price_book)的处理逻辑[添加附件(add_attachment)](module/crm/price_book/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [产品(PRODUCT)](module/crm/product)的处理逻辑[添加附件(add_attachment)](module/crm/product/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [产品证书(PRODUCT_CERTIFICATE)](module/crm/product_certificate)的处理逻辑[添加附件(add_attachment)](module/crm/product_certificate/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [订单(PROJECT)](module/crm/project)的处理逻辑[添加附件(add_attachment)](module/crm/project/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [采购订单(PURCHASE_ORDER)](module/crm/purchase_order)的处理逻辑[添加附件(add_attachment)](module/crm/purchase_order/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [报价(QUOTE)](module/crm/quote)的处理逻辑[添加附件(add_attachment)](module/crm/quote/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [销售订单(SALES_ORDER)](module/crm/sales_order)的处理逻辑[添加附件(add_attachment)](module/crm/sales_order/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [解决方案(SOLUTION)](module/crm/solution)的处理逻辑[添加附件(add_attachment)](module/crm/solution/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [任务&活动(TASK)](module/crm/task)的处理逻辑[添加附件(add_attachment)](module/crm/task/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [用户(USER)](module/crm/user)的处理逻辑[修改密码（表单）(change_pas)](module/crm/user/uilogic/change_pas)

节点：校验表单
<p class="panel-title"><b>执行代码</b></p>

```javascript
(async function() { 
const bol = await uiLogic.form.validate();
if (bol) {
    ibiz.util.action.execAndResolved(
      'change_password',
      {
        context: uiLogic.form.context,
        params: uiLogic.form.params,
        data: [uiLogic.default],
        view: uiLogic.view,
      },
      uiLogic.form.model.appId,
    );
} else {
    ibiz.message.error('请检查表单填写！');
}
} )();
```
#### [供应商(VENDOR)](module/crm/vendor)的处理逻辑[添加附件(add_attachment)](module/crm/vendor/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const defaultData = uiLogic.grid.calcDefaultValue({}, true);
uiLogic.attach = uiLogic.files.map(item => 
    {
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            ...defaultData,
        }
    }
)
```
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[生成周报附件(generate_attachment)](module/crm/weeklies/uilogic/generate_attachment)

节点：下载周报附件
<p class="panel-title"><b>执行代码</b></p>

```javascript
const appDataEntity = await ibiz.hub.getAppDataEntity(
    view.model.appDataEntityId,
    context.srfappid,
);
const appDEPrint = appDataEntity.appDEPrints.find(print => {
    return print.id === 'print';
});
if (appDEPrint) {
    let requestUrl = '';
    if (
        context &&
        context[appDataEntity.codeName.toLowerCase()]
    ) {
        requestUrl += `/${appDataEntity.deapicodeName2}/printdata/${
            context[appDataEntity.codeName.toLowerCase()]
        }`;
    } else {
        throw new Error(ibiz.i18n.t('runtime.uiAction.dataPrimaryKey'));
    }
    const res = await ibiz.net.request(requestUrl, {
        method: 'get',
        responseType: 'blob',
        params: {
            srfprinttag: appDEPrint.codeName,
            ...params,
        },
    });
    if (res.ok) {
        uiLogic.file = res.data;
    } else {
        throw new Error(ibiz.i18n.t('runtime.uiAction.printFailure'));
    }
} else {
    throw new Error(ibiz.i18n.t('runtime.uiAction.physicalPrint'));
}
```
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[生成周报附件(generate_attachment)](module/crm/weeklies/uilogic/generate_attachment)

节点：上传周报附件
<p class="panel-title"><b>执行代码</b></p>

```javascript
 const urls = ibiz.util.file.calcFileUpDownUrl(context, params);
const files = uiLogic.file;
const reg = new RegExp(`(^| )ibzuaa-token=([^;]*)(;|$)`);
const arr = document.cookie.match(reg);
const headers = { Authorization: `Bearer ${arr[2]}` };
const result = await ibiz.util.file.fileUpload(
    urls.uploadUrl,
    uiLogic.file,
    headers,
);
uiLogic.attachment = result;
```
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[生成周报附件(generate_attachment)](module/crm/weeklies/uilogic/generate_attachment)

节点：绑定表单数据
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
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[打开新建周报编辑视图(open_new_edit)](module/crm/weeklies/uilogic/open_new_edit)

节点：获取表单属性
<p class="panel-title"><b>执行代码</b></p>

```javascript
var form_data = view.layoutPanel.panelItems.form.control.data;
uiLogic.default.date_scope = form_data.date_scope;
uiLogic.default.start_date = form_data.start_date;
uiLogic.default.end_date = form_data.end_date;
uiLogic.default.name = form_data.name;
uiLogic.default.owner = form_data.owner;

```




