package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AllStaffAchievementActivityBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerView, 2);
        sViewsWithIds.put(R.id.progressbar, 3);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    public final android.widget.ProgressBar progressbar;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.AllStaffAchievementModel mModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AllStaffAchievementActivityBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.progressbar = (android.widget.ProgressBar) bindings[3];
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[2];
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
        if (BR.model == variableId) {
            setModel((ys.app.pad.viewmodel.AllStaffAchievementModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable ys.app.pad.viewmodel.AllStaffAchievementModel Model) {
        updateRegistration(1, Model);
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.AllStaffAchievementModel getModel() {
        return mModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeModelIsLoadingVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeModel((ys.app.pad.viewmodel.AllStaffAchievementModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeModelIsLoadingVisible(android.databinding.ObservableBoolean ModelIsLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeModel(ys.app.pad.viewmodel.AllStaffAchievementModel Model, int fieldId) {
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
        int modelIsLoadingVisibleViewVISIBLEViewGONE = 0;
        boolean modelIsLoadingVisibleGet = false;
        android.databinding.ObservableBoolean modelIsLoadingVisible = null;
        ys.app.pad.viewmodel.AllStaffAchievementModel model = mModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (model != null) {
                    // read model.isLoadingVisible
                    modelIsLoadingVisible = model.isLoadingVisible;
                }
                updateRegistration(0, modelIsLoadingVisible);


                if (modelIsLoadingVisible != null) {
                    // read model.isLoadingVisible.get()
                    modelIsLoadingVisibleGet = modelIsLoadingVisible.get();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(modelIsLoadingVisibleGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read model.isLoadingVisible.get() ? View.VISIBLE : View.GONE
                modelIsLoadingVisibleViewVISIBLEViewGONE = ((modelIsLoadingVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(modelIsLoadingVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static AllStaffAchievementActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AllStaffAchievementActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AllStaffAchievementActivityBinding>inflate(inflater, ys.app.pad.R.layout.activity_all_staff_achievement, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static AllStaffAchievementActivityBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AllStaffAchievementActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_all_staff_achievement, null, false), bindingComponent);
    }
    @NonNull
    public static AllStaffAchievementActivityBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AllStaffAchievementActivityBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_all_staff_achievement_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AllStaffAchievementActivityBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): model.isLoadingVisible
        flag 1 (0x2L): model
        flag 2 (0x3L): null
        flag 3 (0x4L): model.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 4 (0x5L): model.isLoadingVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}