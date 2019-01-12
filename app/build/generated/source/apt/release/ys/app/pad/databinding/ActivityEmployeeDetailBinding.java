package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEmployeeDetailBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView10, 6);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    public final android.widget.TextView textView10;
    @NonNull
    public final android.widget.TextView textView11;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.manage.EmployeeDetailViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEmployeeDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.textView10 = (android.widget.TextView) bindings[6];
        this.textView11 = (android.widget.TextView) bindings[1];
        this.textView11.setTag(null);
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
            setViewModel((ys.app.pad.viewmodel.manage.EmployeeDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.manage.EmployeeDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.manage.EmployeeDetailViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMInfo((ys.app.pad.model.EmployeeInfo) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMInfo(ys.app.pad.model.EmployeeInfo ViewModelMInfo, int fieldId) {
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
        boolean viewModelMInfoSexInt1 = false;
        java.lang.String viewModelMInfoName = null;
        java.lang.String viewModelMInfoSexInt1MboundView2AndroidStringNvMboundView2AndroidStringNan = null;
        int viewModelMInfoSex = 0;
        java.lang.String viewModelMInfoPost = null;
        java.lang.String viewModelMInfoJobNumber = null;
        java.lang.String viewModelMInfoPhone = null;
        ys.app.pad.model.EmployeeInfo viewModelMInfo = null;
        ys.app.pad.viewmodel.manage.EmployeeDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.mInfo
                    viewModelMInfo = viewModel.mInfo;
                }
                updateRegistration(0, viewModelMInfo);


                if (viewModelMInfo != null) {
                    // read viewModel.mInfo.name
                    viewModelMInfoName = viewModelMInfo.getName();
                    // read viewModel.mInfo.sex
                    viewModelMInfoSex = viewModelMInfo.getSex();
                    // read viewModel.mInfo.post
                    viewModelMInfoPost = viewModelMInfo.getPost();
                    // read viewModel.mInfo.jobNumber
                    viewModelMInfoJobNumber = viewModelMInfo.getJobNumber();
                    // read viewModel.mInfo.phone
                    viewModelMInfoPhone = viewModelMInfo.getPhone();
                }


                // read viewModel.mInfo.sex == 1
                viewModelMInfoSexInt1 = (viewModelMInfoSex) == (1);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelMInfoSexInt1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.mInfo.sex == 1 ? @android:string/nv : @android:string/nan
                viewModelMInfoSexInt1MboundView2AndroidStringNvMboundView2AndroidStringNan = ((viewModelMInfoSexInt1) ? (mboundView2.getResources().getString(R.string.nv)) : (mboundView2.getResources().getString(R.string.nan)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelMInfoSexInt1MboundView2AndroidStringNvMboundView2AndroidStringNan);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelMInfoPhone);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelMInfoJobNumber);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelMInfoPost);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView11, viewModelMInfoName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityEmployeeDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityEmployeeDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityEmployeeDetailBinding>inflate(inflater, ys.app.pad.R.layout.activity_employee_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityEmployeeDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityEmployeeDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_employee_detail, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityEmployeeDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityEmployeeDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_employee_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityEmployeeDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.mInfo
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.mInfo.sex == 1 ? @android:string/nv : @android:string/nan
        flag 4 (0x5L): viewModel.mInfo.sex == 1 ? @android:string/nv : @android:string/nan
    flag mapping end*/
    //end
}