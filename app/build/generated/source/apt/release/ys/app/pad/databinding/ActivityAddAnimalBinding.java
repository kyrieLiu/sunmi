package ys.app.pad.databinding;
import ys.app.pad.R;
import ys.app.pad.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddAnimalBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv0, 43);
        sViewsWithIds.put(R.id.tv1, 44);
        sViewsWithIds.put(R.id.textView15, 45);
        sViewsWithIds.put(R.id.tv_pet_skin, 46);
        sViewsWithIds.put(R.id.tv_pet_bite, 47);
        sViewsWithIds.put(R.id.tv13, 48);
        sViewsWithIds.put(R.id.tv14, 49);
        sViewsWithIds.put(R.id.tv, 50);
        sViewsWithIds.put(R.id.tv2, 51);
        sViewsWithIds.put(R.id.tv5, 52);
        sViewsWithIds.put(R.id.tv6, 53);
        sViewsWithIds.put(R.id.tv9, 54);
        sViewsWithIds.put(R.id.yimiao_date_tv, 55);
        sViewsWithIds.put(R.id.tv_period_yimiao, 56);
        sViewsWithIds.put(R.id.tv7, 57);
        sViewsWithIds.put(R.id.tv8, 58);
        sViewsWithIds.put(R.id.tv11, 59);
        sViewsWithIds.put(R.id.quchong_date_tv, 60);
        sViewsWithIds.put(R.id.tv_neiqu, 61);
        sViewsWithIds.put(R.id.tv_waiqu_name, 62);
        sViewsWithIds.put(R.id.tv_waiqu, 63);
        sViewsWithIds.put(R.id.waiqu_date_tv, 64);
        sViewsWithIds.put(R.id.tv_period_date_waiqu, 65);
    }
    // views
    @NonNull
    public final android.widget.ImageView ivSettingPeriodNeiqu;
    @NonNull
    public final android.widget.ImageView ivSettingPeriodYimiao;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.RelativeLayout mboundView14;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final ys.app.pad.widget.ContainsEmojiEditText mboundView16;
    @NonNull
    private final android.widget.EditText mboundView17;
    @NonNull
    private final android.widget.TextView mboundView19;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.RelativeLayout mboundView20;
    @NonNull
    private final android.widget.TextView mboundView22;
    @NonNull
    private final android.widget.TextView mboundView24;
    @NonNull
    private final android.widget.TextView mboundView26;
    @NonNull
    private final android.widget.RelativeLayout mboundView27;
    @NonNull
    private final android.widget.TextView mboundView29;
    @NonNull
    private final ys.app.pad.widget.ContainsEmojiEditText mboundView3;
    @NonNull
    private final android.widget.RelativeLayout mboundView30;
    @NonNull
    private final android.widget.TextView mboundView34;
    @NonNull
    private final android.widget.RelativeLayout mboundView35;
    @NonNull
    private final android.widget.TextView mboundView37;
    @NonNull
    private final android.widget.RelativeLayout mboundView38;
    @NonNull
    private final android.widget.TextView mboundView40;
    @NonNull
    private final ys.app.pad.widget.ContainsEmojiEditText mboundView41;
    @NonNull
    private final android.widget.Button mboundView42;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.EditText mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView9;
    @NonNull
    public final android.widget.TextView quchongDateTv;
    @NonNull
    public final android.widget.ImageView selectIv0;
    @NonNull
    public final android.widget.ImageView selectIv2;
    @NonNull
    public final android.widget.ImageView selectIv3;
    @NonNull
    public final android.widget.ImageView selectIv4;
    @NonNull
    public final android.widget.ImageView selectIv5;
    @NonNull
    public final android.widget.ImageView selectIv7;
    @NonNull
    public final android.widget.ImageView selectIvWaiqu;
    @NonNull
    public final android.widget.ImageView selectPeriodWaiqu;
    @NonNull
    public final android.widget.ImageView selectPetBite;
    @NonNull
    public final android.widget.ImageView selectPetSkin;
    @NonNull
    public final android.widget.ImageView selectWaiqu;
    @NonNull
    public final android.widget.TextView textView13;
    @NonNull
    public final android.widget.TextView textView14;
    @NonNull
    public final android.widget.TextView textView15;
    @NonNull
    public final android.widget.TextView tv;
    @NonNull
    public final android.widget.TextView tv0;
    @NonNull
    public final android.widget.TextView tv1;
    @NonNull
    public final android.widget.TextView tv11;
    @NonNull
    public final android.widget.TextView tv13;
    @NonNull
    public final android.widget.TextView tv14;
    @NonNull
    public final android.widget.TextView tv2;
    @NonNull
    public final android.widget.TextView tv5;
    @NonNull
    public final android.widget.TextView tv6;
    @NonNull
    public final android.widget.TextView tv7;
    @NonNull
    public final android.widget.TextView tv8;
    @NonNull
    public final android.widget.TextView tv9;
    @NonNull
    public final android.widget.TextView tvNeiqu;
    @NonNull
    public final android.widget.TextView tvPeriodDateWaiqu;
    @NonNull
    public final android.widget.TextView tvPeriodYimiao;
    @NonNull
    public final android.widget.TextView tvPetBite;
    @NonNull
    public final android.widget.TextView tvPetSkin;
    @NonNull
    public final android.widget.TextView tvWaiqu;
    @NonNull
    public final android.widget.TextView tvWaiquName;
    @NonNull
    public final android.widget.TextView waiquDateTv;
    @NonNull
    public final android.widget.TextView yimiaoDateTv;
    // variables
    @Nullable
    private ys.app.pad.viewmodel.AddAnimalViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    private OnClickListenerImpl mViewModelClickButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelClickIsQuchongButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelClickYimiaoDateButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mViewModelClickIsYimiaoButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mViewModelClickBreedButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl5 mViewModelClickCategoryAndroidViewViewOnClickListener;
    private OnClickListenerImpl6 mViewModelClickQuchongDateButtonAndroidViewViewOnClickListener;
    private OnClickListenerImpl7 mViewModelClickGenderButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView13androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalCategory.get()
            //         is viewModel.obAnimalCategory.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView13);
            // localize variables for thread safety
            // viewModel.obAnimalCategory
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalCategory = null;
            // viewModel.obAnimalCategory.get()
            java.lang.String viewModelObAnimalCategoryGet = null;
            // viewModel.obAnimalCategory != null
            boolean viewModelObAnimalCategoryJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalCategory = viewModel.obAnimalCategory;

                viewModelObAnimalCategoryJavaLangObjectNull = (viewModelObAnimalCategory) != (null);
                if (viewModelObAnimalCategoryJavaLangObjectNull) {




                    viewModelObAnimalCategory.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView15androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalBreed.get()
            //         is viewModel.obAnimalBreed.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView15);
            // localize variables for thread safety
            // viewModel.obAnimalBreed.get()
            java.lang.String viewModelObAnimalBreedGet = null;
            // viewModel.obAnimalBreed != null
            boolean viewModelObAnimalBreedJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obAnimalBreed
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalBreed = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalBreed = viewModel.obAnimalBreed;

                viewModelObAnimalBreedJavaLangObjectNull = (viewModelObAnimalBreed) != (null);
                if (viewModelObAnimalBreedJavaLangObjectNull) {




                    viewModelObAnimalBreed.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView16androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalColor.get()
            //         is viewModel.obAnimalColor.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView16);
            // localize variables for thread safety
            // viewModel.obAnimalColor
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalColor = null;
            // viewModel.obAnimalColor.get()
            java.lang.String viewModelObAnimalColorGet = null;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel.obAnimalColor != null
            boolean viewModelObAnimalColorJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalColor = viewModel.obAnimalColor;

                viewModelObAnimalColorJavaLangObjectNull = (viewModelObAnimalColor) != (null);
                if (viewModelObAnimalColorJavaLangObjectNull) {




                    viewModelObAnimalColor.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView17androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalWeight.get()
            //         is viewModel.obAnimalWeight.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView17);
            // localize variables for thread safety
            // viewModel.obAnimalWeight.get()
            java.lang.String viewModelObAnimalWeightGet = null;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obAnimalWeight != null
            boolean viewModelObAnimalWeightJavaLangObjectNull = false;
            // viewModel.obAnimalWeight
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalWeight = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalWeight = viewModel.obAnimalWeight;

                viewModelObAnimalWeightJavaLangObjectNull = (viewModelObAnimalWeight) != (null);
                if (viewModelObAnimalWeightJavaLangObjectNull) {




                    viewModelObAnimalWeight.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView19androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalIsYimiao.get()
            //         is viewModel.obAnimalIsYimiao.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView19);
            // localize variables for thread safety
            // viewModel.obAnimalIsYimiao.get()
            java.lang.String viewModelObAnimalIsYimiaoGet = null;
            // viewModel.obAnimalIsYimiao
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalIsYimiao = null;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel.obAnimalIsYimiao != null
            boolean viewModelObAnimalIsYimiaoJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalIsYimiao = viewModel.obAnimalIsYimiao;

                viewModelObAnimalIsYimiaoJavaLangObjectNull = (viewModelObAnimalIsYimiao) != (null);
                if (viewModelObAnimalIsYimiaoJavaLangObjectNull) {




                    viewModelObAnimalIsYimiao.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView22androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalYimiaoDate.get()
            //         is viewModel.obAnimalYimiaoDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView22);
            // localize variables for thread safety
            // viewModel.obAnimalYimiaoDate.get()
            java.lang.String viewModelObAnimalYimiaoDateGet = null;
            // viewModel.obAnimalYimiaoDate != null
            boolean viewModelObAnimalYimiaoDateJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obAnimalYimiaoDate
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalYimiaoDate = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalYimiaoDate = viewModel.obAnimalYimiaoDate;

                viewModelObAnimalYimiaoDateJavaLangObjectNull = (viewModelObAnimalYimiaoDate) != (null);
                if (viewModelObAnimalYimiaoDateJavaLangObjectNull) {




                    viewModelObAnimalYimiaoDate.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView24androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalYimiaoPeriod.get()
            //         is viewModel.obAnimalYimiaoPeriod.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView24);
            // localize variables for thread safety
            // viewModel.obAnimalYimiaoPeriod.get()
            java.lang.String viewModelObAnimalYimiaoPeriodGet = null;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel.obAnimalYimiaoPeriod
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalYimiaoPeriod = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obAnimalYimiaoPeriod != null
            boolean viewModelObAnimalYimiaoPeriodJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalYimiaoPeriod = viewModel.obAnimalYimiaoPeriod;

                viewModelObAnimalYimiaoPeriodJavaLangObjectNull = (viewModelObAnimalYimiaoPeriod) != (null);
                if (viewModelObAnimalYimiaoPeriodJavaLangObjectNull) {




                    viewModelObAnimalYimiaoPeriod.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView26androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalIsQuchong.get()
            //         is viewModel.obAnimalIsQuchong.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView26);
            // localize variables for thread safety
            // viewModel.obAnimalIsQuchong != null
            boolean viewModelObAnimalIsQuchongJavaLangObjectNull = false;
            // viewModel.obAnimalIsQuchong
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalIsQuchong = null;
            // viewModel.obAnimalIsQuchong.get()
            java.lang.String viewModelObAnimalIsQuchongGet = null;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalIsQuchong = viewModel.obAnimalIsQuchong;

                viewModelObAnimalIsQuchongJavaLangObjectNull = (viewModelObAnimalIsQuchong) != (null);
                if (viewModelObAnimalIsQuchongJavaLangObjectNull) {




                    viewModelObAnimalIsQuchong.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView29androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalQuchongDate.get()
            //         is viewModel.obAnimalQuchongDate.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView29);
            // localize variables for thread safety
            // viewModel.obAnimalQuchongDate != null
            boolean viewModelObAnimalQuchongDateJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel.obAnimalQuchongDate
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalQuchongDate = null;
            // viewModel.obAnimalQuchongDate.get()
            java.lang.String viewModelObAnimalQuchongDateGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalQuchongDate = viewModel.obAnimalQuchongDate;

                viewModelObAnimalQuchongDateJavaLangObjectNull = (viewModelObAnimalQuchongDate) != (null);
                if (viewModelObAnimalQuchongDateJavaLangObjectNull) {




                    viewModelObAnimalQuchongDate.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalName.get()
            //         is viewModel.obAnimalName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewModel.obAnimalName.get()
            java.lang.String viewModelObAnimalNameGet = null;
            // viewModel.obAnimalName != null
            boolean viewModelObAnimalNameJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel.obAnimalName
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalName = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalName = viewModel.obAnimalName;

                viewModelObAnimalNameJavaLangObjectNull = (viewModelObAnimalName) != (null);
                if (viewModelObAnimalNameJavaLangObjectNull) {




                    viewModelObAnimalName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView34androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalIsWaiqu.get()
            //         is viewModel.obAnimalIsWaiqu.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView34);
            // localize variables for thread safety
            // viewModel.obAnimalIsWaiqu != null
            boolean viewModelObAnimalIsWaiquJavaLangObjectNull = false;
            // viewModel.obAnimalIsWaiqu.get()
            java.lang.String viewModelObAnimalIsWaiquGet = null;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obAnimalIsWaiqu
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalIsWaiqu = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalIsWaiqu = viewModel.obAnimalIsWaiqu;

                viewModelObAnimalIsWaiquJavaLangObjectNull = (viewModelObAnimalIsWaiqu) != (null);
                if (viewModelObAnimalIsWaiquJavaLangObjectNull) {




                    viewModelObAnimalIsWaiqu.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView37androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalWaiquTime.get()
            //         is viewModel.obAnimalWaiquTime.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView37);
            // localize variables for thread safety
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel.obAnimalWaiquTime.get()
            java.lang.String viewModelObAnimalWaiquTimeGet = null;
            // viewModel.obAnimalWaiquTime
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalWaiquTime = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obAnimalWaiquTime != null
            boolean viewModelObAnimalWaiquTimeJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalWaiquTime = viewModel.obAnimalWaiquTime;

                viewModelObAnimalWaiquTimeJavaLangObjectNull = (viewModelObAnimalWaiquTime) != (null);
                if (viewModelObAnimalWaiquTimeJavaLangObjectNull) {




                    viewModelObAnimalWaiquTime.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView40androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.waiquPeriod.get()
            //         is viewModel.waiquPeriod.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView40);
            // localize variables for thread safety
            // viewModel.waiquPeriod != null
            boolean viewModelWaiquPeriodJavaLangObjectNull = false;
            // viewModel.waiquPeriod
            android.databinding.ObservableField<java.lang.String> viewModelWaiquPeriod = null;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel.waiquPeriod.get()
            java.lang.String viewModelWaiquPeriodGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelWaiquPeriod = viewModel.waiquPeriod;

                viewModelWaiquPeriodJavaLangObjectNull = (viewModelWaiquPeriod) != (null);
                if (viewModelWaiquPeriodJavaLangObjectNull) {




                    viewModelWaiquPeriod.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView41androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.petRemark.get()
            //         is viewModel.petRemark.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView41);
            // localize variables for thread safety
            // viewModel.petRemark
            android.databinding.ObservableField<java.lang.String> viewModelPetRemark = null;
            // viewModel.petRemark.get()
            java.lang.String viewModelPetRemarkGet = null;
            // viewModel.petRemark != null
            boolean viewModelPetRemarkJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPetRemark = viewModel.petRemark;

                viewModelPetRemarkJavaLangObjectNull = (viewModelPetRemark) != (null);
                if (viewModelPetRemarkJavaLangObjectNull) {




                    viewModelPetRemark.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalGender.get()
            //         is viewModel.obAnimalGender.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.obAnimalGender.get()
            java.lang.String viewModelObAnimalGenderGet = null;
            // viewModel.obAnimalGender
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalGender = null;
            // viewModel.obAnimalGender != null
            boolean viewModelObAnimalGenderJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalGender = viewModel.obAnimalGender;

                viewModelObAnimalGenderJavaLangObjectNull = (viewModelObAnimalGender) != (null);
                if (viewModelObAnimalGenderJavaLangObjectNull) {




                    viewModelObAnimalGender.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.obAnimalAge.get()
            //         is viewModel.obAnimalAge.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel.obAnimalAge
            android.databinding.ObservableField<java.lang.String> viewModelObAnimalAge = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.obAnimalAge != null
            boolean viewModelObAnimalAgeJavaLangObjectNull = false;
            // viewModel.obAnimalAge.get()
            java.lang.String viewModelObAnimalAgeGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelObAnimalAge = viewModel.obAnimalAge;

                viewModelObAnimalAgeJavaLangObjectNull = (viewModelObAnimalAge) != (null);
                if (viewModelObAnimalAgeJavaLangObjectNull) {




                    viewModelObAnimalAge.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.isSkin.get()
            //         is viewModel.isSkin.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // viewModel.isSkin
            android.databinding.ObservableField<java.lang.String> viewModelIsSkin = null;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.isSkin != null
            boolean viewModelIsSkinJavaLangObjectNull = false;
            // viewModel.isSkin.get()
            java.lang.String viewModelIsSkinGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelIsSkin = viewModel.isSkin;

                viewModelIsSkinJavaLangObjectNull = (viewModelIsSkin) != (null);
                if (viewModelIsSkinJavaLangObjectNull) {




                    viewModelIsSkin.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener textView13androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.isBite.get()
            //         is viewModel.isBite.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(textView13);
            // localize variables for thread safety
            // viewModel.isBite
            android.databinding.ObservableField<java.lang.String> viewModelIsBite = null;
            // viewModel.isBite.get()
            java.lang.String viewModelIsBiteGet = null;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.isBite != null
            boolean viewModelIsBiteJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelIsBite = viewModel.isBite;

                viewModelIsBiteJavaLangObjectNull = (viewModelIsBite) != (null);
                if (viewModelIsBiteJavaLangObjectNull) {




                    viewModelIsBite.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener textView14androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.neiquPeriod.get()
            //         is viewModel.neiquPeriod.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(textView14);
            // localize variables for thread safety
            // viewModel.neiquPeriod
            android.databinding.ObservableField<java.lang.String> viewModelNeiquPeriod = null;
            // viewModel.neiquPeriod.get()
            java.lang.String viewModelNeiquPeriodGet = null;
            // viewModel.neiquPeriod != null
            boolean viewModelNeiquPeriodJavaLangObjectNull = false;
            // viewModel
            ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelNeiquPeriod = viewModel.neiquPeriod;

                viewModelNeiquPeriodJavaLangObjectNull = (viewModelNeiquPeriod) != (null);
                if (viewModelNeiquPeriodJavaLangObjectNull) {




                    viewModelNeiquPeriod.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityAddAnimalBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 31);
        final Object[] bindings = mapBindings(bindingComponent, root, 66, sIncludes, sViewsWithIds);
        this.ivSettingPeriodNeiqu = (android.widget.ImageView) bindings[31];
        this.ivSettingPeriodNeiqu.setTag(null);
        this.ivSettingPeriodYimiao = (android.widget.ImageView) bindings[23];
        this.ivSettingPeriodYimiao.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.RelativeLayout) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (ys.app.pad.widget.ContainsEmojiEditText) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (android.widget.EditText) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView19 = (android.widget.TextView) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (android.widget.RelativeLayout) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView22 = (android.widget.TextView) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView24 = (android.widget.TextView) bindings[24];
        this.mboundView24.setTag(null);
        this.mboundView26 = (android.widget.TextView) bindings[26];
        this.mboundView26.setTag(null);
        this.mboundView27 = (android.widget.RelativeLayout) bindings[27];
        this.mboundView27.setTag(null);
        this.mboundView29 = (android.widget.TextView) bindings[29];
        this.mboundView29.setTag(null);
        this.mboundView3 = (ys.app.pad.widget.ContainsEmojiEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView30 = (android.widget.RelativeLayout) bindings[30];
        this.mboundView30.setTag(null);
        this.mboundView34 = (android.widget.TextView) bindings[34];
        this.mboundView34.setTag(null);
        this.mboundView35 = (android.widget.RelativeLayout) bindings[35];
        this.mboundView35.setTag(null);
        this.mboundView37 = (android.widget.TextView) bindings[37];
        this.mboundView37.setTag(null);
        this.mboundView38 = (android.widget.RelativeLayout) bindings[38];
        this.mboundView38.setTag(null);
        this.mboundView40 = (android.widget.TextView) bindings[40];
        this.mboundView40.setTag(null);
        this.mboundView41 = (ys.app.pad.widget.ContainsEmojiEditText) bindings[41];
        this.mboundView41.setTag(null);
        this.mboundView42 = (android.widget.Button) bindings[42];
        this.mboundView42.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.EditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.quchongDateTv = (android.widget.TextView) bindings[60];
        this.selectIv0 = (android.widget.ImageView) bindings[4];
        this.selectIv0.setTag(null);
        this.selectIv2 = (android.widget.ImageView) bindings[18];
        this.selectIv2.setTag(null);
        this.selectIv3 = (android.widget.ImageView) bindings[25];
        this.selectIv3.setTag(null);
        this.selectIv4 = (android.widget.ImageView) bindings[21];
        this.selectIv4.setTag(null);
        this.selectIv5 = (android.widget.ImageView) bindings[28];
        this.selectIv5.setTag(null);
        this.selectIv7 = (android.widget.ImageView) bindings[12];
        this.selectIv7.setTag(null);
        this.selectIvWaiqu = (android.widget.ImageView) bindings[33];
        this.selectIvWaiqu.setTag(null);
        this.selectPeriodWaiqu = (android.widget.ImageView) bindings[39];
        this.selectPeriodWaiqu.setTag(null);
        this.selectPetBite = (android.widget.ImageView) bindings[10];
        this.selectPetBite.setTag(null);
        this.selectPetSkin = (android.widget.ImageView) bindings[8];
        this.selectPetSkin.setTag(null);
        this.selectWaiqu = (android.widget.ImageView) bindings[36];
        this.selectWaiqu.setTag(null);
        this.textView13 = (android.widget.TextView) bindings[11];
        this.textView13.setTag(null);
        this.textView14 = (android.widget.TextView) bindings[32];
        this.textView14.setTag(null);
        this.textView15 = (android.widget.TextView) bindings[45];
        this.tv = (android.widget.TextView) bindings[50];
        this.tv0 = (android.widget.TextView) bindings[43];
        this.tv1 = (android.widget.TextView) bindings[44];
        this.tv11 = (android.widget.TextView) bindings[59];
        this.tv13 = (android.widget.TextView) bindings[48];
        this.tv14 = (android.widget.TextView) bindings[49];
        this.tv2 = (android.widget.TextView) bindings[51];
        this.tv5 = (android.widget.TextView) bindings[52];
        this.tv6 = (android.widget.TextView) bindings[53];
        this.tv7 = (android.widget.TextView) bindings[57];
        this.tv8 = (android.widget.TextView) bindings[58];
        this.tv9 = (android.widget.TextView) bindings[54];
        this.tvNeiqu = (android.widget.TextView) bindings[61];
        this.tvPeriodDateWaiqu = (android.widget.TextView) bindings[65];
        this.tvPeriodYimiao = (android.widget.TextView) bindings[56];
        this.tvPetBite = (android.widget.TextView) bindings[47];
        this.tvPetSkin = (android.widget.TextView) bindings[46];
        this.tvWaiqu = (android.widget.TextView) bindings[63];
        this.tvWaiquName = (android.widget.TextView) bindings[62];
        this.waiquDateTv = (android.widget.TextView) bindings[64];
        this.yimiaoDateTv = (android.widget.TextView) bindings[55];
        setRootTag(root);
        // listeners
        mCallback27 = new android.databinding.generated.callback.OnClickListener(this, 13);
        mCallback15 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback16 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback28 = new android.databinding.generated.callback.OnClickListener(this, 14);
        mCallback25 = new android.databinding.generated.callback.OnClickListener(this, 11);
        mCallback26 = new android.databinding.generated.callback.OnClickListener(this, 12);
        mCallback23 = new android.databinding.generated.callback.OnClickListener(this, 9);
        mCallback24 = new android.databinding.generated.callback.OnClickListener(this, 10);
        mCallback21 = new android.databinding.generated.callback.OnClickListener(this, 7);
        mCallback20 = new android.databinding.generated.callback.OnClickListener(this, 6);
        mCallback22 = new android.databinding.generated.callback.OnClickListener(this, 8);
        mCallback19 = new android.databinding.generated.callback.OnClickListener(this, 5);
        mCallback17 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback29 = new android.databinding.generated.callback.OnClickListener(this, 15);
        mCallback18 = new android.databinding.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80000000L;
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
            setViewModel((ys.app.pad.viewmodel.AddAnimalViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ys.app.pad.viewmodel.AddAnimalViewModel ViewModel) {
        updateRegistration(18, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public ys.app.pad.viewmodel.AddAnimalViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSelectBreed((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelObIsEdit((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelObAnimalBirthday((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelObAnimalYimiaoDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelPetRemark((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelObVipName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelObAnimalAge((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelObAnimalColor((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelNeiquPeriod((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelSelectYimiaoImg((android.databinding.ObservableInt) object, fieldId);
            case 10 :
                return onChangeViewModelIsBite((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeViewModelSelectYimiao((android.databinding.ObservableBoolean) object, fieldId);
            case 12 :
                return onChangeViewModelSelectWaiqu((android.databinding.ObservableBoolean) object, fieldId);
            case 13 :
                return onChangeViewModelObAnimalWaiquTime((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 14 :
                return onChangeViewModelObAnimalWeight((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 15 :
                return onChangeViewModelObAnimalBreed((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 16 :
                return onChangeViewModelIsSkin((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 17 :
                return onChangeViewModelObAnimalGender((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 18 :
                return onChangeViewModel((ys.app.pad.viewmodel.AddAnimalViewModel) object, fieldId);
            case 19 :
                return onChangeViewModelObAnimalName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 20 :
                return onChangeViewModelWaiquPeriod((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 21 :
                return onChangeViewModelObAnimalCategory((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 22 :
                return onChangeViewModelObAnimalIsQuchong((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 23 :
                return onChangeViewModelSelectQuchong((android.databinding.ObservableBoolean) object, fieldId);
            case 24 :
                return onChangeViewModelObAnimalYimiaoPeriod((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 25 :
                return onChangeViewModelObAnimalQuchongDate((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 26 :
                return onChangeViewModelSelectWaiquImg((android.databinding.ObservableInt) object, fieldId);
            case 27 :
                return onChangeViewModelObVipPhone((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 28 :
                return onChangeViewModelObAnimalIsYimiao((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 29 :
                return onChangeViewModelObAnimalIsWaiqu((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 30 :
                return onChangeViewModelSelectQuchongImg((android.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSelectBreed(android.databinding.ObservableBoolean ViewModelSelectBreed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObIsEdit(android.databinding.ObservableBoolean ViewModelObIsEdit, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalBirthday(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalBirthday, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalYimiaoDate(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalYimiaoDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPetRemark(android.databinding.ObservableField<java.lang.String> ViewModelPetRemark, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObVipName(android.databinding.ObservableField<java.lang.String> ViewModelObVipName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalAge(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalAge, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalColor(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalColor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNeiquPeriod(android.databinding.ObservableField<java.lang.String> ViewModelNeiquPeriod, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectYimiaoImg(android.databinding.ObservableInt ViewModelSelectYimiaoImg, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsBite(android.databinding.ObservableField<java.lang.String> ViewModelIsBite, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectYimiao(android.databinding.ObservableBoolean ViewModelSelectYimiao, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectWaiqu(android.databinding.ObservableBoolean ViewModelSelectWaiqu, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalWaiquTime(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalWaiquTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalWeight(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalWeight, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalBreed(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalBreed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsSkin(android.databinding.ObservableField<java.lang.String> ViewModelIsSkin, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalGender(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalGender, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(ys.app.pad.viewmodel.AddAnimalViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalName(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWaiquPeriod(android.databinding.ObservableField<java.lang.String> ViewModelWaiquPeriod, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalCategory(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalCategory, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalIsQuchong(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalIsQuchong, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectQuchong(android.databinding.ObservableBoolean ViewModelSelectQuchong, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalYimiaoPeriod(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalYimiaoPeriod, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalQuchongDate(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalQuchongDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectWaiquImg(android.databinding.ObservableInt ViewModelSelectWaiquImg, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObVipPhone(android.databinding.ObservableField<java.lang.String> ViewModelObVipPhone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalIsYimiao(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalIsYimiao, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObAnimalIsWaiqu(android.databinding.ObservableField<java.lang.String> ViewModelObAnimalIsWaiqu, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectQuchongImg(android.databinding.ObservableInt ViewModelSelectQuchongImg, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000000L;
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
        java.lang.String viewModelObAnimalBirthdayGet = null;
        java.lang.String viewModelObVipPhoneGet = null;
        android.view.View.OnClickListener viewModelClickButtonAndroidViewViewOnClickListener = null;
        android.databinding.ObservableBoolean viewModelSelectBreed = null;
        android.databinding.ObservableBoolean viewModelObIsEdit = null;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalBirthday = null;
        java.lang.String viewModelObAnimalGenderGet = null;
        android.view.View.OnClickListener viewModelClickIsQuchongButtonAndroidViewViewOnClickListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalYimiaoDate = null;
        android.databinding.ObservableField<java.lang.String> viewModelPetRemark = null;
        android.databinding.ObservableField<java.lang.String> viewModelObVipName = null;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalAge = null;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalColor = null;
        android.databinding.ObservableField<java.lang.String> viewModelNeiquPeriod = null;
        android.databinding.ObservableInt viewModelSelectYimiaoImg = null;
        android.databinding.ObservableField<java.lang.String> viewModelIsBite = null;
        java.lang.String viewModelObAnimalBreedGet = null;
        int viewModelSelectYimiaoImgGet = 0;
        android.databinding.ObservableBoolean viewModelSelectYimiao = null;
        java.lang.String viewModelWaiquPeriodGet = null;
        android.databinding.ObservableBoolean viewModelSelectWaiqu = null;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalWaiquTime = null;
        java.lang.String viewModelObAnimalYimiaoPeriodGet = null;
        java.lang.String viewModelObAnimalIsQuchongGet = null;
        java.lang.String viewModelObAnimalIsWaiquGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalWeight = null;
        java.lang.String viewModelObAnimalAgeGet = null;
        android.view.View.OnClickListener viewModelClickYimiaoDateButtonAndroidViewViewOnClickListener = null;
        java.lang.String viewModelObIsEditMboundView42AndroidStringBjcwMboundView42AndroidStringXzcw = null;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalBreed = null;
        java.lang.String viewModelObVipNameGet = null;
        java.lang.String viewModelObAnimalWaiquTimeGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelIsSkin = null;
        android.view.View.OnClickListener viewModelClickIsYimiaoButtonAndroidViewViewOnClickListener = null;
        android.graphics.drawable.Drawable viewModelSelectBreedMboundView14AndroidDrawableShapeLoginInputMboundView14AndroidDrawableShapeGreyInput = null;
        java.lang.String viewModelIsBiteGet = null;
        boolean viewModelSelectWaiquGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalGender = null;
        ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
        java.lang.String viewModelObAnimalYimiaoDateGet = null;
        android.graphics.drawable.Drawable viewModelSelectYimiaoMboundView20AndroidDrawableShapeLoginInputMboundView20AndroidDrawableShapeGreyInput = null;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalName = null;
        java.lang.String viewModelObAnimalQuchongDateGet = null;
        boolean viewModelSelectBreedGet = false;
        android.view.View.OnClickListener viewModelClickBreedButtonAndroidViewViewOnClickListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelWaiquPeriod = null;
        android.view.View.OnClickListener viewModelClickCategoryAndroidViewViewOnClickListener = null;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalCategory = null;
        android.graphics.drawable.Drawable viewModelSelectQuchongMboundView27AndroidDrawableShapeLoginInputMboundView27AndroidDrawableShapeGreyInput = null;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalIsQuchong = null;
        int viewModelSelectQuchongImgGet = 0;
        android.databinding.ObservableBoolean viewModelSelectQuchong = null;
        java.lang.String viewModelNeiquPeriodGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalYimiaoPeriod = null;
        android.graphics.drawable.Drawable viewModelSelectWaiquMboundView35AndroidDrawableShapeLoginInputMboundView35AndroidDrawableShapeGreyInput = null;
        boolean viewModelObIsEditGet = false;
        java.lang.String viewModelObAnimalIsYimiaoGet = null;
        java.lang.String viewModelPetRemarkGet = null;
        boolean viewModelSelectQuchongGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalQuchongDate = null;
        android.graphics.drawable.Drawable viewModelSelectWaiquMboundView38AndroidDrawableShapeLoginInputMboundView38AndroidDrawableShapeGreyInput = null;
        android.view.View.OnClickListener viewModelClickQuchongDateButtonAndroidViewViewOnClickListener = null;
        java.lang.String viewModelIsSkinGet = null;
        android.databinding.ObservableInt viewModelSelectWaiquImg = null;
        java.lang.String viewModelObAnimalNameGet = null;
        android.graphics.drawable.Drawable viewModelSelectQuchongMboundView30AndroidDrawableShapeLoginInputMboundView30AndroidDrawableShapeGreyInput = null;
        android.databinding.ObservableField<java.lang.String> viewModelObVipPhone = null;
        int viewModelSelectWaiquImgGet = 0;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalIsYimiao = null;
        boolean viewModelSelectYimiaoGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelObAnimalIsWaiqu = null;
        android.view.View.OnClickListener viewModelClickGenderButtonAndroidViewViewOnClickListener = null;
        java.lang.String viewModelObAnimalColorGet = null;
        android.databinding.ObservableInt viewModelSelectQuchongImg = null;
        java.lang.String viewModelObAnimalWeightGet = null;
        java.lang.String viewModelObAnimalCategoryGet = null;

        if ((dirtyFlags & 0xffffffffL) != 0) {


            if ((dirtyFlags & 0x80040000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::clickButton
                        viewModelClickButtonAndroidViewViewOnClickListener = (((mViewModelClickButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelClickButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickIsQuchongButton
                        viewModelClickIsQuchongButtonAndroidViewViewOnClickListener = (((mViewModelClickIsQuchongButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickIsQuchongButtonAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelClickIsQuchongButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickYimiaoDateButton
                        viewModelClickYimiaoDateButtonAndroidViewViewOnClickListener = (((mViewModelClickYimiaoDateButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickYimiaoDateButtonAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelClickYimiaoDateButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickIsYimiaoButton
                        viewModelClickIsYimiaoButtonAndroidViewViewOnClickListener = (((mViewModelClickIsYimiaoButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickIsYimiaoButtonAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mViewModelClickIsYimiaoButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickBreedButton
                        viewModelClickBreedButtonAndroidViewViewOnClickListener = (((mViewModelClickBreedButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickBreedButtonAndroidViewViewOnClickListener = new OnClickListenerImpl4()) : mViewModelClickBreedButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickCategory
                        viewModelClickCategoryAndroidViewViewOnClickListener = (((mViewModelClickCategoryAndroidViewViewOnClickListener == null) ? (mViewModelClickCategoryAndroidViewViewOnClickListener = new OnClickListenerImpl5()) : mViewModelClickCategoryAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickQuchongDateButton
                        viewModelClickQuchongDateButtonAndroidViewViewOnClickListener = (((mViewModelClickQuchongDateButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickQuchongDateButtonAndroidViewViewOnClickListener = new OnClickListenerImpl6()) : mViewModelClickQuchongDateButtonAndroidViewViewOnClickListener).setValue(viewModel));
                        // read viewModel::clickGenderButton
                        viewModelClickGenderButtonAndroidViewViewOnClickListener = (((mViewModelClickGenderButtonAndroidViewViewOnClickListener == null) ? (mViewModelClickGenderButtonAndroidViewViewOnClickListener = new OnClickListenerImpl7()) : mViewModelClickGenderButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x80040001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectBreed
                        viewModelSelectBreed = viewModel.selectBreed;
                    }
                    updateRegistration(0, viewModelSelectBreed);


                    if (viewModelSelectBreed != null) {
                        // read viewModel.selectBreed.get()
                        viewModelSelectBreedGet = viewModelSelectBreed.get();
                    }
                if((dirtyFlags & 0x80040001L) != 0) {
                    if(viewModelSelectBreedGet) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read viewModel.selectBreed.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
                    viewModelSelectBreedMboundView14AndroidDrawableShapeLoginInputMboundView14AndroidDrawableShapeGreyInput = ((viewModelSelectBreedGet) ? (getDrawableFromResource(mboundView14, R.drawable.shape_login_input)) : (getDrawableFromResource(mboundView14, R.drawable.shape_grey_input)));
            }
            if ((dirtyFlags & 0x80040002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obIsEdit
                        viewModelObIsEdit = viewModel.obIsEdit;
                    }
                    updateRegistration(1, viewModelObIsEdit);


                    if (viewModelObIsEdit != null) {
                        // read viewModel.obIsEdit.get()
                        viewModelObIsEditGet = viewModelObIsEdit.get();
                    }
                if((dirtyFlags & 0x80040002L) != 0) {
                    if(viewModelObIsEditGet) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read viewModel.obIsEdit.get() ? @android:string/bjcw : @android:string/xzcw
                    viewModelObIsEditMboundView42AndroidStringBjcwMboundView42AndroidStringXzcw = ((viewModelObIsEditGet) ? (mboundView42.getResources().getString(R.string.bjcw)) : (mboundView42.getResources().getString(R.string.xzcw)));
            }
            if ((dirtyFlags & 0x80040004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalBirthday
                        viewModelObAnimalBirthday = viewModel.obAnimalBirthday;
                    }
                    updateRegistration(2, viewModelObAnimalBirthday);


                    if (viewModelObAnimalBirthday != null) {
                        // read viewModel.obAnimalBirthday.get()
                        viewModelObAnimalBirthdayGet = viewModelObAnimalBirthday.get();
                    }
            }
            if ((dirtyFlags & 0x80040008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalYimiaoDate
                        viewModelObAnimalYimiaoDate = viewModel.obAnimalYimiaoDate;
                    }
                    updateRegistration(3, viewModelObAnimalYimiaoDate);


                    if (viewModelObAnimalYimiaoDate != null) {
                        // read viewModel.obAnimalYimiaoDate.get()
                        viewModelObAnimalYimiaoDateGet = viewModelObAnimalYimiaoDate.get();
                    }
            }
            if ((dirtyFlags & 0x80040010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.petRemark
                        viewModelPetRemark = viewModel.petRemark;
                    }
                    updateRegistration(4, viewModelPetRemark);


                    if (viewModelPetRemark != null) {
                        // read viewModel.petRemark.get()
                        viewModelPetRemarkGet = viewModelPetRemark.get();
                    }
            }
            if ((dirtyFlags & 0x80040020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obVipName
                        viewModelObVipName = viewModel.obVipName;
                    }
                    updateRegistration(5, viewModelObVipName);


                    if (viewModelObVipName != null) {
                        // read viewModel.obVipName.get()
                        viewModelObVipNameGet = viewModelObVipName.get();
                    }
            }
            if ((dirtyFlags & 0x80040040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalAge
                        viewModelObAnimalAge = viewModel.obAnimalAge;
                    }
                    updateRegistration(6, viewModelObAnimalAge);


                    if (viewModelObAnimalAge != null) {
                        // read viewModel.obAnimalAge.get()
                        viewModelObAnimalAgeGet = viewModelObAnimalAge.get();
                    }
            }
            if ((dirtyFlags & 0x80040080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalColor
                        viewModelObAnimalColor = viewModel.obAnimalColor;
                    }
                    updateRegistration(7, viewModelObAnimalColor);


                    if (viewModelObAnimalColor != null) {
                        // read viewModel.obAnimalColor.get()
                        viewModelObAnimalColorGet = viewModelObAnimalColor.get();
                    }
            }
            if ((dirtyFlags & 0x80040100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.neiquPeriod
                        viewModelNeiquPeriod = viewModel.neiquPeriod;
                    }
                    updateRegistration(8, viewModelNeiquPeriod);


                    if (viewModelNeiquPeriod != null) {
                        // read viewModel.neiquPeriod.get()
                        viewModelNeiquPeriodGet = viewModelNeiquPeriod.get();
                    }
            }
            if ((dirtyFlags & 0x80040200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectYimiaoImg
                        viewModelSelectYimiaoImg = viewModel.selectYimiaoImg;
                    }
                    updateRegistration(9, viewModelSelectYimiaoImg);


                    if (viewModelSelectYimiaoImg != null) {
                        // read viewModel.selectYimiaoImg.get()
                        viewModelSelectYimiaoImgGet = viewModelSelectYimiaoImg.get();
                    }
            }
            if ((dirtyFlags & 0x80040400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isBite
                        viewModelIsBite = viewModel.isBite;
                    }
                    updateRegistration(10, viewModelIsBite);


                    if (viewModelIsBite != null) {
                        // read viewModel.isBite.get()
                        viewModelIsBiteGet = viewModelIsBite.get();
                    }
            }
            if ((dirtyFlags & 0x80040800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectYimiao
                        viewModelSelectYimiao = viewModel.selectYimiao;
                    }
                    updateRegistration(11, viewModelSelectYimiao);


                    if (viewModelSelectYimiao != null) {
                        // read viewModel.selectYimiao.get()
                        viewModelSelectYimiaoGet = viewModelSelectYimiao.get();
                    }
                if((dirtyFlags & 0x80040800L) != 0) {
                    if(viewModelSelectYimiaoGet) {
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                    }
                }


                    // read viewModel.selectYimiao.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
                    viewModelSelectYimiaoMboundView20AndroidDrawableShapeLoginInputMboundView20AndroidDrawableShapeGreyInput = ((viewModelSelectYimiaoGet) ? (getDrawableFromResource(mboundView20, R.drawable.shape_login_input)) : (getDrawableFromResource(mboundView20, R.drawable.shape_grey_input)));
            }
            if ((dirtyFlags & 0x80041000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectWaiqu
                        viewModelSelectWaiqu = viewModel.selectWaiqu;
                    }
                    updateRegistration(12, viewModelSelectWaiqu);


                    if (viewModelSelectWaiqu != null) {
                        // read viewModel.selectWaiqu.get()
                        viewModelSelectWaiquGet = viewModelSelectWaiqu.get();
                    }
                if((dirtyFlags & 0x80041000L) != 0) {
                    if(viewModelSelectWaiquGet) {
                            dirtyFlags |= 0x20000000000L;
                            dirtyFlags |= 0x80000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000L;
                            dirtyFlags |= 0x40000000000L;
                    }
                }


                    // read viewModel.selectWaiqu.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
                    viewModelSelectWaiquMboundView35AndroidDrawableShapeLoginInputMboundView35AndroidDrawableShapeGreyInput = ((viewModelSelectWaiquGet) ? (getDrawableFromResource(mboundView35, R.drawable.shape_login_input)) : (getDrawableFromResource(mboundView35, R.drawable.shape_grey_input)));
                    // read viewModel.selectWaiqu.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
                    viewModelSelectWaiquMboundView38AndroidDrawableShapeLoginInputMboundView38AndroidDrawableShapeGreyInput = ((viewModelSelectWaiquGet) ? (getDrawableFromResource(mboundView38, R.drawable.shape_login_input)) : (getDrawableFromResource(mboundView38, R.drawable.shape_grey_input)));
            }
            if ((dirtyFlags & 0x80042000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalWaiquTime
                        viewModelObAnimalWaiquTime = viewModel.obAnimalWaiquTime;
                    }
                    updateRegistration(13, viewModelObAnimalWaiquTime);


                    if (viewModelObAnimalWaiquTime != null) {
                        // read viewModel.obAnimalWaiquTime.get()
                        viewModelObAnimalWaiquTimeGet = viewModelObAnimalWaiquTime.get();
                    }
            }
            if ((dirtyFlags & 0x80044000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalWeight
                        viewModelObAnimalWeight = viewModel.obAnimalWeight;
                    }
                    updateRegistration(14, viewModelObAnimalWeight);


                    if (viewModelObAnimalWeight != null) {
                        // read viewModel.obAnimalWeight.get()
                        viewModelObAnimalWeightGet = viewModelObAnimalWeight.get();
                    }
            }
            if ((dirtyFlags & 0x80048000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalBreed
                        viewModelObAnimalBreed = viewModel.obAnimalBreed;
                    }
                    updateRegistration(15, viewModelObAnimalBreed);


                    if (viewModelObAnimalBreed != null) {
                        // read viewModel.obAnimalBreed.get()
                        viewModelObAnimalBreedGet = viewModelObAnimalBreed.get();
                    }
            }
            if ((dirtyFlags & 0x80050000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isSkin
                        viewModelIsSkin = viewModel.isSkin;
                    }
                    updateRegistration(16, viewModelIsSkin);


                    if (viewModelIsSkin != null) {
                        // read viewModel.isSkin.get()
                        viewModelIsSkinGet = viewModelIsSkin.get();
                    }
            }
            if ((dirtyFlags & 0x80060000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalGender
                        viewModelObAnimalGender = viewModel.obAnimalGender;
                    }
                    updateRegistration(17, viewModelObAnimalGender);


                    if (viewModelObAnimalGender != null) {
                        // read viewModel.obAnimalGender.get()
                        viewModelObAnimalGenderGet = viewModelObAnimalGender.get();
                    }
            }
            if ((dirtyFlags & 0x800c0000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalName
                        viewModelObAnimalName = viewModel.obAnimalName;
                    }
                    updateRegistration(19, viewModelObAnimalName);


                    if (viewModelObAnimalName != null) {
                        // read viewModel.obAnimalName.get()
                        viewModelObAnimalNameGet = viewModelObAnimalName.get();
                    }
            }
            if ((dirtyFlags & 0x80140000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.waiquPeriod
                        viewModelWaiquPeriod = viewModel.waiquPeriod;
                    }
                    updateRegistration(20, viewModelWaiquPeriod);


                    if (viewModelWaiquPeriod != null) {
                        // read viewModel.waiquPeriod.get()
                        viewModelWaiquPeriodGet = viewModelWaiquPeriod.get();
                    }
            }
            if ((dirtyFlags & 0x80240000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalCategory
                        viewModelObAnimalCategory = viewModel.obAnimalCategory;
                    }
                    updateRegistration(21, viewModelObAnimalCategory);


                    if (viewModelObAnimalCategory != null) {
                        // read viewModel.obAnimalCategory.get()
                        viewModelObAnimalCategoryGet = viewModelObAnimalCategory.get();
                    }
            }
            if ((dirtyFlags & 0x80440000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalIsQuchong
                        viewModelObAnimalIsQuchong = viewModel.obAnimalIsQuchong;
                    }
                    updateRegistration(22, viewModelObAnimalIsQuchong);


                    if (viewModelObAnimalIsQuchong != null) {
                        // read viewModel.obAnimalIsQuchong.get()
                        viewModelObAnimalIsQuchongGet = viewModelObAnimalIsQuchong.get();
                    }
            }
            if ((dirtyFlags & 0x80840000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectQuchong
                        viewModelSelectQuchong = viewModel.selectQuchong;
                    }
                    updateRegistration(23, viewModelSelectQuchong);


                    if (viewModelSelectQuchong != null) {
                        // read viewModel.selectQuchong.get()
                        viewModelSelectQuchongGet = viewModelSelectQuchong.get();
                    }
                if((dirtyFlags & 0x80840000L) != 0) {
                    if(viewModelSelectQuchongGet) {
                            dirtyFlags |= 0x8000000000L;
                            dirtyFlags |= 0x200000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                            dirtyFlags |= 0x100000000000L;
                    }
                }


                    // read viewModel.selectQuchong.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
                    viewModelSelectQuchongMboundView27AndroidDrawableShapeLoginInputMboundView27AndroidDrawableShapeGreyInput = ((viewModelSelectQuchongGet) ? (getDrawableFromResource(mboundView27, R.drawable.shape_login_input)) : (getDrawableFromResource(mboundView27, R.drawable.shape_grey_input)));
                    // read viewModel.selectQuchong.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
                    viewModelSelectQuchongMboundView30AndroidDrawableShapeLoginInputMboundView30AndroidDrawableShapeGreyInput = ((viewModelSelectQuchongGet) ? (getDrawableFromResource(mboundView30, R.drawable.shape_login_input)) : (getDrawableFromResource(mboundView30, R.drawable.shape_grey_input)));
            }
            if ((dirtyFlags & 0x81040000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalYimiaoPeriod
                        viewModelObAnimalYimiaoPeriod = viewModel.obAnimalYimiaoPeriod;
                    }
                    updateRegistration(24, viewModelObAnimalYimiaoPeriod);


                    if (viewModelObAnimalYimiaoPeriod != null) {
                        // read viewModel.obAnimalYimiaoPeriod.get()
                        viewModelObAnimalYimiaoPeriodGet = viewModelObAnimalYimiaoPeriod.get();
                    }
            }
            if ((dirtyFlags & 0x82040000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalQuchongDate
                        viewModelObAnimalQuchongDate = viewModel.obAnimalQuchongDate;
                    }
                    updateRegistration(25, viewModelObAnimalQuchongDate);


                    if (viewModelObAnimalQuchongDate != null) {
                        // read viewModel.obAnimalQuchongDate.get()
                        viewModelObAnimalQuchongDateGet = viewModelObAnimalQuchongDate.get();
                    }
            }
            if ((dirtyFlags & 0x84040000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectWaiquImg
                        viewModelSelectWaiquImg = viewModel.selectWaiquImg;
                    }
                    updateRegistration(26, viewModelSelectWaiquImg);


                    if (viewModelSelectWaiquImg != null) {
                        // read viewModel.selectWaiquImg.get()
                        viewModelSelectWaiquImgGet = viewModelSelectWaiquImg.get();
                    }
            }
            if ((dirtyFlags & 0x88040000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obVipPhone
                        viewModelObVipPhone = viewModel.obVipPhone;
                    }
                    updateRegistration(27, viewModelObVipPhone);


                    if (viewModelObVipPhone != null) {
                        // read viewModel.obVipPhone.get()
                        viewModelObVipPhoneGet = viewModelObVipPhone.get();
                    }
            }
            if ((dirtyFlags & 0x90040000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalIsYimiao
                        viewModelObAnimalIsYimiao = viewModel.obAnimalIsYimiao;
                    }
                    updateRegistration(28, viewModelObAnimalIsYimiao);


                    if (viewModelObAnimalIsYimiao != null) {
                        // read viewModel.obAnimalIsYimiao.get()
                        viewModelObAnimalIsYimiaoGet = viewModelObAnimalIsYimiao.get();
                    }
            }
            if ((dirtyFlags & 0xa0040000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.obAnimalIsWaiqu
                        viewModelObAnimalIsWaiqu = viewModel.obAnimalIsWaiqu;
                    }
                    updateRegistration(29, viewModelObAnimalIsWaiqu);


                    if (viewModelObAnimalIsWaiqu != null) {
                        // read viewModel.obAnimalIsWaiqu.get()
                        viewModelObAnimalIsWaiquGet = viewModelObAnimalIsWaiqu.get();
                    }
            }
            if ((dirtyFlags & 0xc0040000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectQuchongImg
                        viewModelSelectQuchongImg = viewModel.selectQuchongImg;
                    }
                    updateRegistration(30, viewModelSelectQuchongImg);


                    if (viewModelSelectQuchongImg != null) {
                        // read viewModel.selectQuchongImg.get()
                        viewModelSelectQuchongImgGet = viewModelSelectQuchongImg.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80000000L) != 0) {
            // api target 1

            this.ivSettingPeriodNeiqu.setOnClickListener(mCallback22);
            this.ivSettingPeriodYimiao.setOnClickListener(mCallback20);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView13, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView13androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView15, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView15androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView16, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView16androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView17, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView17androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView19, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView19androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView22, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView22androidTextAttrChanged);
            this.mboundView24.setOnClickListener(mCallback21);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView24, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView24androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView26, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView26androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView29, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView29androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            this.mboundView34.setOnClickListener(mCallback25);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView34, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView34androidTextAttrChanged);
            this.mboundView37.setOnClickListener(mCallback27);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView37, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView37androidTextAttrChanged);
            this.mboundView40.setOnClickListener(mCallback29);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView40, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView40androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView41, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView41androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            this.mboundView7.setOnClickListener(mCallback15);
            this.mboundView9.setOnClickListener(mCallback17);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
            this.selectIvWaiqu.setOnClickListener(mCallback24);
            this.selectPeriodWaiqu.setOnClickListener(mCallback28);
            this.selectPetBite.setOnClickListener(mCallback18);
            this.selectPetSkin.setOnClickListener(mCallback16);
            this.selectWaiqu.setOnClickListener(mCallback26);
            this.textView13.setOnClickListener(mCallback19);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.textView13, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, textView13androidTextAttrChanged);
            this.textView14.setOnClickListener(mCallback23);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.textView14, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, textView14androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xc0040000L) != 0) {
            // api target 1

            ys.app.pad.utils.PetBindingUtil.setImgSrc(this.ivSettingPeriodNeiqu, viewModelSelectQuchongImgGet);
            ys.app.pad.utils.PetBindingUtil.setImgSrc(this.selectIv5, viewModelSelectQuchongImgGet);
        }
        if ((dirtyFlags & 0x80040200L) != 0) {
            // api target 1

            ys.app.pad.utils.PetBindingUtil.setImgSrc(this.ivSettingPeriodYimiao, viewModelSelectYimiaoImgGet);
            ys.app.pad.utils.PetBindingUtil.setImgSrc(this.selectIv4, viewModelSelectYimiaoImgGet);
        }
        if ((dirtyFlags & 0x80040020L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelObVipNameGet);
        }
        if ((dirtyFlags & 0x80040000L) != 0) {
            // api target 1

            this.mboundView13.setOnClickListener(viewModelClickCategoryAndroidViewViewOnClickListener);
            this.mboundView15.setOnClickListener(viewModelClickBreedButtonAndroidViewViewOnClickListener);
            this.mboundView19.setOnClickListener(viewModelClickIsYimiaoButtonAndroidViewViewOnClickListener);
            this.mboundView22.setOnClickListener(viewModelClickYimiaoDateButtonAndroidViewViewOnClickListener);
            this.mboundView26.setOnClickListener(viewModelClickIsQuchongButtonAndroidViewViewOnClickListener);
            this.mboundView29.setOnClickListener(viewModelClickQuchongDateButtonAndroidViewViewOnClickListener);
            this.mboundView42.setOnClickListener(viewModelClickButtonAndroidViewViewOnClickListener);
            this.mboundView5.setOnClickListener(viewModelClickGenderButtonAndroidViewViewOnClickListener);
            this.selectIv0.setOnClickListener(viewModelClickGenderButtonAndroidViewViewOnClickListener);
            this.selectIv2.setOnClickListener(viewModelClickIsYimiaoButtonAndroidViewViewOnClickListener);
            this.selectIv3.setOnClickListener(viewModelClickIsQuchongButtonAndroidViewViewOnClickListener);
            this.selectIv4.setOnClickListener(viewModelClickYimiaoDateButtonAndroidViewViewOnClickListener);
            this.selectIv5.setOnClickListener(viewModelClickQuchongDateButtonAndroidViewViewOnClickListener);
            this.selectIv7.setOnClickListener(viewModelClickCategoryAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x80240000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, viewModelObAnimalCategoryGet);
        }
        if ((dirtyFlags & 0x80040001L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView14, viewModelSelectBreedMboundView14AndroidDrawableShapeLoginInputMboundView14AndroidDrawableShapeGreyInput);
        }
        if ((dirtyFlags & 0x80048000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, viewModelObAnimalBreedGet);
        }
        if ((dirtyFlags & 0x80040080L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView16, viewModelObAnimalColorGet);
        }
        if ((dirtyFlags & 0x80044000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView17, viewModelObAnimalWeightGet);
        }
        if ((dirtyFlags & 0x90040000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView19, viewModelObAnimalIsYimiaoGet);
        }
        if ((dirtyFlags & 0x88040000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelObVipPhoneGet);
        }
        if ((dirtyFlags & 0x80040800L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView20, viewModelSelectYimiaoMboundView20AndroidDrawableShapeLoginInputMboundView20AndroidDrawableShapeGreyInput);
        }
        if ((dirtyFlags & 0x80040008L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView22, viewModelObAnimalYimiaoDateGet);
        }
        if ((dirtyFlags & 0x81040000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView24, viewModelObAnimalYimiaoPeriodGet);
        }
        if ((dirtyFlags & 0x80440000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView26, viewModelObAnimalIsQuchongGet);
        }
        if ((dirtyFlags & 0x80840000L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView27, viewModelSelectQuchongMboundView27AndroidDrawableShapeLoginInputMboundView27AndroidDrawableShapeGreyInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView30, viewModelSelectQuchongMboundView30AndroidDrawableShapeLoginInputMboundView30AndroidDrawableShapeGreyInput);
        }
        if ((dirtyFlags & 0x82040000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView29, viewModelObAnimalQuchongDateGet);
        }
        if ((dirtyFlags & 0x800c0000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelObAnimalNameGet);
        }
        if ((dirtyFlags & 0xa0040000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView34, viewModelObAnimalIsWaiquGet);
        }
        if ((dirtyFlags & 0x80041000L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView35, viewModelSelectWaiquMboundView35AndroidDrawableShapeLoginInputMboundView35AndroidDrawableShapeGreyInput);
            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView38, viewModelSelectWaiquMboundView38AndroidDrawableShapeLoginInputMboundView38AndroidDrawableShapeGreyInput);
        }
        if ((dirtyFlags & 0x80042000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView37, viewModelObAnimalWaiquTimeGet);
        }
        if ((dirtyFlags & 0x80140000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView40, viewModelWaiquPeriodGet);
        }
        if ((dirtyFlags & 0x80040010L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView41, viewModelPetRemarkGet);
        }
        if ((dirtyFlags & 0x80040002L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView42, viewModelObIsEditMboundView42AndroidStringBjcwMboundView42AndroidStringXzcw);
        }
        if ((dirtyFlags & 0x80060000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelObAnimalGenderGet);
        }
        if ((dirtyFlags & 0x80040040L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelObAnimalAgeGet);
        }
        if ((dirtyFlags & 0x80040004L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelObAnimalBirthdayGet);
        }
        if ((dirtyFlags & 0x80050000L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelIsSkinGet);
        }
        if ((dirtyFlags & 0x84040000L) != 0) {
            // api target 1

            ys.app.pad.utils.PetBindingUtil.setImgSrc(this.selectPeriodWaiqu, viewModelSelectWaiquImgGet);
            ys.app.pad.utils.PetBindingUtil.setImgSrc(this.selectWaiqu, viewModelSelectWaiquImgGet);
        }
        if ((dirtyFlags & 0x80040400L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView13, viewModelIsBiteGet);
        }
        if ((dirtyFlags & 0x80040100L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView14, viewModelNeiquPeriodGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AddAnimalViewModel value;
        public OnClickListenerImpl setValue(ys.app.pad.viewmodel.AddAnimalViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickButton(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AddAnimalViewModel value;
        public OnClickListenerImpl1 setValue(ys.app.pad.viewmodel.AddAnimalViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickIsQuchongButton(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AddAnimalViewModel value;
        public OnClickListenerImpl2 setValue(ys.app.pad.viewmodel.AddAnimalViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickYimiaoDateButton(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AddAnimalViewModel value;
        public OnClickListenerImpl3 setValue(ys.app.pad.viewmodel.AddAnimalViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickIsYimiaoButton(arg0);
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AddAnimalViewModel value;
        public OnClickListenerImpl4 setValue(ys.app.pad.viewmodel.AddAnimalViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickBreedButton(arg0);
        }
    }
    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AddAnimalViewModel value;
        public OnClickListenerImpl5 setValue(ys.app.pad.viewmodel.AddAnimalViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickCategory(arg0);
        }
    }
    public static class OnClickListenerImpl6 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AddAnimalViewModel value;
        public OnClickListenerImpl6 setValue(ys.app.pad.viewmodel.AddAnimalViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickQuchongDateButton(arg0);
        }
    }
    public static class OnClickListenerImpl7 implements android.view.View.OnClickListener{
        private ys.app.pad.viewmodel.AddAnimalViewModel value;
        public OnClickListenerImpl7 setValue(ys.app.pad.viewmodel.AddAnimalViewModel value) {
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
            case 13: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectWaiquDate();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clickBirthdaySelect();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectIsSkin();
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.settingWaiquPeriod();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectIsWaiqu();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectWaiquDate();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectNeiquPeriod();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectIsWaiqu();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.settingYimiaoPeriod();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.settingYimiaoPeriod();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectNeiquPeriod();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectIsBite();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectIsSkin();
                }
                break;
            }
            case 15: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.settingWaiquPeriod();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                ys.app.pad.viewmodel.AddAnimalViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.selectIsBite();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityAddAnimalBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddAnimalBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityAddAnimalBinding>inflate(inflater, ys.app.pad.R.layout.activity_add_animal, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityAddAnimalBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddAnimalBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(ys.app.pad.R.layout.activity_add_animal, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityAddAnimalBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityAddAnimalBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_add_animal_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityAddAnimalBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.selectBreed
        flag 1 (0x2L): viewModel.obIsEdit
        flag 2 (0x3L): viewModel.obAnimalBirthday
        flag 3 (0x4L): viewModel.obAnimalYimiaoDate
        flag 4 (0x5L): viewModel.petRemark
        flag 5 (0x6L): viewModel.obVipName
        flag 6 (0x7L): viewModel.obAnimalAge
        flag 7 (0x8L): viewModel.obAnimalColor
        flag 8 (0x9L): viewModel.neiquPeriod
        flag 9 (0xaL): viewModel.selectYimiaoImg
        flag 10 (0xbL): viewModel.isBite
        flag 11 (0xcL): viewModel.selectYimiao
        flag 12 (0xdL): viewModel.selectWaiqu
        flag 13 (0xeL): viewModel.obAnimalWaiquTime
        flag 14 (0xfL): viewModel.obAnimalWeight
        flag 15 (0x10L): viewModel.obAnimalBreed
        flag 16 (0x11L): viewModel.isSkin
        flag 17 (0x12L): viewModel.obAnimalGender
        flag 18 (0x13L): viewModel
        flag 19 (0x14L): viewModel.obAnimalName
        flag 20 (0x15L): viewModel.waiquPeriod
        flag 21 (0x16L): viewModel.obAnimalCategory
        flag 22 (0x17L): viewModel.obAnimalIsQuchong
        flag 23 (0x18L): viewModel.selectQuchong
        flag 24 (0x19L): viewModel.obAnimalYimiaoPeriod
        flag 25 (0x1aL): viewModel.obAnimalQuchongDate
        flag 26 (0x1bL): viewModel.selectWaiquImg
        flag 27 (0x1cL): viewModel.obVipPhone
        flag 28 (0x1dL): viewModel.obAnimalIsYimiao
        flag 29 (0x1eL): viewModel.obAnimalIsWaiqu
        flag 30 (0x1fL): viewModel.selectQuchongImg
        flag 31 (0x20L): null
        flag 32 (0x21L): viewModel.obIsEdit.get() ? @android:string/bjcw : @android:string/xzcw
        flag 33 (0x22L): viewModel.obIsEdit.get() ? @android:string/bjcw : @android:string/xzcw
        flag 34 (0x23L): viewModel.selectBreed.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
        flag 35 (0x24L): viewModel.selectBreed.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
        flag 36 (0x25L): viewModel.selectYimiao.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
        flag 37 (0x26L): viewModel.selectYimiao.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
        flag 38 (0x27L): viewModel.selectQuchong.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
        flag 39 (0x28L): viewModel.selectQuchong.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
        flag 40 (0x29L): viewModel.selectWaiqu.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
        flag 41 (0x2aL): viewModel.selectWaiqu.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
        flag 42 (0x2bL): viewModel.selectWaiqu.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
        flag 43 (0x2cL): viewModel.selectWaiqu.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
        flag 44 (0x2dL): viewModel.selectQuchong.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
        flag 45 (0x2eL): viewModel.selectQuchong.get() ? @android:drawable/shape_login_input : @android:drawable/shape_grey_input
    flag mapping end*/
    //end
}