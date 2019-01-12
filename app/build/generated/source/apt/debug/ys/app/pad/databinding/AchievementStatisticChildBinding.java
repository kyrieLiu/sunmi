package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AchievementStatisticChildBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nestedRefreshLayout, 6);
        sViewsWithIds.put(R.id.date_ll, 7);
        sViewsWithIds.put(R.id.tip_lay, 8);
        sViewsWithIds.put(R.id.line2, 9);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout dateLl;
    @NonNull
    public final android.view.View line2;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    public final ys.app.pad.widget.refresh.NestedRefreshLayout nestedRefreshLayout;
    @NonNull
    public final android.widget.ImageView networkErrorIv;
    @NonNull
    public final android.widget.ImageView noneDataIv;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    @NonNull
    public final android.widget.LinearLayout tipLay;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.achievement.AchieveStatisChildFragmentViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickBeginDateAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickEndDateAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public AchievementStatisticChildBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.dateLl = (android.widget.LinearLayout) bindings[7];
        this.line2 = (android.view.View) bindings[9];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.nestedRefreshLayout = (ys.app.pad.widget.refresh.NestedRefreshLayout) bindings[6];
        this.networkErrorIv = (android.widget.ImageView) bindings[5];
        this.networkErrorIv.setTag(null);
        this.noneDataIv = (android.widget.ImageView) bindings[4];
        this.noneDataIv.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[3];
        this.recyclerView.setTag(null);
        this.tipLay = (android.widget.LinearLayout) bindings[8];
        setRootTag(root);
        // listeners
        mCallback51 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewModel((ys.app.pad.viewmodel.achievement.AchieveStatisChildFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.achievement.AchieveStatisChildFragmentViewModel ViewModel) {
        updateRegistration(4, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.achievement.AchieveStatisChildFragmentViewModel getViewModel() {
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
                return onChangeViewModelObBeginDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelObEndDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModel((ys.app.pad.viewmodel.achievement.AchieveStatisChildFragmentViewModel) object, fieldId);
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
    private boolean onChangeViewModelObBeginDate(android.databinding.ObservableField<java.lang.String> ViewModelObBeginDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObEndDate(android.databinding.ObservableField<java.lang.String> ViewModelObEndDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.achievement.AchieveStatisChildFragmentViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String viewModelObBeginDateGet = null;
        int viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisibleViewGONEViewVISIBLE = 0;
        android.databinding.ObservableBoolean viewModelIsNetWorkErrorVisible = null;
        boolean viewModelIsNetWorkErrorVisibleGet = false;
        android.databinding.ObservableBoolean viewModelIsNoneDataVisible = null;
        boolean viewModelIsNoneDataVisibleGet = false;
        int viewModelIsNoneDataVisibleViewVISIBLEViewGONE = 0;
        boolean viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisible = false;
        android.databinding.ObservableField<java.lang.String> viewModelObBeginDate = null;
        int viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = 0;
        android.databinding.ObservableField<java.lang.String> viewModelObEndDate = null;
        android.view.View.OnClickListener viewModelClickBeginDateAndroidViewViewOnClickListener = null;
        java.lang.String viewModelObEndDateGet = null;
        android.view.View.OnClickListener viewModelClickEndDateAndroidViewViewOnClickListener = null;
        ys.app.pad.viewmodel.achievement.AchieveStatisChildFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNetWorkErrorVisible
                        viewModelIsNetWorkErrorVisible = viewModel.isNetWorkErrorVisible;
                    }
                    updateRegistration(0, viewModelIsNetWorkErrorVisible);


                    if (viewModelIsNetWorkErrorVisible != null) {
                        // read viewModel.isNetWorkErrorVisible.get()
                        viewModelIsNetWorkErrorVisibleGet = viewModelIsNetWorkErrorVisible.get();
                    }
                if((dirtyFlags & 0x31L) != 0) {
                    if(viewModelIsNetWorkErrorVisibleGet) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = ((viewModelIsNetWorkErrorVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x33L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNoneDataVisible
                        viewModelIsNoneDataVisible = viewModel.isNoneDataVisible;
                    }
                    updateRegistration(1, viewModelIsNoneDataVisible);


                    if (viewModelIsNoneDataVisible != null) {
                        // read viewModel.isNoneDataVisible.get()
                        viewModelIsNoneDataVisibleGet = viewModelIsNoneDataVisible.get();
                    }
                if((dirtyFlags & 0x32L) != 0) {
                    if(viewModelIsNoneDataVisibleGet) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0x33L) != 0) {
                    if(viewModelIsNoneDataVisibleGet) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }

                if ((dirtyFlags & 0x32L) != 0) {

                        // read viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
                        viewModelIsNoneDataVisibleViewVISIBLEViewGONE = ((viewModelIsNoneDataVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obBeginDate
                        viewModelObBeginDate = viewModel.obBeginDate;
                    }
                    updateRegistration(2, viewModelObBeginDate);


                    if (viewModelObBeginDate != null) {
                        // read viewModel.obBeginDate.get()
                        viewModelObBeginDateGet = viewModelObBeginDate.get();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obEndDate
                        viewModelObEndDate = viewModel.obEndDate;
                    }
                    updateRegistration(3, viewModelObEndDate);


                    if (viewModelObEndDate != null) {
                        // read viewModel.obEndDate.get()
                        viewModelObEndDateGet = viewModelObEndDate.get();
                    }
            }
            if ((dirtyFlags & 0x30L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickBeginDate
                        viewModelClickBeginDateAndroidViewViewOnClickListener = (((mViewModelClickBeginDateAndroidViewViewOnClickListener == null) ? (mViewModelClickBeginDateAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickBeginDateAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickEndDate
                        viewModelClickEndDateAndroidViewViewOnClickListener = (((mViewModelClickEndDateAndroidViewViewOnClickListener == null) ? (mViewModelClickEndDateAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickEndDateAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {

                if (viewModel != null) {
                    // read viewModel.isNetWorkErrorVisible
                    viewModelIsNetWorkErrorVisible = viewModel.isNetWorkErrorVisible;
                }
                updateRegistration(0, viewModelIsNetWorkErrorVisible);


                if (viewModelIsNetWorkErrorVisible != null) {
                    // read viewModel.isNetWorkErrorVisible.get()
                    viewModelIsNetWorkErrorVisibleGet = viewModelIsNetWorkErrorVisible.get();
                }
            if((dirtyFlags & 0x31L) != 0) {
                if(viewModelIsNetWorkErrorVisibleGet) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
        }

        if ((dirtyFlags & 0x33L) != 0) {

                // read viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get()
                viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisible = ((viewModelIsNoneDataVisibleGet) ? (true) : (viewModelIsNetWorkErrorVisibleGet));
            if((dirtyFlags & 0x33L) != 0) {
                if(viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisible) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get() ? View.GONE : View.VISIBLE
                viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisibleViewGONEViewVISIBLE = ((viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisible) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(viewModelClickBeginDateAndroidViewViewOnClickListener);
            this.mboundView2.setOnClickListener(viewModelClickEndDateAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelObBeginDateGet);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelObEndDateGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.networkErrorIv.setOnClickListener(mCallback51);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.networkErrorIv.setVisibility(viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.noneDataIv.setVisibility(viewModelIsNoneDataVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x33L) != 0) {
            // api target 1

            this.recyclerView.setVisibility(viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisibleViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.achievement.AchieveStatisChildFragmentViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.achievement.AchieveStatisChildFragmentViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickBeginDate(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.achievement.AchieveStatisChildFragmentViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.pad.viewmodel.achievement.AchieveStatisChildFragmentViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickEndDate(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ys.app.pad.viewmodel.achievement.AchieveStatisChildFragmentViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onClickNetWorkError();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static AchievementStatisticChildBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AchievementStatisticChildBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AchievementStatisticChildBinding>inflate(inflater, ys.app.pad.R.layout.fragment_achievement_static_item, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static AchievementStatisticChildBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AchievementStatisticChildBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.fragment_achievement_static_item, null, false), bindingComponent);
    }
    @NonNull
    public static AchievementStatisticChildBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AchievementStatisticChildBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_achievement_static_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AchievementStatisticChildBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.isNetWorkErrorVisible
        flag 1 (0x2L): viewModel.isNoneDataVisible
        flag 2 (0x3L): viewModel.obBeginDate
        flag 3 (0x4L): viewModel.obEndDate
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get() ? View.GONE : View.VISIBLE
        flag 7 (0x8L): viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get() ? View.GONE : View.VISIBLE
        flag 8 (0x9L): viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get()
        flag 11 (0xcL): viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get()
        flag 12 (0xdL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}