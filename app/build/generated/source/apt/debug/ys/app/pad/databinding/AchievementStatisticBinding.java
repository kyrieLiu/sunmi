package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AchievementStatisticBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tool_content_bar, 3);
        sViewsWithIds.put(R.id.back_iv, 4);
        sViewsWithIds.put(R.id.title_ll, 5);
        sViewsWithIds.put(R.id.frameLayout, 6);
    }
    // views
    @NonNull
    public final android.widget.ImageView backIv;
    @NonNull
    public final android.widget.TextView commodityTv;
    @NonNull
    public final android.widget.FrameLayout frameLayout;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final android.widget.TextView serviceTv;
    @NonNull
    public final android.widget.LinearLayout titleLl;
    @NonNull
    public final android.widget.RelativeLayout toolContentBar;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.AchievementStatisticViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickServiceAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickCommodityAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public AchievementStatisticBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.backIv = (android.widget.ImageView) bindings[4];
        this.commodityTv = (android.widget.TextView) bindings[1];
        this.commodityTv.setTag(null);
        this.frameLayout = (android.widget.FrameLayout) bindings[6];
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.serviceTv = (android.widget.TextView) bindings[2];
        this.serviceTv.setTag(null);
        this.titleLl = (android.widget.LinearLayout) bindings[5];
        this.toolContentBar = (android.widget.RelativeLayout) bindings[3];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewModel((ys.app.pad.viewmodel.AchievementStatisticViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.AchievementStatisticViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.AchievementStatisticViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((ys.app.pad.viewmodel.AchievementStatisticViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.AchievementStatisticViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        android.view.View.OnClickListener viewModelClickServiceAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickCommodityAndroidViewViewOnClickListener = null;
        ys.app.pad.viewmodel.AchievementStatisticViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::clickService
                    viewModelClickServiceAndroidViewViewOnClickListener = (((mViewModelClickServiceAndroidViewViewOnClickListener == null) ? (mViewModelClickServiceAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickServiceAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::clickCommodity
                    viewModelClickCommodityAndroidViewViewOnClickListener = (((mViewModelClickCommodityAndroidViewViewOnClickListener == null) ? (mViewModelClickCommodityAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickCommodityAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.commodityTv.setOnClickListener(viewModelClickCommodityAndroidViewViewOnClickListener);
            this.serviceTv.setOnClickListener(viewModelClickServiceAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AchievementStatisticViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.AchievementStatisticViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickService(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AchievementStatisticViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.pad.viewmodel.AchievementStatisticViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickCommodity(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static AchievementStatisticBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AchievementStatisticBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AchievementStatisticBinding>inflate(inflater, ys.app.pad.R.layout.activity_achievement_statistic, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static AchievementStatisticBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AchievementStatisticBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_achievement_statistic, null, false), bindingComponent);
    }
    @NonNull
    public static AchievementStatisticBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AchievementStatisticBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_achievement_statistic_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AchievementStatisticBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}