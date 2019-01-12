package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemConfirmCheckOutBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.confirm_ll, 11);
        sViewsWithIds.put(R.id.up_rl, 12);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout confirmLl;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    @NonNull
    public final android.widget.TextView nameTv;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    @NonNull
    public final android.widget.RelativeLayout upRl;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.ConfirmCheckOutItemViewModel mItemViewModel;
    // values
    // listeners
    private OnClickListenerImpl mItemViewModelClickPayAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemConfirmCheckOutBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 7);
        final Object[] bindings = mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds);
        this.confirmLl = (android.widget.LinearLayout) bindings[11];
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.nameTv = (android.widget.TextView) bindings[1];
        this.nameTv.setTag(null);
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        this.upRl = (android.widget.RelativeLayout) bindings[12];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.itemViewModel == variableId) {
            setItemViewModel((ys.app.pad.viewmodel.ConfirmCheckOutItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.pad.viewmodel.ConfirmCheckOutItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.ConfirmCheckOutItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.pad.viewmodel.ConfirmCheckOutItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelType((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeItemViewModelObAnimal4Name((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeItemViewModelObAnimal1Name((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeItemViewModelObAnimal2Name((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeItemViewModelObAnimal3Name((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeItemViewModelModel((ys.app.pad.model.VipInfo) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.pad.viewmodel.ConfirmCheckOutItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelType(android.databinding.ObservableField<java.lang.String> ItemViewModelType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObAnimal4Name(android.databinding.ObservableField<java.lang.String> ItemViewModelObAnimal4Name, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObAnimal1Name(android.databinding.ObservableField<java.lang.String> ItemViewModelObAnimal1Name, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObAnimal2Name(android.databinding.ObservableField<java.lang.String> ItemViewModelObAnimal2Name, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObAnimal3Name(android.databinding.ObservableField<java.lang.String> ItemViewModelObAnimal3Name, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.pad.model.VipInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelMoneyMboundView7AndroidStringYuan = null;
        java.lang.String itemViewModelObAnimal1NameGet = null;
        ys.app.pad.viewmodel.ConfirmCheckOutItemViewModel itemViewModel = mItemViewModel;
        android.databinding.ObservableField<java.lang.String> itemViewModelType = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelObAnimal4Name = null;
        java.lang.String itemViewModelObAnimal2NameGet = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelObAnimal1Name = null;
        java.lang.String itemViewModelModelPhone = null;
        java.lang.String itemViewModelModelCardNo = null;
        java.lang.String itemViewModelTypeGet = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelObAnimal2Name = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelObAnimal3Name = null;
        java.lang.String itemViewModelObAnimal3NameGet = null;
        ys.app.pad.model.VipInfo itemViewModelModel = null;
        double itemViewModelModelMoney = 0.0;
        java.lang.String itemViewModelModelTypeName = null;
        android.view.View.OnClickListener itemViewModelClickPayAndroidViewViewOnClickListener = null;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelMoney = null;
        java.lang.String itemViewModelModelName = null;
        java.lang.String itemViewModelObAnimal4NameGet = null;
        java.lang.String javaLangStringNOItemViewModelModelCardNo = null;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0x83L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.type
                        itemViewModelType = itemViewModel.type;
                    }
                    updateRegistration(1, itemViewModelType);


                    if (itemViewModelType != null) {
                        // read itemViewModel.type.get()
                        itemViewModelTypeGet = itemViewModelType.get();
                    }
            }
            if ((dirtyFlags & 0x85L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obAnimal4Name
                        itemViewModelObAnimal4Name = itemViewModel.obAnimal4Name;
                    }
                    updateRegistration(2, itemViewModelObAnimal4Name);


                    if (itemViewModelObAnimal4Name != null) {
                        // read itemViewModel.obAnimal4Name.get()
                        itemViewModelObAnimal4NameGet = itemViewModelObAnimal4Name.get();
                    }
            }
            if ((dirtyFlags & 0x89L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obAnimal1Name
                        itemViewModelObAnimal1Name = itemViewModel.obAnimal1Name;
                    }
                    updateRegistration(3, itemViewModelObAnimal1Name);


                    if (itemViewModelObAnimal1Name != null) {
                        // read itemViewModel.obAnimal1Name.get()
                        itemViewModelObAnimal1NameGet = itemViewModelObAnimal1Name.get();
                    }
            }
            if ((dirtyFlags & 0x91L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obAnimal2Name
                        itemViewModelObAnimal2Name = itemViewModel.obAnimal2Name;
                    }
                    updateRegistration(4, itemViewModelObAnimal2Name);


                    if (itemViewModelObAnimal2Name != null) {
                        // read itemViewModel.obAnimal2Name.get()
                        itemViewModelObAnimal2NameGet = itemViewModelObAnimal2Name.get();
                    }
            }
            if ((dirtyFlags & 0xa1L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obAnimal3Name
                        itemViewModelObAnimal3Name = itemViewModel.obAnimal3Name;
                    }
                    updateRegistration(5, itemViewModelObAnimal3Name);


                    if (itemViewModelObAnimal3Name != null) {
                        // read itemViewModel.obAnimal3Name.get()
                        itemViewModelObAnimal3NameGet = itemViewModelObAnimal3Name.get();
                    }
            }
            if ((dirtyFlags & 0xc1L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }
                    updateRegistration(6, itemViewModelModel);


                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.phone
                        itemViewModelModelPhone = itemViewModelModel.getPhone();
                        // read itemViewModel.model.cardNo
                        itemViewModelModelCardNo = itemViewModelModel.getCardNo();
                        // read itemViewModel.model.money
                        itemViewModelModelMoney = itemViewModelModel.getMoney();
                        // read itemViewModel.model.typeName
                        itemViewModelModelTypeName = itemViewModelModel.getTypeName();
                        // read itemViewModel.model.name
                        itemViewModelModelName = itemViewModelModel.getName();
                    }


                    // read ("NO:") + (itemViewModel.model.cardNo)
                    javaLangStringNOItemViewModelModelCardNo = ("NO:") + (itemViewModelModelCardNo);
                    // read AppUtil.formatStandardMoney(itemViewModel.model.money)
                    appUtilFormatStandardMoneyItemViewModelModelMoney = ys.app.pad.utils.AppUtil.formatStandardMoney(itemViewModelModelMoney);


                    // read (AppUtil.formatStandardMoney(itemViewModel.model.money)) + (@android:string/yuan)
                    appUtilFormatStandardMoneyItemViewModelModelMoneyMboundView7AndroidStringYuan = (appUtilFormatStandardMoneyItemViewModelModelMoney) + (mboundView7.getResources().getString(R.string.yuan));
            }
            if ((dirtyFlags & 0x81L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel::clickPay
                        itemViewModelClickPayAndroidViewViewOnClickListener = (((mItemViewModelClickPayAndroidViewViewOnClickListener == null) ? (mItemViewModelClickPayAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mItemViewModelClickPayAndroidViewViewOnClickListener).setValue(itemViewModel));
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x81L) != 0) {
            // api target 1

            this.mboundView10.setOnClickListener(itemViewModelClickPayAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x83L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, itemViewModelTypeGet);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemViewModelModelPhone);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, appUtilFormatStandardMoneyItemViewModelModelMoneyMboundView7AndroidStringYuan);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, javaLangStringNOItemViewModelModelCardNo);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, itemViewModelModelTypeName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameTv, itemViewModelModelName);
        }
        if ((dirtyFlags & 0x89L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelObAnimal1NameGet);
        }
        if ((dirtyFlags & 0x91L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, itemViewModelObAnimal2NameGet);
        }
        if ((dirtyFlags & 0xa1L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, itemViewModelObAnimal3NameGet);
        }
        if ((dirtyFlags & 0x85L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, itemViewModelObAnimal4NameGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.ConfirmCheckOutItemViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.ConfirmCheckOutItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickPay(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemConfirmCheckOutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemConfirmCheckOutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemConfirmCheckOutBinding>inflate(inflater, ys.app.pad.R.layout.item_confirm_check_out, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemConfirmCheckOutBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemConfirmCheckOutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.item_confirm_check_out, null, false), bindingComponent);
    }
    @NonNull
    public static ItemConfirmCheckOutBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemConfirmCheckOutBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_confirm_check_out_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemConfirmCheckOutBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.type
        flag 2 (0x3L): itemViewModel.obAnimal4Name
        flag 3 (0x4L): itemViewModel.obAnimal1Name
        flag 4 (0x5L): itemViewModel.obAnimal2Name
        flag 5 (0x6L): itemViewModel.obAnimal3Name
        flag 6 (0x7L): itemViewModel.model
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}