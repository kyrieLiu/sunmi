package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.title_main, 17);
        sViewsWithIds.put(R.id.sec_root, 18);
        sViewsWithIds.put(R.id.sec_kucun_iv, 19);
        sViewsWithIds.put(R.id.sec_add_shangpin, 20);
        sViewsWithIds.put(R.id.sec_shangpin_enter, 21);
        sViewsWithIds.put(R.id.sec_shangpin_out, 22);
        sViewsWithIds.put(R.id.sec_shangpin_pandian, 23);
        sViewsWithIds.put(R.id.sec_pandian_jilu, 24);
        sViewsWithIds.put(R.id.sec_fuwu_kucun, 25);
        sViewsWithIds.put(R.id.sec_xinzeng_kucun, 26);
        sViewsWithIds.put(R.id.rl0, 27);
        sViewsWithIds.put(R.id.shouyin_iv, 28);
        sViewsWithIds.put(R.id.rl1, 29);
        sViewsWithIds.put(R.id.huiyuan_iv, 30);
        sViewsWithIds.put(R.id.rl2, 31);
        sViewsWithIds.put(R.id.churuku_jilu_iv, 32);
        sViewsWithIds.put(R.id.rl3, 33);
        sViewsWithIds.put(R.id.kucun_iv, 34);
        sViewsWithIds.put(R.id.rl4, 35);
        sViewsWithIds.put(R.id.guanliyuan_iv, 36);
        sViewsWithIds.put(R.id.rl6, 37);
        sViewsWithIds.put(R.id.cuxiao__iv, 38);
        sViewsWithIds.put(R.id.rl7, 39);
        sViewsWithIds.put(R.id.jiezhang_iv, 40);
        sViewsWithIds.put(R.id.rl5, 41);
        sViewsWithIds.put(R.id.yuyue_iv, 42);
    }
    // views
    @NonNull
    public final android.widget.ImageView churukuJiluIv;
    @NonNull
    public final android.widget.ImageView cuxiaoIv;
    @NonNull
    public final android.widget.ImageView guanliyuanIv;
    @NonNull
    public final android.widget.ImageView huiyuanIv;
    @NonNull
    public final android.widget.ImageView jiezhangIv;
    @NonNull
    public final android.widget.ImageView kucunIv;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.TextView mboundView14;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final android.widget.TextView mboundView16;
    @NonNull
    private final android.widget.RelativeLayout mboundView2;
    @NonNull
    private final android.widget.RelativeLayout mboundView3;
    @NonNull
    private final android.widget.RelativeLayout mboundView4;
    @NonNull
    private final android.widget.RelativeLayout mboundView5;
    @NonNull
    private final android.widget.RelativeLayout mboundView6;
    @NonNull
    private final android.widget.RelativeLayout mboundView7;
    @NonNull
    private final android.widget.RelativeLayout mboundView8;
    @NonNull
    public final android.widget.RelativeLayout rl0;
    @NonNull
    public final android.widget.RelativeLayout rl1;
    @NonNull
    public final android.widget.RelativeLayout rl2;
    @NonNull
    public final android.widget.RelativeLayout rl3;
    @NonNull
    public final android.widget.RelativeLayout rl4;
    @NonNull
    public final android.widget.RelativeLayout rl5;
    @NonNull
    public final android.widget.RelativeLayout rl6;
    @NonNull
    public final android.widget.RelativeLayout rl7;
    @NonNull
    public final android.widget.ImageView secAddShangpin;
    @NonNull
    public final android.widget.ImageView secFuwuKucun;
    @NonNull
    public final android.widget.ImageView secKucunIv;
    @NonNull
    public final android.widget.ImageView secPandianJilu;
    @NonNull
    public final android.widget.LinearLayout secRoot;
    @NonNull
    public final android.widget.ImageView secShangpinEnter;
    @NonNull
    public final android.widget.ImageView secShangpinOut;
    @NonNull
    public final android.widget.ImageView secShangpinPandian;
    @NonNull
    public final android.widget.ImageView secXinzengKucun;
    @NonNull
    public final android.widget.ImageView shouyinIv;
    @NonNull
    public final android.widget.TextView textView8;
    @NonNull
    public final android.widget.TextView titleMain;
    @NonNull
    public final android.widget.ImageView yuyueIv;
    // variables
    @Nullable
    private java.lang.String[] mNameArray;
    @Nullable
    private ys.app.pad.viewmodel.MainViewModel mMainViewModel;
    // values
    // listeners
    private OnClickListenerImpl mMainViewModelClickSPRKAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mMainViewModelClickSPPDAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mMainViewModelClickPDJLAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mMainViewModelClickXZSPAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mMainViewModelClickSPCKAndroidViewViewOnClickListener;
    private OnClickListenerImpl5 mMainViewModelClickSPKCAndroidViewViewOnClickListener;
    private OnClickListenerImpl6 mMainViewModelClickFWKCAndroidViewViewOnClickListener;
    private OnClickListenerImpl7 mMainViewModelClickXZFWAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityMainBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 43, sIncludes, sViewsWithIds);
        this.churukuJiluIv = (android.widget.ImageView) bindings[32];
        this.cuxiaoIv = (android.widget.ImageView) bindings[38];
        this.guanliyuanIv = (android.widget.ImageView) bindings[36];
        this.huiyuanIv = (android.widget.ImageView) bindings[30];
        this.jiezhangIv = (android.widget.ImageView) bindings[40];
        this.kucunIv = (android.widget.ImageView) bindings[34];
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (android.widget.TextView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView2 = (android.widget.RelativeLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.RelativeLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.RelativeLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.RelativeLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.RelativeLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.RelativeLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.rl0 = (android.widget.RelativeLayout) bindings[27];
        this.rl1 = (android.widget.RelativeLayout) bindings[29];
        this.rl2 = (android.widget.RelativeLayout) bindings[31];
        this.rl3 = (android.widget.RelativeLayout) bindings[33];
        this.rl4 = (android.widget.RelativeLayout) bindings[35];
        this.rl5 = (android.widget.RelativeLayout) bindings[41];
        this.rl6 = (android.widget.RelativeLayout) bindings[37];
        this.rl7 = (android.widget.RelativeLayout) bindings[39];
        this.secAddShangpin = (android.widget.ImageView) bindings[20];
        this.secFuwuKucun = (android.widget.ImageView) bindings[25];
        this.secKucunIv = (android.widget.ImageView) bindings[19];
        this.secPandianJilu = (android.widget.ImageView) bindings[24];
        this.secRoot = (android.widget.LinearLayout) bindings[18];
        this.secShangpinEnter = (android.widget.ImageView) bindings[21];
        this.secShangpinOut = (android.widget.ImageView) bindings[22];
        this.secShangpinPandian = (android.widget.ImageView) bindings[23];
        this.secXinzengKucun = (android.widget.ImageView) bindings[26];
        this.shouyinIv = (android.widget.ImageView) bindings[28];
        this.textView8 = (android.widget.TextView) bindings[9];
        this.textView8.setTag(null);
        this.titleMain = (android.widget.TextView) bindings[17];
        this.yuyueIv = (android.widget.ImageView) bindings[42];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.nameArray == variableId) {
            setNameArray((java.lang.String[]) variable);
        }
        else if (BR.mainViewModel == variableId) {
            setMainViewModel((ys.app.pad.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNameArray(@Nullable java.lang.String[] NameArray) {
        this.mNameArray = NameArray;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.nameArray);
        super.requestRebind();
    }
    @Nullable
    public java.lang.String[] getNameArray() {
        return mNameArray;
    }
    public void setMainViewModel(@Nullable ys.app.pad.viewmodel.MainViewModel MainViewModel) {
        updateRegistration(0, MainViewModel);
        this.mMainViewModel = MainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mainViewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.MainViewModel getMainViewModel() {
        return mMainViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMainViewModel((ys.app.pad.viewmodel.MainViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMainViewModel(ys.app.pad.viewmodel.MainViewModel MainViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String nameArray5 = null;
        android.view.View.OnClickListener mainViewModelClickSPRKAndroidViewViewOnClickListener = null;
        java.lang.String nameArray0 = null;
        android.view.View.OnClickListener mainViewModelClickSPPDAndroidViewViewOnClickListener = null;
        java.lang.String[] nameArray = mNameArray;
        android.view.View.OnClickListener mainViewModelClickPDJLAndroidViewViewOnClickListener = null;
        java.lang.String nameArray7 = null;
        android.view.View.OnClickListener mainViewModelClickXZSPAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener mainViewModelClickSPCKAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener mainViewModelClickSPKCAndroidViewViewOnClickListener = null;
        java.lang.String nameArray2 = null;
        java.lang.String nameArray1 = null;
        ys.app.pad.viewmodel.MainViewModel mainViewModel = mMainViewModel;
        android.view.View.OnClickListener mainViewModelClickFWKCAndroidViewViewOnClickListener = null;
        java.lang.String nameArray4 = null;
        java.lang.String nameArray3 = null;
        android.view.View.OnClickListener mainViewModelClickXZFWAndroidViewViewOnClickListener = null;
        java.lang.String nameArray6 = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (nameArray != null) {
                    // read nameArray[5]
                    nameArray5 = getFromArray(nameArray, 5);
                    // read nameArray[0]
                    nameArray0 = getFromArray(nameArray, 0);
                    // read nameArray[7]
                    nameArray7 = getFromArray(nameArray, 7);
                    // read nameArray[2]
                    nameArray2 = getFromArray(nameArray, 2);
                    // read nameArray[1]
                    nameArray1 = getFromArray(nameArray, 1);
                    // read nameArray[4]
                    nameArray4 = getFromArray(nameArray, 4);
                    // read nameArray[3]
                    nameArray3 = getFromArray(nameArray, 3);
                    // read nameArray[6]
                    nameArray6 = getFromArray(nameArray, 6);
                }
        }
        if ((dirtyFlags & 0x5L) != 0) {



                if (mainViewModel != null) {
                    // read mainViewModel::clickSPRK
                    mainViewModelClickSPRKAndroidViewViewOnClickListener = (((mMainViewModelClickSPRKAndroidViewViewOnClickListener == null) ? (mMainViewModelClickSPRKAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mMainViewModelClickSPRKAndroidViewViewOnClickListener).setValue(mainViewModel));
                    // read mainViewModel::clickSPPD
                    mainViewModelClickSPPDAndroidViewViewOnClickListener = (((mMainViewModelClickSPPDAndroidViewViewOnClickListener == null) ? (mMainViewModelClickSPPDAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mMainViewModelClickSPPDAndroidViewViewOnClickListener).setValue(mainViewModel));
                    // read mainViewModel::clickPDJL
                    mainViewModelClickPDJLAndroidViewViewOnClickListener = (((mMainViewModelClickPDJLAndroidViewViewOnClickListener == null) ? (mMainViewModelClickPDJLAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mMainViewModelClickPDJLAndroidViewViewOnClickListener).setValue(mainViewModel));
                    // read mainViewModel::clickXZSP
                    mainViewModelClickXZSPAndroidViewViewOnClickListener = (((mMainViewModelClickXZSPAndroidViewViewOnClickListener == null) ? (mMainViewModelClickXZSPAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mMainViewModelClickXZSPAndroidViewViewOnClickListener).setValue(mainViewModel));
                    // read mainViewModel::clickSPCK
                    mainViewModelClickSPCKAndroidViewViewOnClickListener = (((mMainViewModelClickSPCKAndroidViewViewOnClickListener == null) ? (mMainViewModelClickSPCKAndroidViewViewOnClickListener = new OnClickListenerImpl4()) : mMainViewModelClickSPCKAndroidViewViewOnClickListener).setValue(mainViewModel));
                    // read mainViewModel::clickSPKC
                    mainViewModelClickSPKCAndroidViewViewOnClickListener = (((mMainViewModelClickSPKCAndroidViewViewOnClickListener == null) ? (mMainViewModelClickSPKCAndroidViewViewOnClickListener = new OnClickListenerImpl5()) : mMainViewModelClickSPKCAndroidViewViewOnClickListener).setValue(mainViewModel));
                    // read mainViewModel::clickFWKC
                    mainViewModelClickFWKCAndroidViewViewOnClickListener = (((mMainViewModelClickFWKCAndroidViewViewOnClickListener == null) ? (mMainViewModelClickFWKCAndroidViewViewOnClickListener = new OnClickListenerImpl6()) : mMainViewModelClickFWKCAndroidViewViewOnClickListener).setValue(mainViewModel));
                    // read mainViewModel::clickXZFW
                    mainViewModelClickXZFWAndroidViewViewOnClickListener = (((mMainViewModelClickXZFWAndroidViewViewOnClickListener == null) ? (mMainViewModelClickXZFWAndroidViewViewOnClickListener = new OnClickListenerImpl7()) : mMainViewModelClickXZFWAndroidViewViewOnClickListener).setValue(mainViewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mainViewModelClickSPKCAndroidViewViewOnClickListener);
            this.mboundView2.setOnClickListener(mainViewModelClickXZSPAndroidViewViewOnClickListener);
            this.mboundView3.setOnClickListener(mainViewModelClickSPRKAndroidViewViewOnClickListener);
            this.mboundView4.setOnClickListener(mainViewModelClickSPCKAndroidViewViewOnClickListener);
            this.mboundView5.setOnClickListener(mainViewModelClickSPPDAndroidViewViewOnClickListener);
            this.mboundView6.setOnClickListener(mainViewModelClickPDJLAndroidViewViewOnClickListener);
            this.mboundView7.setOnClickListener(mainViewModelClickFWKCAndroidViewViewOnClickListener);
            this.mboundView8.setOnClickListener(mainViewModelClickXZFWAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, nameArray1);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, nameArray2);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, nameArray3);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, nameArray4);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, nameArray6);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, nameArray7);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView16, nameArray5);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView8, nameArray0);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.MainViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.MainViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSPRK(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.MainViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.pad.viewmodel.MainViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSPPD(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.MainViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.pad.viewmodel.MainViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickPDJL(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.MainViewModel value;
        public OnClickListenerImpl3 setValue(ys.app.pad.viewmodel.MainViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickXZSP(arg0);
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.MainViewModel value;
        public OnClickListenerImpl4 setValue(ys.app.pad.viewmodel.MainViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSPCK(arg0);
        }
    }
    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.MainViewModel value;
        public OnClickListenerImpl5 setValue(ys.app.pad.viewmodel.MainViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSPKC(arg0);
        }
    }
    public static class OnClickListenerImpl6 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.MainViewModel value;
        public OnClickListenerImpl6 setValue(ys.app.pad.viewmodel.MainViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickFWKC(arg0);
        }
    }
    public static class OnClickListenerImpl7 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.MainViewModel value;
        public OnClickListenerImpl7 setValue(ys.app.pad.viewmodel.MainViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickXZFW(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMainBinding>inflate(inflater, ys.app.pad.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_main, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): mainViewModel
        flag 1 (0x2L): nameArray
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}