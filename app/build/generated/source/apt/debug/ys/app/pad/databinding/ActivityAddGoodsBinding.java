package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddGoodsBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.include, 17);
        sViewsWithIds.put(R.id.view, 18);
        sViewsWithIds.put(R.id.iv0, 19);
        sViewsWithIds.put(R.id.tv0, 20);
        sViewsWithIds.put(R.id.tv1, 21);
        sViewsWithIds.put(R.id.iv, 22);
        sViewsWithIds.put(R.id.tv, 23);
        sViewsWithIds.put(R.id.tv2, 24);
        sViewsWithIds.put(R.id.iv5, 25);
        sViewsWithIds.put(R.id.tv5, 26);
        sViewsWithIds.put(R.id.tv6, 27);
        sViewsWithIds.put(R.id.iv8, 28);
        sViewsWithIds.put(R.id.tv8, 29);
        sViewsWithIds.put(R.id.tv9, 30);
        sViewsWithIds.put(R.id.ll_add_goods_vipPrice, 31);
        sViewsWithIds.put(R.id.iv10, 32);
        sViewsWithIds.put(R.id.tv10, 33);
        sViewsWithIds.put(R.id.tv11, 34);
        sViewsWithIds.put(R.id.ll_addGoods_name, 35);
        sViewsWithIds.put(R.id.rv_add_good_search_name, 36);
    }
    // views
    @NonNull
    public final android.widget.Button btCommit;
    @NonNull
    public final ys.app.pad.widget.ContainsEmojiEditText editText;
    @NonNull
    public final android.widget.EditText etAddGoodName;
    @Nullable
    public final android.view.View include;
    @NonNull
    public final android.widget.ImageView iv;
    @NonNull
    public final android.widget.ImageView iv0;
    @NonNull
    public final android.widget.ImageView iv10;
    @NonNull
    public final android.widget.ImageView iv5;
    @NonNull
    public final android.widget.ImageView iv8;
    @NonNull
    public final android.widget.LinearLayout llAddGoodsName;
    @NonNull
    public final android.widget.LinearLayout llAddGoodsSearch;
    @NonNull
    public final android.widget.LinearLayout llAddGoodsVipPrice;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final ys.app.pad.widget.LastInputEditText mboundView10;
    @NonNull
    private final ys.app.pad.widget.LastInputEditText mboundView11;
    @NonNull
    private final ys.app.pad.widget.ContainsEmojiEditText mboundView12;
    @NonNull
    private final android.widget.ImageView mboundView14;
    @NonNull
    private final android.widget.EditText mboundView3;
    @NonNull
    private final android.widget.ImageButton mboundView4;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final ys.app.pad.widget.ContainsEmojiEditText mboundView8;
    @NonNull
    private final ys.app.pad.widget.LastInputEditText mboundView9;
    @NonNull
    public final android.widget.RelativeLayout rlAddGoodsView;
    @NonNull
    public final android.support.v7.widget.RecyclerView rvAddGoodSearchName;
    @NonNull
    public final android.widget.TextView selectIv;
    @NonNull
    public final android.widget.ImageView selectIv0;
    @NonNull
    public final android.widget.TextView tv;
    @NonNull
    public final android.widget.TextView tv0;
    @NonNull
    public final android.widget.TextView tv1;
    @NonNull
    public final android.widget.TextView tv10;
    @NonNull
    public final android.widget.TextView tv11;
    @NonNull
    public final android.widget.TextView tv2;
    @NonNull
    public final android.widget.TextView tv5;
    @NonNull
    public final android.widget.TextView tv6;
    @NonNull
    public final android.widget.TextView tv8;
    @NonNull
    public final android.widget.TextView tv9;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.AddGoodsActivityViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback67;
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnClickListener mCallback66;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickSelectUnitButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickScanAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editTextandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsOutOfDate.get()
            //         is viewModel.obGoodsOutOfDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText);
            // localize variables for thread safety
            // viewModel.obGoodsOutOfDate.get()
            java.lang.String viewModelObGoodsOutOfDateGet = null;
            // viewModel.obGoodsOutOfDate != null
            boolean viewModelObGoodsOutOfDateJavaLangObjectNull = false;
            // viewModel.obGoodsOutOfDate
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsOutOfDate = null;
            // viewModel
            ys.app.pad.viewmodel.AddGoodsActivityViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsOutOfDate = viewModel.obGoodsOutOfDate;

                viewModelObGoodsOutOfDateJavaLangObjectNull = (viewModelObGoodsOutOfDate) != (null);
                if (viewModelObGoodsOutOfDateJavaLangObjectNull) {




                    viewModelObGoodsOutOfDate.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener etAddGoodNameandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsName.get()
            //         is viewModel.obGoodsName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(etAddGoodName);
            // localize variables for thread safety
            // viewModel.obGoodsName
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsName = null;
            // viewModel
            ys.app.pad.viewmodel.AddGoodsActivityViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obGoodsName != null
            boolean viewModelObGoodsNameJavaLangObjectNull = false;
            // viewModel.obGoodsName.get()
            java.lang.String viewModelObGoodsNameGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsName = viewModel.obGoodsName;

                viewModelObGoodsNameJavaLangObjectNull = (viewModelObGoodsName) != (null);
                if (viewModelObGoodsNameJavaLangObjectNull) {




                    viewModelObGoodsName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView10androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsRealPrice.get()
            //         is viewModel.obGoodsRealPrice.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView10);
            // localize variables for thread safety
            // viewModel.obGoodsRealPrice != null
            boolean viewModelObGoodsRealPriceJavaLangObjectNull = false;
            // viewModel.obGoodsRealPrice.get()
            java.lang.String viewModelObGoodsRealPriceGet = null;
            // viewModel.obGoodsRealPrice
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsRealPrice = null;
            // viewModel
            ys.app.pad.viewmodel.AddGoodsActivityViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsRealPrice = viewModel.obGoodsRealPrice;

                viewModelObGoodsRealPriceJavaLangObjectNull = (viewModelObGoodsRealPrice) != (null);
                if (viewModelObGoodsRealPriceJavaLangObjectNull) {




                    viewModelObGoodsRealPrice.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView11androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsVipPrice.get()
            //         is viewModel.obGoodsVipPrice.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView11);
            // localize variables for thread safety
            // viewModel.obGoodsVipPrice
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsVipPrice = null;
            // viewModel.obGoodsVipPrice != null
            boolean viewModelObGoodsVipPriceJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.AddGoodsActivityViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obGoodsVipPrice.get()
            java.lang.String viewModelObGoodsVipPriceGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsVipPrice = viewModel.obGoodsVipPrice;

                viewModelObGoodsVipPriceJavaLangObjectNull = (viewModelObGoodsVipPrice) != (null);
                if (viewModelObGoodsVipPriceJavaLangObjectNull) {




                    viewModelObGoodsVipPrice.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView12androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsProductDate.get()
            //         is viewModel.obGoodsProductDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView12);
            // localize variables for thread safety
            // viewModel.obGoodsProductDate
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsProductDate = null;
            // viewModel.obGoodsProductDate.get()
            java.lang.String viewModelObGoodsProductDateGet = null;
            // viewModel
            ys.app.pad.viewmodel.AddGoodsActivityViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obGoodsProductDate != null
            boolean viewModelObGoodsProductDateJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsProductDate = viewModel.obGoodsProductDate;

                viewModelObGoodsProductDateJavaLangObjectNull = (viewModelObGoodsProductDate) != (null);
                if (viewModelObGoodsProductDateJavaLangObjectNull) {




                    viewModelObGoodsProductDate.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsCode.get()
            //         is viewModel.obGoodsCode.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewModel.obGoodsCode.get()
            java.lang.String viewModelObGoodsCodeGet = null;
            // viewModel.obGoodsCode
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsCode = null;
            // viewModel.obGoodsCode != null
            boolean viewModelObGoodsCodeJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.AddGoodsActivityViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsCode = viewModel.obGoodsCode;

                viewModelObGoodsCodeJavaLangObjectNull = (viewModelObGoodsCode) != (null);
                if (viewModelObGoodsCodeJavaLangObjectNull) {




                    viewModelObGoodsCode.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsTypeName.get()
            //         is viewModel.obGoodsTypeName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewModel.obGoodsTypeName.get()
            java.lang.String viewModelObGoodsTypeNameGet = null;
            // viewModel.obGoodsTypeName != null
            boolean viewModelObGoodsTypeNameJavaLangObjectNull = false;
            // viewModel.obGoodsTypeName
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsTypeName = null;
            // viewModel
            ys.app.pad.viewmodel.AddGoodsActivityViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsTypeName = viewModel.obGoodsTypeName;

                viewModelObGoodsTypeNameJavaLangObjectNull = (viewModelObGoodsTypeName) != (null);
                if (viewModelObGoodsTypeNameJavaLangObjectNull) {




                    viewModelObGoodsTypeName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsUnitName.get()
            //         is viewModel.obGoodsUnitName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewModel.obGoodsUnitName != null
            boolean viewModelObGoodsUnitNameJavaLangObjectNull = false;
            // viewModel.obGoodsUnitName
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsUnitName = null;
            // viewModel.obGoodsUnitName.get()
            java.lang.String viewModelObGoodsUnitNameGet = null;
            // viewModel
            ys.app.pad.viewmodel.AddGoodsActivityViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsUnitName = viewModel.obGoodsUnitName;

                viewModelObGoodsUnitNameJavaLangObjectNull = (viewModelObGoodsUnitName) != (null);
                if (viewModelObGoodsUnitNameJavaLangObjectNull) {




                    viewModelObGoodsUnitName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obGoodsCostPrice.get()
            //         is viewModel.obGoodsCostPrice.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // viewModel.obGoodsCostPrice
            android.databinding.ObservableField<java.lang.String> viewModelObGoodsCostPrice = null;
            // viewModel.obGoodsCostPrice.get()
            java.lang.String viewModelObGoodsCostPriceGet = null;
            // viewModel
            ys.app.pad.viewmodel.AddGoodsActivityViewModel viewModel = mViewModel;
            // viewModel.obGoodsCostPrice != null
            boolean viewModelObGoodsCostPriceJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObGoodsCostPrice = viewModel.obGoodsCostPrice;

                viewModelObGoodsCostPriceJavaLangObjectNull = (viewModelObGoodsCostPrice) != (null);
                if (viewModelObGoodsCostPriceJavaLangObjectNull) {




                    viewModelObGoodsCostPrice.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityAddGoodsBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 13);
        final Object[] bindings = mapBindings(bindingComponent, root, 37, sIncludes, sViewsWithIds);
        this.btCommit = (android.widget.Button) bindings[1];
        this.btCommit.setTag(null);
        this.editText = (ys.app.pad.widget.ContainsEmojiEditText) bindings[13];
        this.editText.setTag(null);
        this.etAddGoodName = (android.widget.EditText) bindings[15];
        this.etAddGoodName.setTag(null);
        this.include = (android.view.View) bindings[17];
        this.iv = (android.widget.ImageView) bindings[22];
        this.iv0 = (android.widget.ImageView) bindings[19];
        this.iv10 = (android.widget.ImageView) bindings[32];
        this.iv5 = (android.widget.ImageView) bindings[25];
        this.iv8 = (android.widget.ImageView) bindings[28];
        this.llAddGoodsName = (android.widget.LinearLayout) bindings[35];
        this.llAddGoodsSearch = (android.widget.LinearLayout) bindings[16];
        this.llAddGoodsSearch.setTag(null);
        this.llAddGoodsVipPrice = (android.widget.LinearLayout) bindings[31];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (ys.app.pad.widget.LastInputEditText) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (ys.app.pad.widget.LastInputEditText) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (ys.app.pad.widget.ContainsEmojiEditText) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView14 = (android.widget.ImageView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageButton) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (ys.app.pad.widget.ContainsEmojiEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (ys.app.pad.widget.LastInputEditText) bindings[9];
        this.mboundView9.setTag(null);
        this.rlAddGoodsView = (android.widget.RelativeLayout) bindings[2];
        this.rlAddGoodsView.setTag(null);
        this.rvAddGoodSearchName = (android.support.v7.widget.RecyclerView) bindings[36];
        this.selectIv = (android.widget.TextView) bindings[7];
        this.selectIv.setTag(null);
        this.selectIv0 = (android.widget.ImageView) bindings[5];
        this.selectIv0.setTag(null);
        this.tv = (android.widget.TextView) bindings[23];
        this.tv0 = (android.widget.TextView) bindings[20];
        this.tv1 = (android.widget.TextView) bindings[21];
        this.tv10 = (android.widget.TextView) bindings[33];
        this.tv11 = (android.widget.TextView) bindings[34];
        this.tv2 = (android.widget.TextView) bindings[24];
        this.tv5 = (android.widget.TextView) bindings[26];
        this.tv6 = (android.widget.TextView) bindings[27];
        this.tv8 = (android.widget.TextView) bindings[29];
        this.tv9 = (android.widget.TextView) bindings[30];
        this.view = (android.view.View) bindings[18];
        setRootTag(root);
        // listeners
        mCallback67 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback65 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback66 = new android.databinding.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
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
            setViewModel((ys.app.pad.viewmodel.AddGoodsActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.AddGoodsActivityViewModel ViewModel) {
        updateRegistration(12, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.AddGoodsActivityViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObGoodsCostPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelObGoodsName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelObGoodsCode((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelObGoodsRealPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelObGoodsUnitName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelGetTypeHttpSuccess((android.databinding.ObservableBoolean) object, fieldId);
            case 6 :
                return onChangeViewModelObGoodsVipPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelObGoodsOutOfDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelObGoodsProductDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelGetUnitHttpSuccess((android.databinding.ObservableBoolean) object, fieldId);
            case 10 :
                return onChangeViewModelShowSearch((android.databinding.ObservableBoolean) object, fieldId);
            case 11 :
                return onChangeViewModelObGoodsTypeName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeViewModel((ys.app.pad.viewmodel.AddGoodsActivityViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsCostPrice(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsCostPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsName(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsCode(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsRealPrice(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsRealPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsUnitName(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsUnitName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetTypeHttpSuccess(android.databinding.ObservableBoolean ViewModelGetTypeHttpSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsVipPrice(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsVipPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsOutOfDate(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsOutOfDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsProductDate(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsProductDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetUnitHttpSuccess(android.databinding.ObservableBoolean ViewModelGetUnitHttpSuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowSearch(android.databinding.ObservableBoolean ViewModelShowSearch, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObGoodsTypeName(android.databinding.ObservableField<java.lang.String> ViewModelObGoodsTypeName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.AddGoodsActivityViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
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
        android.view.View.OnClickListener viewModelClickSelectUnitButtonAndroidViewViewOnClickListener = null;
        android.text.TextWatcher viewModelGoodNameListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsCostPrice = null;
        java.lang.String viewModelObGoodsUnitNameGet = null;
        java.lang.String viewModelObGoodsVipPriceGet = null;
        java.lang.String viewModelObGoodsCostPriceGet = null;
        android.text.TextWatcher viewModelMChangedListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsName = null;
        boolean viewModelShowSearchGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsCode = null;
        int viewModelShowSearchViewVISIBLEViewGONE = 0;
        boolean viewModelGetTypeHttpSuccessBooleanTrueBooleanFalse = false;
        java.lang.String viewModelObGoodsRealPriceGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsRealPrice = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsUnitName = null;
        java.lang.String viewModelObGoodsCodeGet = null;
        android.databinding.ObservableBoolean viewModelGetTypeHttpSuccess = null;
        int viewModelGetTypeHttpSuccessViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener viewModelClickScanAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickSelectTypeButtonAndroidViewViewOnClickListener = null;
        boolean viewModelGetUnitHttpSuccessGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsVipPrice = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsOutOfDate = null;
        boolean viewModelGetTypeHttpSuccessGet = false;
        int viewModelGetUnitHttpSuccessViewVISIBLEViewGONE = 0;
        android.text.TextWatcher viewModelBarCodeWatcher = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsProductDate = null;
        android.text.TextWatcher viewModelMTCredTSChangedListener = null;
        android.databinding.ObservableBoolean viewModelGetUnitHttpSuccess = null;
        android.databinding.ObservableBoolean viewModelShowSearch = null;
        java.lang.String viewModelObGoodsTypeNameGet = null;
        java.lang.String viewModelObGoodsProductDateGet = null;
        boolean viewModelGetUnitHttpSuccessBooleanTrueBooleanFalse = false;
        java.lang.String viewModelObGoodsOutOfDateGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObGoodsTypeName = null;
        ys.app.pad.viewmodel.AddGoodsActivityViewModel viewModel = mViewModel;
        java.lang.String viewModelObGoodsNameGet = null;

        if ((dirtyFlags & 0x3fffL) != 0) {


            if ((dirtyFlags & 0x3000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickSelectUnitButton
                        viewModelClickSelectUnitButtonAndroidViewViewOnClickListener = (((mViewModelClickSelectUnitButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickSelectUnitButtonAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickSelectUnitButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel.goodNameListener
                        viewModelGoodNameListener = viewModel.goodNameListener;
                        // read viewModel.mChangedListener
                        viewModelMChangedListener = viewModel.mChangedListener;
                        // read viewModel::clickScan
                        viewModelClickScanAndroidViewViewOnClickListener = (((mViewModelClickScanAndroidViewViewOnClickListener == null) ? (mViewModelClickScanAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickScanAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel.barCodeWatcher
                        viewModelBarCodeWatcher = viewModel.barCodeWatcher;
                        // read viewModel.mTCredTSChangedListener
                        viewModelMTCredTSChangedListener = viewModel.mTCredTSChangedListener;
                    }
            }
            if ((dirtyFlags & 0x3001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsCostPrice
                        viewModelObGoodsCostPrice = viewModel.obGoodsCostPrice;
                    }
                    updateRegistration(0, viewModelObGoodsCostPrice);


                    if (viewModelObGoodsCostPrice != null) {
                        // read viewModel.obGoodsCostPrice.get()
                        viewModelObGoodsCostPriceGet = viewModelObGoodsCostPrice.get();
                    }
            }
            if ((dirtyFlags & 0x3002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsName
                        viewModelObGoodsName = viewModel.obGoodsName;
                    }
                    updateRegistration(1, viewModelObGoodsName);


                    if (viewModelObGoodsName != null) {
                        // read viewModel.obGoodsName.get()
                        viewModelObGoodsNameGet = viewModelObGoodsName.get();
                    }
            }
            if ((dirtyFlags & 0x3004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsCode
                        viewModelObGoodsCode = viewModel.obGoodsCode;
                    }
                    updateRegistration(2, viewModelObGoodsCode);


                    if (viewModelObGoodsCode != null) {
                        // read viewModel.obGoodsCode.get()
                        viewModelObGoodsCodeGet = viewModelObGoodsCode.get();
                    }
            }
            if ((dirtyFlags & 0x3008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsRealPrice
                        viewModelObGoodsRealPrice = viewModel.obGoodsRealPrice;
                    }
                    updateRegistration(3, viewModelObGoodsRealPrice);


                    if (viewModelObGoodsRealPrice != null) {
                        // read viewModel.obGoodsRealPrice.get()
                        viewModelObGoodsRealPriceGet = viewModelObGoodsRealPrice.get();
                    }
            }
            if ((dirtyFlags & 0x3010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsUnitName
                        viewModelObGoodsUnitName = viewModel.obGoodsUnitName;
                    }
                    updateRegistration(4, viewModelObGoodsUnitName);


                    if (viewModelObGoodsUnitName != null) {
                        // read viewModel.obGoodsUnitName.get()
                        viewModelObGoodsUnitNameGet = viewModelObGoodsUnitName.get();
                    }
            }
            if ((dirtyFlags & 0x3020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getTypeHttpSuccess
                        viewModelGetTypeHttpSuccess = viewModel.getTypeHttpSuccess;
                        // read viewModel::clickSelectTypeButton
                        viewModelClickSelectTypeButtonAndroidViewViewOnClickListener = (((mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mViewModelClickSelectTypeButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    }
                    updateRegistration(5, viewModelGetTypeHttpSuccess);


                    if (viewModelGetTypeHttpSuccess != null) {
                        // read viewModel.getTypeHttpSuccess.get()
                        viewModelGetTypeHttpSuccessGet = viewModelGetTypeHttpSuccess.get();
                    }
                if((dirtyFlags & 0x3020L) != 0) {
                    if(viewModelGetTypeHttpSuccessGet) {
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read viewModel.getTypeHttpSuccess.get() ? true : false
                    viewModelGetTypeHttpSuccessBooleanTrueBooleanFalse = ((viewModelGetTypeHttpSuccessGet) ? (true) : (false));
                    // read viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
                    viewModelGetTypeHttpSuccessViewVISIBLEViewGONE = ((viewModelGetTypeHttpSuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsVipPrice
                        viewModelObGoodsVipPrice = viewModel.obGoodsVipPrice;
                    }
                    updateRegistration(6, viewModelObGoodsVipPrice);


                    if (viewModelObGoodsVipPrice != null) {
                        // read viewModel.obGoodsVipPrice.get()
                        viewModelObGoodsVipPriceGet = viewModelObGoodsVipPrice.get();
                    }
            }
            if ((dirtyFlags & 0x3080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsOutOfDate
                        viewModelObGoodsOutOfDate = viewModel.obGoodsOutOfDate;
                    }
                    updateRegistration(7, viewModelObGoodsOutOfDate);


                    if (viewModelObGoodsOutOfDate != null) {
                        // read viewModel.obGoodsOutOfDate.get()
                        viewModelObGoodsOutOfDateGet = viewModelObGoodsOutOfDate.get();
                    }
            }
            if ((dirtyFlags & 0x3100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsProductDate
                        viewModelObGoodsProductDate = viewModel.obGoodsProductDate;
                    }
                    updateRegistration(8, viewModelObGoodsProductDate);


                    if (viewModelObGoodsProductDate != null) {
                        // read viewModel.obGoodsProductDate.get()
                        viewModelObGoodsProductDateGet = viewModelObGoodsProductDate.get();
                    }
            }
            if ((dirtyFlags & 0x3200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getUnitHttpSuccess
                        viewModelGetUnitHttpSuccess = viewModel.getUnitHttpSuccess;
                    }
                    updateRegistration(9, viewModelGetUnitHttpSuccess);


                    if (viewModelGetUnitHttpSuccess != null) {
                        // read viewModel.getUnitHttpSuccess.get()
                        viewModelGetUnitHttpSuccessGet = viewModelGetUnitHttpSuccess.get();
                    }
                if((dirtyFlags & 0x3200L) != 0) {
                    if(viewModelGetUnitHttpSuccessGet) {
                            dirtyFlags |= 0x200000L;
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read viewModel.getUnitHttpSuccess.get() ? View.VISIBLE : View.GONE
                    viewModelGetUnitHttpSuccessViewVISIBLEViewGONE = ((viewModelGetUnitHttpSuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.getUnitHttpSuccess.get() ? true : false
                    viewModelGetUnitHttpSuccessBooleanTrueBooleanFalse = ((viewModelGetUnitHttpSuccessGet) ? (true) : (false));
            }
            if ((dirtyFlags & 0x3400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showSearch
                        viewModelShowSearch = viewModel.showSearch;
                    }
                    updateRegistration(10, viewModelShowSearch);


                    if (viewModelShowSearch != null) {
                        // read viewModel.showSearch.get()
                        viewModelShowSearchGet = viewModelShowSearch.get();
                    }
                if((dirtyFlags & 0x3400L) != 0) {
                    if(viewModelShowSearchGet) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read viewModel.showSearch.get() ? View.VISIBLE : View.GONE
                    viewModelShowSearchViewVISIBLEViewGONE = ((viewModelShowSearchGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obGoodsTypeName
                        viewModelObGoodsTypeName = viewModel.obGoodsTypeName;
                    }
                    updateRegistration(11, viewModelObGoodsTypeName);


                    if (viewModelObGoodsTypeName != null) {
                        // read viewModel.obGoodsTypeName.get()
                        viewModelObGoodsTypeNameGet = viewModelObGoodsTypeName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x3000L) != 0) {
            // api target 1

            this.btCommit.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
            ys.app.pad.utils.PetBindingUtil.setTextChangedListener(this.etAddGoodName, viewModelGoodNameListener);
            ys.app.pad.utils.PetBindingUtil.setTextChangedListener(this.mboundView10, viewModelMTCredTSChangedListener);
            ys.app.pad.utils.PetBindingUtil.setTextChangedListener(this.mboundView11, viewModelMChangedListener);
            ys.app.pad.utils.PetBindingUtil.setTextChangedListener(this.mboundView3, viewModelBarCodeWatcher);
            this.mboundView4.setOnClickListener(viewModelClickScanAndroidViewViewOnClickListener);
            ys.app.pad.utils.PetBindingUtil.setTextChangedListener(this.mboundView9, viewModelMChangedListener);
            this.selectIv.setOnClickListener(viewModelClickSelectUnitButtonAndroidViewViewOnClickListener);
            this.selectIv0.setOnClickListener(viewModelClickSelectTypeButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x3080L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText, viewModelObGoodsOutOfDateGet);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etAddGoodName, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etAddGoodNameandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView10, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView10androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView11, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView11androidTextAttrChanged);
            this.mboundView12.setOnClickListener(mCallback66);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView12, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView12androidTextAttrChanged);
            this.mboundView14.setOnClickListener(mCallback67);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
            this.rlAddGoodsView.setOnClickListener(mCallback65);
        }
        if ((dirtyFlags & 0x3002L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.etAddGoodName, viewModelObGoodsNameGet);
        }
        if ((dirtyFlags & 0x3400L) != 0) {
            // api target 1

            this.llAddGoodsSearch.setVisibility(viewModelShowSearchViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3008L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewModelObGoodsRealPriceGet);
        }
        if ((dirtyFlags & 0x3040L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, viewModelObGoodsVipPriceGet);
        }
        if ((dirtyFlags & 0x3100L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, viewModelObGoodsProductDateGet);
        }
        if ((dirtyFlags & 0x3004L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelObGoodsCodeGet);
        }
        if ((dirtyFlags & 0x3800L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelObGoodsTypeNameGet);
        }
        if ((dirtyFlags & 0x3020L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView6, (android.view.View.OnClickListener)viewModelClickSelectTypeButtonAndroidViewViewOnClickListener, viewModelGetTypeHttpSuccessBooleanTrueBooleanFalse);
            this.selectIv0.setVisibility(viewModelGetTypeHttpSuccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3200L) != 0) {
            // api target 1

            this.mboundView8.setClickable(viewModelGetUnitHttpSuccessBooleanTrueBooleanFalse);
            this.selectIv.setVisibility(viewModelGetUnitHttpSuccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3010L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelObGoodsUnitNameGet);
        }
        if ((dirtyFlags & 0x3001L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelObGoodsCostPriceGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AddGoodsActivityViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.AddGoodsActivityViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AddGoodsActivityViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.pad.viewmodel.AddGoodsActivityViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSelectUnitButton(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AddGoodsActivityViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.pad.viewmodel.AddGoodsActivityViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickScan(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AddGoodsActivityViewModel value;
        public OnClickListenerImpl3 setValue(ys.app.pad.viewmodel.AddGoodsActivityViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSelectTypeButton(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddGoodsActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.uploadClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddGoodsActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.hideSearch();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddGoodsActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.manufactureTimeClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityAddGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityAddGoodsBinding>inflate(inflater, ys.app.pad.R.layout.activity_add_goods, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityAddGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_add_goods, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityAddGoodsBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddGoodsBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_add_goods_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityAddGoodsBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obGoodsCostPrice
        flag 1 (0x2L): viewModel.obGoodsName
        flag 2 (0x3L): viewModel.obGoodsCode
        flag 3 (0x4L): viewModel.obGoodsRealPrice
        flag 4 (0x5L): viewModel.obGoodsUnitName
        flag 5 (0x6L): viewModel.getTypeHttpSuccess
        flag 6 (0x7L): viewModel.obGoodsVipPrice
        flag 7 (0x8L): viewModel.obGoodsOutOfDate
        flag 8 (0x9L): viewModel.obGoodsProductDate
        flag 9 (0xaL): viewModel.getUnitHttpSuccess
        flag 10 (0xbL): viewModel.showSearch
        flag 11 (0xcL): viewModel.obGoodsTypeName
        flag 12 (0xdL): viewModel
        flag 13 (0xeL): null
        flag 14 (0xfL): viewModel.showSearch.get() ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.showSearch.get() ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.getTypeHttpSuccess.get() ? true : false
        flag 17 (0x12L): viewModel.getTypeHttpSuccess.get() ? true : false
        flag 18 (0x13L): viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.getTypeHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.getUnitHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewModel.getUnitHttpSuccess.get() ? View.VISIBLE : View.GONE
        flag 22 (0x17L): viewModel.getUnitHttpSuccess.get() ? true : false
        flag 23 (0x18L): viewModel.getUnitHttpSuccess.get() ? true : false
    flag mapping end*/
    //end
}