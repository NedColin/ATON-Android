package com.juzix.wallet.component.ui.contract;

import com.juzix.wallet.component.ui.base.IPresenter;
import com.juzix.wallet.component.ui.base.IView;
import com.juzix.wallet.entity.SharedWalletEntity;

import java.util.ArrayList;

public class SharedWalletManagerContract {

    public interface View extends IView {
        void showList(ArrayList<SharedWalletEntity> walletEntityList);
    }

    public interface Presenter extends IPresenter<View> {
        void refresh();
        void createWallet();
        void addWallet();
    }
}
