export default {
  gridRowActiveMode: 2,
  xdataControlName: 'grid',
  loadDefault: true,
  deviewCodeName: 'close_view',
  deviewId: '5f2e529b13a3dde4e81dd39575971c6a',
  accUserMode: 2,
  capLanguageRes: {
    lanResTag: 'PAGE.CAPTION.SCHEDULE.CLOSE_VIEW',
  },
  caption: '已完成的任务&历史活动',
  codeName: 'schedule_close_view',
  appDataEntityId: 'crmweb.schedule',
  appViewEngines: [
    {
      engineCat: 'VIEW',
      engineType: 'GridView',
      id: 'engine',
    },
  ],
  appViewLogics: [
    {
      logicTrigger: 'CUSTOM',
      logicType: 'APPUILOGIC',
      builtinAppUILogic: {
        actionAfterWizard: 'DEFAULT',
        newDataAppView: {
          refAppViewId: 'crmweb.schedule_edit_view',
        },
        newDataAppViews: [
          {
            refMode: 'CALL',
            refAppViewId: 'crmweb.call_edit_view',
          },
          {
            refMode: 'EVENT',
            refAppViewId: 'crmweb.event_edit_view',
          },
          {
            refMode: 'RESERVATION',
            refAppViewId: 'crmweb.reservation_edit_view',
          },
          {
            refMode: 'TASK',
            refAppViewId: 'crmweb.task_task_edit_view',
          },
        ],
        wizardAppView: {
          refAppViewId: 'crmweb.schedule_index_pickup_view',
        },
        enableWizardAdd: true,
        appUILogicRefViews: [
          {
            refAppViewId: 'crmweb.schedule_index_pickup_view',
          },
          {
            refAppViewId: 'crmweb.schedule_edit_view',
          },
          {
            refMode: 'CALL',
            refAppViewId: 'crmweb.call_edit_view',
          },
          {
            refMode: 'EVENT',
            refAppViewId: 'crmweb.event_edit_view',
          },
          {
            refMode: 'RESERVATION',
            refAppViewId: 'crmweb.reservation_edit_view',
          },
          {
            refMode: 'TASK',
            refAppViewId: 'crmweb.task_task_edit_view',
          },
        ],
        builtinLogic: true,
        logicType: 'PREDEFINED',
        viewLogicType: 'APP_NEWDATA',
        id: '新建数据',
      },
      builtinLogic: true,
      id: 'newdata',
    },
    {
      logicTrigger: 'CUSTOM',
      logicType: 'APPUILOGIC',
      builtinAppUILogic: {
        openDataAppView: {
          refAppViewId: 'crmweb.schedule_redirect_view',
        },
        openDataAppViews: [
          {
            navigateContexts: [
              {
                key: 'CALL',
                value: 'SCHEDULE',
                name: 'CALL',
                id: 'call',
              },
            ],
            refMode: 'CALL',
            refAppViewId: 'crmweb.call_edit_view',
          },
          {
            navigateContexts: [
              {
                key: 'EVENT',
                value: 'SCHEDULE',
                name: 'EVENT',
                id: 'event',
              },
            ],
            refMode: 'EVENT',
            refAppViewId: 'crmweb.event_edit_view',
          },
          {
            navigateContexts: [
              {
                key: 'RESERVATION',
                value: 'SCHEDULE',
                name: 'RESERVATION',
                id: 'reservation',
              },
            ],
            refMode: 'RESERVATION',
            refAppViewId: 'crmweb.reservation_edit_view',
          },
          {
            navigateContexts: [
              {
                key: 'TASK',
                value: 'SCHEDULE',
                name: 'TASK',
                id: 'task',
              },
            ],
            refMode: 'TASK',
            refAppViewId: 'crmweb.task_task_edit_view',
          },
        ],
        editMode: true,
        appUILogicRefViews: [
          {
            refAppViewId: 'crmweb.schedule_redirect_view',
          },
          {
            navigateContexts: [
              {
                key: 'CALL',
                value: 'SCHEDULE',
                name: 'CALL',
                id: 'call',
              },
            ],
            refMode: 'CALL',
            refAppViewId: 'crmweb.call_edit_view',
          },
          {
            navigateContexts: [
              {
                key: 'EVENT',
                value: 'SCHEDULE',
                name: 'EVENT',
                id: 'event',
              },
            ],
            refMode: 'EVENT',
            refAppViewId: 'crmweb.event_edit_view',
          },
          {
            navigateContexts: [
              {
                key: 'RESERVATION',
                value: 'SCHEDULE',
                name: 'RESERVATION',
                id: 'reservation',
              },
            ],
            refMode: 'RESERVATION',
            refAppViewId: 'crmweb.reservation_edit_view',
          },
          {
            navigateContexts: [
              {
                key: 'TASK',
                value: 'SCHEDULE',
                name: 'TASK',
                id: 'task',
              },
            ],
            refMode: 'TASK',
            refAppViewId: 'crmweb.task_task_edit_view',
          },
        ],
        builtinLogic: true,
        logicType: 'PREDEFINED',
        viewLogicType: 'APP_OPENDATA',
        id: '打开数据',
      },
      builtinLogic: true,
      id: 'opendata',
    },
  ],
  appViewNavParams: [
    {
      key: 'n_owner_id_eq',
      value: 'principal_id',
      id: 'n_owner_id_eq',
    },
  ],
  appViewRefs: [
    {
      realTitle: '日程数据重定向视图',
      realTitleLanguageRes: {
        lanResTag: 'PAGE.TITLE.SCHEDULE.REDIRECTVIEW',
      },
      refAppViewId: 'crmweb.schedule_redirect_view',
      name: 'EDITDATA',
      id: 'editdata',
    },
    {
      realTitle: '日程编辑视图',
      realTitleLanguageRes: {
        lanResTag: 'PAGE.TITLE.SCHEDULE.EDITVIEW',
      },
      refAppViewId: 'crmweb.schedule_edit_view',
      name: 'NEWDATA',
      id: 'newdata',
    },
    {
      realTitle: '日程数据选择视图',
      realTitleLanguageRes: {
        lanResTag: 'PAGE.TITLE.SCHEDULE.INDEXPICKUPVIEW',
      },
      refAppViewId: 'crmweb.schedule_index_pickup_view',
      name: 'NEWDATAWIZARD',
      id: 'newdatawizard',
    },
    {
      realTitle: '通话编辑视图',
      refAppViewId: 'crmweb.call_edit_view',
      name: 'NEWDATA:CALL',
      id: 'newdata:call',
    },
    {
      realTitle: '会议编辑视图',
      refAppViewId: 'crmweb.event_edit_view',
      name: 'NEWDATA:EVENT',
      id: 'newdata:event',
    },
    {
      realTitle: '预留编辑视图',
      realTitleLanguageRes: {
        lanResTag: 'PAGE.TITLE.RESERVATION.EDITVIEW',
      },
      refAppViewId: 'crmweb.reservation_edit_view',
      name: 'NEWDATA:RESERVATION',
      id: 'newdata:reservation',
    },
    {
      realTitle: '任务编辑视图',
      realTitleLanguageRes: {
        lanResTag: 'PAGE.TITLE.TASK.EDIT_VIEW',
      },
      refAppViewId: 'crmweb.task_task_edit_view',
      name: 'NEWDATA:TASK',
      id: 'newdata:task',
    },
    {
      navigateContexts: [
        {
          key: 'CALL',
          value: 'SCHEDULE',
          name: 'CALL',
          id: 'call',
        },
      ],
      realTitle: '通话编辑视图',
      refAppViewId: 'crmweb.call_edit_view',
      name: 'EDITDATA:CALL',
      id: 'editdata:call',
    },
    {
      navigateContexts: [
        {
          key: 'EVENT',
          value: 'SCHEDULE',
          name: 'EVENT',
          id: 'event',
        },
      ],
      realTitle: '会议编辑视图',
      refAppViewId: 'crmweb.event_edit_view',
      name: 'EDITDATA:EVENT',
      id: 'editdata:event',
    },
    {
      navigateContexts: [
        {
          key: 'RESERVATION',
          value: 'SCHEDULE',
          name: 'RESERVATION',
          id: 'reservation',
        },
      ],
      realTitle: '预留编辑视图',
      realTitleLanguageRes: {
        lanResTag: 'PAGE.TITLE.RESERVATION.EDITVIEW',
      },
      refAppViewId: 'crmweb.reservation_edit_view',
      name: 'EDITDATA:RESERVATION',
      id: 'editdata:reservation',
    },
    {
      navigateContexts: [
        {
          key: 'TASK',
          value: 'SCHEDULE',
          name: 'TASK',
          id: 'task',
        },
      ],
      realTitle: '任务编辑视图',
      realTitleLanguageRes: {
        lanResTag: 'PAGE.TITLE.TASK.EDIT_VIEW',
      },
      refAppViewId: 'crmweb.task_task_edit_view',
      name: 'EDITDATA:TASK',
      id: 'editdata:task',
    },
  ],
  controls: [
    {
      aggMode: 'NONE',
      columnEnableFilter: 2,
      groupMode: 'NONE',
      groupStyle: 'DEFAULT',
      degridColumns: [
        {
          clconvertMode: 'NONE',
          dataItemName: 'name',
          excelCaption: '名称',
          appDEFieldId: 'name',
          valueType: 'SIMPLE',
          aggMode: 'NONE',
          align: 'LEFT',
          capLanguageRes: {
            lanResTag: 'DEF.LNAME.NAME',
          },
          caption: '名称',
          codeName: 'name',
          columnType: 'DEFGRIDCOLUMN',
          noPrivDisplayMode: 1,
          width: 180,
          widthUnit: 'PX',
          enableSort: true,
          id: 'name',
        },
        {
          clconvertMode: 'NONE',
          dataItemName: 'update_time',
          excelCaption: '更新时间',
          appDEFieldId: 'update_time',
          valueFormat: 'YYYY-MM-DD HH:mm:ss',
          valueType: 'SIMPLE',
          aggMode: 'NONE',
          align: 'LEFT',
          capLanguageRes: {
            lanResTag: 'DEF.LNAME.UPDATE_TIME',
          },
          caption: '更新时间',
          codeName: 'update_time',
          columnType: 'DEFGRIDCOLUMN',
          noPrivDisplayMode: 1,
          width: 180,
          widthUnit: 'PX',
          enableSort: true,
          id: 'update_time',
        },
        {
          clconvertMode: 'FRONT',
          dataItemName: 'update_man',
          excelCaption: '更新人',
          appCodeListId: 'crmweb.crm__sysoperator',
          appDEFieldId: 'update_man',
          valueType: 'SIMPLE',
          aggMode: 'NONE',
          align: 'LEFT',
          capLanguageRes: {
            lanResTag: 'DEF.LNAME.UPDATE_MAN',
          },
          caption: '更新人',
          codeName: 'update_man',
          columnType: 'DEFGRIDCOLUMN',
          noPrivDisplayMode: 1,
          width: 180,
          widthUnit: 'PX',
          enableSort: true,
          id: 'update_man',
        },
      ],
      degridDataItems: [
        {
          appDEFieldId: 'name',
          valueType: 'SIMPLE',
          dataType: 25,
          id: 'name',
        },
        {
          format: 'YYYY-MM-DD HH:mm:ss',
          appDEFieldId: 'update_time',
          valueType: 'SIMPLE',
          dataType: 5,
          id: 'update_time',
        },
        {
          appDEFieldId: 'update_man',
          valueType: 'SIMPLE',
          dataType: 25,
          id: 'update_man',
        },
        {
          appDEFieldId: 'id',
          valueType: 'SIMPLE',
          dataType: 25,
          id: 'srfkey',
        },
        {
          appDEFieldId: 'id',
          valueType: 'SIMPLE',
          dataType: 25,
          id: 'srfdataaccaction',
        },
        {
          appDEFieldId: 'type',
          valueType: 'SIMPLE',
          dataType: 25,
          id: 'srfdatatype',
        },
        {
          appDEFieldId: 'type',
          valueType: 'SIMPLE',
          dataType: 25,
          id: 'type',
        },
        {
          appDEFieldId: 'name',
          valueType: 'SIMPLE',
          dataType: 25,
          id: 'srfmajortext',
        },
      ],
      degridEditItems: [
        {
          caption: '标识',
          codeName: 'srfkey',
          enableCond: 3,
          appDEFieldId: 'id',
          editor: {
            editorType: 'HIDDEN',
            valueType: 'SIMPLE',
            editable: true,
            id: 'srfkey',
          },
          allowEmpty: true,
          id: 'srfkey',
        },
      ],
      pagingMode: 1,
      pagingSize: 20,
      sortMode: 'REMOTE',
      enableCustomized: true,
      enablePagingBar: true,
      navViewPos: 'NONE',
      fetchControlAction: {
        appDEMethodId: 'fetch_close',
        appDataEntityId: 'crmweb.schedule',
        id: 'fetch',
      },
      removeControlAction: {
        appDEMethodId: 'remove',
        appDataEntityId: 'crmweb.schedule',
        id: 'remove',
      },
      autoLoad: true,
      showBusyIndicator: true,
      codeName: 'main',
      controlType: 'GRID',
      logicName: '主表格',
      appDataEntityId: 'crmweb.schedule',
      controlParam: {
        id: 'grid',
      },
      modelId: 'e5c8e0bf01234c7a3167fc7366ab0f49',
      modelType: 'PSDEGRID',
      name: 'grid',
      id: 'crmweb.schedule.main',
    },
    {
      searchButtonStyle: 'DEFAULT',
      deformPages: [
        {
          layout: {
            columnCount: 24,
            layout: 'TABLE_24COL',
          },
          capLanguageRes: {
            lanResTag: 'CONTROL.DEFORM.SCHEDULE.DEFAULT.FORMPAGE.FORMPAGE1',
          },
          caption: '常规条件',
          codeName: 'formpage1',
          detailStyle: 'DEFAULT',
          detailType: 'FORMPAGE',
          id: 'formpage1',
        },
      ],
      layout: {
        columnCount: 24,
        layout: 'TABLE_24COL',
      },
      tabHeaderPos: 'TOP',
      noTabHeader: true,
      autoLoad: true,
      showBusyIndicator: true,
      codeName: 'default',
      controlType: 'SEARCHFORM',
      logicName: '默认搜索表单',
      appDataEntityId: 'crmweb.schedule',
      controlParam: {
        id: 'searchform',
      },
      modelId: '2343b90904545b78287e05f477fcf1fd',
      modelType: 'PSDEFORM_SEARCHFORM',
      name: 'searchform',
      id: 'crmweb.schedule.default',
    },
    {
      groupMode: 'SINGLE',
      quickSearchMode: 1,
      enableQuickSearch: true,
      controlType: 'SEARCHBAR',
      appDataEntityId: 'crmweb.schedule',
      controlParam: {
        id: 'searchbar',
      },
      id: 'searchbar',
    },
    {
      capLanguageRes: {
        lanResTag: 'PAGE.CAPTION.SCHEDULE.CLOSE_VIEW',
      },
      caption: '已完成的任务&历史活动',
      codeName: 'close_view_captionbar',
      controlType: 'CAPTIONBAR',
      appDataEntityId: 'crmweb.schedule',
      controlParam: {},
      name: 'captionbar',
      id: 'close_view_captionbar',
    },
  ],
  viewLayoutPanel: {
    layoutBodyOnly: true,
    useDefaultLayout: true,
    layoutPanel: true,
    codeName: 'layoutpanel',
    controlStyle: 'APPDEGRIDVIEW',
    controlType: 'VIEWLAYOUTPANEL',
    appDataEntityId: 'crmweb.schedule',
    controlParam: {},
    id: 'layoutpanel',
  },
  title: '已完成的任务&历史活动',
  titleLanguageRes: {
    lanResTag: 'PAGE.TITLE.SCHEDULE.CLOSE_VIEW',
  },
  viewStyle: 'DEFAULT',
  viewType: 'DEGRIDVIEW',
  enableDP: true,
  showCaptionBar: true,
  modelId: 'c11484ac7cdac28af7226a2a1787e496',
  modelType: 'PSAPPDEVIEW',
  name: 'scheduleclose_view',
  id: 'crmweb.schedule_close_view',
};
