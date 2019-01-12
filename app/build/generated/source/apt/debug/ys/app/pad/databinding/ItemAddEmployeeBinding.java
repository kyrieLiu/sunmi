package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAddEmployeeBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv0, 9);
        sViewsWithIds.put(R.id.tv1, 10);
    }
    // views
    @NonNull
    public final android.widget.EditText editText5;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final ys.app.pad.widget.ContainsEmojiEditText mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.EditText mboundView5;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    public final android.widget.LinearLayout rootView;
    @NonNull
    public final android.widget.ImageView selectIv0;
    @NonNull
    public final android.widget.ImageView selectIv1;
    @NonNull
    public final android.widget.TextView tv0;
    @NonNull
    public final android.widget.TextView tv1;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel mItemViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    // values
    // listeners
    private OnClickListenerImpl mItemViewModelClickGenderButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editText5androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of itemViewModel.model.num
            //         is itemViewModel.model.setNum((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText5);
            // localize variables for thread safety
            // itemViewModel
            ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel itemViewModel = mItemViewModel;
            // itemViewModel != null
            boolean itemViewModelJavaLangObjectNull = false;
            // itemViewModel.model.num
            java.lang.String itemViewModelModelNum = null;
            // itemViewModel.model
            ys.app.pad.model.AddEmployeeInfo itemViewModelModel = null;
            // itemViewModel.model != null
            boolean itemViewModelModelJavaLangObjectNull = false;



            itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
            if (itemViewModelJavaLangObjectNull) {


                itemViewModelModel = itemViewModel.getModel();

                itemViewModelModelJavaLangObjectNull = (itemViewModelModel) != (null);
                if (itemViewModelModelJavaLangObjectNull) {




                    itemViewModelModel.setNum(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of itemViewModel.model.name
            //         is itemViewModel.model.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // itemViewModel
            ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel itemViewModel = mItemViewModel;
            // itemViewModel != null
            boolean itemViewModelJavaLangObjectNull = false;
            // itemViewModel.model
            ys.app.pad.model.AddEmployeeInfo itemViewModelModel = null;
            // itemViewModel.model.name
            java.lang.String itemViewModelModelName = null;
            // itemViewModel.model != null
            boolean itemViewModelModelJavaLangObjectNull = false;



            itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
            if (itemViewModelJavaLangObjectNull) {


                itemViewModelModel = itemViewModel.getModel();

                itemViewModelModelJavaLangObjectNull = (itemViewModelModel) != (null);
                if (itemViewModelModelJavaLangObjectNull) {




                    itemViewModelModel.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of itemViewModel.gender.get()
            //         is itemViewModel.gender.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // itemViewModel.gender != null
            boolean itemViewModelGenderJavaLangObjectNull = false;
            // itemViewModel
            ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel itemViewModel = mItemViewModel;
            // itemViewModel != null
            boolean itemViewModelJavaLangObjectNull = false;
            // itemViewModel.gender.get()
            java.lang.String itemViewModelGenderGet = null;
            // itemViewModel.gender
            android.databinding.ObservableField<java.lang.String> itemViewModelGender = null;



            itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
            if (itemViewModelJavaLangObjectNull) {


                itemViewModelGender = itemViewModel.gender;

                itemViewModelGenderJavaLangObjectNull = (itemViewModelGender) != (null);
                if (itemViewModelGenderJavaLangObjectNull) {




                    itemViewModelGender.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of itemViewModel.model.phone
            //         is itemViewModel.model.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // itemViewModel
            ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel itemViewModel = mItemViewModel;
            // itemViewModel != null
            boolean itemViewModelJavaLangObjectNull = false;
            // itemViewModel.model
            ys.app.pad.model.AddEmployeeInfo itemViewModelModel = null;
            // itemViewModel.model.phone
            java.lang.String itemViewModelModelPhone = null;
            // itemViewModel.model != null
            boolean itemViewModelModelJavaLangObjectNull = false;



            itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
            if (itemViewModelJavaLangObjectNull) {


                itemViewModelModel = itemViewModel.getModel();

                itemViewModelModelJavaLangObjectNull = (itemViewModelModel) != (null);
                if (itemViewModelModelJavaLangObjectNull) {




                    itemViewModelModel.setPhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ItemAddEmployeeBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds);
        this.editText5 = (android.widget.EditText) bindings[6];
        this.editText5.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (ys.app.pad.widget.ContainsEmojiEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.EditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.rootView = (android.widget.LinearLayout) bindings[0];
        this.rootView.setTag(null);
        this.selectIv0 = (android.widget.ImageView) bindings[8];
        this.selectIv0.setTag(null);
        this.selectIv1 = (android.widget.ImageView) bindings[3];
        this.selectIv1.setTag(null);
        this.tv0 = (android.widget.TextView) bindings[9];
        this.tv1 = (android.widget.TextView) bindings[10];
        setRootTag(root);
        // listeners
        mCallback45 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback46 = new android.databinding.generated.callback.OnClickListener(this, 2);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel ItemViewModel) {
        updateRegistration(2, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel getItemViewModel() {
        return mItemViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModelGender((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeItemViewModelWorkType((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeItemViewModel((ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModelGender(android.databinding.ObservableField<java.lang.String> ItemViewModelGender, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModelWorkType(android.databinding.ObservableField<java.lang.String> ItemViewModelWorkType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemViewModel(ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.databinding.ObservableField<java.lang.String> itemViewModelGender = null;
        android.databinding.ObservableField<java.lang.String> itemViewModelWorkType = null;
        ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelGenderGet = null;
        java.lang.String itemViewModelWorkTypeGet = null;
        java.lang.String itemViewModelModelPhone = null;
        java.lang.String mboundView1AndroidStringYuangongItemViewModelModelPosition = null;
        android.view.View.OnClickListener itemViewModelClickGenderButtonAndroidViewViewOnClickListener = null;
        ys.app.pad.model.AddEmployeeInfo itemViewModelModel = null;
        java.lang.String itemViewModelModelNum = null;
        int itemViewModelModelPosition = 0;
        java.lang.String itemViewModelModelName = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.gender
                        itemViewModelGender = itemViewModel.gender;
                    }
                    updateRegistration(0, itemViewModelGender);


                    if (itemViewModelGender != null) {
                        // read itemViewModel.gender.get()
                        itemViewModelGenderGet = itemViewModelGender.get();
                    }
            }
            if ((dirtyFlags & 0x16L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.workType
                        itemViewModelWorkType = itemViewModel.workType;
                    }
                    updateRegistration(1, itemViewModelWorkType);


                    if (itemViewModelWorkType != null) {
                        // read itemViewModel.workType.get()
                        itemViewModelWorkTypeGet = itemViewModelWorkType.get();
                    }
            }
            if ((dirtyFlags & 0x14L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel::clickGenderButton
                        itemViewModelClickGenderButtonAndroidViewViewOnClickListener = (((mItemViewModelClickGenderButtonAndroidViewViewOnClickListener == null) ? (mItemViewModelClickGenderButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mItemViewModelClickGenderButtonAndroidViewViewOnClickListener).setValue(itemViewModel));
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.model
                        itemViewModelModel = itemViewModel.getModel();
                    }


                    if (itemViewModelModel != null) {
                        // read itemViewModel.model.phone
                        itemViewModelModelPhone = itemViewModelModel.getPhone();
                        // read itemViewModel.model.num
                        itemViewModelModelNum = itemViewModelModel.getNum();
                        // read itemViewModel.model.position
                        itemViewModelModelPosition = itemViewModelModel.getPosition();
                        // read itemViewModel.model.name
                        itemViewModelModelName = itemViewModelModel.getName();
                    }


                    // read (@android:string/yuangong) + (itemViewModel.model.position)
                    mboundView1AndroidStringYuangongItemViewModelModelPosition = (mboundView1.getResources().getString(R.string.yuangong)) + (itemViewModelModelPosition);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText5, itemViewModelModelNum);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, mboundView1AndroidStringYuangongItemViewModelModelPosition);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemViewModelModelName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, itemViewModelModelPhone);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText5, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editText5androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            this.mboundView7.setOnClickListener(mCallback45);
            this.selectIv0.setOnClickListener(mCallback46);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(itemViewModelClickGenderButtonAndroidViewViewOnClickListener);
            this.selectIv1.setOnClickListener(itemViewModelClickGenderButtonAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, itemViewModelGenderGet);
        }
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, itemViewModelWorkTypeGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickGenderButton(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.selectTypeWork();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                ys.app.pad.viewmodel.manage.AddEmployeeItemViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.selectTypeWork();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemAddEmployeeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemAddEmployeeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemAddEmployeeBinding>inflate(inflater, ys.app.pad.R.layout.item_add_employee, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemAddEmployeeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemAddEmployeeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.item_add_employee, null, false), bindingComponent);
    }
    @NonNull
    public static ItemAddEmployeeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemAddEmployeeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_add_employee_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemAddEmployeeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): itemViewModel.gender
        flag 1 (0x2L): itemViewModel.workType
        flag 2 (0x3L): itemViewModel
        flag 3 (0x4L): itemViewModel.model
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}