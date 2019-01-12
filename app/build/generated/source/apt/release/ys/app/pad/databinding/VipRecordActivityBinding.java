package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VipRecordActivityBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 1);
        sViewsWithIds.put(R.id.vip_rl, 2);
        sViewsWithIds.put(R.id.back_iv, 3);
        sViewsWithIds.put(R.id.vip_recharge_tv, 4);
        sViewsWithIds.put(R.id.vip_consume_tv, 5);
        sViewsWithIds.put(R.id.viewPager, 6);
    }
    // views
    @NonNull
    public final android.widget.ImageView backIv;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.view.View view;
    @NonNull
    public final android.support.v4.view.ViewPager viewPager;
    @NonNull
    public final android.widget.TextView vipConsumeTv;
    @NonNull
    public final android.widget.TextView vipRechargeTv;
    @NonNull
    public final android.widget.RelativeLayout vipRl;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.vip.VipRecordViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VipRecordActivityBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.backIv = (android.widget.ImageView) bindings[3];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.view = (android.view.View) bindings[1];
        this.viewPager = (android.support.v4.view.ViewPager) bindings[6];
        this.vipConsumeTv = (android.widget.TextView) bindings[5];
        this.vipRechargeTv = (android.widget.TextView) bindings[4];
        this.vipRl = (android.widget.RelativeLayout) bindings[2];
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
            setViewModel((ys.app.pad.viewmodel.vip.VipRecordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.vip.VipRecordViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    @Nullable
    public ys.app.pad.viewmodel.vip.VipRecordViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((ys.app.pad.viewmodel.vip.VipRecordViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.vip.VipRecordViewModel ViewModel, int fieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static VipRecordActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VipRecordActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<VipRecordActivityBinding>inflate(inflater, ys.app.pad.R.layout.activity_vip_record, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static VipRecordActivityBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VipRecordActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_vip_record, null, false), bindingComponent);
    }
    @NonNull
    public static VipRecordActivityBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VipRecordActivityBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_vip_record_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new VipRecordActivityBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}