package com.juzix.wallet.component.ui.contract;

import com.juzix.wallet.component.ui.base.IPresenter;
import com.juzix.wallet.component.ui.base.IView;

import java.util.ArrayList;

public class VerificationMnemonicContract {

    public static class DataEntity {
        private boolean checked;
        private String  mnemonic;

        private DataEntity(Builder builder) {
            setChecked(builder.checked);
            setMnemonic(builder.mnemonic);
        }

        public void setChecked(boolean checked) {
            this.checked = checked;
        }

        public String getMnemonic() {
            return mnemonic;
        }

        public void setMnemonic(String mnemonic) {
            this.mnemonic = mnemonic;
        }

        public boolean isChecked() {
            return checked;
        }


        public static final class Builder {
            private boolean checked;
            private String  mnemonic;

            public Builder() {
            }

            public Builder checked(boolean val) {
                checked = val;
                return this;
            }

            public Builder mnemonic(String val) {
                mnemonic = val;
                return this;
            }

            public DataEntity build() {
                return new DataEntity(this);
            }
        }
    }

    public interface View extends IView {
        void showAllList(ArrayList<DataEntity> list);

        void showCheckedList(ArrayList<DataEntity> list);

        void showDisclaimerDialog();

        void showBackupFailedDialog();

        String getMnemonicFromIntent();

        void setCompletedBtnEnable(boolean enable);

        void setClearBtnEnable(boolean enable);
    }

    public interface Presenter extends IPresenter<View> {
        void init();

        void checkAllListItem(int index);

        void uncheckItem(int index);

        void emptyChecked();

        void submit();
    }
}
