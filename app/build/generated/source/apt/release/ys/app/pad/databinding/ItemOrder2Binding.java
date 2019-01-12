package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemOrder2Binding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_qudan_orderNo, 11);
    }
    // views
    @NonNull
    public final android.support.v7.widget.RecyclerView childRecyclerView;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.Button mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    @NonNull
    public final android.widget.TextView numTv;
    @NonNull
    public final android.widget.LinearLayout parentLl;
    @NonNull
    public final android.widget.LinearLayout rootView;
    @NonNull
    public final android.widget.Button takeOffTv;
    @NonNull
    public final android.widget.TextView tvItemOrderTime;
    @NonNull
    public final android.widget.TextView tvQudanOrderNo;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.Order2ItemViewModel mItemViewModel;
    // values
    // listeners
    private OnClickListenerImpl mItemViewModelClickDeleteButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mItemViewModelClickPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemOrder2Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds);
        this.childRecyclerView = (android.support.v7.widget.RecyclerView) bindings[10];
        this.childRecyclerView.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.Button) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.numTv = (android.widget.TextView) bindings[6];
        this.numTv.setTag(null);
        this.parentLl = (android.widget.LinearLayout) bindings[1];
        this.parentLl.setTag(null);
        this.rootView = (android.widget.LinearLayout) bindings[0];
        this.rootView.setTag(null);
        this.takeOffTv = (android.widget.Button) bindings[7];
        this.takeOffTv.setTag(null);
        this.tvItemOrderTime = (android.widget.TextView) bindings[2];
        this.tvItemOrderTime.setTag(null);
        this.tvQudanOrderNo = (android.widget.TextView) bindings[11];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setItemViewModel((ys.app.pad.viewmodel.Order2ItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.pad.viewmodel.Order2ItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.Order2ItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.pad.viewmodel.Order2ItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelModel((ys.app.pad.model.OrderInfo) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.pad.viewmodel.Order2ItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.pad.model.OrderInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.isClick) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.expand) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        int itemViewModelModelOrderDetailedListSize = 0;
        java.lang.String itemViewModelModelVipName = null;
        ys.app.pad.viewmodel.Order2ItemViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelModelOrderNo = null;
        double itemViewModelModelRealAmt = 0.0;
        java.lang.String mboundView3AndroidStringVipNameItemViewModelModelVipName = null;
        int itemViewModelModelVipUserId = 0;
        android.view.View.OnClickListener itemViewModelClickDeleteButtonAndroidViewViewOnClickListener = null;
        java.lang.String dateUtilLongFormatDate3ItemViewModelModelOrderTime = null;
        ys.app.pad.model.OrderInfo itemViewModelModel = null;
        java.util.List<ys.app.pad.model.OrderInfo.OrderDetailedListBean> itemViewModelModelOrderDetailedList = null;
        java.lang.String itemViewModelModelVipUserIdInt0MboundView3AndroidStringVipNameItemViewModelModelVipNameMboundView3AndroidStringNormalCustom = null;
        java.lang.String itemViewModelModelOrderDetailedListSizeJavaLangString = null;
        boolean itemViewModelModelExpand = false;
        long itemViewModelModelOrderTime = 0L;
        android.view.View.OnClickListener itemViewModelClickPayAndroidViewViewOnClickListener = null;
        int itemViewModelModelIsClick = 0;
        boolean itemViewModelModelVipUserIdInt0 = false;
        java.lang.String mboundView8AndroidStringFuhaoAppUtilFormatStandardMoneyItemViewModelModelRealAmt = null;
        android.view.View.OnClickListener itemViewModelClickOpenOrCloseAndroidViewViewOnClickListener = null;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelRealAmt = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x11L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel::clickDeleteButton
                        itemViewModelClickDeleteButtonAndroidViewViewOnClickListener = (((mItemViewModelClickDeleteButtonAndroidViewViewOnClickListener == null) ? (mItemViewModelClickDeleteButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mItemViewModelClickDeleteButtonAndroidViewViewOnClickListener).setValue(itemViewModel));
                        // read itemViewModel::clickPay
                        itemViewModelClickPayAndroidViewViewOnClickListener = (((mItemViewModelClickPayAndroidViewViewOnClickListener == null) ? (mItemViewModelClickPayAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mItemViewModelClickPayAndroidViewViewOnClickListener).setValue(itemViewModel));
                        // read itemViewModel::clickOpenOrClose
                        itemViewModelClickOpenOrCloseAndroidViewViewOnClickListener = (((mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener == null) ? (mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener).setValue(itemViewModel));
                    }
            }

                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }
                updateRegistration(1, itemViewModelModel);

            if ((dirtyFlags & 0x13L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.orderNo
                        itemViewModelModelOrderNo = itemViewModelModel.getOrderNo();
                        // read itemViewModel.model.realAmt
                        itemViewModelModelRealAmt = itemViewModelModel.getRealAmt();
                        // read itemViewModel.model.vipUserId
                        itemViewModelModelVipUserId = itemViewModelModel.getVipUserId();
                        // read itemViewModel.model.orderTime
                        itemViewModelModelOrderTime = itemViewModelModel.getOrderTime();
                    }


                    // read AppUtil.formatStandardMoney(itemViewModel.model.realAmt)
                    appUtilFormatStandardMoneyItemViewModelModelRealAmt = ys.app.pad.utils.AppUtil.formatStandardMoney(itemViewModelModelRealAmt);
                    // read itemViewModel.model.vipUserId > 0
                    itemViewModelModelVipUserIdInt0 = (itemViewModelModelVipUserId) > (0);
                    // read DateUtil.longFormatDate3(itemViewModel.model.orderTime)
                    dateUtilLongFormatDate3ItemViewModelModelOrderTime = ys.app.pad.utils.DateUtil.longFormatDate3(itemViewModelModelOrderTime);
                if((dirtyFlags & 0x13L) != 0) {
                    if(itemViewModelModelVipUserIdInt0) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read (@android:string/fuhao) + (AppUtil.formatStandardMoney(itemViewModel.model.realAmt))
                    mboundView8AndroidStringFuhaoAppUtilFormatStandardMoneyItemViewModelModelRealAmt = (mboundView8.getResources().getString(R.string.fuhao)) + (appUtilFormatStandardMoneyItemViewModelModelRealAmt);
            }

                if (itemViewModelModel != null) {
                    // read itemViewModel.model.orderDetailedList
                    itemViewModelModelOrderDetailedList = itemViewModelModel.getOrderDetailedList();
                    // read itemViewModel.model.expand
                    itemViewModelModelExpand = itemViewModelModel.isExpand();
                    // read itemViewModel.model.isClick
                    itemViewModelModelIsClick = itemViewModelModel.getIsClick();
                }


                if (itemViewModelModelOrderDetailedList != null) {
                    // read itemViewModel.model.orderDetailedList.size()
                    itemViewModelModelOrderDetailedListSize = itemViewModelModelOrderDetailedList.size();
                }

            if ((dirtyFlags & 0x13L) != 0) {

                    // read (itemViewModel.model.orderDetailedList.size()) + ("")
                    itemViewModelModelOrderDetailedListSizeJavaLangString = (itemViewModelModelOrderDetailedListSize) + ("");
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (itemViewModelModel != null) {
                    // read itemViewModel.model.vipName
                    itemViewModelModelVipName = itemViewModelModel.getVipName();
                }


                // read (@android:string/vipName) + (itemViewModel.model.vipName)
                mboundView3AndroidStringVipNameItemViewModelModelVipName = (mboundView3.getResources().getString(R.string.vipName)) + (itemViewModelModelVipName);
        }

        if ((dirtyFlags & 0x13L) != 0) {

                // read itemViewModel.model.vipUserId > 0 ? (@android:string/vipName) + (itemViewModel.model.vipName) : @android:string/normalCustom
                itemViewModelModelVipUserIdInt0MboundView3AndroidStringVipNameItemViewModelModelVipNameMboundView3AndroidStringNormalCustom = ((itemViewModelModelVipUserIdInt0) ? (mboundView3AndroidStringVipNameItemViewModelModelVipName) : (mboundView3.getResources().getString(R.string.normalCustom)));
        }
        // batch finished
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            ys.app.pad.utils.PetBindingUtil.setChildAdapterData(this.childRecyclerView, itemViewModelModelOrderDetailedList);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemViewModelModelVipUserIdInt0MboundView3AndroidStringVipNameItemViewModelModelVipNameMboundView3AndroidStringNormalCustom);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, itemViewModelModelOrderNo);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, mboundView8AndroidStringFuhaoAppUtilFormatStandardMoneyItemViewModelModelRealAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.numTv, itemViewModelModelOrderDetailedListSizeJavaLangString);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemOrderTime, dateUtilLongFormatDate3ItemViewModelModelOrderTime);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(itemViewModelClickDeleteButtonAndroidViewViewOnClickListener);
            this.parentLl.setOnClickListener(itemViewModelClickOpenOrCloseAndroidViewViewOnClickListener);
            this.takeOffTv.setOnClickListener(itemViewModelClickPayAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x1fL) != 0) {
            // api target 1

            ys.app.pad.utils.PetBindingUtil.setIsVis(this.mboundView9, itemViewModelModelExpand, itemViewModelModelIsClick, itemViewModelModelOrderDetailedListSize);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.Order2ItemViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.Order2ItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickDeleteButton(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.Order2ItemViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.pad.viewmodel.Order2ItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickPay(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.Order2ItemViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.pad.viewmodel.Order2ItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickOpenOrClose(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemOrder2Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemOrder2Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemOrder2Binding>inflate(inflater, ys.app.pad.R.layout.item_order2, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemOrder2Binding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemOrder2Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.item_order2, null, false), bindingComponent);
    }
    @NonNull
    public static ItemOrder2Binding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemOrder2Binding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_order2_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemOrder2Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): itemViewModel.model.isClick
        flag 3 (0x4L): itemViewModel.model.expand
        flag 4 (0x5L): null
        flag 5 (0x6L): itemViewModel.model.vipUserId > 0 ? (@android:string/vipName) + (itemViewModel.model.vipName) : @android:string/normalCustom
        flag 6 (0x7L): itemViewModel.model.vipUserId > 0 ? (@android:string/vipName) + (itemViewModel.model.vipName) : @android:string/normalCustom
    flag mapping end*/
    //end
}