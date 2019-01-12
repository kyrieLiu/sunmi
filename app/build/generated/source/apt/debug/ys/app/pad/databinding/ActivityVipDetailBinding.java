package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityVipDetailBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_vip_detail_menu, 10);
        sViewsWithIds.put(R.id.iv0, 11);
        sViewsWithIds.put(R.id.textView3, 12);
        sViewsWithIds.put(R.id.iv1, 13);
        sViewsWithIds.put(R.id.iv2, 14);
        sViewsWithIds.put(R.id.tv_vip_detail_cardNO, 15);
        sViewsWithIds.put(R.id.iv3, 16);
        sViewsWithIds.put(R.id.tv_vip_detail_type, 17);
        sViewsWithIds.put(R.id.iv4, 18);
        sViewsWithIds.put(R.id.ll_vip_detail_birthday, 19);
        sViewsWithIds.put(R.id.tv_vip_detail_birthday_name, 20);
        sViewsWithIds.put(R.id.iv6, 21);
        sViewsWithIds.put(R.id.recyclerView, 22);
    }
    // views
    @NonNull
    public final android.widget.ImageView iv0;
    @NonNull
    public final android.widget.ImageView iv1;
    @NonNull
    public final android.widget.ImageView iv2;
    @NonNull
    public final android.widget.ImageView iv3;
    @NonNull
    public final android.widget.ImageView iv4;
    @NonNull
    public final android.widget.ImageView iv6;
    @NonNull
    public final android.widget.LinearLayout ll;
    @NonNull
    public final android.widget.LinearLayout llVipDetailBirthday;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.RelativeLayout mboundView8;
    @NonNull
    private final android.widget.ImageView mboundView9;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    @NonNull
    public final android.support.v7.widget.RecyclerView rlVipDetailMenu;
    @NonNull
    public final android.widget.TextView textView3;
    @NonNull
    public final android.widget.TextView tvVipDetailBirthdayName;
    @NonNull
    public final android.widget.TextView tvVipDetailCardNO;
    @NonNull
    public final android.widget.TextView tvVipDetailName;
    @NonNull
    public final android.widget.TextView tvVipDetailPhone;
    @NonNull
    public final android.widget.TextView tvVipDetailType;
    @NonNull
    public final android.widget.TextView tvVipcardDetailType;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.vip.VipDetailViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback71;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityVipDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds);
        this.iv0 = (android.widget.ImageView) bindings[11];
        this.iv1 = (android.widget.ImageView) bindings[13];
        this.iv2 = (android.widget.ImageView) bindings[14];
        this.iv3 = (android.widget.ImageView) bindings[16];
        this.iv4 = (android.widget.ImageView) bindings[18];
        this.iv6 = (android.widget.ImageView) bindings[21];
        this.ll = (android.widget.LinearLayout) bindings[1];
        this.ll.setTag(null);
        this.llVipDetailBirthday = (android.widget.LinearLayout) bindings[19];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.RelativeLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[22];
        this.rlVipDetailMenu = (android.support.v7.widget.RecyclerView) bindings[10];
        this.textView3 = (android.widget.TextView) bindings[12];
        this.tvVipDetailBirthdayName = (android.widget.TextView) bindings[20];
        this.tvVipDetailCardNO = (android.widget.TextView) bindings[15];
        this.tvVipDetailName = (android.widget.TextView) bindings[2];
        this.tvVipDetailName.setTag(null);
        this.tvVipDetailPhone = (android.widget.TextView) bindings[3];
        this.tvVipDetailPhone.setTag(null);
        this.tvVipDetailType = (android.widget.TextView) bindings[17];
        this.tvVipcardDetailType = (android.widget.TextView) bindings[6];
        this.tvVipcardDetailType.setTag(null);
        setRootTag(root);
        // listeners
        mCallback71 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((ys.app.pad.viewmodel.vip.VipDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.vip.VipDetailViewModel ViewModel) {
        updateRegistration(3, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.vip.VipDetailViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelMInfo((ys.app.pad.model.VipInfo) object, fieldId);
            case 2 :
                return onChangeViewModelIsAnimal((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModel((ys.app.pad.viewmodel.vip.VipDetailViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMoney(android.databinding.ObservableField<java.lang.String> ViewModelMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMInfo(ys.app.pad.model.VipInfo ViewModelMInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsAnimal(android.databinding.ObservableBoolean ViewModelIsAnimal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.vip.VipDetailViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.info) {
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
        java.lang.String viewModelMInfoName = null;
        java.lang.String viewModelMoneyGet = null;
        int viewModelIsAnimalViewVISIBLEViewGONE = 0;
        java.lang.String stringValueOfViewModelMInfoIntegral = null;
        int viewModelIsAnimalViewGONEViewVISIBLE = 0;
        boolean viewModelIsAnimalGet = false;
        int viewModelMInfoIntegral = 0;
        java.lang.String viewModelMInfoTypeName = null;
        java.lang.String viewModelMInfoCardNo = null;
        java.lang.String viewModelMInfoPhone = null;
        android.databinding.ObservableField<java.lang.String> viewModelMoney = null;
        ys.app.pad.model.VipInfo viewModelMInfo = null;
        android.databinding.ObservableBoolean viewModelIsAnimal = null;
        ys.app.pad.viewmodel.vip.VipDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.money
                        viewModelMoney = viewModel.money;
                    }
                    updateRegistration(0, viewModelMoney);


                    if (viewModelMoney != null) {
                        // read viewModel.money.get()
                        viewModelMoneyGet = viewModelMoney.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mInfo
                        viewModelMInfo = viewModel.mInfo;
                    }
                    updateRegistration(1, viewModelMInfo);


                    if (viewModelMInfo != null) {
                        // read viewModel.mInfo.name
                        viewModelMInfoName = viewModelMInfo.getName();
                        // read viewModel.mInfo.integral
                        viewModelMInfoIntegral = viewModelMInfo.getIntegral();
                        // read viewModel.mInfo.typeName
                        viewModelMInfoTypeName = viewModelMInfo.getTypeName();
                        // read viewModel.mInfo.cardNo
                        viewModelMInfoCardNo = viewModelMInfo.getCardNo();
                        // read viewModel.mInfo.phone
                        viewModelMInfoPhone = viewModelMInfo.getPhone();
                    }


                    // read String.valueOf(viewModel.mInfo.integral)
                    stringValueOfViewModelMInfoIntegral = java.lang.String.valueOf(viewModelMInfoIntegral);
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isAnimal
                        viewModelIsAnimal = viewModel.isAnimal;
                    }
                    updateRegistration(2, viewModelIsAnimal);


                    if (viewModelIsAnimal != null) {
                        // read viewModel.isAnimal.get()
                        viewModelIsAnimalGet = viewModelIsAnimal.get();
                    }
                if((dirtyFlags & 0x1cL) != 0) {
                    if(viewModelIsAnimalGet) {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.isAnimal.get() ? View.VISIBLE : View.GONE
                    viewModelIsAnimalViewVISIBLEViewGONE = ((viewModelIsAnimalGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.isAnimal.get() ? View.GONE : View.VISIBLE
                    viewModelIsAnimalViewGONEViewVISIBLE = ((viewModelIsAnimalGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelMInfoCardNo);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, stringValueOfViewModelMInfoIntegral);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvVipDetailName, viewModelMInfoName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvVipDetailPhone, viewModelMInfoPhone);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvVipcardDetailType, viewModelMInfoTypeName);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelMoneyGet);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.mboundView8.setVisibility(viewModelIsAnimalViewVISIBLEViewGONE);
            this.mboundView9.setVisibility(viewModelIsAnimalViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView9.setOnClickListener(mCallback71);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ys.app.pad.viewmodel.vip.VipDetailViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.clickAddAnimal();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityVipDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityVipDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityVipDetailBinding>inflate(inflater, ys.app.pad.R.layout.activity_vip_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityVipDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityVipDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_vip_detail, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityVipDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityVipDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_vip_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityVipDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.money
        flag 1 (0x2L): viewModel.mInfo
        flag 2 (0x3L): viewModel.isAnimal
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.isAnimal.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.isAnimal.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.isAnimal.get() ? View.GONE : View.VISIBLE
        flag 8 (0x9L): viewModel.isAnimal.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}