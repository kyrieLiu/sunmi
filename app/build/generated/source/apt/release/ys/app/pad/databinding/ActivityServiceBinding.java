package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityServiceBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_head, 5);
        sViewsWithIds.put(R.id.ll_collectMoney_service, 6);
        sViewsWithIds.put(R.id.rl_collectMoney_service_top, 7);
        sViewsWithIds.put(R.id.tv_collect_money_service, 8);
        sViewsWithIds.put(R.id.rv_collectMoney_service, 9);
        sViewsWithIds.put(R.id.recyclerView_service, 10);
        sViewsWithIds.put(R.id.progressbar, 11);
    }
    // views
    @NonNull
    public final com.flipboard.bottomsheet.BottomSheetLayout bottomSheetLayout;
    @Nullable
    public final android.view.View layoutHead;
    @NonNull
    public final android.widget.LinearLayout llCollectMoneyService;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.widget.RelativeLayout mboundView4;
    @NonNull
    public final android.widget.ImageView networkErrorIv;
    @NonNull
    public final android.widget.ImageView noneDataIv;
    @NonNull
    public final android.widget.ProgressBar progressbar;
    @NonNull
    public final ys.app.pad.widget.wrapperRecylerView.IRecyclerView recyclerViewService;
    @NonNull
    public final android.widget.RelativeLayout rlCollectMoneyServiceTop;
    @NonNull
    public final android.support.v7.widget.RecyclerView rvCollectMoneyService;
    @NonNull
    public final android.widget.TextView tvCollectMoneyService;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.ServiceActivityViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityServiceBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds);
        this.bottomSheetLayout = (com.flipboard.bottomsheet.BottomSheetLayout) bindings[0];
        this.bottomSheetLayout.setTag(null);
        this.layoutHead = (android.view.View) bindings[5];
        this.llCollectMoneyService = (android.widget.LinearLayout) bindings[6];
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView4 = (android.widget.RelativeLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.networkErrorIv = (android.widget.ImageView) bindings[3];
        this.networkErrorIv.setTag(null);
        this.noneDataIv = (android.widget.ImageView) bindings[2];
        this.noneDataIv.setTag(null);
        this.progressbar = (android.widget.ProgressBar) bindings[11];
        this.recyclerViewService = (ys.app.pad.widget.wrapperRecylerView.IRecyclerView) bindings[10];
        this.rlCollectMoneyServiceTop = (android.widget.RelativeLayout) bindings[7];
        this.rvCollectMoneyService = (android.support.v7.widget.RecyclerView) bindings[9];
        this.tvCollectMoneyService = (android.widget.TextView) bindings[8];
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
            setViewModel((ys.app.pad.viewmodel.ServiceActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.ServiceActivityViewModel ViewModel) {
        updateRegistration(3, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.ServiceActivityViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsNetWorkErrorVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelIsNoneDataVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelIsLoadingVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModel((ys.app.pad.viewmodel.ServiceActivityViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsNetWorkErrorVisible(android.databinding.ObservableBoolean ViewModelIsNetWorkErrorVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsNoneDataVisible(android.databinding.ObservableBoolean ViewModelIsNoneDataVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoadingVisible(android.databinding.ObservableBoolean ViewModelIsLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.ServiceActivityViewModel ViewModel, int fieldId) {
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
        int viewModelIsLoadingVisibleViewVISIBLEViewGONE = 0;
        android.databinding.ObservableBoolean viewModelIsNetWorkErrorVisible = null;
        boolean viewModelIsNetWorkErrorVisibleGet = false;
        boolean viewModelIsLoadingVisibleGet = false;
        android.databinding.ObservableBoolean viewModelIsNoneDataVisible = null;
        boolean viewModelIsNoneDataVisibleGet = false;
        int viewModelIsNoneDataVisibleViewVISIBLEViewGONE = 0;
        int viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = null;
        android.databinding.ObservableBoolean viewModelIsLoadingVisible = null;
        ys.app.pad.viewmodel.ServiceActivityViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNetWorkErrorVisible
                        viewModelIsNetWorkErrorVisible = viewModel.isNetWorkErrorVisible;
                    }
                    updateRegistration(0, viewModelIsNetWorkErrorVisible);


                    if (viewModelIsNetWorkErrorVisible != null) {
                        // read viewModel.isNetWorkErrorVisible.get()
                        viewModelIsNetWorkErrorVisibleGet = viewModelIsNetWorkErrorVisible.get();
                    }
                if((dirtyFlags & 0x19L) != 0) {
                    if(viewModelIsNetWorkErrorVisibleGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = ((viewModelIsNetWorkErrorVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNoneDataVisible
                        viewModelIsNoneDataVisible = viewModel.isNoneDataVisible;
                    }
                    updateRegistration(1, viewModelIsNoneDataVisible);


                    if (viewModelIsNoneDataVisible != null) {
                        // read viewModel.isNoneDataVisible.get()
                        viewModelIsNoneDataVisibleGet = viewModelIsNoneDataVisible.get();
                    }
                if((dirtyFlags & 0x1aL) != 0) {
                    if(viewModelIsNoneDataVisibleGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNoneDataVisibleViewVISIBLEViewGONE = ((viewModelIsNoneDataVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::onClickNetWorkError
                        viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = (((mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener == null) ? (mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoadingVisible
                        viewModelIsLoadingVisible = viewModel.isLoadingVisible;
                    }
                    updateRegistration(2, viewModelIsLoadingVisible);


                    if (viewModelIsLoadingVisible != null) {
                        // read viewModel.isLoadingVisible.get()
                        viewModelIsLoadingVisibleGet = viewModelIsLoadingVisible.get();
                    }
                if((dirtyFlags & 0x1cL) != 0) {
                    if(viewModelIsLoadingVisibleGet) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsLoadingVisibleViewVISIBLEViewGONE = ((viewModelIsLoadingVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelIsLoadingVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.networkErrorIv.setOnClickListener(viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.networkErrorIv.setVisibility(viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.noneDataIv.setVisibility(viewModelIsNoneDataVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.ServiceActivityViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.ServiceActivityViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickNetWorkError(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityServiceBinding>inflate(inflater, ys.app.pad.R.layout.activity_service, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityServiceBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityServiceBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_service, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityServiceBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityServiceBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_service_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityServiceBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.isNetWorkErrorVisible
        flag 1 (0x2L): viewModel.isNoneDataVisible
        flag 2 (0x3L): viewModel.isLoadingVisible
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}