package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TransactionDetailBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 19);
        sViewsWithIds.put(R.id.bar_transaction, 20);
        sViewsWithIds.put(R.id.back_iv, 21);
        sViewsWithIds.put(R.id.title_tv, 22);
        sViewsWithIds.put(R.id.tv_transaction_more, 23);
        sViewsWithIds.put(R.id.scrollView, 24);
        sViewsWithIds.put(R.id.textView3, 25);
        sViewsWithIds.put(R.id.tv2, 26);
        sViewsWithIds.put(R.id.tv3, 27);
        sViewsWithIds.put(R.id.tv4, 28);
        sViewsWithIds.put(R.id.tv5, 29);
        sViewsWithIds.put(R.id.tv6, 30);
        sViewsWithIds.put(R.id.tv7, 31);
        sViewsWithIds.put(R.id.tv8, 32);
        sViewsWithIds.put(R.id.tv10, 33);
        sViewsWithIds.put(R.id.tv11, 34);
        sViewsWithIds.put(R.id.recyclerView, 35);
    }
    // views
    @NonNull
    public final android.widget.ImageView backIv;
    @NonNull
    public final android.widget.RelativeLayout barTransaction;
    @NonNull
    public final android.widget.LinearLayout ll;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.LinearLayout mboundView13;
    @NonNull
    private final android.widget.TextView mboundView14;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final android.widget.TextView mboundView18;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.view.View mboundView5;
    @NonNull
    private final android.widget.RelativeLayout mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.view.View mboundView9;
    @NonNull
    public final android.widget.TextView modifyTv;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    @NonNull
    public final android.widget.ScrollView scrollView;
    @NonNull
    public final android.widget.TextView textView2;
    @NonNull
    public final android.widget.TextView textView3;
    @NonNull
    public final android.widget.TextView titleTv;
    @NonNull
    public final android.widget.TextView tv10;
    @NonNull
    public final android.widget.TextView tv11;
    @NonNull
    public final android.widget.TextView tv2;
    @NonNull
    public final android.widget.TextView tv3;
    @NonNull
    public final android.widget.TextView tv4;
    @NonNull
    public final android.widget.TextView tv5;
    @NonNull
    public final android.widget.TextView tv6;
    @NonNull
    public final android.widget.TextView tv7;
    @NonNull
    public final android.widget.TextView tv8;
    @NonNull
    public final android.widget.TextView tvName;
    @NonNull
    public final android.widget.ImageView tvTransactionMore;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.TransactionDetailViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TransactionDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 6);
        final Object[] bindings = mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds);
        this.backIv = (android.widget.ImageView) bindings[21];
        this.barTransaction = (android.widget.RelativeLayout) bindings[20];
        this.ll = (android.widget.LinearLayout) bindings[1];
        this.ll.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.RelativeLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.LinearLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView18 = (android.widget.TextView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.view.View) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.RelativeLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.view.View) bindings[9];
        this.mboundView9.setTag(null);
        this.modifyTv = (android.widget.TextView) bindings[17];
        this.modifyTv.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[35];
        this.scrollView = (android.widget.ScrollView) bindings[24];
        this.textView2 = (android.widget.TextView) bindings[2];
        this.textView2.setTag(null);
        this.textView3 = (android.widget.TextView) bindings[25];
        this.titleTv = (android.widget.TextView) bindings[22];
        this.tv10 = (android.widget.TextView) bindings[33];
        this.tv11 = (android.widget.TextView) bindings[34];
        this.tv2 = (android.widget.TextView) bindings[26];
        this.tv3 = (android.widget.TextView) bindings[27];
        this.tv4 = (android.widget.TextView) bindings[28];
        this.tv5 = (android.widget.TextView) bindings[29];
        this.tv6 = (android.widget.TextView) bindings[30];
        this.tv7 = (android.widget.TextView) bindings[31];
        this.tv8 = (android.widget.TextView) bindings[32];
        this.tvName = (android.widget.TextView) bindings[16];
        this.tvName.setTag(null);
        this.tvTransactionMore = (android.widget.ImageView) bindings[23];
        this.view = (android.view.View) bindings[19];
        setRootTag(root);
        // listeners
        mCallback40 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            setViewModel((ys.app.pad.viewmodel.TransactionDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.TransactionDetailViewModel ViewModel) {
        updateRegistration(5, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.TransactionDetailViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelObIsChargeType((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelOrderInfo((ys.app.pad.model.OrderInfo) object, fieldId);
            case 2 :
                return onChangeViewModelOrderMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelMRechargeListBean((ys.app.pad.model.OrderInfo.RechargeListBean) object, fieldId);
            case 4 :
                return onChangeViewModelIsVis((android.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeViewModel((ys.app.pad.viewmodel.TransactionDetailViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelObIsChargeType(android.databinding.ObservableBoolean ViewModelObIsChargeType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOrderInfo(ys.app.pad.model.OrderInfo ViewModelOrderInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOrderMoney(android.databinding.ObservableField<java.lang.String> ViewModelOrderMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMRechargeListBean(ys.app.pad.model.OrderInfo.RechargeListBean ViewModelMRechargeListBean, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.userName) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsVis(android.databinding.ObservableBoolean ViewModelIsVis, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.TransactionDetailViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        java.lang.String appUtilFormatStandardMoneyViewModelOrderInfoFavouredAmt = null;
        java.lang.String viewModelMRechargeListBeanVipPhone = null;
        java.lang.String appUtilGetPayTypeViewModelOrderInfoPayedMethod = null;
        java.lang.String viewModelOrderInfoPayedMethod = null;
        boolean appUtilIsPaySucViewModelOrderInfoStatus = false;
        java.lang.String viewModelOrderInfoOrderNo = null;
        java.lang.String stringValueOfViewModelMRechargeListBeanUserName = null;
        java.lang.String appUtilIsPaySucViewModelOrderInfoStatusMboundView12AndroidStringZfcgMboundView12AndroidStringZfsb = null;
        java.lang.String mboundView11AndroidStringRmbAppUtilFormatStandardMoneyViewModelOrderInfoFavouredAmt = null;
        double viewModelOrderInfoFavouredAmt = 0.0;
        java.lang.String mboundView15AndroidStringRmbAppUtilFormatStandardMoneyViewModelMRechargeListBeanRechargeAmt = null;
        java.lang.String stringValueOfViewModelMRechargeListBeanVipUserCardNo = null;
        java.lang.String appUtilGetTimesViewModelOrderInfoOrderTime = null;
        double viewModelOrderInfoTotalAmt = 0.0;
        int viewModelOrderInfoIsRefundInt0ViewVISIBLEViewGONE = 0;
        android.databinding.ObservableBoolean viewModelObIsChargeType = null;
        java.lang.String stringValueOfViewModelOrderInfoOrderNo = null;
        boolean viewModelOrderInfoIsRefundInt0 = false;
        java.lang.String viewModelMRechargeListBeanUserName = null;
        int viewModelObIsChargeTypeViewGONEViewVISIBLE = 0;
        ys.app.pad.model.OrderInfo viewModelOrderInfo = null;
        int viewModelOrderInfoIsRefund = 0;
        android.databinding.ObservableField<java.lang.String> viewModelOrderMoney = null;
        long viewModelOrderInfoOrderTime = 0L;
        boolean viewModelObIsChargeTypeGet = false;
        java.lang.String viewModelOrderInfoStatus = null;
        int viewModelIsVisViewVISIBLEViewGONE = 0;
        java.lang.String viewModelMRechargeListBeanVipUserCardNo = null;
        java.lang.String appUtilFormatStandardMoneyViewModelMRechargeListBeanRechargeAmt = null;
        ys.app.pad.model.OrderInfo.RechargeListBean viewModelMRechargeListBean = null;
        java.lang.String appUtilFormatStandardMoneyViewModelOrderInfoTotalAmt = null;
        boolean viewModelIsVisGet = false;
        android.databinding.ObservableBoolean viewModelIsVis = null;
        double viewModelMRechargeListBeanRechargeAmt = 0.0;
        java.lang.String viewModelOrderMoneyGet = null;
        java.lang.String mboundView7AndroidStringRmbAppUtilFormatStandardMoneyViewModelOrderInfoTotalAmt = null;
        ys.app.pad.viewmodel.TransactionDetailViewModel viewModel = mViewModel;
        java.lang.String stringValueOfViewModelMRechargeListBeanVipPhone = null;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xa1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obIsChargeType
                        viewModelObIsChargeType = viewModel.obIsChargeType;
                    }
                    updateRegistration(0, viewModelObIsChargeType);


                    if (viewModelObIsChargeType != null) {
                        // read viewModel.obIsChargeType.get()
                        viewModelObIsChargeTypeGet = viewModelObIsChargeType.get();
                    }
                if((dirtyFlags & 0xa1L) != 0) {
                    if(viewModelObIsChargeTypeGet) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read viewModel.obIsChargeType.get() ? View.GONE : View.VISIBLE
                    viewModelObIsChargeTypeViewGONEViewVISIBLE = ((viewModelObIsChargeTypeGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xa2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderInfo
                        viewModelOrderInfo = viewModel.orderInfo;
                    }
                    updateRegistration(1, viewModelOrderInfo);


                    if (viewModelOrderInfo != null) {
                        // read viewModel.orderInfo.payedMethod
                        viewModelOrderInfoPayedMethod = viewModelOrderInfo.getPayedMethod();
                        // read viewModel.orderInfo.orderNo
                        viewModelOrderInfoOrderNo = viewModelOrderInfo.getOrderNo();
                        // read viewModel.orderInfo.favouredAmt
                        viewModelOrderInfoFavouredAmt = viewModelOrderInfo.getFavouredAmt();
                        // read viewModel.orderInfo.totalAmt
                        viewModelOrderInfoTotalAmt = viewModelOrderInfo.getTotalAmt();
                        // read viewModel.orderInfo.isRefund
                        viewModelOrderInfoIsRefund = viewModelOrderInfo.getIsRefund();
                        // read viewModel.orderInfo.orderTime
                        viewModelOrderInfoOrderTime = viewModelOrderInfo.getOrderTime();
                        // read viewModel.orderInfo.status
                        viewModelOrderInfoStatus = viewModelOrderInfo.getStatus();
                    }


                    // read AppUtil.getPayType(viewModel.orderInfo.payedMethod)
                    appUtilGetPayTypeViewModelOrderInfoPayedMethod = ys.app.pad.utils.AppUtil.getPayType(viewModelOrderInfoPayedMethod);
                    // read String.valueOf(viewModel.orderInfo.orderNo)
                    stringValueOfViewModelOrderInfoOrderNo = java.lang.String.valueOf(viewModelOrderInfoOrderNo);
                    // read AppUtil.formatStandardMoney(viewModel.orderInfo.favouredAmt)
                    appUtilFormatStandardMoneyViewModelOrderInfoFavouredAmt = ys.app.pad.utils.AppUtil.formatStandardMoney(viewModelOrderInfoFavouredAmt);
                    // read AppUtil.formatStandardMoney(viewModel.orderInfo.totalAmt)
                    appUtilFormatStandardMoneyViewModelOrderInfoTotalAmt = ys.app.pad.utils.AppUtil.formatStandardMoney(viewModelOrderInfoTotalAmt);
                    // read viewModel.orderInfo.isRefund == 0
                    viewModelOrderInfoIsRefundInt0 = (viewModelOrderInfoIsRefund) == (0);
                    // read AppUtil.getTimes(viewModel.orderInfo.orderTime)
                    appUtilGetTimesViewModelOrderInfoOrderTime = ys.app.pad.utils.AppUtil.getTimes(viewModelOrderInfoOrderTime);
                    // read AppUtil.isPaySuc(viewModel.orderInfo.status)
                    appUtilIsPaySucViewModelOrderInfoStatus = ys.app.pad.utils.AppUtil.isPaySuc(viewModelOrderInfoStatus);
                if((dirtyFlags & 0xa2L) != 0) {
                    if(viewModelOrderInfoIsRefundInt0) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0xa2L) != 0) {
                    if(appUtilIsPaySucViewModelOrderInfoStatus) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read (@android:string/rmb) + (AppUtil.formatStandardMoney(viewModel.orderInfo.favouredAmt))
                    mboundView11AndroidStringRmbAppUtilFormatStandardMoneyViewModelOrderInfoFavouredAmt = (mboundView11.getResources().getString(R.string.rmb)) + (appUtilFormatStandardMoneyViewModelOrderInfoFavouredAmt);
                    // read (@android:string/rmb) + (AppUtil.formatStandardMoney(viewModel.orderInfo.totalAmt))
                    mboundView7AndroidStringRmbAppUtilFormatStandardMoneyViewModelOrderInfoTotalAmt = (mboundView7.getResources().getString(R.string.rmb)) + (appUtilFormatStandardMoneyViewModelOrderInfoTotalAmt);
                    // read viewModel.orderInfo.isRefund == 0 ? View.VISIBLE : View.GONE
                    viewModelOrderInfoIsRefundInt0ViewVISIBLEViewGONE = ((viewModelOrderInfoIsRefundInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read AppUtil.isPaySuc(viewModel.orderInfo.status) ? @android:string/zfcg : @android:string/zfsb
                    appUtilIsPaySucViewModelOrderInfoStatusMboundView12AndroidStringZfcgMboundView12AndroidStringZfsb = ((appUtilIsPaySucViewModelOrderInfoStatus) ? (mboundView12.getResources().getString(R.string.zfcg)) : (mboundView12.getResources().getString(R.string.zfsb)));
            }
            if ((dirtyFlags & 0xa4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderMoney
                        viewModelOrderMoney = viewModel.orderMoney;
                    }
                    updateRegistration(2, viewModelOrderMoney);


                    if (viewModelOrderMoney != null) {
                        // read viewModel.orderMoney.get()
                        viewModelOrderMoneyGet = viewModelOrderMoney.get();
                    }
            }
            if ((dirtyFlags & 0xe8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mRechargeListBean
                        viewModelMRechargeListBean = viewModel.mRechargeListBean;
                    }
                    updateRegistration(3, viewModelMRechargeListBean);

                if ((dirtyFlags & 0xa8L) != 0) {

                        if (viewModelMRechargeListBean != null) {
                            // read viewModel.mRechargeListBean.vipPhone
                            viewModelMRechargeListBeanVipPhone = viewModelMRechargeListBean.getVipPhone();
                            // read viewModel.mRechargeListBean.vipUserCardNo
                            viewModelMRechargeListBeanVipUserCardNo = viewModelMRechargeListBean.getVipUserCardNo();
                            // read viewModel.mRechargeListBean.rechargeAmt
                            viewModelMRechargeListBeanRechargeAmt = viewModelMRechargeListBean.getRechargeAmt();
                        }


                        // read String.valueOf(viewModel.mRechargeListBean.vipPhone)
                        stringValueOfViewModelMRechargeListBeanVipPhone = java.lang.String.valueOf(viewModelMRechargeListBeanVipPhone);
                        // read String.valueOf(viewModel.mRechargeListBean.vipUserCardNo)
                        stringValueOfViewModelMRechargeListBeanVipUserCardNo = java.lang.String.valueOf(viewModelMRechargeListBeanVipUserCardNo);
                        // read AppUtil.formatStandardMoney(viewModel.mRechargeListBean.rechargeAmt)
                        appUtilFormatStandardMoneyViewModelMRechargeListBeanRechargeAmt = ys.app.pad.utils.AppUtil.formatStandardMoney(viewModelMRechargeListBeanRechargeAmt);


                        // read (@android:string/rmb) + (AppUtil.formatStandardMoney(viewModel.mRechargeListBean.rechargeAmt))
                        mboundView15AndroidStringRmbAppUtilFormatStandardMoneyViewModelMRechargeListBeanRechargeAmt = (mboundView15.getResources().getString(R.string.rmb)) + (appUtilFormatStandardMoneyViewModelMRechargeListBeanRechargeAmt);
                }

                    if (viewModelMRechargeListBean != null) {
                        // read viewModel.mRechargeListBean.userName
                        viewModelMRechargeListBeanUserName = viewModelMRechargeListBean.getUserName();
                    }


                    // read String.valueOf(viewModel.mRechargeListBean.userName)
                    stringValueOfViewModelMRechargeListBeanUserName = java.lang.String.valueOf(viewModelMRechargeListBeanUserName);
            }
            if ((dirtyFlags & 0xb0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isVis
                        viewModelIsVis = viewModel.isVis;
                    }
                    updateRegistration(4, viewModelIsVis);


                    if (viewModelIsVis != null) {
                        // read viewModel.isVis.get()
                        viewModelIsVisGet = viewModelIsVis.get();
                    }
                if((dirtyFlags & 0xb0L) != 0) {
                    if(viewModelIsVisGet) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read viewModel.isVis.get() ? View.VISIBLE : View.GONE
                    viewModelIsVisViewVISIBLEViewGONE = ((viewModelIsVisGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xa1L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(viewModelObIsChargeTypeViewGONEViewVISIBLE);
            this.mboundView5.setVisibility(viewModelObIsChargeTypeViewGONEViewVISIBLE);
            this.mboundView6.setVisibility(viewModelObIsChargeTypeViewGONEViewVISIBLE);
            this.mboundView9.setVisibility(viewModelObIsChargeTypeViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xa2L) != 0) {
            // api target 1

            this.mboundView11.setVisibility(viewModelOrderInfoIsRefundInt0ViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, mboundView11AndroidStringRmbAppUtilFormatStandardMoneyViewModelOrderInfoFavouredAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, appUtilIsPaySucViewModelOrderInfoStatusMboundView12AndroidStringZfcgMboundView12AndroidStringZfsb);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, appUtilGetTimesViewModelOrderInfoOrderTime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, appUtilGetPayTypeViewModelOrderInfoPayedMethod);
            this.mboundView7.setVisibility(viewModelOrderInfoIsRefundInt0ViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, mboundView7AndroidStringRmbAppUtilFormatStandardMoneyViewModelOrderInfoTotalAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, stringValueOfViewModelOrderInfoOrderNo);
        }
        if ((dirtyFlags & 0xb0L) != 0) {
            // api target 1

            this.mboundView13.setVisibility(viewModelIsVisViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xa8L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, stringValueOfViewModelMRechargeListBeanVipUserCardNo);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, mboundView15AndroidStringRmbAppUtilFormatStandardMoneyViewModelMRechargeListBeanRechargeAmt);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView18, stringValueOfViewModelMRechargeListBeanVipPhone);
        }
        if ((dirtyFlags & 0xa4L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelOrderMoneyGet);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.modifyTv.setOnClickListener(mCallback40);
        }
        if ((dirtyFlags & 0xe8L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, stringValueOfViewModelMRechargeListBeanUserName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ys.app.pad.viewmodel.TransactionDetailViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.showConfirmDialog();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static TransactionDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TransactionDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<TransactionDetailBinding>inflate(inflater, ys.app.pad.R.layout.activity_transaction_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static TransactionDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TransactionDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_transaction_detail, null, false), bindingComponent);
    }
    @NonNull
    public static TransactionDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TransactionDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_transaction_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new TransactionDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.obIsChargeType
        flag 1 (0x2L): viewModel.orderInfo
        flag 2 (0x3L): viewModel.orderMoney
        flag 3 (0x4L): viewModel.mRechargeListBean
        flag 4 (0x5L): viewModel.isVis
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): viewModel.mRechargeListBean.userName
        flag 7 (0x8L): null
        flag 8 (0x9L): AppUtil.isPaySuc(viewModel.orderInfo.status) ? @android:string/zfcg : @android:string/zfsb
        flag 9 (0xaL): AppUtil.isPaySuc(viewModel.orderInfo.status) ? @android:string/zfcg : @android:string/zfsb
        flag 10 (0xbL): viewModel.orderInfo.isRefund == 0 ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.orderInfo.isRefund == 0 ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.obIsChargeType.get() ? View.GONE : View.VISIBLE
        flag 13 (0xeL): viewModel.obIsChargeType.get() ? View.GONE : View.VISIBLE
        flag 14 (0xfL): viewModel.isVis.get() ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.isVis.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}