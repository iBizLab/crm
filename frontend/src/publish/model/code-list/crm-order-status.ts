export default {
  codeListTag: 'crm__order_status',
  codeListType: 'STATIC',
  codeName: 'crm__order_status',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'item_10',
      sysCss: {
        cssName: 'green-span',
      },
      text: '在建',
      textCls: 'green-span',
      value: '10',
      id: 'item_10',
    },
    {
      codeName: 'item_20',
      sysCss: {
        cssName: 'grey-span',
      },
      text: '已关闭',
      textCls: 'grey-span',
      value: '20',
      id: 'item_20',
    },
  ],
  enableCache: true,
  name: '订单状态',
  id: 'crmweb.crm__order_status',
};
