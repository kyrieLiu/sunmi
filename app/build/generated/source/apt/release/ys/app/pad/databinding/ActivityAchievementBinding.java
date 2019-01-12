package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAchievementBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 5);
        sViewsWithIds.put(R.id.scrollView, 6);
        sViewsWithIds.put(R.id.recyclerView, 7);
        sViewsWithIds.put(R.id.tv_achievement_total, 8);
        sViewsWithIds.put(R.id.root_view, 9);
        sViewsWithIds.put(R.id.recyclerView2, 10);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView2;
    @NonNull
    public final android.widget.LinearLayout rootView;
    @NonNull
    public final android.support.v4.widget.NestedScrollView scrollView;
    @NonNull
    public final android.widget.TextView tvAchievementMoreOrder;
    @NonNull
    public final android.widget.TextView tvAchievementStatic;
    @NonNull
    public final android.widget.TextView tvAchievementTotal;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.AchievementViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelOnClickSeeMoreAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelOnClickStaticAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityAchievementBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[7];
        this.recyclerView2 = (android.support.v7.widget.RecyclerView) bindings[10];
        this.rootView = (android.widget.LinearLayout) bindings[9];
        this.scrollView = (android.support.v4.widget.NestedScrollView) bindings[6];
        this.tvAchievementMoreOrder = (android.widget.TextView) bindings[3];
        this.tvAchievementMoreOrder.setTag(null);
        this.tvAchievementStatic = (android.widget.TextView) bindings[4];
        this.tvAchievementStatic.setTag(null);
        this.tvAchievementTotal = (android.widget.TextView) bindings[8];
        this.view = (android.view.View) bindings[5];
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
        if (BR.viewModel == variableId) {
            setViewModel((ys.app.pad.viewmodel.AchievementViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.AchievementViewModel ViewModel) {
        updateRegistration(1, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.AchievementViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelOrderMoney((android.databinding.ObservableDouble) object, fieldId);
            case 1 :
                return onChangeViewModel((ys.app.pad.viewmodel.AchievementViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelOrderMoney(android.databinding.ObservableDouble ViewModelOrderMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.AchievementViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
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
        android.view.View.OnClickListener viewModelOnClickSeeMoreAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelOnClickStaticAndroidViewViewOnClickListener = null;
        java.lang.String viewModelOrderMoneyMboundView2AndroidStringYuan = null;
        android.databinding.ObservableDouble viewModelOrderMoney = null;
        double viewModelOrderMoneyGet = 0.0;
        ys.app.pad.viewmodel.AchievementViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::onClickSeeMore
                        viewModelOnClickSeeMoreAndroidViewViewOnClickListener = (((mViewModelOnClickSeeMoreAndroidViewViewOnClickListener == null) ? (mViewModelOnClickSeeMoreAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelOnClickSeeMoreAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::onClickStatic
                        viewModelOnClickStaticAndroidViewViewOnClickListener = (((mViewModelOnClickStaticAndroidViewViewOnClickListener == null) ? (mViewModelOnClickStaticAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelOnClickStaticAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }

                if (viewModel != null) {
                    // read viewModel.orderMoney
                    viewModelOrderMoney = viewModel.orderMoney;
                }
                updateRegistration(0, viewModelOrderMoney);


                if (viewModelOrderMoney != null) {
                    // read viewModel.orderMoney.get()
                    viewModelOrderMoneyGet = viewModelOrderMoney.get();
                }


                // read (viewModel.orderMoney.get()) + (@android:string/yuan)
                viewModelOrderMoneyMboundView2AndroidStringYuan = (viewModelOrderMoneyGet) + (mboundView2.getResources().getString(R.string.yuan));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelOrderMoneyMboundView2AndroidStringYuan);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.tvAchievementMoreOrder.setOnClickListener(viewModelOnClickSeeMoreAndroidViewViewOnClickListener);
            this.tvAchievementStatic.setOnClickListener(viewModelOnClickStaticAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AchievementViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.AchievementViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickSeeMore(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AchievementViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.pad.viewmodel.AchievementViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickStatic(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityAchievementBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAchievementBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityAchievementBinding>inflate(inflater, ys.app.pad.R.layout.activity_achievement, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityAchievementBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAchievementBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_achievement, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityAchievementBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAchievementBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_achievement_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityAchievementBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.orderMoney
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}