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
