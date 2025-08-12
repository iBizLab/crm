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
