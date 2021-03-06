package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddEmployeeBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 2);
        sViewsWithIds.put(R.id.scrollView, 3);
        sViewsWithIds.put(R.id.recyclerView, 4);
    }
    // views
    @NonNull
    private final android.widget.Button mboundView1;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    @NonNull
    public final android.widget.RelativeLayout rootRl;
    @NonNull
    public final ys.app.pad.widget.MyNestedScrollView scrollView;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.manage.AddEmployeeViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityAddEmployeeBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.mboundView1 = (android.widget.Button) bindings[1];
        this.mboundView1.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[4];
        this.rootRl = (android.widget.RelativeLayout) bindings[0];
        this.rootRl.setTag(null);
        this.scrollView = (ys.app.pad.widget.MyNestedScrollView) bindings[3];
        this.view = (android.view.View) bindings[2];
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
            setViewModel((ys.app.pad.viewmodel.manage.AddEmployeeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.manage.AddEmployeeViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.manage.AddEmployeeViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((ys.app.pad.viewmodel.manage.AddEmployeeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.manage.AddEmployeeViewModel ViewModel, int fieldId) {
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
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        ys.app.pad.viewmodel.manage.AddEmployeeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::clickButton
                    viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.manage.AddEmployeeViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.manage.AddEmployeeViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityAddEmployeeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddEmployeeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityAddEmployeeBinding>inflate(inflater, ys.app.pad.R.layout.activity_add_employee, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityAddEmployeeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddEmployeeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_add_employee, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityAddEmployeeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddEmployeeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_add_employee_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityAddEmployeeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}