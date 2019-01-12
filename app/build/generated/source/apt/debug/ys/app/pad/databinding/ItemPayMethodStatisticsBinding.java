package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPayMethodStatisticsBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_item_static_payMethod, 3);
        sViewsWithIds.put(R.id.iv_item_statistic_icon, 4);
    }
    // views
    @NonNull
    public final android.widget.ImageView ivItemStatisticIcon;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    public final android.widget.RelativeLayout rlItemStaticPayMethod;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    @NonNull
    public final android.widget.TextView tvItemStatisticName;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.PayMethodStatisticsItemViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPayMethodStatisticsBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.ivItemStatisticIcon = (android.widget.ImageView) bindings[4];
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.rlItemStaticPayMethod = (android.widget.RelativeLayout) bindings[3];
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        this.tvItemStatisticName = (android.widget.TextView) bindings[1];
        this.tvItemStatisticName.setTag(null);
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
            setItemViewModel((ys.app.pad.viewmodel.PayMethodStatisticsItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.pad.viewmodel.PayMethodStatisticsItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.PayMethodStatisticsItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.pad.viewmodel.PayMethodStatisticsItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.pad.viewmodel.PayMethodStatisticsItemViewModel ItemViewModel, int fieldId) {
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
        ys.app.pad.viewmodel.PayMethodStatisticsItemViewModel itemViewModel = mItemViewModel;
        java.lang.String appUtilFormatStandardMoneyStringValueOfItemViewModelModelTotalAmtMboundView2AndroidStringYuan = null;
        java.lang.String stringValueOfItemViewModelModelTotalAmt = null;
        ys.app.pad.model.StatisticsDataInfo.PayMethodListBean itemViewModelModel = null;
        double itemViewModelModelTotalAmt = 0.0;
        java.lang.String appUtilFormatStandardMoneyStringValueOfItemViewModelModelTotalAmt = null;
        java.lang.String itemViewModelModelName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }


                if (itemViewModelModel != null) {
                    // read itemViewModel.model.totalAmt
                    itemViewModelModelTotalAmt = itemViewModelModel.getTotalAmt();
                    // read itemViewModel.model.name
                    itemViewModelModelName = itemViewModelModel.getName();
                }


                // read String.valueOf(itemViewModel.model.totalAmt)
                stringValueOfItemViewModelModelTotalAmt = java.lang.String.valueOf(itemViewModelModelTotalAmt);


                // read AppUtil.formatStandardMoney(String.valueOf(itemViewModel.model.totalAmt))
                appUtilFormatStandardMoneyStringValueOfItemViewModelModelTotalAmt = ys.app.pad.utils.AppUtil.formatStandardMoney(stringValueOfItemViewModelModelTotalAmt);


                // read (AppUtil.formatStandardMoney(String.valueOf(itemViewModel.model.totalAmt))) + (@android:string/yuan)
                appUtilFormatStandardMoneyStringValueOfItemViewModelModelTotalAmtMboundView2AndroidStringYuan = (appUtilFormatStandardMoneyStringValueOfItemViewModelModelTotalAmt) + (mboundView2.getResources().getString(R.string.yuan));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, appUtilFormatStandardMoneyStringValueOfItemViewModelModelTotalAmtMboundView2AndroidStringYuan);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemStatisticName, itemViewModelModelName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemPayMethodStatisticsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPayMethodStatisticsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemPayMethodStatisticsBinding>inflate(inflater, ys.app.pad.R.layout.item_paymethod_statistics, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemPayMethodStatisticsBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPayMethodStatisticsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.item_paymethod_statistics, null, false), bindingComponent);
    }
    @NonNull
    public static ItemPayMethodStatisticsBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemPayMethodStatisticsBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_paymethod_statistics_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemPayMethodStatisticsBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.model
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}