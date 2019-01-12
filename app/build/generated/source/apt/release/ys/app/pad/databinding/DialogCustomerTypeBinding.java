package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogCustomerTypeBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tabLayout, 11);
        sViewsWithIds.put(R.id.down_ll, 12);
        sViewsWithIds.put(R.id.rl_dialog_collect_vip, 13);
        sViewsWithIds.put(R.id.textView6, 14);
    }
    // views
    @NonNull
    public final android.widget.EditText animalEt;
    @NonNull
    public final android.widget.TextView cancelTv;
    @NonNull
    public final android.widget.LinearLayout downLl;
    @NonNull
    public final android.widget.ImageView ivDialogSearchCard;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.widget.EditText nameEt;
    @NonNull
    public final android.widget.LinearLayout notVipLl;
    @NonNull
    public final android.widget.TextView okTv;
    @NonNull
    public final android.widget.EditText phoneEt;
    @NonNull
    public final android.support.v7.widget.RecyclerView rlDialogCollectVip;
    @NonNull
    public final android.support.design.widget.TabLayout tabLayout;
    @NonNull
    public final android.widget.TextView textView6;
    @NonNull
    public final android.widget.EditText vipCardEt;
    @NonNull
    public final android.widget.LinearLayout vipLl;
    @NonNull
    public final android.widget.EditText vipPhoneEt;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.CustomerTypeViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickJumpAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener animalEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mAnimalName.get()
            //         is viewModel.mAnimalName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(animalEt);
            // localize variables for thread safety
            // viewModel.mAnimalName.get()
            java.lang.String viewModelMAnimalNameGet = null;
            // viewModel.mAnimalName
            android.databinding.ObservableField<java.lang.String> viewModelMAnimalName = null;
            // viewModel
            ys.app.pad.viewmodel.CustomerTypeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.mAnimalName != null
            boolean viewModelMAnimalNameJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMAnimalName = viewModel.mAnimalName;

                viewModelMAnimalNameJavaLangObjectNull = (viewModelMAnimalName) != (null);
                if (viewModelMAnimalNameJavaLangObjectNull) {




                    viewModelMAnimalName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener nameEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mName.get()
            //         is viewModel.mName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(nameEt);
            // localize variables for thread safety
            // viewModel.mName != null
            boolean viewModelMNameJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.CustomerTypeViewModel viewModel = mViewModel;
            // viewModel.mName.get()
            java.lang.String viewModelMNameGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.mName
            android.databinding.ObservableField<java.lang.String> viewModelMName = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMName = viewModel.mName;

                viewModelMNameJavaLangObjectNull = (viewModelMName) != (null);
                if (viewModelMNameJavaLangObjectNull) {




                    viewModelMName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener phoneEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mPhone.get()
            //         is viewModel.mPhone.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(phoneEt);
            // localize variables for thread safety
            // viewModel.mPhone != null
            boolean viewModelMPhoneJavaLangObjectNull = false;
            // viewModel.mPhone
            android.databinding.ObservableField<java.lang.String> viewModelMPhone = null;
            // viewModel
            ys.app.pad.viewmodel.CustomerTypeViewModel viewModel = mViewModel;
            // viewModel.mPhone.get()
            java.lang.String viewModelMPhoneGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMPhone = viewModel.mPhone;

                viewModelMPhoneJavaLangObjectNull = (viewModelMPhone) != (null);
                if (viewModelMPhoneJavaLangObjectNull) {




                    viewModelMPhone.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener vipCardEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mVipCard.get()
            //         is viewModel.mVipCard.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(vipCardEt);
            // localize variables for thread safety
            // viewModel.mVipCard != null
            boolean viewModelMVipCardJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.CustomerTypeViewModel viewModel = mViewModel;
            // viewModel.mVipCard
            android.databinding.ObservableField<java.lang.String> viewModelMVipCard = null;
            // viewModel.mVipCard.get()
            java.lang.String viewModelMVipCardGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMVipCard = viewModel.mVipCard;

                viewModelMVipCardJavaLangObjectNull = (viewModelMVipCard) != (null);
                if (viewModelMVipCardJavaLangObjectNull) {




                    viewModelMVipCard.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener vipPhoneEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mVipPhone.get()
            //         is viewModel.mVipPhone.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(vipPhoneEt);
            // localize variables for thread safety
            // viewModel.mVipPhone
            android.databinding.ObservableField<java.lang.String> viewModelMVipPhone = null;
            // viewModel.mVipPhone != null
            boolean viewModelMVipPhoneJavaLangObjectNull = false;
            // viewModel.mVipPhone.get()
            java.lang.String viewModelMVipPhoneGet = null;
            // viewModel
            ys.app.pad.viewmodel.CustomerTypeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMVipPhone = viewModel.mVipPhone;

                viewModelMVipPhoneJavaLangObjectNull = (viewModelMVipPhone) != (null);
                if (viewModelMVipPhoneJavaLangObjectNull) {




                    viewModelMVipPhone.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public DialogCustomerTypeBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 7);
        final Object[] bindings = mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds);
        this.animalEt = (android.widget.EditText) bindings[4];
        this.animalEt.setTag(null);
        this.cancelTv = (android.widget.TextView) bindings[5];
        this.cancelTv.setTag(null);
        this.downLl = (android.widget.LinearLayout) bindings[12];
        this.ivDialogSearchCard = (android.widget.ImageView) bindings[9];
        this.ivDialogSearchCard.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nameEt = (android.widget.EditText) bindings[2];
        this.nameEt.setTag(null);
        this.notVipLl = (android.widget.LinearLayout) bindings[1];
        this.notVipLl.setTag(null);
        this.okTv = (android.widget.TextView) bindings[6];
        this.okTv.setTag(null);
        this.phoneEt = (android.widget.EditText) bindings[3];
        this.phoneEt.setTag(null);
        this.rlDialogCollectVip = (android.support.v7.widget.RecyclerView) bindings[13];
        this.tabLayout = (android.support.design.widget.TabLayout) bindings[11];
        this.textView6 = (android.widget.TextView) bindings[14];
        this.vipCardEt = (android.widget.EditText) bindings[10];
        this.vipCardEt.setTag(null);
        this.vipLl = (android.widget.LinearLayout) bindings[7];
        this.vipLl.setTag(null);
        this.vipPhoneEt = (android.widget.EditText) bindings[8];
        this.vipPhoneEt.setTag(null);
        setRootTag(root);
        // listeners
        mCallback41 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setViewModel((ys.app.pad.viewmodel.CustomerTypeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.CustomerTypeViewModel ViewModel) {
        updateRegistration(6, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.CustomerTypeViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMAnimalName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelMVipPhone((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelObPosition((android.databinding.ObservableInt) object, fieldId);
            case 3 :
                return onChangeViewModelMVipCard((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelMName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelMPhone((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModel((ys.app.pad.viewmodel.CustomerTypeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMAnimalName(android.databinding.ObservableField<java.lang.String> ViewModelMAnimalName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMVipPhone(android.databinding.ObservableField<java.lang.String> ViewModelMVipPhone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObPosition(android.databinding.ObservableInt ViewModelObPosition, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMVipCard(android.databinding.ObservableField<java.lang.String> ViewModelMVipCard, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMName(android.databinding.ObservableField<java.lang.String> ViewModelMName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMPhone(android.databinding.ObservableField<java.lang.String> ViewModelMPhone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.CustomerTypeViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        android.databinding.ObservableField<java.lang.String> viewModelMAnimalName = null;
        android.view.View.OnClickListener viewModelClickJumpAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelMVipPhone = null;
        android.databinding.ObservableInt viewModelObPosition = null;
        android.databinding.ObservableField<java.lang.String> viewModelMVipCard = null;
        java.lang.String viewModelMNameGet = null;
        java.lang.String viewModelMAnimalNameGet = null;
        int viewModelObPositionInt1ViewVISIBLEViewGONE = 0;
        boolean viewModelObPositionInt0 = false;
        android.databinding.ObservableField<java.lang.String> viewModelMName = null;
        java.lang.String viewModelMPhoneGet = null;
        boolean viewModelObPositionInt1 = false;
        android.databinding.ObservableField<java.lang.String> viewModelMPhone = null;
        java.lang.String viewModelMVipCardGet = null;
        java.lang.String viewModelMVipPhoneGet = null;
        int viewModelObPositionInt0ViewVISIBLEViewGONE = 0;
        ys.app.pad.viewmodel.CustomerTypeViewModel viewModel = mViewModel;
        int viewModelObPositionGet = 0;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mAnimalName
                        viewModelMAnimalName = viewModel.mAnimalName;
                    }
                    updateRegistration(0, viewModelMAnimalName);


                    if (viewModelMAnimalName != null) {
                        // read viewModel.mAnimalName.get()
                        viewModelMAnimalNameGet = viewModelMAnimalName.get();
                    }
            }
            if ((dirtyFlags & 0xc0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickJump
                        viewModelClickJumpAndroidViewViewOnClickListener = (((mViewModelClickJumpAndroidViewViewOnClickListener == null) ? (mViewModelClickJumpAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickJumpAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mVipPhone
                        viewModelMVipPhone = viewModel.mVipPhone;
                    }
                    updateRegistration(1, viewModelMVipPhone);


                    if (viewModelMVipPhone != null) {
                        // read viewModel.mVipPhone.get()
                        viewModelMVipPhoneGet = viewModelMVipPhone.get();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obPosition
                        viewModelObPosition = viewModel.obPosition;
                    }
                    updateRegistration(2, viewModelObPosition);


                    if (viewModelObPosition != null) {
                        // read viewModel.obPosition.get()
                        viewModelObPositionGet = viewModelObPosition.get();
                    }


                    // read viewModel.obPosition.get() == 0
                    viewModelObPositionInt0 = (viewModelObPositionGet) == (0);
                    // read viewModel.obPosition.get() == 1
                    viewModelObPositionInt1 = (viewModelObPositionGet) == (1);
                if((dirtyFlags & 0xc4L) != 0) {
                    if(viewModelObPositionInt0) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0xc4L) != 0) {
                    if(viewModelObPositionInt1) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewModel.obPosition.get() == 0 ? View.VISIBLE : View.GONE
                    viewModelObPositionInt0ViewVISIBLEViewGONE = ((viewModelObPositionInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.obPosition.get() == 1 ? View.VISIBLE : View.GONE
                    viewModelObPositionInt1ViewVISIBLEViewGONE = ((viewModelObPositionInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mVipCard
                        viewModelMVipCard = viewModel.mVipCard;
                    }
                    updateRegistration(3, viewModelMVipCard);


                    if (viewModelMVipCard != null) {
                        // read viewModel.mVipCard.get()
                        viewModelMVipCardGet = viewModelMVipCard.get();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mName
                        viewModelMName = viewModel.mName;
                    }
                    updateRegistration(4, viewModelMName);


                    if (viewModelMName != null) {
                        // read viewModel.mName.get()
                        viewModelMNameGet = viewModelMName.get();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mPhone
                        viewModelMPhone = viewModel.mPhone;
                    }
                    updateRegistration(5, viewModelMPhone);


                    if (viewModelMPhone != null) {
                        // read viewModel.mPhone.get()
                        viewModelMPhoneGet = viewModelMPhone.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.animalEt, viewModelMAnimalNameGet);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.animalEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, animalEtandroidTextAttrChanged);
            this.ivDialogSearchCard.setOnClickListener(mCallback41);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.nameEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nameEtandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.phoneEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, phoneEtandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.vipCardEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, vipCardEtandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.vipPhoneEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, vipPhoneEtandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.cancelTv.setOnClickListener(viewModelClickJumpAndroidViewViewOnClickListener);
            this.okTv.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameEt, viewModelMNameGet);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            this.notVipLl.setVisibility(viewModelObPositionInt1ViewVISIBLEViewGONE);
            this.vipLl.setVisibility(viewModelObPositionInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.phoneEt, viewModelMPhoneGet);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.vipCardEt, viewModelMVipCardGet);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.vipPhoneEt, viewModelMVipPhoneGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CustomerTypeViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.CustomerTypeViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickJump(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CustomerTypeViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.pad.viewmodel.CustomerTypeViewModel value) {
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
        ys.app.pad.viewmodel.CustomerTypeViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.searchCardNo();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static DialogCustomerTypeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogCustomerTypeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<DialogCustomerTypeBinding>inflate(inflater, ys.app.pad.R.layout.dialog_customer_type, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static DialogCustomerTypeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogCustomerTypeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.dialog_customer_type, null, false), bindingComponent);
    }
    @NonNull
    public static DialogCustomerTypeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogCustomerTypeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/dialog_customer_type_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new DialogCustomerTypeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.mAnimalName
        flag 1 (0x2L): viewModel.mVipPhone
        flag 2 (0x3L): viewModel.obPosition
        flag 3 (0x4L): viewModel.mVipCard
        flag 4 (0x5L): viewModel.mName
        flag 5 (0x6L): viewModel.mPhone
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): viewModel.obPosition.get() == 1 ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.obPosition.get() == 1 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.obPosition.get() == 0 ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.obPosition.get() == 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}