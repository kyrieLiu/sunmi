package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCollectMoneyBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_head, 25);
        sViewsWithIds.put(R.id.view, 26);
        sViewsWithIds.put(R.id.rl_collectMoney_goods_top, 27);
        sViewsWithIds.put(R.id.tv_collect_money_goods, 28);
        sViewsWithIds.put(R.id.rl_collectMoney_service_top, 29);
        sViewsWithIds.put(R.id.tv_collect_money_service, 30);
        sViewsWithIds.put(R.id.rl_collectMoney_num_top, 31);
        sViewsWithIds.put(R.id.iv_collectMoney_num, 32);
        sViewsWithIds.put(R.id.tv_collect_money_num, 33);
        sViewsWithIds.put(R.id.rl_bottom, 34);
        sViewsWithIds.put(R.id.money_tv, 35);
        sViewsWithIds.put(R.id.ll_shopcar, 36);
        sViewsWithIds.put(R.id.tv_car, 37);
        sViewsWithIds.put(R.id.bv_unm, 38);
        sViewsWithIds.put(R.id.iv_service_num_select, 39);
        sViewsWithIds.put(R.id.progressbar, 40);
        sViewsWithIds.put(R.id.tv_collect_vip_name, 41);
        sViewsWithIds.put(R.id.tv_collect_vip_phone, 42);
        sViewsWithIds.put(R.id.tv_collect_vip_card_name, 43);
        sViewsWithIds.put(R.id.tv_collect_vip_card_type, 44);
        sViewsWithIds.put(R.id.tv_collect_vip_money, 45);
        sViewsWithIds.put(R.id.et_collect_normal_name, 46);
        sViewsWithIds.put(R.id.et_collect_normal_phone, 47);
        sViewsWithIds.put(R.id.rv_collectMoney_shopCar, 48);
        sViewsWithIds.put(R.id.ll_collectMoney_guide, 49);
        sViewsWithIds.put(R.id.iv_collectMoney_arrow, 50);
    }
    // views
    @NonNull
    public final com.flipboard.bottomsheet.BottomSheetLayout bottomSheetLayout;
    @NonNull
    public final android.widget.Button btCollectNormal;
    @NonNull
    public final android.widget.Button btCollectVip;
    @NonNull
    public final android.widget.TextView bvUnm;
    @NonNull
    public final android.widget.EditText etCollectNormalName;
    @NonNull
    public final android.widget.EditText etCollectNormalPhone;
    @NonNull
    public final android.widget.Button guadanBtn;
    @NonNull
    public final android.widget.ImageView ivCollectMoneyArrow;
    @NonNull
    public final android.widget.ImageView ivCollectMoneyNum;
    @NonNull
    public final android.widget.ImageView ivServiceNumSelect;
    @Nullable
    public final android.view.View layoutHead;
    @NonNull
    public final android.widget.LinearLayout llCollectMoneyGuide;
    @NonNull
    public final android.widget.RelativeLayout llShopcar;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.RelativeLayout mboundView18;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.Button mboundView20;
    @NonNull
    private final android.widget.Button mboundView22;
    @NonNull
    private final android.widget.LinearLayout mboundView23;
    @NonNull
    private final android.widget.LinearLayout mboundView24;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    @NonNull
    public final android.widget.TextView moneyTv;
    @NonNull
    public final android.widget.ImageView networkErrorIv;
    @NonNull
    public final android.widget.ImageView noneDataIv;
    @NonNull
    public final android.widget.Button okBtn;
    @NonNull
    public final android.widget.ProgressBar progressbar;
    @NonNull
    public final android.widget.Button qudanBtn;
    @NonNull
    public final ys.app.pad.widget.wrapperRecylerView.IRecyclerView recyclerView;
    @NonNull
    public final ys.app.pad.widget.wrapperRecylerView.IRecyclerView recyclerViewService;
    @NonNull
    public final android.widget.RelativeLayout rlBottom;
    @NonNull
    public final android.widget.LinearLayout rlCollectMoneyGoodsTop;
    @NonNull
    public final android.widget.RelativeLayout rlCollectMoneyNumTop;
    @NonNull
    public final android.widget.LinearLayout rlCollectMoneyServiceTop;
    @NonNull
    public final android.support.v7.widget.RecyclerView rvCollectMoneyService;
    @NonNull
    public final android.support.v7.widget.RecyclerView rvCollectMoneyShopCar;
    @NonNull
    public final android.support.v7.widget.RecyclerView rvCollectMoneyTrade;
    @NonNull
    public final ys.app.pad.widget.wrapperRecylerView.IRecyclerView rvNumCardList;
    @NonNull
    public final ys.app.pad.widget.wrapperRecylerView.IRecyclerView rvNumServiceList;
    @NonNull
    public final android.widget.ImageView tvCar;
    @NonNull
    public final android.widget.TextView tvCollectMoneyGoods;
    @NonNull
    public final android.widget.TextView tvCollectMoneyNum;
    @NonNull
    public final android.widget.TextView tvCollectMoneyService;
    @NonNull
    public final android.widget.TextView tvCollectVipCardName;
    @NonNull
    public final android.widget.TextView tvCollectVipCardType;
    @NonNull
    public final android.widget.TextView tvCollectVipMoney;
    @NonNull
    public final android.widget.TextView tvCollectVipName;
    @NonNull
    public final android.widget.TextView tvCollectVipPhone;
    @NonNull
    public final android.widget.TextView tvServiceNumSelect;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.CollectMoneyViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback90;
    @Nullable
    private final android.view.View.OnClickListener mCallback91;
    @Nullable
    private final android.view.View.OnClickListener mCallback89;
    @Nullable
    private final android.view.View.OnClickListener mCallback87;
    @Nullable
    private final android.view.View.OnClickListener mCallback88;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClicGuadanButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickOrderAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityCollectMoneyBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 10);
        final Object[] bindings = mapBindings(bindingComponent, root, 51, sIncludes, sViewsWithIds);
        this.bottomSheetLayout = (com.flipboard.bottomsheet.BottomSheetLayout) bindings[0];
        this.bottomSheetLayout.setTag(null);
        this.btCollectNormal = (android.widget.Button) bindings[21];
        this.btCollectNormal.setTag(null);
        this.btCollectVip = (android.widget.Button) bindings[19];
        this.btCollectVip.setTag(null);
        this.bvUnm = (android.widget.TextView) bindings[38];
        this.etCollectNormalName = (android.widget.EditText) bindings[46];
        this.etCollectNormalPhone = (android.widget.EditText) bindings[47];
        this.guadanBtn = (android.widget.Button) bindings[7];
        this.guadanBtn.setTag(null);
        this.ivCollectMoneyArrow = (android.widget.ImageView) bindings[50];
        this.ivCollectMoneyNum = (android.widget.ImageView) bindings[32];
        this.ivServiceNumSelect = (android.widget.ImageView) bindings[39];
        this.layoutHead = (android.view.View) bindings[25];
        this.llCollectMoneyGuide = (android.widget.LinearLayout) bindings[49];
        this.llShopcar = (android.widget.RelativeLayout) bindings[36];
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView18 = (android.widget.RelativeLayout) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (android.widget.Button) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView22 = (android.widget.Button) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView23 = (android.widget.LinearLayout) bindings[23];
        this.mboundView23.setTag(null);
        this.mboundView24 = (android.widget.LinearLayout) bindings[24];
        this.mboundView24.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.moneyTv = (android.widget.TextView) bindings[35];
        this.networkErrorIv = (android.widget.ImageView) bindings[17];
        this.networkErrorIv.setTag(null);
        this.noneDataIv = (android.widget.ImageView) bindings[16];
        this.noneDataIv.setTag(null);
        this.okBtn = (android.widget.Button) bindings[6];
        this.okBtn.setTag(null);
        this.progressbar = (android.widget.ProgressBar) bindings[40];
        this.qudanBtn = (android.widget.Button) bindings[8];
        this.qudanBtn.setTag(null);
        this.recyclerView = (ys.app.pad.widget.wrapperRecylerView.IRecyclerView) bindings[15];
        this.recyclerView.setTag(null);
        this.recyclerViewService = (ys.app.pad.widget.wrapperRecylerView.IRecyclerView) bindings[14];
        this.recyclerViewService.setTag(null);
        this.rlBottom = (android.widget.RelativeLayout) bindings[34];
        this.rlCollectMoneyGoodsTop = (android.widget.LinearLayout) bindings[27];
        this.rlCollectMoneyNumTop = (android.widget.RelativeLayout) bindings[31];
        this.rlCollectMoneyServiceTop = (android.widget.LinearLayout) bindings[29];
        this.rvCollectMoneyService = (android.support.v7.widget.RecyclerView) bindings[5];
        this.rvCollectMoneyService.setTag(null);
        this.rvCollectMoneyShopCar = (android.support.v7.widget.RecyclerView) bindings[48];
        this.rvCollectMoneyTrade = (android.support.v7.widget.RecyclerView) bindings[3];
        this.rvCollectMoneyTrade.setTag(null);
        this.rvNumCardList = (ys.app.pad.widget.wrapperRecylerView.IRecyclerView) bindings[12];
        this.rvNumCardList.setTag(null);
        this.rvNumServiceList = (ys.app.pad.widget.wrapperRecylerView.IRecyclerView) bindings[13];
        this.rvNumServiceList.setTag(null);
        this.tvCar = (android.widget.ImageView) bindings[37];
        this.tvCollectMoneyGoods = (android.widget.TextView) bindings[28];
        this.tvCollectMoneyNum = (android.widget.TextView) bindings[33];
        this.tvCollectMoneyService = (android.widget.TextView) bindings[30];
        this.tvCollectVipCardName = (android.widget.TextView) bindings[43];
        this.tvCollectVipCardType = (android.widget.TextView) bindings[44];
        this.tvCollectVipMoney = (android.widget.TextView) bindings[45];
        this.tvCollectVipName = (android.widget.TextView) bindings[41];
        this.tvCollectVipPhone = (android.widget.TextView) bindings[42];
        this.tvServiceNumSelect = (android.widget.TextView) bindings[10];
        this.tvServiceNumSelect.setTag(null);
        this.view = (android.view.View) bindings[26];
        setRootTag(root);
        // listeners
        mCallback90 = new android.databinding.generated.callback.OnClickListener(this, 4);
        mCallback91 = new android.databinding.generated.callback.OnClickListener(this, 5);
        mCallback89 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback87 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback88 = new android.databinding.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
            setViewModel((ys.app.pad.viewmodel.CollectMoneyViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.CollectMoneyViewModel ViewModel) {
        updateRegistration(4, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.CollectMoneyViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelShowView((android.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeViewModelVipType((android.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeViewModelIsLoadingVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelShowNavigateService((android.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeViewModel((ys.app.pad.viewmodel.CollectMoneyViewModel) object, fieldId);
            case 5 :
                return onChangeViewModelShowNavigateGoods((android.databinding.ObservableBoolean) object, fieldId);
            case 6 :
                return onChangeViewModelIsNetWorkErrorVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 7 :
                return onChangeViewModelIsNoneDataVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 8 :
                return onChangeViewModelCardName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelShowCard((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowView(android.databinding.ObservableInt ViewModelShowView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVipType(android.databinding.ObservableInt ViewModelVipType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoadingVisible(android.databinding.ObservableBoolean ViewModelIsLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowNavigateService(android.databinding.ObservableBoolean ViewModelShowNavigateService, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.CollectMoneyViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowNavigateGoods(android.databinding.ObservableBoolean ViewModelShowNavigateGoods, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsNetWorkErrorVisible(android.databinding.ObservableBoolean ViewModelIsNetWorkErrorVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsNoneDataVisible(android.databinding.ObservableBoolean ViewModelIsNoneDataVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCardName(android.databinding.ObservableField<java.lang.String> ViewModelCardName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowCard(android.databinding.ObservableBoolean ViewModelShowCard, int fieldId) {
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
        boolean viewModelShowCardGet = false;
        int viewModelIsLoadingVisibleViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        boolean viewModelIsNetWorkErrorVisibleGet = false;
        android.view.View.OnClickListener viewModelClicGuadanButtonAndroidViewViewOnClickListener = null;
        android.graphics.drawable.Drawable viewModelVipTypeInt2MboundView20AndroidDrawableShapeButtonNormalMboundView20AndroidDrawableShapeBInput = null;
        int viewModelShowViewInt1ViewVISIBLEViewGONE = 0;
        int viewModelVipTypeInt2MboundView20AndroidColorWhiteMboundView20AndroidColorSelectorPressButtonTextColor = 0;
        int viewModelVipTypeInt4MboundView22AndroidColorWhiteMboundView22AndroidColorSelectorPressButtonTextColor = 0;
        android.graphics.drawable.Drawable viewModelVipTypeInt4MboundView22AndroidDrawableShapeButtonNormalMboundView22AndroidDrawableShapeBInput = null;
        android.view.View.OnClickListener viewModelClickOrderAndroidViewViewOnClickListener = null;
        boolean viewModelShowViewInt3 = false;
        boolean viewModelShowNavigateGoodsGet = false;
        boolean viewModelVipTypeInt2 = false;
        int viewModelVipTypeInt3ViewGONEViewVISIBLE = 0;
        int viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = 0;
        boolean viewModelShowViewInt1 = false;
        android.databinding.ObservableInt viewModelShowView = null;
        int viewModelVipTypeInt1BtCollectVipAndroidColorWhiteBtCollectVipAndroidColorSelectorPressButtonTextColor = 0;
        android.graphics.drawable.Drawable viewModelVipTypeInt3BtCollectNormalAndroidDrawableShapeButtonNormalBtCollectNormalAndroidDrawableShapeBInput = null;
        boolean viewModelShowViewInt2 = false;
        android.databinding.ObservableInt viewModelVipType = null;
        int viewModelShowNavigateGoodsViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = null;
        android.databinding.ObservableBoolean viewModelIsLoadingVisible = null;
        boolean viewModelVipTypeInt1 = false;
        android.databinding.ObservableBoolean viewModelShowNavigateService = null;
        java.lang.String viewModelCardNameGet = null;
        int viewModelVipTypeGet = 0;
        ys.app.pad.viewmodel.CollectMoneyViewModel viewModel = mViewModel;
        android.databinding.ObservableBoolean viewModelShowNavigateGoods = null;
        int viewModelShowNavigateServiceViewVISIBLEViewGONE = 0;
        android.databinding.ObservableBoolean viewModelIsNetWorkErrorVisible = null;
        int viewModelShowCardViewVISIBLEViewGONE = 0;
        boolean viewModelIsLoadingVisibleGet = false;
        int viewModelShowViewInt3ViewVISIBLEViewGONE = 0;
        boolean viewModelVipTypeInt3 = false;
        android.databinding.ObservableBoolean viewModelIsNoneDataVisible = null;
        boolean viewModelIsNoneDataVisibleGet = false;
        int viewModelIsNoneDataVisibleViewVISIBLEViewGONE = 0;
        int viewModelVipTypeInt3ViewVISIBLEViewGONE = 0;
        android.databinding.ObservableField<java.lang.String> viewModelCardName = null;
        boolean viewModelShowNavigateServiceGet = false;
        int viewModelShowViewGet = 0;
        int viewModelShowViewInt2ViewVISIBLEViewGONE = 0;
        int viewModelShowCardViewGONEViewVISIBLE = 0;
        android.graphics.drawable.Drawable viewModelVipTypeInt1BtCollectVipAndroidDrawableShapeButtonNormalBtCollectVipAndroidDrawableShapeBInput = null;
        boolean viewModelVipTypeInt4 = false;
        int viewModelVipTypeInt3BtCollectNormalAndroidColorWhiteBtCollectNormalAndroidColorSelectorPressButtonTextColor = 0;
        android.databinding.ObservableBoolean viewModelShowCard = null;

        if ((dirtyFlags & 0x7ffL) != 0) {


            if ((dirtyFlags & 0x410L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clicGuadanButton
                        viewModelClicGuadanButtonAndroidViewViewOnClickListener = (((mViewModelClicGuadanButtonAndroidViewViewOnClickListener == null) ? (mViewModelClicGuadanButtonAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClicGuadanButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickOrder
                        viewModelClickOrderAndroidViewViewOnClickListener = (((mViewModelClickOrderAndroidViewViewOnClickListener == null) ? (mViewModelClickOrderAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickOrderAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::onClickNetWorkError
                        viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = (((mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener == null) ? (mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x411L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showView
                        viewModelShowView = viewModel.showView;
                    }
                    updateRegistration(0, viewModelShowView);


                    if (viewModelShowView != null) {
                        // read viewModel.showView.get()
                        viewModelShowViewGet = viewModelShowView.get();
                    }


                    // read viewModel.showView.get() == 3
                    viewModelShowViewInt3 = (viewModelShowViewGet) == (3);
                    // read viewModel.showView.get() == 1
                    viewModelShowViewInt1 = (viewModelShowViewGet) == (1);
                    // read viewModel.showView.get() == 2
                    viewModelShowViewInt2 = (viewModelShowViewGet) == (2);
                if((dirtyFlags & 0x411L) != 0) {
                    if(viewModelShowViewInt3) {
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000L;
                    }
                }
                if((dirtyFlags & 0x411L) != 0) {
                    if(viewModelShowViewInt1) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
                if((dirtyFlags & 0x411L) != 0) {
                    if(viewModelShowViewInt2) {
                            dirtyFlags |= 0x100000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000L;
                    }
                }


                    // read viewModel.showView.get() == 3 ? View.VISIBLE : View.GONE
                    viewModelShowViewInt3ViewVISIBLEViewGONE = ((viewModelShowViewInt3) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showView.get() == 1 ? View.VISIBLE : View.GONE
                    viewModelShowViewInt1ViewVISIBLEViewGONE = ((viewModelShowViewInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showView.get() == 2 ? View.VISIBLE : View.GONE
                    viewModelShowViewInt2ViewVISIBLEViewGONE = ((viewModelShowViewInt2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x412L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.vipType
                        viewModelVipType = viewModel.vipType;
                    }
                    updateRegistration(1, viewModelVipType);


                    if (viewModelVipType != null) {
                        // read viewModel.vipType.get()
                        viewModelVipTypeGet = viewModelVipType.get();
                    }


                    // read viewModel.vipType.get() == 2
                    viewModelVipTypeInt2 = (viewModelVipTypeGet) == (2);
                    // read viewModel.vipType.get() == 1
                    viewModelVipTypeInt1 = (viewModelVipTypeGet) == (1);
                    // read viewModel.vipType.get() == 3
                    viewModelVipTypeInt3 = (viewModelVipTypeGet) == (3);
                    // read viewModel.vipType.get() == 4
                    viewModelVipTypeInt4 = (viewModelVipTypeGet) == (4);
                if((dirtyFlags & 0x412L) != 0) {
                    if(viewModelVipTypeInt2) {
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x20000L;
                    }
                }
                if((dirtyFlags & 0x412L) != 0) {
                    if(viewModelVipTypeInt1) {
                            dirtyFlags |= 0x10000000L;
                            dirtyFlags |= 0x1000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                            dirtyFlags |= 0x800000000000L;
                    }
                }
                if((dirtyFlags & 0x412L) != 0) {
                    if(viewModelVipTypeInt3) {
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x40000000000L;
                            dirtyFlags |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x20000000000L;
                            dirtyFlags |= 0x2000000000000L;
                    }
                }
                if((dirtyFlags & 0x412L) != 0) {
                    if(viewModelVipTypeInt4) {
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read viewModel.vipType.get() == 2 ? @android:drawable/shape_button_normal : @android:drawable/shape_b_input
                    viewModelVipTypeInt2MboundView20AndroidDrawableShapeButtonNormalMboundView20AndroidDrawableShapeBInput = ((viewModelVipTypeInt2) ? (getDrawableFromResource(mboundView20, R.drawable.shape_button_normal)) : (getDrawableFromResource(mboundView20, R.drawable.shape_b_input)));
                    // read viewModel.vipType.get() == 2 ? @android:color/white : @android:color/selector_press_button_text_color
                    viewModelVipTypeInt2MboundView20AndroidColorWhiteMboundView20AndroidColorSelectorPressButtonTextColor = ((viewModelVipTypeInt2) ? (getColorFromResource(mboundView20, R.color.white)) : (getColorFromResource(mboundView20, R.color.selector_press_button_text_color)));
                    // read viewModel.vipType.get() == 1 ? @android:color/white : @android:color/selector_press_button_text_color
                    viewModelVipTypeInt1BtCollectVipAndroidColorWhiteBtCollectVipAndroidColorSelectorPressButtonTextColor = ((viewModelVipTypeInt1) ? (getColorFromResource(btCollectVip, R.color.white)) : (getColorFromResource(btCollectVip, R.color.selector_press_button_text_color)));
                    // read viewModel.vipType.get() == 1 ? @android:drawable/shape_button_normal : @android:drawable/shape_b_input
                    viewModelVipTypeInt1BtCollectVipAndroidDrawableShapeButtonNormalBtCollectVipAndroidDrawableShapeBInput = ((viewModelVipTypeInt1) ? (getDrawableFromResource(btCollectVip, R.drawable.shape_button_normal)) : (getDrawableFromResource(btCollectVip, R.drawable.shape_b_input)));
                    // read viewModel.vipType.get() == 3 ? View.GONE : View.VISIBLE
                    viewModelVipTypeInt3ViewGONEViewVISIBLE = ((viewModelVipTypeInt3) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read viewModel.vipType.get() == 3 ? @android:drawable/shape_button_normal : @android:drawable/shape_b_input
                    viewModelVipTypeInt3BtCollectNormalAndroidDrawableShapeButtonNormalBtCollectNormalAndroidDrawableShapeBInput = ((viewModelVipTypeInt3) ? (getDrawableFromResource(btCollectNormal, R.drawable.shape_button_normal)) : (getDrawableFromResource(btCollectNormal, R.drawable.shape_b_input)));
                    // read viewModel.vipType.get() == 3 ? View.VISIBLE : View.GONE
                    viewModelVipTypeInt3ViewVISIBLEViewGONE = ((viewModelVipTypeInt3) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.vipType.get() == 3 ? @android:color/white : @android:color/selector_press_button_text_color
                    viewModelVipTypeInt3BtCollectNormalAndroidColorWhiteBtCollectNormalAndroidColorSelectorPressButtonTextColor = ((viewModelVipTypeInt3) ? (getColorFromResource(btCollectNormal, R.color.white)) : (getColorFromResource(btCollectNormal, R.color.selector_press_button_text_color)));
                    // read viewModel.vipType.get() == 4 ? @android:color/white : @android:color/selector_press_button_text_color
                    viewModelVipTypeInt4MboundView22AndroidColorWhiteMboundView22AndroidColorSelectorPressButtonTextColor = ((viewModelVipTypeInt4) ? (getColorFromResource(mboundView22, R.color.white)) : (getColorFromResource(mboundView22, R.color.selector_press_button_text_color)));
                    // read viewModel.vipType.get() == 4 ? @android:drawable/shape_button_normal : @android:drawable/shape_b_input
                    viewModelVipTypeInt4MboundView22AndroidDrawableShapeButtonNormalMboundView22AndroidDrawableShapeBInput = ((viewModelVipTypeInt4) ? (getDrawableFromResource(mboundView22, R.drawable.shape_button_normal)) : (getDrawableFromResource(mboundView22, R.drawable.shape_b_input)));
            }
            if ((dirtyFlags & 0x414L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoadingVisible
                        viewModelIsLoadingVisible = viewModel.isLoadingVisible;
                    }
                    updateRegistration(2, viewModelIsLoadingVisible);


                    if (viewModelIsLoadingVisible != null) {
                        // read viewModel.isLoadingVisible.get()
                        viewModelIsLoadingVisibleGet = viewModelIsLoadingVisible.get();
                    }
                if((dirtyFlags & 0x414L) != 0) {
                    if(viewModelIsLoadingVisibleGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsLoadingVisibleViewVISIBLEViewGONE = ((viewModelIsLoadingVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x418L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showNavigateService
                        viewModelShowNavigateService = viewModel.showNavigateService;
                    }
                    updateRegistration(3, viewModelShowNavigateService);


                    if (viewModelShowNavigateService != null) {
                        // read viewModel.showNavigateService.get()
                        viewModelShowNavigateServiceGet = viewModelShowNavigateService.get();
                    }
                if((dirtyFlags & 0x418L) != 0) {
                    if(viewModelShowNavigateServiceGet) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }


                    // read viewModel.showNavigateService.get() ? View.VISIBLE : View.GONE
                    viewModelShowNavigateServiceViewVISIBLEViewGONE = ((viewModelShowNavigateServiceGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x430L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showNavigateGoods
                        viewModelShowNavigateGoods = viewModel.showNavigateGoods;
                    }
                    updateRegistration(5, viewModelShowNavigateGoods);


                    if (viewModelShowNavigateGoods != null) {
                        // read viewModel.showNavigateGoods.get()
                        viewModelShowNavigateGoodsGet = viewModelShowNavigateGoods.get();
                    }
                if((dirtyFlags & 0x430L) != 0) {
                    if(viewModelShowNavigateGoodsGet) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }


                    // read viewModel.showNavigateGoods.get() ? View.VISIBLE : View.GONE
                    viewModelShowNavigateGoodsViewVISIBLEViewGONE = ((viewModelShowNavigateGoodsGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x450L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNetWorkErrorVisible
                        viewModelIsNetWorkErrorVisible = viewModel.isNetWorkErrorVisible;
                    }
                    updateRegistration(6, viewModelIsNetWorkErrorVisible);


                    if (viewModelIsNetWorkErrorVisible != null) {
                        // read viewModel.isNetWorkErrorVisible.get()
                        viewModelIsNetWorkErrorVisibleGet = viewModelIsNetWorkErrorVisible.get();
                    }
                if((dirtyFlags & 0x450L) != 0) {
                    if(viewModelIsNetWorkErrorVisibleGet) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }


                    // read viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = ((viewModelIsNetWorkErrorVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x490L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNoneDataVisible
                        viewModelIsNoneDataVisible = viewModel.isNoneDataVisible;
                    }
                    updateRegistration(7, viewModelIsNoneDataVisible);


                    if (viewModelIsNoneDataVisible != null) {
                        // read viewModel.isNoneDataVisible.get()
                        viewModelIsNoneDataVisibleGet = viewModelIsNoneDataVisible.get();
                    }
                if((dirtyFlags & 0x490L) != 0) {
                    if(viewModelIsNoneDataVisibleGet) {
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000L;
                    }
                }


                    // read viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNoneDataVisibleViewVISIBLEViewGONE = ((viewModelIsNoneDataVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x510L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cardName
                        viewModelCardName = viewModel.cardName;
                    }
                    updateRegistration(8, viewModelCardName);


                    if (viewModelCardName != null) {
                        // read viewModel.cardName.get()
                        viewModelCardNameGet = viewModelCardName.get();
                    }
            }
            if ((dirtyFlags & 0x610L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showCard
                        viewModelShowCard = viewModel.showCard;
                    }
                    updateRegistration(9, viewModelShowCard);


                    if (viewModelShowCard != null) {
                        // read viewModel.showCard.get()
                        viewModelShowCardGet = viewModelShowCard.get();
                    }
                if((dirtyFlags & 0x610L) != 0) {
                    if(viewModelShowCardGet) {
                            dirtyFlags |= 0x1000000000L;
                            dirtyFlags |= 0x400000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                            dirtyFlags |= 0x200000000000L;
                    }
                }


                    // read viewModel.showCard.get() ? View.VISIBLE : View.GONE
                    viewModelShowCardViewVISIBLEViewGONE = ((viewModelShowCardGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showCard.get() ? View.GONE : View.VISIBLE
                    viewModelShowCardViewGONEViewVISIBLE = ((viewModelShowCardGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x412L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.btCollectNormal, viewModelVipTypeInt3BtCollectNormalAndroidDrawableShapeButtonNormalBtCollectNormalAndroidDrawableShapeBInput);
            this.btCollectNormal.setTextColor(viewModelVipTypeInt3BtCollectNormalAndroidColorWhiteBtCollectNormalAndroidColorSelectorPressButtonTextColor);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.btCollectVip, viewModelVipTypeInt1BtCollectVipAndroidDrawableShapeButtonNormalBtCollectVipAndroidDrawableShapeBInput);
            this.btCollectVip.setTextColor(viewModelVipTypeInt1BtCollectVipAndroidColorWhiteBtCollectVipAndroidColorSelectorPressButtonTextColor);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView20, viewModelVipTypeInt2MboundView20AndroidDrawableShapeButtonNormalMboundView20AndroidDrawableShapeBInput);
            this.mboundView20.setTextColor(viewModelVipTypeInt2MboundView20AndroidColorWhiteMboundView20AndroidColorSelectorPressButtonTextColor);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView22, viewModelVipTypeInt4MboundView22AndroidDrawableShapeButtonNormalMboundView22AndroidDrawableShapeBInput);
            this.mboundView22.setTextColor(viewModelVipTypeInt4MboundView22AndroidColorWhiteMboundView22AndroidColorSelectorPressButtonTextColor);
            this.mboundView23.setVisibility(viewModelVipTypeInt3ViewGONEViewVISIBLE);
            this.mboundView24.setVisibility(viewModelVipTypeInt3ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.btCollectNormal.setOnClickListener(mCallback90);
            this.btCollectVip.setOnClickListener(mCallback88);
            this.mboundView20.setOnClickListener(mCallback89);
            this.mboundView22.setOnClickListener(mCallback91);
            this.tvServiceNumSelect.setOnClickListener(mCallback87);
        }
        if ((dirtyFlags & 0x410L) != 0) {
            // api target 1

            this.guadanBtn.setOnClickListener(viewModelClicGuadanButtonAndroidViewViewOnClickListener);
            this.networkErrorIv.setOnClickListener(viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener);
            this.okBtn.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
            this.qudanBtn.setOnClickListener(viewModelClickOrderAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x510L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, viewModelCardNameGet);
        }
        if ((dirtyFlags & 0x610L) != 0) {
            // api target 1

            this.mboundView11.setVisibility(viewModelShowCardViewGONEViewVISIBLE);
            this.rvNumCardList.setVisibility(viewModelShowCardViewVISIBLEViewGONE);
            this.rvNumServiceList.setVisibility(viewModelShowCardViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x414L) != 0) {
            // api target 1

            this.mboundView18.setVisibility(viewModelIsLoadingVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x430L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelShowNavigateGoodsViewVISIBLEViewGONE);
            this.rvCollectMoneyTrade.setVisibility(viewModelShowNavigateGoodsViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x418L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelShowNavigateServiceViewVISIBLEViewGONE);
            this.rvCollectMoneyService.setVisibility(viewModelShowNavigateServiceViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x411L) != 0) {
            // api target 1

            this.mboundView9.setVisibility(viewModelShowViewInt3ViewVISIBLEViewGONE);
            this.recyclerView.setVisibility(viewModelShowViewInt1ViewVISIBLEViewGONE);
            this.recyclerViewService.setVisibility(viewModelShowViewInt2ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x450L) != 0) {
            // api target 1

            this.networkErrorIv.setVisibility(viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x490L) != 0) {
            // api target 1

            this.noneDataIv.setVisibility(viewModelIsNoneDataVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CollectMoneyViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.CollectMoneyViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CollectMoneyViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.pad.viewmodel.CollectMoneyViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clicGuadanButton(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CollectMoneyViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.pad.viewmodel.CollectMoneyViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickOrder(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CollectMoneyViewModel value;
        public OnClickListenerImpl3 setValue(ys.app.pad.viewmodel.CollectMoneyViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickNetWorkError(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.CollectMoneyViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectNormalUser();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.CollectMoneyViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectOnlyDiscount();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.CollectMoneyViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectNumCardVip();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.CollectMoneyViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.showCardList();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.CollectMoneyViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectVipUser();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityCollectMoneyBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCollectMoneyBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityCollectMoneyBinding>inflate(inflater, ys.app.pad.R.layout.activity_collect_money, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityCollectMoneyBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCollectMoneyBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_collect_money, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityCollectMoneyBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCollectMoneyBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_collect_money_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityCollectMoneyBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.showView
        flag 1 (0x2L): viewModel.vipType
        flag 2 (0x3L): viewModel.isLoadingVisible
        flag 3 (0x4L): viewModel.showNavigateService
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): viewModel.showNavigateGoods
        flag 6 (0x7L): viewModel.isNetWorkErrorVisible
        flag 7 (0x8L): viewModel.isNoneDataVisible
        flag 8 (0x9L): viewModel.cardName
        flag 9 (0xaL): viewModel.showCard
        flag 10 (0xbL): null
        flag 11 (0xcL): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.vipType.get() == 2 ? @android:drawable/shape_button_normal : @android:drawable/shape_b_input
        flag 14 (0xfL): viewModel.vipType.get() == 2 ? @android:drawable/shape_button_normal : @android:drawable/shape_b_input
        flag 15 (0x10L): viewModel.showView.get() == 1 ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.showView.get() == 1 ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.vipType.get() == 2 ? @android:color/white : @android:color/selector_press_button_text_color
        flag 18 (0x13L): viewModel.vipType.get() == 2 ? @android:color/white : @android:color/selector_press_button_text_color
        flag 19 (0x14L): viewModel.vipType.get() == 4 ? @android:color/white : @android:color/selector_press_button_text_color
        flag 20 (0x15L): viewModel.vipType.get() == 4 ? @android:color/white : @android:color/selector_press_button_text_color
        flag 21 (0x16L): viewModel.vipType.get() == 4 ? @android:drawable/shape_button_normal : @android:drawable/shape_b_input
        flag 22 (0x17L): viewModel.vipType.get() == 4 ? @android:drawable/shape_button_normal : @android:drawable/shape_b_input
        flag 23 (0x18L): viewModel.vipType.get() == 3 ? View.GONE : View.VISIBLE
        flag 24 (0x19L): viewModel.vipType.get() == 3 ? View.GONE : View.VISIBLE
        flag 25 (0x1aL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): viewModel.vipType.get() == 1 ? @android:color/white : @android:color/selector_press_button_text_color
        flag 28 (0x1dL): viewModel.vipType.get() == 1 ? @android:color/white : @android:color/selector_press_button_text_color
        flag 29 (0x1eL): viewModel.vipType.get() == 3 ? @android:drawable/shape_button_normal : @android:drawable/shape_b_input
        flag 30 (0x1fL): viewModel.vipType.get() == 3 ? @android:drawable/shape_button_normal : @android:drawable/shape_b_input
        flag 31 (0x20L): viewModel.showNavigateGoods.get() ? View.VISIBLE : View.GONE
        flag 32 (0x21L): viewModel.showNavigateGoods.get() ? View.VISIBLE : View.GONE
        flag 33 (0x22L): viewModel.showNavigateService.get() ? View.VISIBLE : View.GONE
        flag 34 (0x23L): viewModel.showNavigateService.get() ? View.VISIBLE : View.GONE
        flag 35 (0x24L): viewModel.showCard.get() ? View.VISIBLE : View.GONE
        flag 36 (0x25L): viewModel.showCard.get() ? View.VISIBLE : View.GONE
        flag 37 (0x26L): viewModel.showView.get() == 3 ? View.VISIBLE : View.GONE
        flag 38 (0x27L): viewModel.showView.get() == 3 ? View.VISIBLE : View.GONE
        flag 39 (0x28L): viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
        flag 40 (0x29L): viewModel.isNoneDataVisible.get() ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): viewModel.vipType.get() == 3 ? View.VISIBLE : View.GONE
        flag 42 (0x2bL): viewModel.vipType.get() == 3 ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): viewModel.showView.get() == 2 ? View.VISIBLE : View.GONE
        flag 44 (0x2dL): viewModel.showView.get() == 2 ? View.VISIBLE : View.GONE
        flag 45 (0x2eL): viewModel.showCard.get() ? View.GONE : View.VISIBLE
        flag 46 (0x2fL): viewModel.showCard.get() ? View.GONE : View.VISIBLE
        flag 47 (0x30L): viewModel.vipType.get() == 1 ? @android:drawable/shape_button_normal : @android:drawable/shape_b_input
        flag 48 (0x31L): viewModel.vipType.get() == 1 ? @android:drawable/shape_button_normal : @android:drawable/shape_b_input
        flag 49 (0x32L): viewModel.vipType.get() == 3 ? @android:color/white : @android:color/selector_press_button_text_color
        flag 50 (0x33L): viewModel.vipType.get() == 3 ? @android:color/white : @android:color/selector_press_button_text_color
    flag mapping end*/
    //end
}