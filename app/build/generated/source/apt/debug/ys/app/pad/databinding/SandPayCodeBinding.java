package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SandPayCodeBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_tool_bar, 2);
        sViewsWithIds.put(R.id.et_auth_code, 3);
        sViewsWithIds.put(R.id.tv_personal_pay, 4);
        sViewsWithIds.put(R.id.fl_scan_frame, 5);
        sViewsWithIds.put(R.id.iv_scan_needle, 6);
        sViewsWithIds.put(R.id.iv_scan_example, 7);
    }
    // views
    @NonNull
    public final android.widget.EditText etAuthCode;
    @NonNull
    public final android.widget.FrameLayout flScanFrame;
    @NonNull
    public final android.widget.ImageView ivScanExample;
    @NonNull
    public final android.widget.ImageView ivScanNeedle;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.view.SurfaceView surfaceView;
    @NonNull
    public final android.widget.TextView tvPersonalPay;
    @Nullable
    public final android.view.View viewToolBar;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.SandPayCodeModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SandPayCodeBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.etAuthCode = (android.widget.EditText) bindings[3];
        this.flScanFrame = (android.widget.FrameLayout) bindings[5];
        this.ivScanExample = (android.widget.ImageView) bindings[7];
        this.ivScanNeedle = (android.widget.ImageView) bindings[6];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.surfaceView = (android.view.SurfaceView) bindings[1];
        this.surfaceView.setTag(null);
        this.tvPersonalPay = (android.widget.TextView) bindings[4];
        this.viewToolBar = (android.view.View) bindings[2];
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
            setViewModel((ys.app.pad.viewmodel.SandPayCodeModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.SandPayCodeModel ViewModel) {
        updateRegistration(1, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.SandPayCodeModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsT1miniShow((android.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModel((ys.app.pad.viewmodel.SandPayCodeModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsT1miniShow(android.databinding.ObservableField<java.lang.Boolean> ViewModelIsT1miniShow, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.SandPayCodeModel ViewModel, int fieldId) {
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
        android.databinding.ObservableField<java.lang.Boolean> viewModelIsT1miniShow = null;
        java.lang.Boolean viewModelIsT1miniShowGet = null;
        int viewModelIsT1miniShowViewVISIBLEViewGONE = 0;
        boolean androidDatabindingDynamicUtilSafeUnboxViewModelIsT1miniShowGet = false;
        ys.app.pad.viewmodel.SandPayCodeModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.isT1miniShow
                    viewModelIsT1miniShow = viewModel.isT1miniShow;
                }
                updateRegistration(0, viewModelIsT1miniShow);


                if (viewModelIsT1miniShow != null) {
                    // read viewModel.isT1miniShow.get()
                    viewModelIsT1miniShowGet = viewModelIsT1miniShow.get();
                }


                // read android.databinding.DynamicUtil.safeUnbox(viewModel.isT1miniShow.get())
                androidDatabindingDynamicUtilSafeUnboxViewModelIsT1miniShowGet = android.databinding.DynamicUtil.safeUnbox(viewModelIsT1miniShowGet);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidDatabindingDynamicUtilSafeUnboxViewModelIsT1miniShowGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read android.databinding.DynamicUtil.safeUnbox(viewModel.isT1miniShow.get()) ? View.VISIBLE : View.GONE
                viewModelIsT1miniShowViewVISIBLEViewGONE = ((androidDatabindingDynamicUtilSafeUnboxViewModelIsT1miniShowGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.surfaceView.setVisibility(viewModelIsT1miniShowViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static SandPayCodeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SandPayCodeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<SandPayCodeBinding>inflate(inflater, ys.app.pad.R.layout.activity_sand_pay_code, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static SandPayCodeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SandPayCodeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_sand_pay_code, null, false), bindingComponent);
    }
    @NonNull
    public static SandPayCodeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static SandPayCodeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_sand_pay_code_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new SandPayCodeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.isT1miniShow
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): android.databinding.DynamicUtil.safeUnbox(viewModel.isT1miniShow.get()) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): android.databinding.DynamicUtil.safeUnbox(viewModel.isT1miniShow.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}