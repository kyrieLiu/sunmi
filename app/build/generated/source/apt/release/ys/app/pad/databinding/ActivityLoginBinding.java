package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_title, 4);
        sViewsWithIds.put(R.id.root_rl, 5);
        sViewsWithIds.put(R.id.root_r2, 6);
        sViewsWithIds.put(R.id.iv_login_password, 7);
    }
    // views
    @NonNull
    public final android.widget.ImageView ivLoginPassword;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.Button mboundView3;
    @NonNull
    public final android.widget.EditText pswEt;
    @NonNull
    public final android.widget.LinearLayout rootR2;
    @NonNull
    public final android.widget.LinearLayout rootRl;
    @NonNull
    public final android.widget.TextView tvTitle;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.LoginViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener pswEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.psw
            //         is viewModel.setPsw((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(pswEt);
            // localize variables for thread safety
            // viewModel.psw
            java.lang.String viewModelPsw = null;
            // viewModel
            ys.app.pad.viewmodel.LoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setPsw(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityLoginBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.ivLoginPassword = (android.widget.ImageView) bindings[7];
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        this.pswEt = (android.widget.EditText) bindings[1];
        this.pswEt.setTag(null);
        this.rootR2 = (android.widget.LinearLayout) bindings[6];
        this.rootRl = (android.widget.LinearLayout) bindings[5];
        this.tvTitle = (android.widget.TextView) bindings[4];
        setRootTag(root);
        // listeners
        mCallback4 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            setViewModel((ys.app.pad.viewmodel.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.LoginViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.LoginViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((ys.app.pad.viewmodel.LoginViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.LoginViewModel ViewModel, int fieldId) {
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
        java.lang.String viewModelPsw = null;
        ys.app.pad.viewmodel.LoginViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::clickButton
                    viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel.psw
                    viewModelPsw = viewModel.getPsw();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback4);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.pswEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, pswEtandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.pswEt, viewModelPsw);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.LoginViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.LoginViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ys.app.pad.viewmodel.LoginViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.forgetPwdClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityLoginBinding>inflate(inflater, ys.app.pad.R.layout.activity_login, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_login, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityLoginBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_login_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityLoginBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}