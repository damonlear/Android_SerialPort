package com.pemt.androidserialport.activity;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.pemt.androidserialport.bean.MessageBean;
import java.util.ArrayList;

/**
 * author： pemt
 * date:    2018/5/26
 * desc:
 */
public interface MainContract {

    interface IView {
        void setOpen(boolean isOpen);

        void setLeftData(ArrayList<MultiItemEntity> list);

        void addData(MessageBean messageBean);

        void showPermissionDialog();

        String getEditText();
    }

    interface IPresenter {

    }

}
