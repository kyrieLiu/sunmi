package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAchievementStaticBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView, 5);
        sViewsWithIds.put(R.id.tab_layout, 6);
        sViewsWithIds.put(R.id.viewpager, 7);
        sViewsWithIds.put(R.id.progressbar, 8);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
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
    public final android.widget.ScrollView scrollView;
    @NonNull
    public final android.support.design.widget.TabLayout tabLayout;
    @NonNull
    public final android.support.v4.view.ViewPager viewpager;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.AchievementStaticFragmentViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback70;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAchievementStaticBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView4 = (android.widget.RelativeLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.networkErrorIv = (android.widget.ImageView) bindings[3];
        this.networkErrorIv.setTag(null);
        this.noneDataIv = (android.widget.ImageView) bindings[2];
        this.noneDataIv.setTag(null);
        this.progressbar = (android.widget.ProgressBar) bindings[8];
        this.scrollView = (android.widget.ScrollView) bindings[5];
        this.tabLayout = (android.support.design.widget.TabLayout) bindings[6];
        this.viewpager = (android.support.v4.view.ViewPager) bindings[7];
        setRootTag(root);
        // listeners
        mCallback70 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            setViewModel((ys.app.pad.viewmodel.AchievementStaticFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.AchievementStaticFragmentViewModel ViewModel) {
        updateRegistration(3, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.AchievementStaticFragmentViewModel getViewModel() {
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
                return onChangeViewModel((ys.app.pad.viewmodel.AchievementStaticFragmentViewModel) object, fieldId);
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
    private boolean onChangeViewModel(ys.app.pad.viewmodel.AchievementStaticFragmentViewModel ViewModel, int fieldId) {
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
        boolean viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisibleBooleanTrueViewModelIsLoadingVisible = false;
        android.databinding.ObservableBoolean viewModelIsNoneDataVisible = null;
        boolean viewModelIsNoneDataVisibleGet = false;
        int viewModelIsNoneDataVisibleViewVISIBLEViewGONE = 0;
        boolean viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisible = false;
        int viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = 0;
        android.databinding.ObservableBoolean viewModelIsLoadingVisible = null;
        int viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisibleBooleanTrueViewModelIsLoadingVisibleViewGONEViewVISIBLE = 0;
        ys.app.pad.viewmodel.AchievementStaticFragmentViewModel viewModel = mViewModel;

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
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = ((viewModelIsNetWorkErrorVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

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
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x1fL) != 0) {
                if(viewModelIsNoneDataVisibleGet) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }

            if ((dirtyFlags & 0x1aL) != 0) {

                    // read viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNoneDataVisibleViewVISIBLEViewGONE = ((viewModelIsNoneDataVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
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

        if ((dirtyFlags & 0x800L) != 0) {

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
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
        }

        if ((dirtyFlags & 0x1fL) != 0) {

                // read viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get()
                viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisible = ((viewModelIsNoneDataVisibleGet) ? (true) : (viewModelIsNetWorkErrorVisibleGet));
            if((dirtyFlags & 0x1fL) != 0) {
                if(viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisible) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

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
        }

        if ((dirtyFlags & 0x1fL) != 0) {

                // read viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get() ? true : viewModel.isLoadingVisible.get()
                viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisibleBooleanTrueViewModelIsLoadingVisible = ((viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisible) ? (true) : (viewModelIsLoadingVisibleGet));
            if((dirtyFlags & 0x1fL) != 0) {
                if(viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisibleBooleanTrueViewModelIsLoadingVisible) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get() ? true : viewModel.isLoadingVisible.get() ? View.GONE : View.VISIBLE
                viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisibleBooleanTrueViewModelIsLoadingVisibleViewGONEViewVISIBLE = ((viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisibleBooleanTrueViewModelIsLoadingVisible) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x1fL) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelIsNoneDataVisibleBooleanTrueViewModelIsNetWorkErrorVisibleBooleanTrueViewModelIsLoadingVisibleViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelIsLoadingVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.networkErrorIv.setOnClickListener(mCallback70);
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
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ys.app.pad.viewmodel.AchievementStaticFragmentViewModel viewModel = mViewModel;
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
    public static FragmentAchievementStaticBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentAchievementStaticBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FragmentAchievementStaticBinding>inflate(inflater, ys.app.pad.R.layout.fragment_achievement_static, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static FragmentAchievementStaticBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentAchievementStaticBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.fragment_achievement_static, null, false), bindingComponent);
    }
    @NonNull
    public static FragmentAchievementStaticBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentAchievementStaticBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_achievement_static_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentAchievementStaticBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.isNetWorkErrorVisible
        flag 1 (0x2L): viewModel.isNoneDataVisible
        flag 2 (0x3L): viewModel.isLoadingVisible
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get() ? true : viewModel.isLoadingVisible.get()
        flag 8 (0x9L): viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get() ? true : viewModel.isLoadingVisible.get()
        flag 9 (0xaL): viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get()
        flag 12 (0xdL): viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get()
        flag 13 (0xeL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get() ? true : viewModel.isLoadingVisible.get() ? View.GONE : View.VISIBLE
        flag 16 (0x11L): viewModel.isNoneDataVisible.get() ? true : viewModel.isNetWorkErrorVisible.get() ? true : viewModel.isLoadingVisible.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}