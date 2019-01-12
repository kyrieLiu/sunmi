package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNumCardListBinding extends android.databinding.ViewDataBinding  {

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
    public final android.widget.Button btVipCardCancellation;
    @NonNull
    public final android.widget.Button btVipCardDelete;
    @NonNull
    public final ys.app.pad.widget.autoview.CustomHRecyclerView childRecyclerView;
    @NonNull
    public final android.widget.ImageView ivShowItem;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.RelativeLayout mboundView9;
    @NonNull
    public final android.widget.TextView nameTv;
    @NonNull
    public final android.widget.LinearLayout rootView;
    // variables
    @Nullable
    private ys.app.pad.itemmodel.NumCardItemViewModel mItemViewModel;
    // values
    // listeners
    private OnClickListenerImpl mItemViewModelDeleteAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mItemViewModelObsoleteAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mItemViewModelCardMembersAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemNumCardListBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.btVipCardCancellation = (android.widget.Button) bindings[3];
        this.btVipCardCancellation.setTag(null);
        this.btVipCardDelete = (android.widget.Button) bindings[4];
        this.btVipCardDelete.setTag(null);
        this.childRecyclerView = (ys.app.pad.widget.autoview.CustomHRecyclerView) bindings[8];
        this.childRecyclerView.setTag(null);
        this.ivShowItem = (android.widget.ImageView) bindings[5];
        this.ivShowItem.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.RelativeLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.nameTv = (android.widget.TextView) bindings[2];
        this.nameTv.setTag(null);
        this.rootView = (android.widget.LinearLayout) bindings[0];
        this.rootView.setTag(null);
        setRootTag(root);
        // listeners
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
            setItemViewModel((ys.app.pad.itemmodel.NumCardItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.pad.itemmodel.NumCardItemViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.itemmodel.NumCardItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((ys.app.pad.itemmodel.NumCardItemViewModel) object, fieldId);
            case 1 :
                return onChangeItemViewModelCardMoney((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeItemViewModelModel((ys.app.pad.model.NumCardListInfo) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.pad.itemmodel.NumCardItemViewModel ItemViewModel, int fieldId) {
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
    private boolean onChangeItemViewModelCardMoney(android.databinding.ObservableField<java.lang.String> ItemViewModelCardMoney, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelModel(ys.app.pad.model.NumCardListInfo ItemViewModelModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.isClick) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.expand) {
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
        android.view.View.OnClickListener itemViewModelDeleteAndroidViewViewOnClickListener = null;
        java.lang.String itemViewModelCardMoneyGet = null;
        ys.app.pad.itemmodel.NumCardItemViewModel itemViewModel = mItemViewModel;
        android.databinding.ObservableField<java.lang.String> itemViewModelCardMoney = null;
        java.util.List<ys.app.pad.itemmodel.CardNumberList2Bean> itemViewModelModelCardNumberList2 = null;
        android.view.View.OnClickListener itemViewModelObsoleteAndroidViewViewOnClickListener = null;
        ys.app.pad.model.NumCardListInfo itemViewModelModel = null;
        boolean itemViewModelModelExpand = false;
        int itemViewModelViewCount = 0;
        int itemViewModelModelIsClick = 0;
        java.lang.String itemViewModelModelName = null;
        android.view.View.OnClickListener itemViewModelClickOpenOrCloseAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener itemViewModelCardMembersAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x21L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel::delete
                        itemViewModelDeleteAndroidViewViewOnClickListener = (((mItemViewModelDeleteAndroidViewViewOnClickListener == null) ? (mItemViewModelDeleteAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mItemViewModelDeleteAndroidViewViewOnClickListener).setValue(itemViewModel));
                        // read itemViewModel::obsolete
                        itemViewModelObsoleteAndroidViewViewOnClickListener = (((mItemViewModelObsoleteAndroidViewViewOnClickListener == null) ? (mItemViewModelObsoleteAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mItemViewModelObsoleteAndroidViewViewOnClickListener).setValue(itemViewModel));
                        // read itemViewModel::clickOpenOrClose
                        itemViewModelClickOpenOrCloseAndroidViewViewOnClickListener = (((mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener == null) ? (mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mItemViewModelClickOpenOrCloseAndroidViewViewOnClickListener).setValue(itemViewModel));
                        // read itemViewModel::cardMembers
                        itemViewModelCardMembersAndroidViewViewOnClickListener = (((mItemViewModelCardMembersAndroidViewViewOnClickListener == null) ? (mItemViewModelCardMembersAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mItemViewModelCardMembersAndroidViewViewOnClickListener).setValue(itemViewModel));
                    }
            }
            if ((dirtyFlags & 0x23L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.cardMoney
                        itemViewModelCardMoney = itemViewModel.cardMoney;
                    }
                    updateRegistration(1, itemViewModelCardMoney);


                    if (itemViewModelCardMoney != null) {
                        // read itemViewModel.cardMoney.get()
                        itemViewModelCardMoneyGet = itemViewModelCardMoney.get();
                    }
            }
            if ((dirtyFlags & 0x3dL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                        // read itemViewModel.viewCount
                        itemViewModelViewCount = itemViewModel.viewCount;
                    }
                    updateRegistration(2, itemViewModelModel);

                if ((dirtyFlags & 0x25L) != 0) {

                        if (itemViewModelModel != null) {
                            // read itemViewModel.model.cardNumberList2
                            itemViewModelModelCardNumberList2 = itemViewModelModel.getCardNumberList2();
                            // read itemViewModel.model.name
                            itemViewModelModelName = itemViewModelModel.getName();
                        }
                }

                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.expand
                        itemViewModelModelExpand = itemViewModelModel.getExpand();
                        // read itemViewModel.model.isClick
                        itemViewModelModelIsClick = itemViewModelModel.getIsClick();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            this.btVipCardCancellation.setOnClickListener(itemViewModelObsoleteAndroidViewViewOnClickListener);
            this.btVipCardDelete.setOnClickListener(itemViewModelDeleteAndroidViewViewOnClickListener);
            this.ivShowItem.setOnClickListener(itemViewModelClickOpenOrCloseAndroidViewViewOnClickListener);
            this.mboundView1.setOnClickListener(itemViewModelClickOpenOrCloseAndroidViewViewOnClickListener);
            this.mboundView9.setOnClickListener(itemViewModelCardMembersAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            ys.app.pad.utils.PetBindingUtil.setNumCardAdapterData(this.childRecyclerView, itemViewModelModelCardNumberList2);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameTv, itemViewModelModelName);
        }
        if ((dirtyFlags & 0x3dL) != 0) {
            // api target 1

            ys.app.pad.utils.PetBindingUtil.setIsVisFull(this.mboundView6, itemViewModelModelExpand, itemViewModelModelIsClick, itemViewModelViewCount);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, itemViewModelCardMoneyGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.itemmodel.NumCardItemViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.itemmodel.NumCardItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.delete(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.pad.itemmodel.NumCardItemViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.pad.itemmodel.NumCardItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.obsolete(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.pad.itemmodel.NumCardItemViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.pad.itemmodel.NumCardItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickOpenOrClose(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private ys.app.pad.itemmodel.NumCardItemViewModel value;
        public OnClickListenerImpl3 setValue(ys.app.pad.itemmodel.NumCardItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.cardMembers(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemNumCardListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemNumCardListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemNumCardListBinding>inflate(inflater, ys.app.pad.R.layout.item_num_card_list, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemNumCardListBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemNumCardListBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.item_num_card_list, null, false), bindingComponent);
    }
    @NonNull
    public static ItemNumCardListBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemNumCardListBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_num_card_list_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemNumCardListBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.cardMoney
        flag 2 (0x3L): itemViewModel.model
        flag 3 (0x4L): itemViewModel.model.isClick
        flag 4 (0x5L): itemViewModel.model.expand
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}