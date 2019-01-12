package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ServiceDetailActivityBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 18);
        sViewsWithIds.put(R.id.iv0, 19);
        sViewsWithIds.put(R.id.iv2, 20);
        sViewsWithIds.put(R.id.iv4, 21);
        sViewsWithIds.put(R.id.iv5, 22);
        sViewsWithIds.put(R.id.iv6, 23);
        sViewsWithIds.put(R.id.tv0, 24);
        sViewsWithIds.put(R.id.tv1, 25);
        sViewsWithIds.put(R.id.discount, 26);
        sViewsWithIds.put(R.id.zhekou_cuxiaojia_tv, 27);
        sViewsWithIds.put(R.id.discount_on, 28);
        sViewsWithIds.put(R.id.lijian_cuxiaojia_tv, 29);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout discount;
    @NonNull
    public final android.widget.LinearLayout discountOn;
    @NonNull
    public final android.widget.ImageView img1;
    @NonNull
    public final android.widget.ImageView iv0;
    @NonNull
    public final android.widget.ImageView iv2;
    @NonNull
    public final android.widget.ImageView iv4;
    @NonNull
    public final android.widget.ImageView iv5;
    @NonNull
    public final android.widget.ImageView iv6;
    @NonNull
    public final android.widget.TextView lijianCuxiaojiaTv;
    @NonNull
    public final android.widget.EditText lijianEt;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView10;
    @NonNull
    private final android.widget.LinearLayout mboundView12;
    @NonNull
    private final android.widget.EditText mboundView14;
    @NonNull
    private final android.widget.EditText mboundView15;
    @NonNull
    private final android.widget.Button mboundView17;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    @NonNull
    private final android.widget.TextView mboundView9;
    @NonNull
    public final android.widget.ImageView selectIv0;
    @NonNull
    public final android.widget.LinearLayout serviceLl;
    @NonNull
    public final android.widget.TextView tv0;
    @NonNull
    public final android.widget.TextView tv1;
    @NonNull
    public final android.view.View view;
    @NonNull
    public final android.widget.TextView zhekouCuxiaojiaTv;
    @NonNull
    public final android.widget.EditText zhekouEt;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.ServiceDetailViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener lijianEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.ykjString.get()
            //         is viewModel.ykjString.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(lijianEt);
            // localize variables for thread safety
            // viewModel.ykjString
            android.databinding.ObservableField<java.lang.String> viewModelYkjString = null;
            // viewModel.ykjString.get()
            java.lang.String viewModelYkjStringGet = null;
            // viewModel.ykjString != null
            boolean viewModelYkjStringJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelYkjString = viewModel.ykjString;

                viewModelYkjStringJavaLangObjectNull = (viewModelYkjString) != (null);
                if (viewModelYkjStringJavaLangObjectNull) {




                    viewModelYkjString.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView14androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obCostBeginDate.get()
            //         is viewModel.obCostBeginDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView14);
            // localize variables for thread safety
            // viewModel.obCostBeginDate
            android.databinding.ObservableField<java.lang.String> viewModelObCostBeginDate = null;
            // viewModel.obCostBeginDate != null
            boolean viewModelObCostBeginDateJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
            // viewModel.obCostBeginDate.get()
            java.lang.String viewModelObCostBeginDateGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObCostBeginDate = viewModel.obCostBeginDate;

                viewModelObCostBeginDateJavaLangObjectNull = (viewModelObCostBeginDate) != (null);
                if (viewModelObCostBeginDateJavaLangObjectNull) {




                    viewModelObCostBeginDate.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView15androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obCostEndDate.get()
            //         is viewModel.obCostEndDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView15);
            // localize variables for thread safety
            // viewModel.obCostEndDate.get()
            java.lang.String viewModelObCostEndDateGet = null;
            // viewModel.obCostEndDate
            android.databinding.ObservableField<java.lang.String> viewModelObCostEndDate = null;
            // viewModel
            ys.app.pad.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obCostEndDate != null
            boolean viewModelObCostEndDateJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObCostEndDate = viewModel.obCostEndDate;

                viewModelObCostEndDateJavaLangObjectNull = (viewModelObCostEndDate) != (null);
                if (viewModelObCostEndDateJavaLangObjectNull) {




                    viewModelObCostEndDate.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.selectType.get()
            //         is viewModel.selectType.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // viewModel.selectType != null
            boolean viewModelSelectTypeJavaLangObjectNull = false;
            // viewModel.selectType.get()
            java.lang.String viewModelSelectTypeGet = null;
            // viewModel.selectType
            android.databinding.ObservableField<java.lang.String> viewModelSelectType = null;
            // viewModel
            ys.app.pad.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSelectType = viewModel.selectType;

                viewModelSelectTypeJavaLangObjectNull = (viewModelSelectType) != (null);
                if (viewModelSelectTypeJavaLangObjectNull) {




                    viewModelSelectType.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener zhekouEtandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.discountString.get()
            //         is viewModel.discountString.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(zhekouEt);
            // localize variables for thread safety
            // viewModel.discountString
            android.databinding.ObservableField<java.lang.String> viewModelDiscountString = null;
            // viewModel
            ys.app.pad.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.discountString.get()
            java.lang.String viewModelDiscountStringGet = null;
            // viewModel.discountString != null
            boolean viewModelDiscountStringJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelDiscountString = viewModel.discountString;

                viewModelDiscountStringJavaLangObjectNull = (viewModelDiscountString) != (null);
                if (viewModelDiscountStringJavaLangObjectNull) {




                    viewModelDiscountString.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ServiceDetailActivityBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 10);
        final Object[] bindings = mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds);
        this.discount = (android.widget.LinearLayout) bindings[26];
        this.discountOn = (android.widget.LinearLayout) bindings[28];
        this.img1 = (android.widget.ImageView) bindings[16];
        this.img1.setTag(null);
        this.iv0 = (android.widget.ImageView) bindings[19];
        this.iv2 = (android.widget.ImageView) bindings[20];
        this.iv4 = (android.widget.ImageView) bindings[21];
        this.iv5 = (android.widget.ImageView) bindings[22];
        this.iv6 = (android.widget.ImageView) bindings[23];
        this.lijianCuxiaojiaTv = (android.widget.TextView) bindings[29];
        this.lijianEt = (android.widget.EditText) bindings[13];
        this.lijianEt.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.LinearLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView12 = (android.widget.LinearLayout) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView14 = (android.widget.EditText) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.EditText) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView17 = (android.widget.Button) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.selectIv0 = (android.widget.ImageView) bindings[8];
        this.selectIv0.setTag(null);
        this.serviceLl = (android.widget.LinearLayout) bindings[1];
        this.serviceLl.setTag(null);
        this.tv0 = (android.widget.TextView) bindings[24];
        this.tv1 = (android.widget.TextView) bindings[25];
        this.view = (android.view.View) bindings[18];
        this.zhekouCuxiaojiaTv = (android.widget.TextView) bindings[27];
        this.zhekouEt = (android.widget.EditText) bindings[11];
        this.zhekouEt.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback13 = new android.databinding.generated.callback.OnClickListener(this, 5);
        mCallback14 = new android.databinding.generated.callback.OnClickListener(this, 6);
        mCallback11 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback12 = new android.databinding.generated.callback.OnClickListener(this, 4);
        mCallback10 = new android.databinding.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8000L;
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
            setViewModel((ys.app.pad.viewmodel.ServiceDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.ServiceDetailViewModel ViewModel) {
        updateRegistration(9, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.ServiceDetailViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSelectType((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelSelectTypeId((android.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeViewModelObCostBeginDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelYkjString((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelMResult((ys.app.pad.model.ServiceInfo) object, fieldId);
            case 5 :
                return onChangeViewModelDiscountString((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelObCostEndDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelVipPic((android.databinding.ObservableBoolean) object, fieldId);
            case 8 :
                return onChangeViewModelPromotion((android.databinding.ObservableBoolean) object, fieldId);
            case 9 :
                return onChangeViewModel((ys.app.pad.viewmodel.ServiceDetailViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSelectType(android.databinding.ObservableField<java.lang.String> ViewModelSelectType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectTypeId(android.databinding.ObservableInt ViewModelSelectTypeId, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObCostBeginDate(android.databinding.ObservableField<java.lang.String> ViewModelObCostBeginDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelYkjString(android.databinding.ObservableField<java.lang.String> ViewModelYkjString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMResult(ys.app.pad.model.ServiceInfo ViewModelMResult, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.typeName) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        else if (fieldId == BR.costAmt) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        else if (fieldId == BR.realAmt) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        else if (fieldId == BR.vipAmt) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDiscountString(android.databinding.ObservableField<java.lang.String> ViewModelDiscountString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObCostEndDate(android.databinding.ObservableField<java.lang.String> ViewModelObCostEndDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVipPic(android.databinding.ObservableBoolean ViewModelVipPic, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPromotion(android.databinding.ObservableBoolean ViewModelPromotion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.ServiceDetailViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        java.lang.String viewModelMResultName = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMResultVipAmt = null;
        android.databinding.ObservableField<java.lang.String> viewModelSelectType = null;
        android.databinding.ObservableInt viewModelSelectTypeId = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMResultVipAmtMboundView6AndroidStringYuan = null;
        boolean viewModelSelectTypeIdInt2 = false;
        boolean viewModelPromotionGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObCostBeginDate = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMResultCostAmt = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMResultRealAmtMboundView5AndroidStringYuan = null;
        android.databinding.ObservableField<java.lang.String> viewModelYkjString = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMResultRealAmt = null;
        double viewModelMResultVipAmt = 0.0;
        int viewModelSelectTypeIdInt2ViewVISIBLEViewGONE = 0;
        ys.app.pad.model.ServiceInfo viewModelMResult = null;
        java.lang.String viewModelYkjStringGet = null;
        java.lang.String viewModelObCostBeginDateGet = null;
        int viewModelPromotionViewVISIBLEViewGONE = 0;
        java.lang.String appUtilFormatStandardMoneyViewModelMResultCostAmtMboundView4AndroidStringYuan = null;
        android.databinding.ObservableField<java.lang.String> viewModelDiscountString = null;
        boolean viewModelVipPicGet = false;
        java.lang.String viewModelDiscountStringGet = null;
        java.lang.String viewModelMResultTypeName = null;
        double viewModelMResultCostAmt = 0.0;
        java.lang.String viewModelObCostEndDateGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObCostEndDate = null;
        android.databinding.ObservableBoolean viewModelVipPic = null;
        double viewModelMResultRealAmt = 0.0;
        int viewModelSelectTypeIdGet = 0;
        java.lang.String viewModelSelectTypeGet = null;
        android.databinding.ObservableBoolean viewModelPromotion = null;
        boolean viewModelSelectTypeIdInt1 = false;
        int viewModelSelectTypeIdInt1ViewVISIBLEViewGONE = 0;
        ys.app.pad.viewmodel.ServiceDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xffffL) != 0) {


            if ((dirtyFlags & 0x8201L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectType
                        viewModelSelectType = viewModel.selectType;
                    }
                    updateRegistration(0, viewModelSelectType);


                    if (viewModelSelectType != null) {
                        // read viewModel.selectType.get()
                        viewModelSelectTypeGet = viewModelSelectType.get();
                    }
            }
            if ((dirtyFlags & 0x8202L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectTypeId
                        viewModelSelectTypeId = viewModel.selectTypeId;
                    }
                    updateRegistration(1, viewModelSelectTypeId);


                    if (viewModelSelectTypeId != null) {
                        // read viewModel.selectTypeId.get()
                        viewModelSelectTypeIdGet = viewModelSelectTypeId.get();
                    }


                    // read viewModel.selectTypeId.get() == 2
                    viewModelSelectTypeIdInt2 = (viewModelSelectTypeIdGet) == (2);
                    // read viewModel.selectTypeId.get() == 1
                    viewModelSelectTypeIdInt1 = (viewModelSelectTypeIdGet) == (1);
                if((dirtyFlags & 0x8202L) != 0) {
                    if(viewModelSelectTypeIdInt2) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x8202L) != 0) {
                    if(viewModelSelectTypeIdInt1) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }


                    // read viewModel.selectTypeId.get() == 2 ? View.VISIBLE : View.GONE
                    viewModelSelectTypeIdInt2ViewVISIBLEViewGONE = ((viewModelSelectTypeIdInt2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.selectTypeId.get() == 1 ? View.VISIBLE : View.GONE
                    viewModelSelectTypeIdInt1ViewVISIBLEViewGONE = ((viewModelSelectTypeIdInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x8204L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obCostBeginDate
                        viewModelObCostBeginDate = viewModel.obCostBeginDate;
                    }
                    updateRegistration(2, viewModelObCostBeginDate);


                    if (viewModelObCostBeginDate != null) {
                        // read viewModel.obCostBeginDate.get()
                        viewModelObCostBeginDateGet = viewModelObCostBeginDate.get();
                    }
            }
            if ((dirtyFlags & 0x8208L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ykjString
                        viewModelYkjString = viewModel.ykjString;
                    }
                    updateRegistration(3, viewModelYkjString);


                    if (viewModelYkjString != null) {
                        // read viewModel.ykjString.get()
                        viewModelYkjStringGet = viewModelYkjString.get();
                    }
            }
            if ((dirtyFlags & 0xfe10L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mResult
                        viewModelMResult = viewModel.mResult;
                    }
                    updateRegistration(4, viewModelMResult);

                if ((dirtyFlags & 0x8610L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.name
                            viewModelMResultName = viewModelMResult.getName();
                        }
                }
                if ((dirtyFlags & 0xc210L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.vipAmt
                            viewModelMResultVipAmt = viewModelMResult.getVipAmt();
                        }


                        // read AppUtil.formatStandardMoney(viewModel.mResult.vipAmt)
                        appUtilFormatStandardMoneyViewModelMResultVipAmt = ys.app.pad.utils.AppUtil.formatStandardMoney(viewModelMResultVipAmt);


                        // read (AppUtil.formatStandardMoney(viewModel.mResult.vipAmt)) + (@android:string/yuan)
                        appUtilFormatStandardMoneyViewModelMResultVipAmtMboundView6AndroidStringYuan = (appUtilFormatStandardMoneyViewModelMResultVipAmt) + (mboundView6.getResources().getString(R.string.yuan));
                }
                if ((dirtyFlags & 0x8a10L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.typeName
                            viewModelMResultTypeName = viewModelMResult.getTypeName();
                        }
                }
                if ((dirtyFlags & 0x9210L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.costAmt
                            viewModelMResultCostAmt = viewModelMResult.getCostAmt();
                        }


                        // read AppUtil.formatStandardMoney(viewModel.mResult.costAmt)
                        appUtilFormatStandardMoneyViewModelMResultCostAmt = ys.app.pad.utils.AppUtil.formatStandardMoney(viewModelMResultCostAmt);


                        // read (AppUtil.formatStandardMoney(viewModel.mResult.costAmt)) + (@android:string/yuan)
                        appUtilFormatStandardMoneyViewModelMResultCostAmtMboundView4AndroidStringYuan = (appUtilFormatStandardMoneyViewModelMResultCostAmt) + (mboundView4.getResources().getString(R.string.yuan));
                }
                if ((dirtyFlags & 0xa210L) != 0) {

                        if (viewModelMResult != null) {
                            // read viewModel.mResult.realAmt
                            viewModelMResultRealAmt = viewModelMResult.getRealAmt();
                        }


                        // read AppUtil.formatStandardMoney(viewModel.mResult.realAmt)
                        appUtilFormatStandardMoneyViewModelMResultRealAmt = ys.app.pad.utils.AppUtil.formatStandardMoney(viewModelMResultRealAmt);


                        // read (AppUtil.formatStandardMoney(viewModel.mResult.realAmt)) + (@android:string/yuan)
                        appUtilFormatStandardMoneyViewModelMResultRealAmtMboundView5AndroidStringYuan = (appUtilFormatStandardMoneyViewModelMResultRealAmt) + (mboundView5.getResources().getString(R.string.yuan));
                }
            }
            if ((dirtyFlags & 0x8220L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.discountString
                        viewModelDiscountString = viewModel.discountString;
                    }
                    updateRegistration(5, viewModelDiscountString);


                    if (viewModelDiscountString != null) {
                        // read viewModel.discountString.get()
                        viewModelDiscountStringGet = viewModelDiscountString.get();
                    }
            }
            if ((dirtyFlags & 0x8240L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obCostEndDate
                        viewModelObCostEndDate = viewModel.obCostEndDate;
                    }
                    updateRegistration(6, viewModelObCostEndDate);


                    if (viewModelObCostEndDate != null) {
                        // read viewModel.obCostEndDate.get()
                        viewModelObCostEndDateGet = viewModelObCostEndDate.get();
                    }
            }
            if ((dirtyFlags & 0x8280L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.vipPic
                        viewModelVipPic = viewModel.vipPic;
                    }
                    updateRegistration(7, viewModelVipPic);


                    if (viewModelVipPic != null) {
                        // read viewModel.vipPic.get()
                        viewModelVipPicGet = viewModelVipPic.get();
                    }
            }
            if ((dirtyFlags & 0x8300L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.promotion
                        viewModelPromotion = viewModel.promotion;
                    }
                    updateRegistration(8, viewModelPromotion);


                    if (viewModelPromotion != null) {
                        // read viewModel.promotion.get()
                        viewModelPromotionGet = viewModelPromotion.get();
                    }
                if((dirtyFlags & 0x8300L) != 0) {
                    if(viewModelPromotionGet) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read viewModel.promotion.get() ? View.VISIBLE : View.GONE
                    viewModelPromotionViewVISIBLEViewGONE = ((viewModelPromotionGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8000L) != 0) {
            // api target 1

            this.img1.setOnClickListener(mCallback13);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.lijianEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, lijianEtandroidTextAttrChanged);
            this.mboundView14.setOnClickListener(mCallback11);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView14, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView14androidTextAttrChanged);
            this.mboundView15.setOnClickListener(mCallback12);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView15, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView15androidTextAttrChanged);
            this.mboundView17.setOnClickListener(mCallback14);
            this.mboundView9.setOnClickListener(mCallback10);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
            this.selectIv0.setOnClickListener(mCallback9);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.zhekouEt, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, zhekouEtandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x8280L) != 0) {
            // api target 1

            ys.app.pad.utils.PetBindingUtil.setImgIsSelect(this.img1, viewModelVipPicGet);
        }
        if ((dirtyFlags & 0x8208L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.lijianEt, viewModelYkjStringGet);
        }
        if ((dirtyFlags & 0x8202L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(viewModelSelectTypeIdInt1ViewVISIBLEViewGONE);
            this.mboundView12.setVisibility(viewModelSelectTypeIdInt2ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x8204L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, viewModelObCostBeginDateGet);
        }
        if ((dirtyFlags & 0x8240L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, viewModelObCostEndDateGet);
        }
        if ((dirtyFlags & 0x8300L) != 0) {
            // api target 1

            this.mboundView17.setVisibility(viewModelPromotionViewVISIBLEViewGONE);
            this.mboundView7.setVisibility(viewModelPromotionViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x8610L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelMResultName);
        }
        if ((dirtyFlags & 0x8a10L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelMResultTypeName);
        }
        if ((dirtyFlags & 0x9210L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, appUtilFormatStandardMoneyViewModelMResultCostAmtMboundView4AndroidStringYuan);
        }
        if ((dirtyFlags & 0xa210L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, appUtilFormatStandardMoneyViewModelMResultRealAmtMboundView5AndroidStringYuan);
        }
        if ((dirtyFlags & 0xc210L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, appUtilFormatStandardMoneyViewModelMResultVipAmtMboundView6AndroidStringYuan);
        }
        if ((dirtyFlags & 0x8201L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelSelectTypeGet);
        }
        if ((dirtyFlags & 0x8220L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.zhekouEt, viewModelDiscountStringGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectClick();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.vipClick();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clickButton();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.costBeginDateTimeClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.costEndDateTimeClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.ServiceDetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ServiceDetailActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ServiceDetailActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ServiceDetailActivityBinding>inflate(inflater, ys.app.pad.R.layout.activity_service_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ServiceDetailActivityBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ServiceDetailActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_service_detail, null, false), bindingComponent);
    }
    @NonNull
    public static ServiceDetailActivityBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ServiceDetailActivityBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_service_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ServiceDetailActivityBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.selectType
        flag 1 (0x2L): viewModel.selectTypeId
        flag 2 (0x3L): viewModel.obCostBeginDate
        flag 3 (0x4L): viewModel.ykjString
        flag 4 (0x5L): viewModel.mResult
        flag 5 (0x6L): viewModel.discountString
        flag 6 (0x7L): viewModel.obCostEndDate
        flag 7 (0x8L): viewModel.vipPic
        flag 8 (0x9L): viewModel.promotion
        flag 9 (0xaL): viewModel
        flag 10 (0xbL): viewModel.mResult.name
        flag 11 (0xcL): viewModel.mResult.typeName
        flag 12 (0xdL): viewModel.mResult.costAmt
        flag 13 (0xeL): viewModel.mResult.realAmt
        flag 14 (0xfL): viewModel.mResult.vipAmt
        flag 15 (0x10L): null
        flag 16 (0x11L): viewModel.selectTypeId.get() == 2 ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.selectTypeId.get() == 2 ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.promotion.get() ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.promotion.get() ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.selectTypeId.get() == 1 ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewModel.selectTypeId.get() == 1 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}