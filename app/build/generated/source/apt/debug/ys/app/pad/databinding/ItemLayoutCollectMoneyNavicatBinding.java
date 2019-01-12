package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLayoutCollectMoneyNavicatBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_item_goods, 1);
        sViewsWithIds.put(R.id.tv_item_collect_money_title, 2);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final android.widget.RelativeLayout rlItemGoods;
    @NonNull
    public final android.widget.TextView tvItemCollectMoneyTitle;
    // variables
    @Nullable
    private ys.app.pad.model.GoodTypeInfo mInfo;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLayoutCollectMoneyNavicatBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rlItemGoods = (android.widget.RelativeLayout) bindings[1];
        this.tvItemCollectMoneyTitle = (android.widget.TextView) bindings[2];
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
        if (BR.info == variableId) {
            setInfo((ys.app.pad.model.GoodTypeInfo) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInfo(@Nullable ys.app.pad.model.GoodTypeInfo Info) {
        this.mInfo = Info;
    }
    @Nullable
    public ys.app.pad.model.GoodTypeInfo getInfo() {
        return mInfo;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeInfo((ys.app.pad.model.GoodTypeInfo) object, fieldId);
        }
        return false;
    }
    private boolean onChangeInfo(ys.app.pad.model.GoodTypeInfo Info, int fieldId) {
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
    public static ItemLayoutCollectMoneyNavicatBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemLayoutCollectMoneyNavicatBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemLayoutCollectMoneyNavicatBinding>inflate(inflater, ys.app.pad.R.layout.item_layout_collect_money_navicat, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemLayoutCollectMoneyNavicatBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemLayoutCollectMoneyNavicatBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.item_layout_collect_money_navicat, null, false), bindingComponent);
    }
    @NonNull
    public static ItemLayoutCollectMoneyNavicatBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemLayoutCollectMoneyNavicatBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_layout_collect_money_navicat_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemLayoutCollectMoneyNavicatBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): info
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}