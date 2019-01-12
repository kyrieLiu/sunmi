package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCommitOrderBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 16);
        sViewsWithIds.put(R.id.tv_money, 17);
        sViewsWithIds.put(R.id.tv_commit_order_yuan, 18);
        sViewsWithIds.put(R.id.et_commit_order_real_get, 19);
        sViewsWithIds.put(R.id.tv_commit_order_change_unit, 20);
        sViewsWithIds.put(R.id.tv_commit_order_change, 21);
        sViewsWithIds.put(R.id.scrollView, 22);
        sViewsWithIds.put(R.id.seviceRecylerView, 23);
        sViewsWithIds.put(R.id.goodsRecylerView, 24);
        sViewsWithIds.put(R.id.progressbar, 25);
        sViewsWithIds.put(R.id.keyboardLayout, 26);
    }
    // views
    @NonNull
    public final android.widget.EditText etCommitOrderRealGet;
    @NonNull
    public final android.support.v7.widget.RecyclerView goodsRecylerView;
    @NonNull
    public final ys.app.pad.widget.KeyboardLayout keyboardLayout;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView10;
    @NonNull
    private final android.widget.LinearLayout mboundView11;
    @NonNull
    private final android.widget.LinearLayout mboundView12;
    @NonNull
    private final android.widget.LinearLayout mboundView13;
    @NonNull
    private final android.widget.LinearLayout mboundView14;
    @NonNull
    private final android.widget.LinearLayout mboundView15;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.RelativeLayout mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    @NonNull
    private final android.widget.LinearLayout mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    @NonNull
    public final android.widget.ImageView networkErrorIv;
    @NonNull
    public final android.widget.ProgressBar progressbar;
    @NonNull
    public final ys.app.pad.widget.MyNestedScrollView scrollView;
    @NonNull
    public final android.support.v7.widget.RecyclerView seviceRecylerView;
    @NonNull
    public final android.widget.TextView tvCommitOrderChange;
    @NonNull
    public final android.widget.TextView tvCommitOrderChangeUnit;
    @NonNull
    public final android.widget.TextView tvCommitOrderYuan;
    @NonNull
    public final android.widget.TextView tvMoney;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.CommitOrderViewModel mViewModel;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickBossZhifubaoAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickZhifubaoPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickXianjinPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mViewModelNumPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mViewModelClickWeixinScannerPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl5 mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener;
    private OnClickListenerImpl6 mViewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl7 mViewModelClickXinhangkaPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl8 mViewModelClickWeixinPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl9 mViewModelVipPayAndroidViewViewOnClickListener;
    private OnClickListenerImpl10 mViewModelClickBossWeixinAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityCommitOrderBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 8);
        final Object[] bindings = mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds);
        this.etCommitOrderRealGet = (android.widget.EditText) bindings[19];
        this.goodsRecylerView = (android.support.v7.widget.RecyclerView) bindings[24];
        this.keyboardLayout = (ys.app.pad.widget.KeyboardLayout) bindings[26];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.LinearLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.LinearLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.LinearLayout) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.LinearLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.LinearLayout) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.LinearLayout) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.LinearLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.networkErrorIv = (android.widget.ImageView) bindings[4];
        this.networkErrorIv.setTag(null);
        this.progressbar = (android.widget.ProgressBar) bindings[25];
        this.scrollView = (ys.app.pad.widget.MyNestedScrollView) bindings[22];
        this.seviceRecylerView = (android.support.v7.widget.RecyclerView) bindings[23];
        this.tvCommitOrderChange = (android.widget.TextView) bindings[21];
        this.tvCommitOrderChangeUnit = (android.widget.TextView) bindings[20];
        this.tvCommitOrderYuan = (android.widget.TextView) bindings[18];
        this.tvMoney = (android.widget.TextView) bindings[17];
        this.view = (android.view.View) bindings[16];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setViewModel((ys.app.pad.viewmodel.CommitOrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.CommitOrderViewModel ViewModel) {
        updateRegistration(5, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.CommitOrderViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObCountMoney((android.databinding.ObservableDouble) object, fieldId);
            case 1 :
                return onChangeViewModelIsServiceVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelOrderType((android.databinding.ObservableInt) object, fieldId);
            case 3 :
                return onChangeViewModelIsLoadingVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeViewModelPayType((android.databinding.ObservableInt) object, fieldId);
            case 5 :
                return onChangeViewModel((ys.app.pad.viewmodel.CommitOrderViewModel) object, fieldId);
            case 6 :
                return onChangeViewModelIsNetWorkErrorVisible((android.databinding.ObservableBoolean) object, fieldId);
            case 7 :
                return onChangeViewModelIsGoodsVisible((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObCountMoney(android.databinding.ObservableDouble ViewModelObCountMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsServiceVisible(android.databinding.ObservableBoolean ViewModelIsServiceVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOrderType(android.databinding.ObservableInt ViewModelOrderType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoadingVisible(android.databinding.ObservableBoolean ViewModelIsLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPayType(android.databinding.ObservableInt ViewModelPayType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.CommitOrderViewModel ViewModel, int fieldId) {
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
    private boolean onChangeViewModelIsGoodsVisible(android.databinding.ObservableBoolean ViewModelIsGoodsVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        boolean viewModelOrderTypeInt1 = false;
        android.view.View.OnClickListener viewModelClickBossZhifubaoAndroidViewViewOnClickListener = null;
        android.databinding.ObservableDouble viewModelObCountMoney = null;
        boolean viewModelPayTypeInt4 = false;
        android.view.View.OnClickListener viewModelClickZhifubaoPayAndroidViewViewOnClickListener = null;
        int viewModelIsLoadingVisibleViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView11AndroidDrawableShapeInputEnableViewModelPayTypeInt5MboundView11AndroidDrawableXuanzhongMboundView11AndroidDrawableShapeLoginInput = null;
        boolean viewModelIsNetWorkErrorVisibleGet = false;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView7AndroidDrawableShapeInputEnableViewModelPayTypeInt1MboundView7AndroidDrawableXuanzhongMboundView7AndroidDrawableShapeLoginInput = null;
        android.view.View.OnClickListener viewModelClickXianjinPayAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelNumPayAndroidViewViewOnClickListener = null;
        boolean viewModelPayTypeInt9 = false;
        android.graphics.drawable.Drawable viewModelOrderTypeInt0MboundView14AndroidDrawableShapeInputEnableViewModelPayTypeInt8MboundView14AndroidDrawableXuanzhongMboundView14AndroidDrawableShapeLoginInput = null;
        java.lang.String mboundView1AndroidStringFuhaoAppUtilFormatStandardMoneyViewModelObCountMoney = null;
        boolean viewModelIsServiceVisibleGet = false;
        int viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = 0;
        android.databinding.ObservableBoolean viewModelIsServiceVisible = null;
        android.graphics.drawable.Drawable viewModelPayTypeInt7MboundView13AndroidDrawableXuanzhongMboundView13AndroidDrawableShapeLoginInput = null;
        android.view.View.OnClickListener viewModelClickWeixinScannerPayAndroidViewViewOnClickListener = null;
        int viewModelOrderTypeGet = 0;
        boolean ViewModelOrderTypeInt11 = false;
        android.databinding.ObservableInt viewModelOrderType = null;
        android.graphics.drawable.Drawable viewModelPayTypeInt0MboundView6AndroidDrawableXuanzhongMboundView6AndroidDrawableShapeLoginInput = null;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView10AndroidDrawableShapeInputEnableViewModelPayTypeInt4MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput = null;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView13AndroidDrawableShapeInputEnableViewModelPayTypeInt7MboundView13AndroidDrawableXuanzhongMboundView13AndroidDrawableShapeLoginInput = null;
        android.view.View.OnClickListener viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = null;
        android.databinding.ObservableBoolean viewModelIsLoadingVisible = null;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView15AndroidDrawableShapeInputEnableViewModelPayTypeInt9MboundView15AndroidDrawableXuanzhongMboundView15AndroidDrawableShapeLoginInput = null;
        boolean viewModelPayTypeInt5 = false;
        android.databinding.ObservableInt viewModelPayType = null;
        boolean viewModelPayTypeInt0 = false;
        android.graphics.drawable.Drawable viewModelPayTypeInt8MboundView14AndroidDrawableXuanzhongMboundView14AndroidDrawableShapeLoginInput = null;
        ys.app.pad.viewmodel.CommitOrderViewModel viewModel = mViewModel;
        android.graphics.drawable.Drawable viewModelPayTypeInt2MboundView8AndroidDrawableXuanzhongMboundView8AndroidDrawableShapeLoginInput = null;
        java.lang.String appUtilFormatStandardMoneyViewModelObCountMoney = null;
        boolean viewModelPayTypeInt1 = false;
        int viewModelPayTypeGet = 0;
        android.databinding.ObservableBoolean viewModelIsNetWorkErrorVisible = null;
        boolean viewModelIsGoodsVisibleGet = false;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView9AndroidDrawableShapeInputEnableViewModelPayTypeInt3MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput = null;
        boolean viewModelIsLoadingVisibleGet = false;
        android.databinding.ObservableBoolean viewModelIsGoodsVisible = null;
        boolean viewModelPayTypeInt7 = false;
        android.graphics.drawable.Drawable viewModelPayTypeInt3MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput = null;
        boolean ViewModelOrderTypeInt12 = false;
        android.view.View.OnClickListener viewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelClickXinhangkaPayAndroidViewViewOnClickListener = null;
        boolean viewModelPayTypeInt6 = false;
        android.graphics.drawable.Drawable viewModelPayTypeInt9MboundView15AndroidDrawableXuanzhongMboundView15AndroidDrawableShapeLoginInput = null;
        android.view.View.OnClickListener viewModelClickWeixinPayAndroidViewViewOnClickListener = null;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView12AndroidDrawableShapeInputEnableViewModelPayTypeInt6MboundView12AndroidDrawableXuanzhongMboundView12AndroidDrawableShapeLoginInput = null;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView8AndroidDrawableShapeInputEnableViewModelPayTypeInt2MboundView8AndroidDrawableXuanzhongMboundView8AndroidDrawableShapeLoginInput = null;
        int viewModelIsGoodsVisibleViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable viewModelPayTypeInt4MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput = null;
        boolean viewModelPayTypeInt8 = false;
        android.graphics.drawable.Drawable viewModelPayTypeInt6MboundView12AndroidDrawableXuanzhongMboundView12AndroidDrawableShapeLoginInput = null;
        android.view.View.OnClickListener viewModelVipPayAndroidViewViewOnClickListener = null;
        boolean viewModelOrderTypeInt0 = false;
        boolean viewModelPayTypeInt2 = false;
        boolean ViewModelOrderTypeInt13 = false;
        double viewModelObCountMoneyGet = 0.0;
        android.graphics.drawable.Drawable viewModelOrderTypeInt1MboundView6AndroidDrawableShapeInputEnableViewModelPayTypeInt0MboundView6AndroidDrawableXuanzhongMboundView6AndroidDrawableShapeLoginInput = null;
        android.view.View.OnClickListener viewModelClickBossWeixinAndroidViewViewOnClickListener = null;
        boolean ViewModelOrderTypeInt01 = false;
        boolean viewModelPayTypeInt3 = false;
        int viewModelIsServiceVisibleViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable viewModelPayTypeInt1MboundView7AndroidDrawableXuanzhongMboundView7AndroidDrawableShapeLoginInput = null;
        android.graphics.drawable.Drawable viewModelPayTypeInt5MboundView11AndroidDrawableXuanzhongMboundView11AndroidDrawableShapeLoginInput = null;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x124L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickBossZhifubao
                        viewModelClickBossZhifubaoAndroidViewViewOnClickListener = (((mViewModelClickBossZhifubaoAndroidViewViewOnClickListener == null) ? (mViewModelClickBossZhifubaoAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickBossZhifubaoAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickZhifubaoPay
                        viewModelClickZhifubaoPayAndroidViewViewOnClickListener = (((mViewModelClickZhifubaoPayAndroidViewViewOnClickListener == null) ? (mViewModelClickZhifubaoPayAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickZhifubaoPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickXianjinPay
                        viewModelClickXianjinPayAndroidViewViewOnClickListener = (((mViewModelClickXianjinPayAndroidViewViewOnClickListener == null) ? (mViewModelClickXianjinPayAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickXianjinPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::numPay
                        viewModelNumPayAndroidViewViewOnClickListener = (((mViewModelNumPayAndroidViewViewOnClickListener == null) ? (mViewModelNumPayAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mViewModelNumPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickWeixinScannerPay
                        viewModelClickWeixinScannerPayAndroidViewViewOnClickListener = (((mViewModelClickWeixinScannerPayAndroidViewViewOnClickListener == null) ? (mViewModelClickWeixinScannerPayAndroidViewViewOnClickListener = new OnClickListenerImpl4()) : mViewModelClickWeixinScannerPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickZhifubaoScannerPay
                        viewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener = (((mViewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener == null) ? (mViewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener = new OnClickListenerImpl6()) : mViewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickXinhangkaPay
                        viewModelClickXinhangkaPayAndroidViewViewOnClickListener = (((mViewModelClickXinhangkaPayAndroidViewViewOnClickListener == null) ? (mViewModelClickXinhangkaPayAndroidViewViewOnClickListener = new OnClickListenerImpl7()) : mViewModelClickXinhangkaPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickWeixinPay
                        viewModelClickWeixinPayAndroidViewViewOnClickListener = (((mViewModelClickWeixinPayAndroidViewViewOnClickListener == null) ? (mViewModelClickWeixinPayAndroidViewViewOnClickListener = new OnClickListenerImpl8()) : mViewModelClickWeixinPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::vipPay
                        viewModelVipPayAndroidViewViewOnClickListener = (((mViewModelVipPayAndroidViewViewOnClickListener == null) ? (mViewModelVipPayAndroidViewViewOnClickListener = new OnClickListenerImpl9()) : mViewModelVipPayAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickBossWeixin
                        viewModelClickBossWeixinAndroidViewViewOnClickListener = (((mViewModelClickBossWeixinAndroidViewViewOnClickListener == null) ? (mViewModelClickBossWeixinAndroidViewViewOnClickListener = new OnClickListenerImpl10()) : mViewModelClickBossWeixinAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x121L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obCountMoney
                        viewModelObCountMoney = viewModel.obCountMoney;
                    }
                    updateRegistration(0, viewModelObCountMoney);


                    if (viewModelObCountMoney != null) {
                        // read viewModel.obCountMoney.get()
                        viewModelObCountMoneyGet = viewModelObCountMoney.get();
                    }


                    // read AppUtil.formatStandardMoney(viewModel.obCountMoney.get())
                    appUtilFormatStandardMoneyViewModelObCountMoney = ys.app.pad.utils.AppUtil.formatStandardMoney(viewModelObCountMoneyGet);


                    // read (@android:string/fuhao) + (AppUtil.formatStandardMoney(viewModel.obCountMoney.get()))
                    mboundView1AndroidStringFuhaoAppUtilFormatStandardMoneyViewModelObCountMoney = (mboundView1.getResources().getString(R.string.fuhao)) + (appUtilFormatStandardMoneyViewModelObCountMoney);
            }
            if ((dirtyFlags & 0x122L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isServiceVisible
                        viewModelIsServiceVisible = viewModel.isServiceVisible;
                    }
                    updateRegistration(1, viewModelIsServiceVisible);


                    if (viewModelIsServiceVisible != null) {
                        // read viewModel.isServiceVisible.get()
                        viewModelIsServiceVisibleGet = viewModelIsServiceVisible.get();
                    }
                if((dirtyFlags & 0x122L) != 0) {
                    if(viewModelIsServiceVisibleGet) {
                            dirtyFlags |= 0x10000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000000L;
                    }
                }


                    // read viewModel.isServiceVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsServiceVisibleViewVISIBLEViewGONE = ((viewModelIsServiceVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x134L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderType
                        viewModelOrderType = viewModel.orderType;
                    }
                    updateRegistration(2, viewModelOrderType);


                    if (viewModelOrderType != null) {
                        // read viewModel.orderType.get()
                        viewModelOrderTypeGet = viewModelOrderType.get();
                    }

                if ((dirtyFlags & 0x124L) != 0) {

                        // read viewModel.orderType.get() == 1
                        viewModelOrderTypeInt1 = (viewModelOrderTypeGet) == (1);
                        // read viewModel.orderType.get() == 0
                        viewModelOrderTypeInt0 = (viewModelOrderTypeGet) == (0);
                        // read viewModel.orderType.get() == -1
                        ViewModelOrderTypeInt13 = (viewModelOrderTypeGet) == (-1);
                }

                    // read viewModel.orderType.get() != -1
                    ViewModelOrderTypeInt11 = (viewModelOrderTypeGet) != (-1);
                    // read viewModel.orderType.get() != 1
                    ViewModelOrderTypeInt12 = (viewModelOrderTypeGet) != (1);
                    // read viewModel.orderType.get() != 0
                    ViewModelOrderTypeInt01 = (viewModelOrderTypeGet) != (0);
                if((dirtyFlags & 0x134L) != 0) {
                    if(ViewModelOrderTypeInt11) {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x4000000L;
                            dirtyFlags |= 0x400000000L;
                            dirtyFlags |= 0x10000000000L;
                            dirtyFlags |= 0x40000000000L;
                            dirtyFlags |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x800000L;
                            dirtyFlags |= 0x2000000L;
                            dirtyFlags |= 0x200000000L;
                            dirtyFlags |= 0x8000000000L;
                            dirtyFlags |= 0x20000000000L;
                            dirtyFlags |= 0x2000000000000L;
                    }
                }
                if((dirtyFlags & 0x134L) != 0) {
                    if(ViewModelOrderTypeInt12) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }
                if((dirtyFlags & 0x134L) != 0) {
                    if(ViewModelOrderTypeInt01) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
            }
            if ((dirtyFlags & 0x120L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::onClickNetWorkError
                        viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = (((mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener == null) ? (mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener = new OnClickListenerImpl5()) : mViewModelOnClickNetWorkErrorAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x128L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoadingVisible
                        viewModelIsLoadingVisible = viewModel.isLoadingVisible;
                    }
                    updateRegistration(3, viewModelIsLoadingVisible);


                    if (viewModelIsLoadingVisible != null) {
                        // read viewModel.isLoadingVisible.get()
                        viewModelIsLoadingVisibleGet = viewModelIsLoadingVisible.get();
                    }
                if((dirtyFlags & 0x128L) != 0) {
                    if(viewModelIsLoadingVisibleGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsLoadingVisibleViewVISIBLEViewGONE = ((viewModelIsLoadingVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x160L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNetWorkErrorVisible
                        viewModelIsNetWorkErrorVisible = viewModel.isNetWorkErrorVisible;
                    }
                    updateRegistration(6, viewModelIsNetWorkErrorVisible);


                    if (viewModelIsNetWorkErrorVisible != null) {
                        // read viewModel.isNetWorkErrorVisible.get()
                        viewModelIsNetWorkErrorVisibleGet = viewModelIsNetWorkErrorVisible.get();
                    }
                if((dirtyFlags & 0x160L) != 0) {
                    if(viewModelIsNetWorkErrorVisibleGet) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE = ((viewModelIsNetWorkErrorVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isGoodsVisible
                        viewModelIsGoodsVisible = viewModel.isGoodsVisible;
                    }
                    updateRegistration(7, viewModelIsGoodsVisible);


                    if (viewModelIsGoodsVisible != null) {
                        // read viewModel.isGoodsVisible.get()
                        viewModelIsGoodsVisibleGet = viewModelIsGoodsVisible.get();
                    }
                if((dirtyFlags & 0x1a0L) != 0) {
                    if(viewModelIsGoodsVisibleGet) {
                            dirtyFlags |= 0x100000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000L;
                    }
                }


                    // read viewModel.isGoodsVisible.get() ? View.VISIBLE : View.GONE
                    viewModelIsGoodsVisibleViewVISIBLEViewGONE = ((viewModelIsGoodsVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x202820a80a800L) != 0) {

                if (viewModel != null) {
                    // read viewModel.payType
                    viewModelPayType = viewModel.payType;
                }
                updateRegistration(4, viewModelPayType);


                if (viewModelPayType != null) {
                    // read viewModel.payType.get()
                    viewModelPayTypeGet = viewModelPayType.get();
                }

            if ((dirtyFlags & 0x800000L) != 0) {

                    // read viewModel.payType.get() == 4
                    viewModelPayTypeInt4 = (viewModelPayTypeGet) == (4);
                if((dirtyFlags & 0x800000L) != 0) {
                    if(viewModelPayTypeInt4) {
                            dirtyFlags |= 0x400000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000L;
                    }
                }


                    // read viewModel.payType.get() == 4 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt4MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt4) ? (getDrawableFromResource(mboundView10, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView10, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x8000000L) != 0) {

                    // read viewModel.payType.get() == 9
                    viewModelPayTypeInt9 = (viewModelPayTypeGet) == (9);
                if((dirtyFlags & 0x8000000L) != 0) {
                    if(viewModelPayTypeInt9) {
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000L;
                    }
                }


                    // read viewModel.payType.get() == 9 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt9MboundView15AndroidDrawableXuanzhongMboundView15AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt9) ? (getDrawableFromResource(mboundView15, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView15, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x800L) != 0) {

                    // read viewModel.payType.get() == 5
                    viewModelPayTypeInt5 = (viewModelPayTypeGet) == (5);
                if((dirtyFlags & 0x800L) != 0) {
                    if(viewModelPayTypeInt5) {
                            dirtyFlags |= 0x100000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000000L;
                    }
                }


                    // read viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt5MboundView11AndroidDrawableXuanzhongMboundView11AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt5) ? (getDrawableFromResource(mboundView11, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView11, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x2000000000000L) != 0) {

                    // read viewModel.payType.get() == 0
                    viewModelPayTypeInt0 = (viewModelPayTypeGet) == (0);
                if((dirtyFlags & 0x2000000000000L) != 0) {
                    if(viewModelPayTypeInt0) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt0MboundView6AndroidDrawableXuanzhongMboundView6AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt0) ? (getDrawableFromResource(mboundView6, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView6, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x2000L) != 0) {

                    // read viewModel.payType.get() == 1
                    viewModelPayTypeInt1 = (viewModelPayTypeGet) == (1);
                if((dirtyFlags & 0x2000L) != 0) {
                    if(viewModelPayTypeInt1) {
                            dirtyFlags |= 0x40000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000000000L;
                    }
                }


                    // read viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt1MboundView7AndroidDrawableXuanzhongMboundView7AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt1) ? (getDrawableFromResource(mboundView7, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView7, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x2000000L) != 0) {

                    // read viewModel.payType.get() == 7
                    viewModelPayTypeInt7 = (viewModelPayTypeGet) == (7);
                if((dirtyFlags & 0x2000000L) != 0) {
                    if(viewModelPayTypeInt7) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt7MboundView13AndroidDrawableXuanzhongMboundView13AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt7) ? (getDrawableFromResource(mboundView13, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView13, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x8000000000L) != 0) {

                    // read viewModel.payType.get() == 6
                    viewModelPayTypeInt6 = (viewModelPayTypeGet) == (6);
                if((dirtyFlags & 0x8000000000L) != 0) {
                    if(viewModelPayTypeInt6) {
                            dirtyFlags |= 0x1000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000000L;
                    }
                }


                    // read viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt6MboundView12AndroidDrawableXuanzhongMboundView12AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt6) ? (getDrawableFromResource(mboundView12, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView12, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x8000L) != 0) {

                    // read viewModel.payType.get() == 8
                    viewModelPayTypeInt8 = (viewModelPayTypeGet) == (8);
                if((dirtyFlags & 0x8000L) != 0) {
                    if(viewModelPayTypeInt8) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }


                    // read viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt8MboundView14AndroidDrawableXuanzhongMboundView14AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt8) ? (getDrawableFromResource(mboundView14, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView14, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x20000000000L) != 0) {

                    // read viewModel.payType.get() == 2
                    viewModelPayTypeInt2 = (viewModelPayTypeGet) == (2);
                if((dirtyFlags & 0x20000000000L) != 0) {
                    if(viewModelPayTypeInt2) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }


                    // read viewModel.payType.get() == 2 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt2MboundView8AndroidDrawableXuanzhongMboundView8AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt2) ? (getDrawableFromResource(mboundView8, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView8, R.drawable.shape_login_input)));
            }
            if ((dirtyFlags & 0x200000000L) != 0) {

                    // read viewModel.payType.get() == 3
                    viewModelPayTypeInt3 = (viewModelPayTypeGet) == (3);
                if((dirtyFlags & 0x200000000L) != 0) {
                    if(viewModelPayTypeInt3) {
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                    }
                }


                    // read viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                    viewModelPayTypeInt3MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput = ((viewModelPayTypeInt3) ? (getDrawableFromResource(mboundView9, R.drawable.xuanzhong)) : (getDrawableFromResource(mboundView9, R.drawable.shape_login_input)));
            }
        }

        if ((dirtyFlags & 0x134L) != 0) {

                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView11AndroidDrawableShapeInputEnableViewModelPayTypeInt5MboundView11AndroidDrawableXuanzhongMboundView11AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView11, R.drawable.shape_input_enable)) : (viewModelPayTypeInt5MboundView11AndroidDrawableXuanzhongMboundView11AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView7AndroidDrawableShapeInputEnableViewModelPayTypeInt1MboundView7AndroidDrawableXuanzhongMboundView7AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView7, R.drawable.shape_input_enable)) : (viewModelPayTypeInt1MboundView7AndroidDrawableXuanzhongMboundView7AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != 0 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt0MboundView14AndroidDrawableShapeInputEnableViewModelPayTypeInt8MboundView14AndroidDrawableXuanzhongMboundView14AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt01) ? (getDrawableFromResource(mboundView14, R.drawable.shape_input_enable)) : (viewModelPayTypeInt8MboundView14AndroidDrawableXuanzhongMboundView14AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 4 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView10AndroidDrawableShapeInputEnableViewModelPayTypeInt4MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView10, R.drawable.shape_input_enable)) : (viewModelPayTypeInt4MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView13AndroidDrawableShapeInputEnableViewModelPayTypeInt7MboundView13AndroidDrawableXuanzhongMboundView13AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView13, R.drawable.shape_input_enable)) : (viewModelPayTypeInt7MboundView13AndroidDrawableXuanzhongMboundView13AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != 1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 9 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView15AndroidDrawableShapeInputEnableViewModelPayTypeInt9MboundView15AndroidDrawableXuanzhongMboundView15AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt12) ? (getDrawableFromResource(mboundView15, R.drawable.shape_input_enable)) : (viewModelPayTypeInt9MboundView15AndroidDrawableXuanzhongMboundView15AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView9AndroidDrawableShapeInputEnableViewModelPayTypeInt3MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView9, R.drawable.shape_input_enable)) : (viewModelPayTypeInt3MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView12AndroidDrawableShapeInputEnableViewModelPayTypeInt6MboundView12AndroidDrawableXuanzhongMboundView12AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView12, R.drawable.shape_input_enable)) : (viewModelPayTypeInt6MboundView12AndroidDrawableXuanzhongMboundView12AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 2 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView8AndroidDrawableShapeInputEnableViewModelPayTypeInt2MboundView8AndroidDrawableXuanzhongMboundView8AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView8, R.drawable.shape_input_enable)) : (viewModelPayTypeInt2MboundView8AndroidDrawableXuanzhongMboundView8AndroidDrawableShapeLoginInput));
                // read viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
                viewModelOrderTypeInt1MboundView6AndroidDrawableShapeInputEnableViewModelPayTypeInt0MboundView6AndroidDrawableXuanzhongMboundView6AndroidDrawableShapeLoginInput = ((ViewModelOrderTypeInt11) ? (getDrawableFromResource(mboundView6, R.drawable.shape_input_enable)) : (viewModelPayTypeInt0MboundView6AndroidDrawableXuanzhongMboundView6AndroidDrawableShapeLoginInput));
        }
        // batch finished
        if ((dirtyFlags & 0x121L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, mboundView1AndroidStringFuhaoAppUtilFormatStandardMoneyViewModelObCountMoney);
        }
        if ((dirtyFlags & 0x134L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView10, viewModelOrderTypeInt1MboundView10AndroidDrawableShapeInputEnableViewModelPayTypeInt4MboundView10AndroidDrawableXuanzhongMboundView10AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView11, viewModelOrderTypeInt1MboundView11AndroidDrawableShapeInputEnableViewModelPayTypeInt5MboundView11AndroidDrawableXuanzhongMboundView11AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView12, viewModelOrderTypeInt1MboundView12AndroidDrawableShapeInputEnableViewModelPayTypeInt6MboundView12AndroidDrawableXuanzhongMboundView12AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView13, viewModelOrderTypeInt1MboundView13AndroidDrawableShapeInputEnableViewModelPayTypeInt7MboundView13AndroidDrawableXuanzhongMboundView13AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView14, viewModelOrderTypeInt0MboundView14AndroidDrawableShapeInputEnableViewModelPayTypeInt8MboundView14AndroidDrawableXuanzhongMboundView14AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView15, viewModelOrderTypeInt1MboundView15AndroidDrawableShapeInputEnableViewModelPayTypeInt9MboundView15AndroidDrawableXuanzhongMboundView15AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView6, viewModelOrderTypeInt1MboundView6AndroidDrawableShapeInputEnableViewModelPayTypeInt0MboundView6AndroidDrawableXuanzhongMboundView6AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView7, viewModelOrderTypeInt1MboundView7AndroidDrawableShapeInputEnableViewModelPayTypeInt1MboundView7AndroidDrawableXuanzhongMboundView7AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView8, viewModelOrderTypeInt1MboundView8AndroidDrawableShapeInputEnableViewModelPayTypeInt2MboundView8AndroidDrawableXuanzhongMboundView8AndroidDrawableShapeLoginInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView9, viewModelOrderTypeInt1MboundView9AndroidDrawableShapeInputEnableViewModelPayTypeInt3MboundView9AndroidDrawableXuanzhongMboundView9AndroidDrawableShapeLoginInput);
        }
        if ((dirtyFlags & 0x124L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView10, (android.view.View.OnClickListener)viewModelClickXinhangkaPayAndroidViewViewOnClickListener, ViewModelOrderTypeInt13);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView11, (android.view.View.OnClickListener)viewModelClickXianjinPayAndroidViewViewOnClickListener, ViewModelOrderTypeInt13);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView12, (android.view.View.OnClickListener)viewModelClickBossWeixinAndroidViewViewOnClickListener, ViewModelOrderTypeInt13);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView13, (android.view.View.OnClickListener)viewModelClickBossZhifubaoAndroidViewViewOnClickListener, ViewModelOrderTypeInt13);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView14, (android.view.View.OnClickListener)viewModelVipPayAndroidViewViewOnClickListener, viewModelOrderTypeInt0);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView15, (android.view.View.OnClickListener)viewModelNumPayAndroidViewViewOnClickListener, viewModelOrderTypeInt1);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView6, (android.view.View.OnClickListener)viewModelClickWeixinPayAndroidViewViewOnClickListener, ViewModelOrderTypeInt13);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView7, (android.view.View.OnClickListener)viewModelClickZhifubaoPayAndroidViewViewOnClickListener, ViewModelOrderTypeInt13);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView8, (android.view.View.OnClickListener)viewModelClickWeixinScannerPayAndroidViewViewOnClickListener, ViewModelOrderTypeInt13);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView9, (android.view.View.OnClickListener)viewModelClickZhifubaoScannerPayAndroidViewViewOnClickListener, ViewModelOrderTypeInt13);
        }
        if ((dirtyFlags & 0x122L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelIsServiceVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewModelIsGoodsVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x128L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(viewModelIsLoadingVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x120L) != 0) {
            // api target 1

            this.networkErrorIv.setOnClickListener(viewModelOnClickNetWorkErrorAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x160L) != 0) {
            // api target 1

            this.networkErrorIv.setVisibility(viewModelIsNetWorkErrorVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CommitOrderViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.CommitOrderViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickBossZhifubao(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CommitOrderViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.pad.viewmodel.CommitOrderViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickZhifubaoPay(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CommitOrderViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.pad.viewmodel.CommitOrderViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickXianjinPay(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CommitOrderViewModel value;
        public OnClickListenerImpl3 setValue(ys.app.pad.viewmodel.CommitOrderViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.numPay(arg0);
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CommitOrderViewModel value;
        public OnClickListenerImpl4 setValue(ys.app.pad.viewmodel.CommitOrderViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickWeixinScannerPay(arg0);
        }
    }
    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CommitOrderViewModel value;
        public OnClickListenerImpl5 setValue(ys.app.pad.viewmodel.CommitOrderViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickNetWorkError(arg0);
        }
    }
    public static class OnClickListenerImpl6 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CommitOrderViewModel value;
        public OnClickListenerImpl6 setValue(ys.app.pad.viewmodel.CommitOrderViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickZhifubaoScannerPay(arg0);
        }
    }
    public static class OnClickListenerImpl7 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CommitOrderViewModel value;
        public OnClickListenerImpl7 setValue(ys.app.pad.viewmodel.CommitOrderViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickXinhangkaPay(arg0);
        }
    }
    public static class OnClickListenerImpl8 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CommitOrderViewModel value;
        public OnClickListenerImpl8 setValue(ys.app.pad.viewmodel.CommitOrderViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickWeixinPay(arg0);
        }
    }
    public static class OnClickListenerImpl9 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CommitOrderViewModel value;
        public OnClickListenerImpl9 setValue(ys.app.pad.viewmodel.CommitOrderViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.vipPay(arg0);
        }
    }
    public static class OnClickListenerImpl10 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.CommitOrderViewModel value;
        public OnClickListenerImpl10 setValue(ys.app.pad.viewmodel.CommitOrderViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickBossWeixin(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityCommitOrderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCommitOrderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityCommitOrderBinding>inflate(inflater, ys.app.pad.R.layout.activity_commit_order, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityCommitOrderBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCommitOrderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_commit_order, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityCommitOrderBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCommitOrderBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_commit_order_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityCommitOrderBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obCountMoney
        flag 1 (0x2L): viewModel.isServiceVisible
        flag 2 (0x3L): viewModel.orderType
        flag 3 (0x4L): viewModel.isLoadingVisible
        flag 4 (0x5L): viewModel.payType
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): viewModel.isNetWorkErrorVisible
        flag 7 (0x8L): viewModel.isGoodsVisible
        flag 8 (0x9L): null
        flag 9 (0xaL): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.isLoadingVisible.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 12 (0xdL): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 13 (0xeL): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 14 (0xfL): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 15 (0x10L): viewModel.orderType.get() != 0 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 16 (0x11L): viewModel.orderType.get() != 0 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 17 (0x12L): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.isNetWorkErrorVisible.get() ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 20 (0x15L): viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 21 (0x16L): viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 22 (0x17L): viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 23 (0x18L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 4 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 24 (0x19L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 4 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 25 (0x1aL): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 26 (0x1bL): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 7 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 27 (0x1cL): viewModel.orderType.get() != 1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 9 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 28 (0x1dL): viewModel.orderType.get() != 1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 9 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 29 (0x1eL): viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 30 (0x1fL): viewModel.payType.get() == 8 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 31 (0x20L): viewModel.payType.get() == 2 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 32 (0x21L): viewModel.payType.get() == 2 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 33 (0x22L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 34 (0x23L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 35 (0x24L): viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 36 (0x25L): viewModel.payType.get() == 3 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 37 (0x26L): viewModel.payType.get() == 9 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 38 (0x27L): viewModel.payType.get() == 9 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 39 (0x28L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 40 (0x29L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 41 (0x2aL): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 2 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 42 (0x2bL): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 2 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 43 (0x2cL): viewModel.isGoodsVisible.get() ? View.VISIBLE : View.GONE
        flag 44 (0x2dL): viewModel.isGoodsVisible.get() ? View.VISIBLE : View.GONE
        flag 45 (0x2eL): viewModel.payType.get() == 4 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 46 (0x2fL): viewModel.payType.get() == 4 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 47 (0x30L): viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 48 (0x31L): viewModel.payType.get() == 6 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 49 (0x32L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 50 (0x33L): viewModel.orderType.get() != -1 ? @android:drawable/shape_input_enable : viewModel.payType.get() == 0 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 51 (0x34L): viewModel.isServiceVisible.get() ? View.VISIBLE : View.GONE
        flag 52 (0x35L): viewModel.isServiceVisible.get() ? View.VISIBLE : View.GONE
        flag 53 (0x36L): viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 54 (0x37L): viewModel.payType.get() == 1 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 55 (0x38L): viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
        flag 56 (0x39L): viewModel.payType.get() == 5 ? @android:drawable/xuanzhong : @android:drawable/shape_login_input
    flag mapping end*/
    //end
}