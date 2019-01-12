package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTransactionDetailBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    public final android.widget.TextView employeeNameTv;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.RelativeLayout mboundView13;
    @NonNull
    private final android.widget.TextView mboundView14;
    @NonNull
    private final android.widget.ImageView mboundView15;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.RelativeLayout mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    public final android.widget.TextView modifyTv;
    @NonNull
    public final android.widget.TextView nameTv;
    @NonNull
    public final android.widget.Button refundBtn;
    @NonNull
    public final android.widget.RelativeLayout rootView;
    @NonNull
    public final android.widget.TextView totalMoneyTv;
    @NonNull
    public final android.widget.TextView typeTv;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.ItemTransactionDetailViewModel mItemViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback72;
    @Nullable
    private final android.view.View.OnClickListener mCallback73;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTransactionDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds);
        this.employeeNameTv = (android.widget.TextView) bindings[3];
        this.employeeNameTv.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView13 = (android.widget.RelativeLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.ImageView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.RelativeLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.modifyTv = (android.widget.TextView) bindings[11];
        this.modifyTv.setTag(null);
        this.nameTv = (android.widget.TextView) bindings[4];
        this.nameTv.setTag(null);
        this.refundBtn = (android.widget.Button) bindings[12];
        this.refundBtn.setTag(null);
        this.rootView = (android.widget.RelativeLayout) bindings[0];
        this.rootView.setTag(null);
        this.totalMoneyTv = (android.widget.TextView) bindings[9];
        this.totalMoneyTv.setTag(null);
        this.typeTv = (android.widget.TextView) bindings[2];
        this.typeTv.setTag(null);
        setRootTag(root);
        // listeners
        mCallback72 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback73 = new android.databinding.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((ys.app.pad.viewmodel.ItemTransactionDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.pad.viewmodel.ItemTransactionDetailViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.ItemTransactionDetailViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.pad.viewmodel.ItemTransactionDetailViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelCanRefund((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeItemViewModelUserName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeItemViewModelModel((ys.app.pad.model.OrderInfo.OrderDetailedListBean) object, fieldId);
            case 4 :
                return onChangeItemViewModelPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.pad.viewmodel.ItemTransactionDetailViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelCanRefund(android.databinding.ObservableBoolean ItemViewModelCanRefund, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelUserName(android.databinding.ObservableField<java.lang.String> ItemViewModelUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.pad.model.OrderInfo.OrderDetailedListBean ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelPrice(android.databinding.ObservableField<java.lang.String> ItemViewModelPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String stringValueOfItemViewModelModelCount = null;
        int itemViewModelModelIsGift = 0;
        boolean itemViewModelModelIsRefundInt1 = false;
        ys.app.pad.viewmodel.ItemTransactionDetailViewModel itemViewModel = mItemViewModel;
        android.databinding.ObservableBoolean itemViewModelCanRefund = null;
        int itemViewModelModelIsClassification = 0;
        int int1ItemViewModelModelIsGiftBooleanTrueItemViewModelModelIsRefundInt1ViewGONEViewVISIBLE = 0;
        int int1ItemViewModelModelIsGiftEmployeeNameTvAndroidColorTextLightEmployeeNameTvAndroidColorTextNormal = 0;
        int itemViewModelModelIsFold = 0;
        int itemViewModelModelIsRefund = 0;
        int int1ItemViewModelModelIsGiftMboundView8AndroidColorTextLightMboundView8AndroidColorTextNormal = 0;
        int int1ItemViewModelModelIsGiftNameTvAndroidColorTextLightNameTvAndroidColorTextNormal = 0;
        int itemViewModelModelIsRefundInt1ViewVISIBLEViewGONE = 0;
        int int1ItemViewModelModelIsGiftTypeTvAndroidColorTextLightTypeTvAndroidColorTextNormal = 0;
        int itemViewModelModelIsPromotion = 0;
        android.databinding.ObservableField<java.lang.String> itemViewModelUserName = null;
        int itemViewModelModelVipUserId = 0;
        int int1ItemViewModelModelIsGiftMboundView5AndroidColorTextLightMboundView5AndroidColorTextNormal = 0;
        java.lang.String itemViewModelModelProductTypeName = null;
        java.lang.String mboundView8AndroidStringXhStringValueOfItemViewModelModelCount = null;
        ys.app.pad.model.OrderInfo.OrderDetailedListBean itemViewModelModel = null;
        boolean int1ItemViewModelModelIsGiftBooleanTrueItemViewModelModelIsRefundInt1 = false;
        int itemViewModelModelCount = 0;
        android.databinding.ObservableField<java.lang.String> itemViewModelPrice = null;
        int itemViewModelCanRefundViewVISIBLEViewGONE = 0;
        int int1ItemViewModelModelIsGiftViewVISIBLEViewGONE = 0;
        int int1ItemViewModelModelIsGiftViewGONEViewVISIBLE = 0;
        java.lang.String itemViewModelPriceGet = null;
        boolean itemViewModelCanRefundGet = false;
        java.lang.String itemViewModelModelName = null;
        java.lang.String itemViewModelUserNameGet = null;
        boolean int1ItemViewModelModelIsGift = false;
        double itemViewModelModelRealMoney = 0.0;
        double itemViewModelModelVipPrice = 0.0;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x23L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.canRefund
                        itemViewModelCanRefund = itemViewModel.canRefund;
                    }
                    updateRegistration(1, itemViewModelCanRefund);


                    if (itemViewModelCanRefund != null) {
                        // read itemViewModel.canRefund.get()
                        itemViewModelCanRefundGet = itemViewModelCanRefund.get();
                    }
                if((dirtyFlags & 0x23L) != 0) {
                    if(itemViewModelCanRefundGet) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read itemViewModel.canRefund.get() ? View.VISIBLE : View.GONE
                    itemViewModelCanRefundViewVISIBLEViewGONE = ((itemViewModelCanRefundGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.userName
                        itemViewModelUserName = itemViewModel.userName;
                    }
                    updateRegistration(2, itemViewModelUserName);


                    if (itemViewModelUserName != null) {
                        // read itemViewModel.userName.get()
                        itemViewModelUserNameGet = itemViewModelUserName.get();
                    }
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }
                    updateRegistration(3, itemViewModelModel);


                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.isGift
                        itemViewModelModelIsGift = itemViewModelModel.getIsGift();
                        // read itemViewModel.model.isClassification
                        itemViewModelModelIsClassification = itemViewModelModel.getIsClassification();
                        // read itemViewModel.model.isFold
                        itemViewModelModelIsFold = itemViewModelModel.getIsFold();
                        // read itemViewModel.model.isRefund
                        itemViewModelModelIsRefund = itemViewModelModel.getIsRefund();
                        // read itemViewModel.model.isPromotion
                        itemViewModelModelIsPromotion = itemViewModelModel.getIsPromotion();
                        // read itemViewModel.model.vipUserId
                        itemViewModelModelVipUserId = itemViewModelModel.getVipUserId();
                        // read itemViewModel.model.productTypeName
                        itemViewModelModelProductTypeName = itemViewModelModel.getProductTypeName();
                        // read itemViewModel.model.count
                        itemViewModelModelCount = itemViewModelModel.getCount();
                        // read itemViewModel.model.name
                        itemViewModelModelName = itemViewModelModel.getName();
                        // read itemViewModel.model.realMoney
                        itemViewModelModelRealMoney = itemViewModelModel.getRealMoney();
                        // read itemViewModel.model.vipPrice
                        itemViewModelModelVipPrice = itemViewModelModel.getVipPrice();
                    }


                    // read 1 == itemViewModel.model.isGift
                    int1ItemViewModelModelIsGift = (1) == (itemViewModelModelIsGift);
                    // read itemViewModel.model.isRefund == 1
                    itemViewModelModelIsRefundInt1 = (itemViewModelModelIsRefund) == (1);
                    // read String.valueOf(itemViewModel.model.count)
                    stringValueOfItemViewModelModelCount = java.lang.String.valueOf(itemViewModelModelCount);
                if((dirtyFlags & 0x29L) != 0) {
                    if(int1ItemViewModelModelIsGift) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x200000L;
                            dirtyFlags |= 0x2000000L;
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x4000000L;
                    }
                }
                if((dirtyFlags & 0x29L) != 0) {
                    if(itemViewModelModelIsRefundInt1) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                    int1ItemViewModelModelIsGiftEmployeeNameTvAndroidColorTextLightEmployeeNameTvAndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(employeeNameTv, R.color.text_light)) : (getColorFromResource(employeeNameTv, R.color.text_normal)));
                    // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                    int1ItemViewModelModelIsGiftMboundView8AndroidColorTextLightMboundView8AndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(mboundView8, R.color.text_light)) : (getColorFromResource(mboundView8, R.color.text_normal)));
                    // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                    int1ItemViewModelModelIsGiftNameTvAndroidColorTextLightNameTvAndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(nameTv, R.color.text_light)) : (getColorFromResource(nameTv, R.color.text_normal)));
                    // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                    int1ItemViewModelModelIsGiftTypeTvAndroidColorTextLightTypeTvAndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(typeTv, R.color.text_light)) : (getColorFromResource(typeTv, R.color.text_normal)));
                    // read 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
                    int1ItemViewModelModelIsGiftMboundView5AndroidColorTextLightMboundView5AndroidColorTextNormal = ((int1ItemViewModelModelIsGift) ? (getColorFromResource(mboundView5, R.color.text_light)) : (getColorFromResource(mboundView5, R.color.text_normal)));
                    // read 1 == itemViewModel.model.isGift ? View.VISIBLE : View.GONE
                    int1ItemViewModelModelIsGiftViewVISIBLEViewGONE = ((int1ItemViewModelModelIsGift) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read 1 == itemViewModel.model.isGift ? View.GONE : View.VISIBLE
                    int1ItemViewModelModelIsGiftViewGONEViewVISIBLE = ((int1ItemViewModelModelIsGift) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read itemViewModel.model.isRefund == 1 ? View.VISIBLE : View.GONE
                    itemViewModelModelIsRefundInt1ViewVISIBLEViewGONE = ((itemViewModelModelIsRefundInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read (@android:string/xh) + (String.valueOf(itemViewModel.model.count))
                    mboundView8AndroidStringXhStringValueOfItemViewModelModelCount = (mboundView8.getResources().getString(R.string.xh)) + (stringValueOfItemViewModelModelCount);
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.price
                        itemViewModelPrice = itemViewModel.price;
                    }
                    updateRegistration(4, itemViewModelPrice);


                    if (itemViewModelPrice != null) {
                        // read itemViewModel.price.get()
                        itemViewModelPriceGet = itemViewModelPrice.get();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x29L) != 0) {

                // read 1 == itemViewModel.model.isGift ? true : itemViewModel.model.isRefund == 1
                int1ItemViewModelModelIsGiftBooleanTrueItemViewModelModelIsRefundInt1 = ((int1ItemViewModelModelIsGift) ? (true) : (itemViewModelModelIsRefundInt1));
            if((dirtyFlags & 0x29L) != 0) {
                if(int1ItemViewModelModelIsGiftBooleanTrueItemViewModelModelIsRefundInt1) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read 1 == itemViewModel.model.isGift ? true : itemViewModel.model.isRefund == 1 ? View.GONE : View.VISIBLE
                int1ItemViewModelModelIsGiftBooleanTrueItemViewModelModelIsRefundInt1ViewGONEViewVISIBLE = ((int1ItemViewModelModelIsGiftBooleanTrueItemViewModelModelIsRefundInt1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.employeeNameTv, itemViewModelUserNameGet);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            this.employeeNameTv.setTextColor(int1ItemViewModelModelIsGiftEmployeeNameTvAndroidColorTextLightEmployeeNameTvAndroidColorTextNormal);
            this.mboundView10.setVisibility(itemViewModelModelIsRefundInt1ViewVISIBLEViewGONE);
            this.mboundView13.setVisibility(int1ItemViewModelModelIsGiftViewGONEViewVISIBLE);
            ys.app.pad.utils.PetBindingUtil.setCostAndCost(this.mboundView14, itemViewModelModelVipUserId, itemViewModelModelIsPromotion, itemViewModelModelIsFold);
            this.mboundView15.setVisibility(int1ItemViewModelModelIsGiftViewVISIBLEViewGONE);
            this.mboundView5.setTextColor(int1ItemViewModelModelIsGiftMboundView5AndroidColorTextLightMboundView5AndroidColorTextNormal);
            ys.app.pad.utils.PetBindingUtil.setFristPrice(this.mboundView5, itemViewModelModelIsClassification, itemViewModelModelIsPromotion, itemViewModelModelIsFold, itemViewModelModelVipPrice);
            ys.app.pad.utils.PetBindingUtil.setPrice(this.mboundView6, itemViewModelModelIsClassification, itemViewModelModelIsPromotion);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, mboundView8AndroidStringXhStringValueOfItemViewModelModelCount);
            this.mboundView8.setTextColor(int1ItemViewModelModelIsGiftMboundView8AndroidColorTextLightMboundView8AndroidColorTextNormal);
            this.modifyTv.setVisibility(int1ItemViewModelModelIsGiftBooleanTrueItemViewModelModelIsRefundInt1ViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameTv, itemViewModelModelName);
            this.nameTv.setTextColor(int1ItemViewModelModelIsGiftNameTvAndroidColorTextLightNameTvAndroidColorTextNormal);
            ys.app.pad.utils.PetBindingUtil.setTotalMoney(this.totalMoneyTv, itemViewModelModelRealMoney);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.typeTv, itemViewModelModelProductTypeName);
            this.typeTv.setTextColor(int1ItemViewModelModelIsGiftTypeTvAndroidColorTextLightTypeTvAndroidColorTextNormal);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, itemViewModelPriceGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.modifyTv.setOnClickListener(mCallback72);
            this.refundBtn.setOnClickListener(mCallback73);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            this.refundBtn.setVisibility(itemViewModelCanRefundViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                ys.app.pad.viewmodel.ItemTransactionDetailViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.showConfirmDialog();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                ys.app.pad.viewmodel.ItemTransactionDetailViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.refoundMoney();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemTransactionDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemTransactionDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemTransactionDetailBinding>inflate(inflater, ys.app.pad.R.layout.item_transaction_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemTransactionDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemTransactionDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.item_transaction_detail, null, false), bindingComponent);
    }
    @NonNull
    public static ItemTransactionDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemTransactionDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_transaction_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemTransactionDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.canRefund
        flag 2 (0x3L): itemViewModel.userName
        flag 3 (0x4L): itemViewModel.model
        flag 4 (0x5L): itemViewModel.price
        flag 5 (0x6L): null
        flag 6 (0x7L): 1 == itemViewModel.model.isGift ? true : itemViewModel.model.isRefund == 1 ? View.GONE : View.VISIBLE
        flag 7 (0x8L): 1 == itemViewModel.model.isGift ? true : itemViewModel.model.isRefund == 1 ? View.GONE : View.VISIBLE
        flag 8 (0x9L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 9 (0xaL): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 10 (0xbL): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 11 (0xcL): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 12 (0xdL): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 13 (0xeL): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 14 (0xfL): itemViewModel.model.isRefund == 1 ? View.VISIBLE : View.GONE
        flag 15 (0x10L): itemViewModel.model.isRefund == 1 ? View.VISIBLE : View.GONE
        flag 16 (0x11L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 17 (0x12L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 18 (0x13L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 19 (0x14L): 1 == itemViewModel.model.isGift ? @android:color/text_light : @android:color/text_normal
        flag 20 (0x15L): 1 == itemViewModel.model.isGift ? true : itemViewModel.model.isRefund == 1
        flag 21 (0x16L): 1 == itemViewModel.model.isGift ? true : itemViewModel.model.isRefund == 1
        flag 22 (0x17L): itemViewModel.canRefund.get() ? View.VISIBLE : View.GONE
        flag 23 (0x18L): itemViewModel.canRefund.get() ? View.VISIBLE : View.GONE
        flag 24 (0x19L): 1 == itemViewModel.model.isGift ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): 1 == itemViewModel.model.isGift ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): 1 == itemViewModel.model.isGift ? View.GONE : View.VISIBLE
        flag 27 (0x1cL): 1 == itemViewModel.model.isGift ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}