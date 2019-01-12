package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddVipCardBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 4);
        sViewsWithIds.put(R.id.vip_ll, 5);
        sViewsWithIds.put(R.id.ll1_0, 6);
        sViewsWithIds.put(R.id.tv_vip_card_warn, 7);
        sViewsWithIds.put(R.id.scrollView_0, 8);
        sViewsWithIds.put(R.id.scrollView, 9);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout ll10;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.support.v7.widget.RecyclerView mboundView2;
    @NonNull
    private final android.support.v7.widget.RecyclerView mboundView3;
    @NonNull
    public final ys.app.pad.widget.MyNestedScrollView scrollView;
    @NonNull
    public final ys.app.pad.widget.MyNestedScrollView scrollView0;
    @NonNull
    public final ys.app.pad.widget.ContainsEmojiEditText telEt0;
    @NonNull
    public final android.widget.TextView tvVipCardWarn;
    @NonNull
    public final android.view.View view;
    @NonNull
    public final android.widget.LinearLayout vipLl;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.manage.AddVipCardViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener telEt0androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obCardName.get()
            //         is viewModel.obCardName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(telEt0);
            // localize variables for thread safety
            // viewModel.obCardName.get()
            java.lang.String viewModelObCardNameGet = null;
            // viewModel
            ys.app.pad.viewmodel.manage.AddVipCardViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obCardName != null
            boolean viewModelObCardNameJavaLangObjectNull = false;
            // viewModel.obCardName
            android.databinding.ObservableField<java.lang.String> viewModelObCardName = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObCardName = viewModel.obCardName;

                viewModelObCardNameJavaLangObjectNull = (viewModelObCardName) != (null);
                if (viewModelObCardNameJavaLangObjectNull) {




                    viewModelObCardName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityAddVipCardBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.ll10 = (android.widget.LinearLayout) bindings[6];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.support.v7.widget.RecyclerView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.support.v7.widget.RecyclerView) bindings[3];
        this.mboundView3.setTag(null);
        this.scrollView = (ys.app.pad.widget.MyNestedScrollView) bindings[9];
        this.scrollView0 = (ys.app.pad.widget.MyNestedScrollView) bindings[8];
        this.telEt0 = (ys.app.pad.widget.ContainsEmojiEditText) bindings[1];
        this.telEt0.setTag(null);
        this.tvVipCardWarn = (android.widget.TextView) bindings[7];
        this.view = (android.view.View) bindings[4];
        this.vipLl = (android.widget.LinearLayout) bindings[5];
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
        if (BR.viewModel == variableId) {
            setViewModel((ys.app.pad.viewmodel.manage.AddVipCardViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.manage.AddVipCardViewModel ViewModel) {
        updateRegistration(3, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.manage.AddVipCardViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObIsIsAddVipCard((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelObCardName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelObIsInput((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModel((ys.app.pad.viewmodel.manage.AddVipCardViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObIsIsAddVipCard(android.databinding.ObservableBoolean ViewModelObIsIsAddVipCard, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObCardName(android.databinding.ObservableField<java.lang.String> ViewModelObCardName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObIsInput(android.databinding.ObservableBoolean ViewModelObIsInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.manage.AddVipCardViewModel ViewModel, int fieldId) {
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
        android.databinding.ObservableBoolean viewModelObIsIsAddVipCard = null;
        java.lang.String viewModelObCardNameGet = null;
        java.util.List<ys.app.pad.model.GoodTypeInfo> viewModelGoodTypeInfos = null;
        android.databinding.ObservableField<java.lang.String> viewModelObCardName = null;
        java.util.List<ys.app.pad.model.ServiceTypeInfo> viewModelServiceTypeInfos = null;
        android.databinding.ObservableBoolean viewModelObIsInput = null;
        boolean viewModelObIsIsAddVipCardGet = false;
        boolean viewModelObIsInputGet = false;
        ys.app.pad.viewmodel.manage.AddVipCardViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x1dL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obIsIsAddVipCard
                        viewModelObIsIsAddVipCard = viewModel.obIsIsAddVipCard;
                        // read viewModel.goodTypeInfos
                        viewModelGoodTypeInfos = viewModel.goodTypeInfos;
                        // read viewModel.serviceTypeInfos
                        viewModelServiceTypeInfos = viewModel.serviceTypeInfos;
                        // read viewModel.obIsInput
                        viewModelObIsInput = viewModel.obIsInput;
                    }
                    updateRegistration(0, viewModelObIsIsAddVipCard);
                    updateRegistration(2, viewModelObIsInput);


                    if (viewModelObIsIsAddVipCard != null) {
                        // read viewModel.obIsIsAddVipCard.get()
                        viewModelObIsIsAddVipCardGet = viewModelObIsIsAddVipCard.get();
                    }
                    if (viewModelObIsInput != null) {
                        // read viewModel.obIsInput.get()
                        viewModelObIsInputGet = viewModelObIsInput.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obCardName
                        viewModelObCardName = viewModel.obCardName;
                    }
                    updateRegistration(1, viewModelObCardName);


                    if (viewModelObCardName != null) {
                        // read viewModel.obCardName.get()
                        viewModelObCardNameGet = viewModelObCardName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1dL) != 0) {
            // api target 1

            ys.app.pad.utils.PetBindingUtil.setGoodsTypeAdapterData(this.mboundView2, viewModelGoodTypeInfos, viewModelObIsInputGet, viewModelObIsIsAddVipCardGet);
            ys.app.pad.utils.PetBindingUtil.setServiceTypeAdapterData(this.mboundView3, viewModelServiceTypeInfos, viewModelObIsInputGet, viewModelObIsIsAddVipCardGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.telEt0, viewModelObCardNameGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.telEt0, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, telEt0androidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityAddVipCardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddVipCardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityAddVipCardBinding>inflate(inflater, ys.app.pad.R.layout.activity_add_vip_card, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityAddVipCardBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddVipCardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_add_vip_card, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityAddVipCardBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddVipCardBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_add_vip_card_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityAddVipCardBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obIsIsAddVipCard
        flag 1 (0x2L): viewModel.obCardName
        flag 2 (0x3L): viewModel.obIsInput
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}