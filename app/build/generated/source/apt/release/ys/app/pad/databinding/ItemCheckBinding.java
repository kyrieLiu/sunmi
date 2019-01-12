package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCheckBinding extends android.databinding.ViewDataBinding  {

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
    private final android.widget.EditText mboundView3;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    @NonNull
    public final android.widget.TextView tvCheckYingkui;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.CheckItemViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCheckBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        this.tvCheckYingkui = (android.widget.TextView) bindings[4];
        this.tvCheckYingkui.setTag(null);
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
            setItemViewModel((ys.app.pad.viewmodel.CheckItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.pad.viewmodel.CheckItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.CheckItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.pad.viewmodel.CheckItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelObLossNum((android.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeItemViewModelModel((ys.app.pad.model.GoodInfo) object, fieldId);
            case 3 :
                return onChangeItemViewModelField((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.pad.viewmodel.CheckItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelObLossNum(android.databinding.ObservableInt ItemViewModelObLossNum, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.pad.model.GoodInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.stockNum) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.inventoryNum) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelField(android.databinding.ObservableField<java.lang.String> ItemViewModelField, int fieldId) {
        if (fieldId == BR._all) {
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
        ys.app.pad.viewmodel.CheckItemViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelFieldGet = null;
        java.lang.String stringValueOfItemViewModelObLossNum = null;
        int itemViewModelObLossNumGet = 0;
        java.lang.String stringValueOfItemViewModelModelInventoryNum = null;
        android.text.TextWatcher itemViewModelTextChangedListener = null;
        int itemViewModelModelStockNum = 0;
        android.databinding.ObservableInt itemViewModelObLossNum = null;
        ys.app.pad.model.GoodInfo itemViewModelModel = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelField = null;
        int itemViewModelModelInventoryNum = 0;
        java.lang.String itemViewModelModelName = null;
        java.lang.String stringValueOfItemViewModelModelStockNum = null;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0x81L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.textChangedListener
                        itemViewModelTextChangedListener = itemViewModel.textChangedListener;
                    }
            }
            if ((dirtyFlags & 0x83L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.obLossNum
                        itemViewModelObLossNum = itemViewModel.obLossNum;
                    }
                    updateRegistration(1, itemViewModelObLossNum);


                    if (itemViewModelObLossNum != null) {
                        // read itemViewModel.obLossNum.get()
                        itemViewModelObLossNumGet = itemViewModelObLossNum.get();
                    }


                    // read String.valueOf(itemViewModel.obLossNum.get())
                    stringValueOfItemViewModelObLossNum = java.lang.String.valueOf(itemViewModelObLossNumGet);
            }
            if ((dirtyFlags & 0xf5L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }
                    updateRegistration(2, itemViewModelModel);

                if ((dirtyFlags & 0xa5L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.stockNum
                            itemViewModelModelStockNum = itemViewModelModel.getStockNum();
                        }


                        // read String.valueOf(itemViewModel.model.stockNum)
                        stringValueOfItemViewModelModelStockNum = java.lang.String.valueOf(itemViewModelModelStockNum);
                }
                if ((dirtyFlags & 0xc5L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.inventoryNum
                            itemViewModelModelInventoryNum = itemViewModelModel.getInventoryNum();
                        }


                        // read String.valueOf(itemViewModel.model.inventoryNum)
                        stringValueOfItemViewModelModelInventoryNum = java.lang.String.valueOf(itemViewModelModelInventoryNum);
                }
                if ((dirtyFlags & 0x95L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.name
                            itemViewModelModelName = itemViewModelModel.getName();
                        }
                }
            }
            if ((dirtyFlags & 0x89L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.field
                        itemViewModelField = itemViewModel.field;
                    }
                    updateRegistration(3, itemViewModelField);


                    if (itemViewModelField != null) {
                        // read itemViewModel.field.get()
                        itemViewModelFieldGet = itemViewModelField.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x95L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelModelName);
        }
        if ((dirtyFlags & 0xa5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, stringValueOfItemViewModelModelStockNum);
        }
        if ((dirtyFlags & 0xc5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, stringValueOfItemViewModelModelInventoryNum);
        }
        if ((dirtyFlags & 0x81L) != 0) {
            // api target 1

            ys.app.pad.utils.PetBindingUtil.setTextChangedListener(this.mboundView3, itemViewModelTextChangedListener);
        }
        if ((dirtyFlags & 0x83L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, stringValueOfItemViewModelObLossNum);
        }
        if ((dirtyFlags & 0x89L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvCheckYingkui, itemViewModelFieldGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemCheckBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemCheckBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemCheckBinding>inflate(inflater, ys.app.pad.R.layout.item_check, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemCheckBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemCheckBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.item_check, null, false), bindingComponent);
    }
    @NonNull
    public static ItemCheckBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemCheckBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_check_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemCheckBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.obLossNum
        flag 2 (0x3L): itemViewModel.model
        flag 3 (0x4L): itemViewModel.field
        flag 4 (0x5L): itemViewModel.model.name
        flag 5 (0x6L): itemViewModel.model.stockNum
        flag 6 (0x7L): itemViewModel.model.inventoryNum
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}