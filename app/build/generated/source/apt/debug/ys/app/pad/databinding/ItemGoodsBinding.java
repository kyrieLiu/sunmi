package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemGoodsBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll, 17);
    }
    // views
    @NonNull
    public final android.widget.TextView kutv;
    @NonNull
    public final android.widget.LinearLayout ll;
    @NonNull
    public final android.widget.LinearLayout llPromotionTime;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.RelativeLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView9;
    @NonNull
    public final android.widget.TextView promotion;
    @NonNull
    public final android.widget.LinearLayout rootView;
    @NonNull
    public final android.widget.TextView tvItemGoodDiscountNum;
    @NonNull
    public final android.widget.TextView tvItemPromotionGoodsOriginalPrice;
    @NonNull
    public final android.widget.TextView tvItemPromotionGoodsVipPrice;
    @NonNull
    public final android.view.View view;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.GoodsItemViewModel mItemViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback95;
    @Nullable
    private final android.view.View.OnClickListener mCallback96;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemGoodsBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 7);
        final Object[] bindings = mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds);
        this.kutv = (android.widget.TextView) bindings[16];
        this.kutv.setTag(null);
        this.ll = (android.widget.LinearLayout) bindings[17];
        this.llPromotionTime = (android.widget.LinearLayout) bindings[11];
        this.llPromotionTime.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView2 = (android.widget.RelativeLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.promotion = (android.widget.TextView) bindings[15];
        this.promotion.setTag(null);
        this.rootView = (android.widget.LinearLayout) bindings[0];
        this.rootView.setTag(null);
        this.tvItemGoodDiscountNum = (android.widget.TextView) bindings[3];
        this.tvItemGoodDiscountNum.setTag(null);
        this.tvItemPromotionGoodsOriginalPrice = (android.widget.TextView) bindings[8];
        this.tvItemPromotionGoodsOriginalPrice.setTag(null);
        this.tvItemPromotionGoodsVipPrice = (android.widget.TextView) bindings[6];
        this.tvItemPromotionGoodsVipPrice.setTag(null);
        this.view = (android.view.View) bindings[14];
        this.view.setTag(null);
        setRootTag(root);
        // listeners
        mCallback95 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback96 = new android.databinding.generated.callback.OnClickListener(this, 2);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((ys.app.pad.viewmodel.GoodsItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.pad.viewmodel.GoodsItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.GoodsItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.pad.viewmodel.GoodsItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelPromotionPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeItemViewModelChuku((android.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeItemViewModelRuku((android.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeItemViewModelIsInventoryList((android.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeItemViewModelPromotionSetting((android.databinding.ObservableBoolean) object, fieldId);
            case 6 :
                return onChangeItemViewModelModel((ys.app.pad.model.GoodInfo) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.pad.viewmodel.GoodsItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.model) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelPromotionPrice(android.databinding.ObservableField<java.lang.String> ItemViewModelPromotionPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelChuku(android.databinding.ObservableBoolean ItemViewModelChuku, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelRuku(android.databinding.ObservableBoolean ItemViewModelRuku, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelIsInventoryList(android.databinding.ObservableBoolean ItemViewModelIsInventoryList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelPromotionSetting(android.databinding.ObservableBoolean ItemViewModelPromotionSetting, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.pad.model.GoodInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.isPromotion) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.vipAmt) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.realAmt) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.unit) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        else if (fieldId == BR.stockNum) {
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
        boolean itemViewModelIsInventoryListGet = false;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelVipAmt = null;
        ys.app.pad.viewmodel.GoodsItemViewModel itemViewModel = mItemViewModel;
        java.lang.String mboundView9AndroidStringGoodsStandardItemViewModelModelUnit = null;
        java.lang.String mboundView10AndroidStringGoodsInventoryStringValueOfItemViewModelModelStockNum = null;
        boolean itemViewModelModelStockNumInt0 = false;
        int itemViewModelModelIsFold = 0;
        java.lang.String itemViewModelPromotionSettingItemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxcPromotionAndroidStringJrxc = null;
        java.lang.String appUtilDiscountShowItemViewModelModelPromotionNumTvItemGoodDiscountNumAndroidStringZhe = null;
        long itemViewModelModelEndTime = 0L;
        boolean itemViewModelModelIsFoldInt1 = false;
        int itemViewModelModelStockNumInt0MboundView10AndroidColorTextYellowMboundView10AndroidColorWhite = 0;
        android.databinding.ObservableField<java.lang.String> itemViewModelPromotionPrice = null;
        java.lang.String itemViewModelModelPromotionTypeInt2TvItemGoodDiscountNumAndroidStringLijianAppUtilDiscountShowItemViewModelModelPromotionNumTvItemGoodDiscountNumAndroidStringZhe = null;
        android.databinding.ObservableBoolean itemViewModelChuku = null;
        int itemViewModelIsInventoryListViewGONEViewVISIBLE = 0;
        android.graphics.drawable.Drawable itemViewModelModelIsPromotionInt1TvItemPromotionGoodsOriginalPriceAndroidDrawableShapeLineLightTvItemPromotionGoodsOriginalPriceAndroidDrawableShapeTransparent = null;
        android.databinding.ObservableBoolean itemViewModelRuku = null;
        double itemViewModelModelRealAmt = 0.0;
        int itemViewModelModelIsPromotion = 0;
        int itemViewModelModelIsPromotionInt1MboundView7AndroidColorTextLightMboundView7AndroidColorFaintYellow = 0;
        java.lang.String tvItemPromotionGoodsVipPriceAndroidStringVipPriceAppUtilFormatStandardMoneyItemViewModelModelVipAmt = null;
        int itemViewModelModelPromotionType = 0;
        java.lang.String mboundView5AndroidStringDiscountPriceItemViewModelPromotionPrice = null;
        double itemViewModelModelVipAmt = 0.0;
        boolean itemViewModelModelPromotionTypeInt2 = false;
        android.databinding.ObservableBoolean itemViewModelIsInventoryList = null;
        int itemViewModelModelStockNum = 0;
        android.databinding.ObservableBoolean itemViewModelPromotionSetting = null;
        java.lang.String itemViewModelRukuKutvAndroidStringRkItemViewModelChukuKutvAndroidStringCkKutvAndroidStringCk = null;
        int itemViewModelChukuViewVISIBLEViewGONE = 0;
        int itemViewModelModelIsPromotionInt1TvItemPromotionGoodsOriginalPriceAndroidColorTextLightTvItemPromotionGoodsOriginalPriceAndroidColorFaintYellow = 0;
        ys.app.pad.model.GoodInfo itemViewModelModel = null;
        boolean itemViewModelPromotionSettingGet = false;
        java.lang.String itemViewModelModelUnit = null;
        java.lang.String tvItemPromotionGoodsOriginalPriceAndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelRealAmt = null;
        java.lang.String appUtilDiscountShowItemViewModelModelPromotionNum = null;
        boolean itemViewModelRukuGet = false;
        long itemViewModelModelBeginTime = 0L;
        java.lang.String appUtilLongToStandardTimeItemViewModelModelEndTime = null;
        java.lang.String itemViewModelPromotionPriceGet = null;
        java.lang.String itemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxc = null;
        java.lang.String appUtilLongToStandardTimeItemViewModelModelBeginTime = null;
        java.lang.String itemViewModelModelName = null;
        java.lang.String itemViewModelChukuKutvAndroidStringCkKutvAndroidStringCk = null;
        boolean itemViewModelChukuGet = false;
        int itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE = 0;
        int itemViewModelRukuViewVISIBLEItemViewModelChukuViewVISIBLEViewGONE = 0;
        int itemViewModelModelIsFoldInt1ItemViewModelModelIsPromotionInt1ViewVISIBLEViewGONEViewGONE = 0;
        boolean itemViewModelModelIsPromotionInt1 = false;
        double itemViewModelModelPromotionNum = 0.0;
        int itemViewModelPromotionSettingViewVISIBLEViewGONE = 0;
        java.lang.String stringValueOfItemViewModelModelStockNum = null;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelRealAmt = null;

        if ((dirtyFlags & 0x3fffL) != 0) {


            if ((dirtyFlags & 0x2003L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.promotionPrice
                        itemViewModelPromotionPrice = itemViewModel.promotionPrice;
                    }
                    updateRegistration(1, itemViewModelPromotionPrice);


                    if (itemViewModelPromotionPrice != null) {
                        // read itemViewModel.promotionPrice.get()
                        itemViewModelPromotionPriceGet = itemViewModelPromotionPrice.get();
                    }


                    // read (@android:string/discount_price) + (itemViewModel.promotionPrice.get())
                    mboundView5AndroidStringDiscountPriceItemViewModelPromotionPrice = (mboundView5.getResources().getString(R.string.discount_price)) + (itemViewModelPromotionPriceGet);
            }
            if ((dirtyFlags & 0x200dL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.ruku
                        itemViewModelRuku = itemViewModel.ruku;
                    }
                    updateRegistration(3, itemViewModelRuku);


                    if (itemViewModelRuku != null) {
                        // read itemViewModel.ruku.get()
                        itemViewModelRukuGet = itemViewModelRuku.get();
                    }
                if((dirtyFlags & 0x200dL) != 0) {
                    if(itemViewModelRukuGet) {
                            dirtyFlags |= 0x8000000L;
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                            dirtyFlags |= 0x4000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x2011L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.isInventoryList
                        itemViewModelIsInventoryList = itemViewModel.isInventoryList;
                    }
                    updateRegistration(4, itemViewModelIsInventoryList);


                    if (itemViewModelIsInventoryList != null) {
                        // read itemViewModel.isInventoryList.get()
                        itemViewModelIsInventoryListGet = itemViewModelIsInventoryList.get();
                    }
                if((dirtyFlags & 0x2011L) != 0) {
                    if(itemViewModelIsInventoryListGet) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }


                    // read itemViewModel.isInventoryList.get() ? View.GONE : View.VISIBLE
                    itemViewModelIsInventoryListViewGONEViewVISIBLE = ((itemViewModelIsInventoryListGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x2161L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.promotionSetting
                        itemViewModelPromotionSetting = itemViewModel.promotionSetting;
                    }
                    updateRegistration(5, itemViewModelPromotionSetting);


                    if (itemViewModelPromotionSetting != null) {
                        // read itemViewModel.promotionSetting.get()
                        itemViewModelPromotionSettingGet = itemViewModelPromotionSetting.get();
                    }
                if((dirtyFlags & 0x2161L) != 0) {
                    if(itemViewModelPromotionSettingGet) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                if((dirtyFlags & 0x2021L) != 0) {
                    if(itemViewModelPromotionSettingGet) {
                            dirtyFlags |= 0x80000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000000L;
                    }
                }

                if ((dirtyFlags & 0x2021L) != 0) {

                        // read itemViewModel.promotionSetting.get() ? View.VISIBLE : View.GONE
                        itemViewModelPromotionSettingViewVISIBLEViewGONE = ((itemViewModelPromotionSettingGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x3fc1L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }
                    updateRegistration(6, itemViewModelModel);

                if ((dirtyFlags & 0x2141L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.isFold
                            itemViewModelModelIsFold = itemViewModelModel.getIsFold();
                            // read itemViewModel.model.isPromotion
                            itemViewModelModelIsPromotion = itemViewModelModel.getIsPromotion();
                        }


                        // read itemViewModel.model.isFold == 1
                        itemViewModelModelIsFoldInt1 = (itemViewModelModelIsFold) == (1);
                        // read itemViewModel.model.isPromotion == 1
                        itemViewModelModelIsPromotionInt1 = (itemViewModelModelIsPromotion) == (1);
                    if((dirtyFlags & 0x2141L) != 0) {
                        if(itemViewModelModelIsFoldInt1) {
                                dirtyFlags |= 0x20000000000L;
                        }
                        else {
                                dirtyFlags |= 0x10000000000L;
                        }
                    }
                    if((dirtyFlags & 0x2141L) != 0) {
                        if(itemViewModelModelIsPromotionInt1) {
                                dirtyFlags |= 0x800000L;
                                dirtyFlags |= 0x2000000L;
                                dirtyFlags |= 0x80000000L;
                        }
                        else {
                                dirtyFlags |= 0x400000L;
                                dirtyFlags |= 0x1000000L;
                                dirtyFlags |= 0x40000000L;
                        }
                    }
                    if((dirtyFlags & 0x8000L) != 0) {
                        if(itemViewModelModelIsPromotionInt1) {
                                dirtyFlags |= 0x200000000L;
                        }
                        else {
                                dirtyFlags |= 0x100000000L;
                        }
                    }
                    if((dirtyFlags & 0x20000002141L) != 0) {
                        if(itemViewModelModelIsPromotionInt1) {
                                dirtyFlags |= 0x2000000000L;
                        }
                        else {
                                dirtyFlags |= 0x1000000000L;
                        }
                    }


                        // read itemViewModel.model.isPromotion == 1 ? @android:drawable/shape_line_light : @android:drawable/shape_transparent
                        itemViewModelModelIsPromotionInt1TvItemPromotionGoodsOriginalPriceAndroidDrawableShapeLineLightTvItemPromotionGoodsOriginalPriceAndroidDrawableShapeTransparent = ((itemViewModelModelIsPromotionInt1) ? (getDrawableFromResource(tvItemPromotionGoodsOriginalPrice, R.drawable.shape_line_light)) : (getDrawableFromResource(tvItemPromotionGoodsOriginalPrice, R.drawable.shape_transparent)));
                        // read itemViewModel.model.isPromotion == 1 ? @android:color/text_light : @android:color/faint_yellow
                        itemViewModelModelIsPromotionInt1MboundView7AndroidColorTextLightMboundView7AndroidColorFaintYellow = ((itemViewModelModelIsPromotionInt1) ? (getColorFromResource(mboundView7, R.color.text_light)) : (getColorFromResource(mboundView7, R.color.faint_yellow)));
                        // read itemViewModel.model.isPromotion == 1 ? @android:color/text_light : @android:color/faint_yellow
                        itemViewModelModelIsPromotionInt1TvItemPromotionGoodsOriginalPriceAndroidColorTextLightTvItemPromotionGoodsOriginalPriceAndroidColorFaintYellow = ((itemViewModelModelIsPromotionInt1) ? (getColorFromResource(tvItemPromotionGoodsOriginalPrice, R.color.text_light)) : (getColorFromResource(tvItemPromotionGoodsOriginalPrice, R.color.faint_yellow)));
                        // read itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
                        itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE = ((itemViewModelModelIsPromotionInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
                if ((dirtyFlags & 0x2041L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.endTime
                            itemViewModelModelEndTime = itemViewModelModel.getEndTime();
                            // read itemViewModel.model.promotionType
                            itemViewModelModelPromotionType = itemViewModelModel.getPromotionType();
                            // read itemViewModel.model.beginTime
                            itemViewModelModelBeginTime = itemViewModelModel.getBeginTime();
                        }


                        // read AppUtil.longToStandardTime(itemViewModel.model.endTime)
                        appUtilLongToStandardTimeItemViewModelModelEndTime = ys.app.pad.utils.AppUtil.longToStandardTime(itemViewModelModelEndTime);
                        // read itemViewModel.model.promotionType == 2
                        itemViewModelModelPromotionTypeInt2 = (itemViewModelModelPromotionType) == (2);
                        // read AppUtil.longToStandardTime(itemViewModel.model.beginTime)
                        appUtilLongToStandardTimeItemViewModelModelBeginTime = ys.app.pad.utils.AppUtil.longToStandardTime(itemViewModelModelBeginTime);
                    if((dirtyFlags & 0x2041L) != 0) {
                        if(itemViewModelModelPromotionTypeInt2) {
                                dirtyFlags |= 0x80000L;
                        }
                        else {
                                dirtyFlags |= 0x40000L;
                        }
                    }
                }
                if ((dirtyFlags & 0x2441L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.realAmt
                            itemViewModelModelRealAmt = itemViewModelModel.getRealAmt();
                        }


                        // read AppUtil.formatStandardMoney(itemViewModel.model.realAmt)
                        appUtilFormatStandardMoneyItemViewModelModelRealAmt = ys.app.pad.utils.AppUtil.formatStandardMoney(itemViewModelModelRealAmt);


                        // read (@android:string/rmb) + (AppUtil.formatStandardMoney(itemViewModel.model.realAmt))
                        tvItemPromotionGoodsOriginalPriceAndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelRealAmt = (tvItemPromotionGoodsOriginalPrice.getResources().getString(R.string.rmb)) + (appUtilFormatStandardMoneyItemViewModelModelRealAmt);
                }
                if ((dirtyFlags & 0x2241L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.vipAmt
                            itemViewModelModelVipAmt = itemViewModelModel.getVipAmt();
                        }


                        // read AppUtil.formatStandardMoney(itemViewModel.model.vipAmt)
                        appUtilFormatStandardMoneyItemViewModelModelVipAmt = ys.app.pad.utils.AppUtil.formatStandardMoney(itemViewModelModelVipAmt);


                        // read (@android:string/vip_price) + (AppUtil.formatStandardMoney(itemViewModel.model.vipAmt))
                        tvItemPromotionGoodsVipPriceAndroidStringVipPriceAppUtilFormatStandardMoneyItemViewModelModelVipAmt = (tvItemPromotionGoodsVipPrice.getResources().getString(R.string.vip_price)) + (appUtilFormatStandardMoneyItemViewModelModelVipAmt);
                }
                if ((dirtyFlags & 0x3041L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.stockNum
                            itemViewModelModelStockNum = itemViewModelModel.getStockNum();
                        }


                        // read itemViewModel.model.stockNum == 0
                        itemViewModelModelStockNumInt0 = (itemViewModelModelStockNum) == (0);
                        // read String.valueOf(itemViewModel.model.stockNum)
                        stringValueOfItemViewModelModelStockNum = java.lang.String.valueOf(itemViewModelModelStockNum);
                    if((dirtyFlags & 0x3041L) != 0) {
                        if(itemViewModelModelStockNumInt0) {
                                dirtyFlags |= 0x20000L;
                        }
                        else {
                                dirtyFlags |= 0x10000L;
                        }
                    }


                        // read itemViewModel.model.stockNum == 0 ? @android:color/text_yellow : @android:color/white
                        itemViewModelModelStockNumInt0MboundView10AndroidColorTextYellowMboundView10AndroidColorWhite = ((itemViewModelModelStockNumInt0) ? (getColorFromResource(mboundView10, R.color.text_yellow)) : (getColorFromResource(mboundView10, R.color.white)));
                        // read (@android:string/goods_inventory) + (String.valueOf(itemViewModel.model.stockNum))
                        mboundView10AndroidStringGoodsInventoryStringValueOfItemViewModelModelStockNum = (mboundView10.getResources().getString(R.string.goods_inventory)) + (stringValueOfItemViewModelModelStockNum);
                }
                if ((dirtyFlags & 0x2841L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.unit
                            itemViewModelModelUnit = itemViewModelModel.getUnit();
                        }


                        // read (@android:string/goods_standard) + (itemViewModel.model.unit)
                        mboundView9AndroidStringGoodsStandardItemViewModelModelUnit = (mboundView9.getResources().getString(R.string.goods_standard)) + (itemViewModelModelUnit);
                }
                if ((dirtyFlags & 0x20c1L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.name
                            itemViewModelModelName = itemViewModelModel.getName();
                        }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4004000000L) != 0) {

                if (itemViewModel != null) {
                    // read itemViewModel.chuku
                    itemViewModelChuku = itemViewModel.chuku;
                }
                updateRegistration(2, itemViewModelChuku);


                if (itemViewModelChuku != null) {
                    // read itemViewModel.chuku.get()
                    itemViewModelChukuGet = itemViewModelChuku.get();
                }
            if((dirtyFlags & 0x4000000000L) != 0) {
                if(itemViewModelChukuGet) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }
            if((dirtyFlags & 0x4000000L) != 0) {
                if(itemViewModelChukuGet) {
                        dirtyFlags |= 0x800000000L;
                }
                else {
                        dirtyFlags |= 0x400000000L;
                }
            }

            if ((dirtyFlags & 0x4000000000L) != 0) {

                    // read itemViewModel.chuku.get() ? View.VISIBLE : View.GONE
                    itemViewModelChukuViewVISIBLEViewGONE = ((itemViewModelChukuGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x4000000L) != 0) {

                    // read itemViewModel.chuku.get() ? @android:string/ck : @android:string/ck
                    itemViewModelChukuKutvAndroidStringCkKutvAndroidStringCk = ((itemViewModelChukuGet) ? (kutv.getResources().getString(R.string.ck)) : (kutv.getResources().getString(R.string.ck)));
            }
        }
        if ((dirtyFlags & 0x48000L) != 0) {

                if (itemViewModel != null) {
                    // read itemViewModel.model
                    itemViewModelModel = itemViewModel.getModel();
                }
                updateRegistration(6, itemViewModelModel);

            if ((dirtyFlags & 0x8000L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.isPromotion
                        itemViewModelModelIsPromotion = itemViewModelModel.getIsPromotion();
                    }


                    // read itemViewModel.model.isPromotion == 1
                    itemViewModelModelIsPromotionInt1 = (itemViewModelModelIsPromotion) == (1);
                if((dirtyFlags & 0x2141L) != 0) {
                    if(itemViewModelModelIsPromotionInt1) {
                            dirtyFlags |= 0x800000L;
                            dirtyFlags |= 0x2000000L;
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x40000000L;
                    }
                }
                if((dirtyFlags & 0x8000L) != 0) {
                    if(itemViewModelModelIsPromotionInt1) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }
                if((dirtyFlags & 0x20000002141L) != 0) {
                    if(itemViewModelModelIsPromotionInt1) {
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                    }
                }


                    // read itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc
                    itemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxc = ((itemViewModelModelIsPromotionInt1) ? (promotion.getResources().getString(R.string.rjrxc)) : (promotion.getResources().getString(R.string.jrxc)));
            }
            if ((dirtyFlags & 0x40000L) != 0) {

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.promotionNum
                        itemViewModelModelPromotionNum = itemViewModelModel.getPromotionNum();
                    }


                    // read AppUtil.discountShow(itemViewModel.model.promotionNum)
                    appUtilDiscountShowItemViewModelModelPromotionNum = ys.app.pad.utils.AppUtil.discountShow(itemViewModelModelPromotionNum);


                    // read (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
                    appUtilDiscountShowItemViewModelModelPromotionNumTvItemGoodDiscountNumAndroidStringZhe = (appUtilDiscountShowItemViewModelModelPromotionNum) + (tvItemGoodDiscountNum.getResources().getString(R.string.zhe));
            }
        }
        if ((dirtyFlags & 0x2141L) != 0) {

                // read itemViewModel.model.isFold == 1 ? itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE : View.GONE
                itemViewModelModelIsFoldInt1ItemViewModelModelIsPromotionInt1ViewVISIBLEViewGONEViewGONE = ((itemViewModelModelIsFoldInt1) ? (itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE) : (android.view.View.GONE));
        }

        if ((dirtyFlags & 0x2161L) != 0) {

                // read itemViewModel.promotionSetting.get() ? itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc : @android:string/jrxc
                itemViewModelPromotionSettingItemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxcPromotionAndroidStringJrxc = ((itemViewModelPromotionSettingGet) ? (itemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxc) : (promotion.getResources().getString(R.string.jrxc)));
        }
        if ((dirtyFlags & 0x2041L) != 0) {

                // read itemViewModel.model.promotionType == 2 ? @android:string/lijian : (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
                itemViewModelModelPromotionTypeInt2TvItemGoodDiscountNumAndroidStringLijianAppUtilDiscountShowItemViewModelModelPromotionNumTvItemGoodDiscountNumAndroidStringZhe = ((itemViewModelModelPromotionTypeInt2) ? (tvItemGoodDiscountNum.getResources().getString(R.string.lijian)) : (appUtilDiscountShowItemViewModelModelPromotionNumTvItemGoodDiscountNumAndroidStringZhe));
        }
        if ((dirtyFlags & 0x200dL) != 0) {

                // read itemViewModel.ruku.get() ? @android:string/rk : itemViewModel.chuku.get() ? @android:string/ck : @android:string/ck
                itemViewModelRukuKutvAndroidStringRkItemViewModelChukuKutvAndroidStringCkKutvAndroidStringCk = ((itemViewModelRukuGet) ? (kutv.getResources().getString(R.string.rk)) : (itemViewModelChukuKutvAndroidStringCkKutvAndroidStringCk));
                // read itemViewModel.ruku.get() ? View.VISIBLE : itemViewModel.chuku.get() ? View.VISIBLE : View.GONE
                itemViewModelRukuViewVISIBLEItemViewModelChukuViewVISIBLEViewGONE = ((itemViewModelRukuGet) ? (android.view.View.VISIBLE) : (itemViewModelChukuViewVISIBLEViewGONE));
        }
        // batch finished
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            this.kutv.setOnClickListener(mCallback96);
            this.promotion.setOnClickListener(mCallback95);
        }
        if ((dirtyFlags & 0x200dL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.kutv, itemViewModelRukuKutvAndroidStringRkItemViewModelChukuKutvAndroidStringCkKutvAndroidStringCk);
            this.kutv.setVisibility(itemViewModelRukuViewVISIBLEItemViewModelChukuViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2141L) != 0) {
            // api target 1

            this.llPromotionTime.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.mboundView4.setVisibility(itemViewModelModelIsFoldInt1ItemViewModelModelIsPromotionInt1ViewVISIBLEViewGONEViewGONE);
            this.mboundView7.setTextColor(itemViewModelModelIsPromotionInt1MboundView7AndroidColorTextLightMboundView7AndroidColorFaintYellow);
            this.tvItemPromotionGoodsOriginalPrice.setTextColor(itemViewModelModelIsPromotionInt1TvItemPromotionGoodsOriginalPriceAndroidColorTextLightTvItemPromotionGoodsOriginalPriceAndroidColorFaintYellow);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.tvItemPromotionGoodsOriginalPrice, itemViewModelModelIsPromotionInt1TvItemPromotionGoodsOriginalPriceAndroidDrawableShapeLineLightTvItemPromotionGoodsOriginalPriceAndroidDrawableShapeTransparent);
        }
        if ((dirtyFlags & 0x20c1L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelModelName);
        }
        if ((dirtyFlags & 0x3041L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, mboundView10AndroidStringGoodsInventoryStringValueOfItemViewModelModelStockNum);
            this.mboundView10.setTextColor(itemViewModelModelStockNumInt0MboundView10AndroidColorTextYellowMboundView10AndroidColorWhite);
        }
        if ((dirtyFlags & 0x2041L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, appUtilLongToStandardTimeItemViewModelModelBeginTime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, appUtilLongToStandardTimeItemViewModelModelEndTime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemGoodDiscountNum, itemViewModelModelPromotionTypeInt2TvItemGoodDiscountNumAndroidStringLijianAppUtilDiscountShowItemViewModelModelPromotionNumTvItemGoodDiscountNumAndroidStringZhe);
        }
        if ((dirtyFlags & 0x2003L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, mboundView5AndroidStringDiscountPriceItemViewModelPromotionPrice);
        }
        if ((dirtyFlags & 0x2841L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, mboundView9AndroidStringGoodsStandardItemViewModelModelUnit);
        }
        if ((dirtyFlags & 0x2161L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.promotion, itemViewModelPromotionSettingItemViewModelModelIsPromotionInt1PromotionAndroidStringRjrxcPromotionAndroidStringJrxcPromotionAndroidStringJrxc);
        }
        if ((dirtyFlags & 0x2021L) != 0) {
            // api target 1

            this.promotion.setVisibility(itemViewModelPromotionSettingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2441L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemPromotionGoodsOriginalPrice, tvItemPromotionGoodsOriginalPriceAndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelRealAmt);
        }
        if ((dirtyFlags & 0x2241L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemPromotionGoodsVipPrice, tvItemPromotionGoodsVipPriceAndroidStringVipPriceAppUtilFormatStandardMoneyItemViewModelModelVipAmt);
        }
        if ((dirtyFlags & 0x2011L) != 0) {
            // api target 1

            this.view.setVisibility(itemViewModelIsInventoryListViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                ys.app.pad.viewmodel.GoodsItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.promotionClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                ys.app.pad.viewmodel.GoodsItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.kuClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemGoodsBinding>inflate(inflater, ys.app.pad.R.layout.item_goods, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.item_goods, null, false), bindingComponent);
    }
    @NonNull
    public static ItemGoodsBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_goods_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemGoodsBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.promotionPrice
        flag 2 (0x3L): itemViewModel.chuku
        flag 3 (0x4L): itemViewModel.ruku
        flag 4 (0x5L): itemViewModel.isInventoryList
        flag 5 (0x6L): itemViewModel.promotionSetting
        flag 6 (0x7L): itemViewModel.model
        flag 7 (0x8L): itemViewModel.model.name
        flag 8 (0x9L): itemViewModel.model.isPromotion
        flag 9 (0xaL): itemViewModel.model.vipAmt
        flag 10 (0xbL): itemViewModel.model.realAmt
        flag 11 (0xcL): itemViewModel.model.unit
        flag 12 (0xdL): itemViewModel.model.stockNum
        flag 13 (0xeL): null
        flag 14 (0xfL): itemViewModel.promotionSetting.get() ? itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc : @android:string/jrxc
        flag 15 (0x10L): itemViewModel.promotionSetting.get() ? itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc : @android:string/jrxc
        flag 16 (0x11L): itemViewModel.model.stockNum == 0 ? @android:color/text_yellow : @android:color/white
        flag 17 (0x12L): itemViewModel.model.stockNum == 0 ? @android:color/text_yellow : @android:color/white
        flag 18 (0x13L): itemViewModel.model.promotionType == 2 ? @android:string/lijian : (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
        flag 19 (0x14L): itemViewModel.model.promotionType == 2 ? @android:string/lijian : (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
        flag 20 (0x15L): itemViewModel.isInventoryList.get() ? View.GONE : View.VISIBLE
        flag 21 (0x16L): itemViewModel.isInventoryList.get() ? View.GONE : View.VISIBLE
        flag 22 (0x17L): itemViewModel.model.isPromotion == 1 ? @android:drawable/shape_line_light : @android:drawable/shape_transparent
        flag 23 (0x18L): itemViewModel.model.isPromotion == 1 ? @android:drawable/shape_line_light : @android:drawable/shape_transparent
        flag 24 (0x19L): itemViewModel.model.isPromotion == 1 ? @android:color/text_light : @android:color/faint_yellow
        flag 25 (0x1aL): itemViewModel.model.isPromotion == 1 ? @android:color/text_light : @android:color/faint_yellow
        flag 26 (0x1bL): itemViewModel.ruku.get() ? @android:string/rk : itemViewModel.chuku.get() ? @android:string/ck : @android:string/ck
        flag 27 (0x1cL): itemViewModel.ruku.get() ? @android:string/rk : itemViewModel.chuku.get() ? @android:string/ck : @android:string/ck
        flag 28 (0x1dL): itemViewModel.chuku.get() ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): itemViewModel.chuku.get() ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): itemViewModel.model.isPromotion == 1 ? @android:color/text_light : @android:color/faint_yellow
        flag 31 (0x20L): itemViewModel.model.isPromotion == 1 ? @android:color/text_light : @android:color/faint_yellow
        flag 32 (0x21L): itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc
        flag 33 (0x22L): itemViewModel.model.isPromotion == 1 ? @android:string/rjrxc : @android:string/jrxc
        flag 34 (0x23L): itemViewModel.chuku.get() ? @android:string/ck : @android:string/ck
        flag 35 (0x24L): itemViewModel.chuku.get() ? @android:string/ck : @android:string/ck
        flag 36 (0x25L): itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
        flag 37 (0x26L): itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
        flag 38 (0x27L): itemViewModel.ruku.get() ? View.VISIBLE : itemViewModel.chuku.get() ? View.VISIBLE : View.GONE
        flag 39 (0x28L): itemViewModel.ruku.get() ? View.VISIBLE : itemViewModel.chuku.get() ? View.VISIBLE : View.GONE
        flag 40 (0x29L): itemViewModel.model.isFold == 1 ? itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE : View.GONE
        flag 41 (0x2aL): itemViewModel.model.isFold == 1 ? itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE : View.GONE
        flag 42 (0x2bL): itemViewModel.promotionSetting.get() ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): itemViewModel.promotionSetting.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}