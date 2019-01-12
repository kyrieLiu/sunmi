package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class OrderListScreenBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.ShoppingCarAdapterViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public OrderListScreenBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setItemViewModel((ys.app.pad.viewmodel.ShoppingCarAdapterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.pad.viewmodel.ShoppingCarAdapterViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.ShoppingCarAdapterViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.pad.viewmodel.ShoppingCarAdapterViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.pad.viewmodel.ShoppingCarAdapterViewModel ItemViewModel, int fieldId) {
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String stringValueOfItemViewModelModelCount = null;
        int itemViewModelModelIsGift = 0;
        ys.app.pad.viewmodel.ShoppingCarAdapterViewModel itemViewModel = mItemViewModel;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelVipPriceJavaLangString = null;
        ys.app.pad.model.SummitOrderInfo itemViewModelModel = null;
        int itemViewModelModelCount = 0;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelRealMoney = null;
        int int1ItemViewModelModelIsGiftViewVISIBLEViewGONE = 0;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelVipPrice = null;
        java.lang.String itemViewModelModelName = null;
        boolean int1ItemViewModelModelIsGift = false;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelRealMoneyJavaLangString = null;
        double itemViewModelModelRealMoney = 0.0;
        double itemViewModelModelVipPrice = 0.0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }


                if (itemViewModelModel != null) {
                    // read itemViewModel.model.isGift
                    itemViewModelModelIsGift = itemViewModelModel.getIsGift();
                    // read itemViewModel.model.count
                    itemViewModelModelCount = itemViewModelModel.getCount();
                    // read itemViewModel.model.name
                    itemViewModelModelName = itemViewModelModel.getName();
                    // read itemViewModel.model.realMoney
                    itemViewModelModelRealMoney = itemViewModelModel.getRealMoney();
                    // read itemViewModel.model.vipPrice
                    itemViewModelModelVipPrice = itemViewModelModel.getVipPrice();
                }


                // read 1 == itemViewModel.model.isGift
                int1ItemViewModelModelIsGift = (1) == (itemViewModelModelIsGift);
                // read String.valueOf(itemViewModel.model.count)
                stringValueOfItemViewModelModelCount = java.lang.String.valueOf(itemViewModelModelCount);
                // read AppUtil.formatStandardMoney(itemViewModel.model.realMoney)
                appUtilFormatStandardMoneyItemViewModelModelRealMoney = ys.app.pad.utils.AppUtil.formatStandardMoney(itemViewModelModelRealMoney);
                // read AppUtil.formatStandardMoney(itemViewModel.model.vipPrice)
                appUtilFormatStandardMoneyItemViewModelModelVipPrice = ys.app.pad.utils.AppUtil.formatStandardMoney(itemViewModelModelVipPrice);
            if((dirtyFlags & 0x7L) != 0) {
                if(int1ItemViewModelModelIsGift) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read 1 == itemViewModel.model.isGift ? View.VISIBLE : View.GONE
                int1ItemViewModelModelIsGiftViewVISIBLEViewGONE = ((int1ItemViewModelModelIsGift) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read (AppUtil.formatStandardMoney(itemViewModel.model.realMoney)) + ("元")
                appUtilFormatStandardMoneyItemViewModelModelRealMoneyJavaLangString = (appUtilFormatStandardMoneyItemViewModelModelRealMoney) + ("元");
                // read (AppUtil.formatStandardMoney(itemViewModel.model.vipPrice)) + ("元")
                appUtilFormatStandardMoneyItemViewModelModelVipPriceJavaLangString = (appUtilFormatStandardMoneyItemViewModelModelVipPrice) + ("元");
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelModelName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, stringValueOfItemViewModelModelCount);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, appUtilFormatStandardMoneyItemViewModelModelVipPriceJavaLangString);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, appUtilFormatStandardMoneyItemViewModelModelRealMoneyJavaLangString);
            this.mboundView5.setVisibility(int1ItemViewModelModelIsGiftViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static OrderListScreenBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static OrderListScreenBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<OrderListScreenBinding>inflate(inflater, ys.app.pad.R.layout.item_vice_order_list, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static OrderListScreenBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static OrderListScreenBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.item_vice_order_list, null, false), bindingComponent);
    }
    @NonNull
    public static OrderListScreenBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static OrderListScreenBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_vice_order_list_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new OrderListScreenBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): null
        flag 3 (0x4L): 1 == itemViewModel.model.isGift ? View.VISIBLE : View.GONE
        flag 4 (0x5L): 1 == itemViewModel.model.isGift ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}