package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemGoodsCollectBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_item_collect_picture, 14);
    }
    // views
    @NonNull
    public final android.widget.ImageView ivItemCollectPicture;
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
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView9;
    @NonNull
    public final android.widget.LinearLayout rootView;
    @NonNull
    public final android.widget.TextView tvItemGoodDiscountNum;
    @NonNull
    public final android.widget.TextView tvItemPromotionGoodsOriginalPrice;
    @NonNull
    public final android.widget.TextView tvItemPromotionGoodsVipPrice;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.GoodsItemViewModel mItemViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemGoodsCollectBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds);
        this.ivItemCollectPicture = (android.widget.ImageView) bindings[14];
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
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.rootView = (android.widget.LinearLayout) bindings[0];
        this.rootView.setTag(null);
        this.tvItemGoodDiscountNum = (android.widget.TextView) bindings[3];
        this.tvItemGoodDiscountNum.setTag(null);
        this.tvItemPromotionGoodsOriginalPrice = (android.widget.TextView) bindings[8];
        this.tvItemPromotionGoodsOriginalPrice.setTag(null);
        this.tvItemPromotionGoodsVipPrice = (android.widget.TextView) bindings[6];
        this.tvItemPromotionGoodsVipPrice.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
                    mDirtyFlags |= 0x4L;
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
    private boolean onChangeItemViewModelModel(ys.app.pad.model.GoodInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.isPromotion) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.vipAmt) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.realAmt) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.unit) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.stockNum) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelVipAmt = null;
        ys.app.pad.viewmodel.GoodsItemViewModel itemViewModel = mItemViewModel;
        java.lang.String mboundView9AndroidStringGoodsStandardItemViewModelModelUnit = null;
        java.lang.String mboundView10AndroidStringGoodsInventoryStringValueOfItemViewModelModelStockNum = null;
        boolean itemViewModelModelStockNumInt0 = false;
        int itemViewModelModelIsFold = 0;
        java.lang.String appUtilDiscountShowItemViewModelModelPromotionNumTvItemGoodDiscountNumAndroidStringZhe = null;
        long itemViewModelModelEndTime = 0L;
        boolean itemViewModelModelIsFoldInt1 = false;
        int itemViewModelModelStockNumInt0MboundView10AndroidColorTextYellowMboundView10AndroidColorWhite = 0;
        android.databinding.ObservableField<java.lang.String> itemViewModelPromotionPrice = null;
        java.lang.String itemViewModelModelPromotionTypeInt2TvItemGoodDiscountNumAndroidStringLijianAppUtilDiscountShowItemViewModelModelPromotionNumTvItemGoodDiscountNumAndroidStringZhe = null;
        android.graphics.drawable.Drawable itemViewModelModelIsPromotionInt1TvItemPromotionGoodsOriginalPriceAndroidDrawableShapeLineLightTvItemPromotionGoodsOriginalPriceAndroidDrawableShapeTransparent = null;
        double itemViewModelModelRealAmt = 0.0;
        int itemViewModelModelIsPromotion = 0;
        int itemViewModelModelIsPromotionInt1MboundView7AndroidColorTextLightMboundView7AndroidColorFaintYellow = 0;
        java.lang.String tvItemPromotionGoodsVipPriceAndroidStringVipPriceAppUtilFormatStandardMoneyItemViewModelModelVipAmt = null;
        int itemViewModelModelPromotionType = 0;
        java.lang.String mboundView5AndroidStringDiscountPriceItemViewModelPromotionPrice = null;
        double itemViewModelModelVipAmt = 0.0;
        boolean itemViewModelModelPromotionTypeInt2 = false;
        int itemViewModelModelStockNum = 0;
        int itemViewModelModelIsPromotionInt1TvItemPromotionGoodsOriginalPriceAndroidColorTextLightTvItemPromotionGoodsOriginalPriceAndroidColorFaintYellow = 0;
        ys.app.pad.model.GoodInfo itemViewModelModel = null;
        java.lang.String itemViewModelModelUnit = null;
        java.lang.String tvItemPromotionGoodsOriginalPriceAndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelRealAmt = null;
        java.lang.String appUtilDiscountShowItemViewModelModelPromotionNum = null;
        long itemViewModelModelBeginTime = 0L;
        java.lang.String appUtilLongToStandardTimeItemViewModelModelEndTime = null;
        java.lang.String itemViewModelPromotionPriceGet = null;
        java.lang.String appUtilLongToStandardTimeItemViewModelModelBeginTime = null;
        java.lang.String itemViewModelModelName = null;
        int itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE = 0;
        int itemViewModelModelIsFoldInt1ItemViewModelModelIsPromotionInt1ViewVISIBLEViewGONEViewGONE = 0;
        boolean itemViewModelModelIsPromotionInt1 = false;
        double itemViewModelModelPromotionNum = 0.0;
        java.lang.String stringValueOfItemViewModelModelStockNum = null;
        java.lang.String appUtilFormatStandardMoneyItemViewModelModelRealAmt = null;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x203L) != 0) {

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
            if ((dirtyFlags & 0x3fdL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }
                    updateRegistration(2, itemViewModelModel);

                if ((dirtyFlags & 0x215L) != 0) {

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
                    if((dirtyFlags & 0x215L) != 0) {
                        if(itemViewModelModelIsFoldInt1) {
                                dirtyFlags |= 0x800000L;
                        }
                        else {
                                dirtyFlags |= 0x400000L;
                        }
                    }
                    if((dirtyFlags & 0x215L) != 0) {
                        if(itemViewModelModelIsPromotionInt1) {
                                dirtyFlags |= 0x8000L;
                                dirtyFlags |= 0x20000L;
                                dirtyFlags |= 0x80000L;
                        }
                        else {
                                dirtyFlags |= 0x4000L;
                                dirtyFlags |= 0x10000L;
                                dirtyFlags |= 0x40000L;
                        }
                    }
                    if((dirtyFlags & 0x800215L) != 0) {
                        if(itemViewModelModelIsPromotionInt1) {
                                dirtyFlags |= 0x200000L;
                        }
                        else {
                                dirtyFlags |= 0x100000L;
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
                if ((dirtyFlags & 0x205L) != 0) {

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
                    if((dirtyFlags & 0x205L) != 0) {
                        if(itemViewModelModelPromotionTypeInt2) {
                                dirtyFlags |= 0x2000L;
                        }
                        else {
                                dirtyFlags |= 0x1000L;
                        }
                    }
                }
                if ((dirtyFlags & 0x245L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.realAmt
                            itemViewModelModelRealAmt = itemViewModelModel.getRealAmt();
                        }


                        // read AppUtil.formatStandardMoney(itemViewModel.model.realAmt)
                        appUtilFormatStandardMoneyItemViewModelModelRealAmt = ys.app.pad.utils.AppUtil.formatStandardMoney(itemViewModelModelRealAmt);


                        // read (@android:string/rmb) + (AppUtil.formatStandardMoney(itemViewModel.model.realAmt))
                        tvItemPromotionGoodsOriginalPriceAndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelRealAmt = (tvItemPromotionGoodsOriginalPrice.getResources().getString(R.string.rmb)) + (appUtilFormatStandardMoneyItemViewModelModelRealAmt);
                }
                if ((dirtyFlags & 0x225L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.vipAmt
                            itemViewModelModelVipAmt = itemViewModelModel.getVipAmt();
                        }


                        // read AppUtil.formatStandardMoney(itemViewModel.model.vipAmt)
                        appUtilFormatStandardMoneyItemViewModelModelVipAmt = ys.app.pad.utils.AppUtil.formatStandardMoney(itemViewModelModelVipAmt);


                        // read (@android:string/vip_price) + (AppUtil.formatStandardMoney(itemViewModel.model.vipAmt))
                        tvItemPromotionGoodsVipPriceAndroidStringVipPriceAppUtilFormatStandardMoneyItemViewModelModelVipAmt = (tvItemPromotionGoodsVipPrice.getResources().getString(R.string.vip_price)) + (appUtilFormatStandardMoneyItemViewModelModelVipAmt);
                }
                if ((dirtyFlags & 0x305L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.stockNum
                            itemViewModelModelStockNum = itemViewModelModel.getStockNum();
                        }


                        // read itemViewModel.model.stockNum == 0
                        itemViewModelModelStockNumInt0 = (itemViewModelModelStockNum) == (0);
                        // read String.valueOf(itemViewModel.model.stockNum)
                        stringValueOfItemViewModelModelStockNum = java.lang.String.valueOf(itemViewModelModelStockNum);
                    if((dirtyFlags & 0x305L) != 0) {
                        if(itemViewModelModelStockNumInt0) {
                                dirtyFlags |= 0x800L;
                        }
                        else {
                                dirtyFlags |= 0x400L;
                        }
                    }


                        // read itemViewModel.model.stockNum == 0 ? @android:color/text_yellow : @android:color/white
                        itemViewModelModelStockNumInt0MboundView10AndroidColorTextYellowMboundView10AndroidColorWhite = ((itemViewModelModelStockNumInt0) ? (getColorFromResource(mboundView10, R.color.text_yellow)) : (getColorFromResource(mboundView10, R.color.white)));
                        // read (@android:string/goods_inventory) + (String.valueOf(itemViewModel.model.stockNum))
                        mboundView10AndroidStringGoodsInventoryStringValueOfItemViewModelModelStockNum = (mboundView10.getResources().getString(R.string.goods_inventory)) + (stringValueOfItemViewModelModelStockNum);
                }
                if ((dirtyFlags & 0x285L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.unit
                            itemViewModelModelUnit = itemViewModelModel.getUnit();
                        }


                        // read (@android:string/goods_standard) + (itemViewModel.model.unit)
                        mboundView9AndroidStringGoodsStandardItemViewModelModelUnit = (mboundView9.getResources().getString(R.string.goods_standard)) + (itemViewModelModelUnit);
                }
                if ((dirtyFlags & 0x20dL) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.name
                            itemViewModelModelName = itemViewModelModel.getName();
                        }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x215L) != 0) {

                // read itemViewModel.model.isFold == 1 ? itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE : View.GONE
                itemViewModelModelIsFoldInt1ItemViewModelModelIsPromotionInt1ViewVISIBLEViewGONEViewGONE = ((itemViewModelModelIsFoldInt1) ? (itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1000L) != 0) {

                if (itemViewModelModel != null) {
                    // read itemViewModel.model.promotionNum
                    itemViewModelModelPromotionNum = itemViewModelModel.getPromotionNum();
                }


                // read AppUtil.discountShow(itemViewModel.model.promotionNum)
                appUtilDiscountShowItemViewModelModelPromotionNum = ys.app.pad.utils.AppUtil.discountShow(itemViewModelModelPromotionNum);


                // read (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
                appUtilDiscountShowItemViewModelModelPromotionNumTvItemGoodDiscountNumAndroidStringZhe = (appUtilDiscountShowItemViewModelModelPromotionNum) + (tvItemGoodDiscountNum.getResources().getString(R.string.zhe));
        }

        if ((dirtyFlags & 0x205L) != 0) {

                // read itemViewModel.model.promotionType == 2 ? @android:string/lijian : (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
                itemViewModelModelPromotionTypeInt2TvItemGoodDiscountNumAndroidStringLijianAppUtilDiscountShowItemViewModelModelPromotionNumTvItemGoodDiscountNumAndroidStringZhe = ((itemViewModelModelPromotionTypeInt2) ? (tvItemGoodDiscountNum.getResources().getString(R.string.lijian)) : (appUtilDiscountShowItemViewModelModelPromotionNumTvItemGoodDiscountNumAndroidStringZhe));
        }
        // batch finished
        if ((dirtyFlags & 0x215L) != 0) {
            // api target 1

            this.llPromotionTime.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(itemViewModelModelIsPromotionInt1ViewVISIBLEViewGONE);
            this.mboundView4.setVisibility(itemViewModelModelIsFoldInt1ItemViewModelModelIsPromotionInt1ViewVISIBLEViewGONEViewGONE);
            this.mboundView7.setTextColor(itemViewModelModelIsPromotionInt1MboundView7AndroidColorTextLightMboundView7AndroidColorFaintYellow);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.tvItemPromotionGoodsOriginalPrice, itemViewModelModelIsPromotionInt1TvItemPromotionGoodsOriginalPriceAndroidDrawableShapeLineLightTvItemPromotionGoodsOriginalPriceAndroidDrawableShapeTransparent);
            this.tvItemPromotionGoodsOriginalPrice.setTextColor(itemViewModelModelIsPromotionInt1TvItemPromotionGoodsOriginalPriceAndroidColorTextLightTvItemPromotionGoodsOriginalPriceAndroidColorFaintYellow);
        }
        if ((dirtyFlags & 0x20dL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelModelName);
        }
        if ((dirtyFlags & 0x305L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, mboundView10AndroidStringGoodsInventoryStringValueOfItemViewModelModelStockNum);
            this.mboundView10.setTextColor(itemViewModelModelStockNumInt0MboundView10AndroidColorTextYellowMboundView10AndroidColorWhite);
        }
        if ((dirtyFlags & 0x205L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, appUtilLongToStandardTimeItemViewModelModelBeginTime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, appUtilLongToStandardTimeItemViewModelModelEndTime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemGoodDiscountNum, itemViewModelModelPromotionTypeInt2TvItemGoodDiscountNumAndroidStringLijianAppUtilDiscountShowItemViewModelModelPromotionNumTvItemGoodDiscountNumAndroidStringZhe);
        }
        if ((dirtyFlags & 0x203L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, mboundView5AndroidStringDiscountPriceItemViewModelPromotionPrice);
        }
        if ((dirtyFlags & 0x285L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, mboundView9AndroidStringGoodsStandardItemViewModelModelUnit);
        }
        if ((dirtyFlags & 0x245L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemPromotionGoodsOriginalPrice, tvItemPromotionGoodsOriginalPriceAndroidStringRmbAppUtilFormatStandardMoneyItemViewModelModelRealAmt);
        }
        if ((dirtyFlags & 0x225L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemPromotionGoodsVipPrice, tvItemPromotionGoodsVipPriceAndroidStringVipPriceAppUtilFormatStandardMoneyItemViewModelModelVipAmt);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemGoodsCollectBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsCollectBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemGoodsCollectBinding>inflate(inflater, ys.app.pad.R.layout.item_goods_collect_money, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemGoodsCollectBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsCollectBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.item_goods_collect_money, null, false), bindingComponent);
    }
    @NonNull
    public static ItemGoodsCollectBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemGoodsCollectBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_goods_collect_money_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemGoodsCollectBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.promotionPrice
        flag 2 (0x3L): itemViewModel.model
        flag 3 (0x4L): itemViewModel.model.name
        flag 4 (0x5L): itemViewModel.model.isPromotion
        flag 5 (0x6L): itemViewModel.model.vipAmt
        flag 6 (0x7L): itemViewModel.model.realAmt
        flag 7 (0x8L): itemViewModel.model.unit
        flag 8 (0x9L): itemViewModel.model.stockNum
        flag 9 (0xaL): null
        flag 10 (0xbL): itemViewModel.model.stockNum == 0 ? @android:color/text_yellow : @android:color/white
        flag 11 (0xcL): itemViewModel.model.stockNum == 0 ? @android:color/text_yellow : @android:color/white
        flag 12 (0xdL): itemViewModel.model.promotionType == 2 ? @android:string/lijian : (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
        flag 13 (0xeL): itemViewModel.model.promotionType == 2 ? @android:string/lijian : (AppUtil.discountShow(itemViewModel.model.promotionNum)) + (@android:string/zhe)
        flag 14 (0xfL): itemViewModel.model.isPromotion == 1 ? @android:drawable/shape_line_light : @android:drawable/shape_transparent
        flag 15 (0x10L): itemViewModel.model.isPromotion == 1 ? @android:drawable/shape_line_light : @android:drawable/shape_transparent
        flag 16 (0x11L): itemViewModel.model.isPromotion == 1 ? @android:color/text_light : @android:color/faint_yellow
        flag 17 (0x12L): itemViewModel.model.isPromotion == 1 ? @android:color/text_light : @android:color/faint_yellow
        flag 18 (0x13L): itemViewModel.model.isPromotion == 1 ? @android:color/text_light : @android:color/faint_yellow
        flag 19 (0x14L): itemViewModel.model.isPromotion == 1 ? @android:color/text_light : @android:color/faint_yellow
        flag 20 (0x15L): itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
        flag 21 (0x16L): itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE
        flag 22 (0x17L): itemViewModel.model.isFold == 1 ? itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE : View.GONE
        flag 23 (0x18L): itemViewModel.model.isFold == 1 ? itemViewModel.model.isPromotion == 1 ? View.VISIBLE : View.GONE : View.GONE
    flag mapping end*/
    //end
}