
package android.databinding;
import ys.app.pad.BR;
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 19;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case ys.app.pad.R.layout.activity_modify_boss_psw:
                    return ys.app.pad.databinding.ActivityModifyBossPswBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_add_vip_card:
                    return ys.app.pad.databinding.ActivityAddVipCardBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_order2:
                    return ys.app.pad.databinding.ItemOrder2Binding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_child_order:
                    return ys.app.pad.databinding.ItemChildOrderBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_refund_vip:
                    return ys.app.pad.databinding.ActivityRefundVipBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_employee_performance_1:
                    return ys.app.pad.databinding.ItemEmployeePerformance1Binding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_employee_performance_3:
                    return ys.app.pad.databinding.ItemEmployeePerformance3Binding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_vip_pet_list:
                    return ys.app.pad.databinding.VipPetListBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_employee:
                    return ys.app.pad.databinding.ItemEmployeeBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_employee_performance_2:
                    return ys.app.pad.databinding.ItemEmployeePerformance2Binding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_employee_detail:
                    return ys.app.pad.databinding.ActivityEmployeeDetailBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_statistics:
                    return ys.app.pad.databinding.ActivityStatisticsBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_confirm_check_out:
                    return ys.app.pad.databinding.ItemConfirmCheckOutBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_service_search:
                    return ys.app.pad.databinding.ItemServiceSearchBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_goods_collect_money:
                    return ys.app.pad.databinding.ItemGoodsCollectBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_login:
                    return ys.app.pad.databinding.ActivityLoginBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_modify:
                    return ys.app.pad.databinding.ActivityModifyBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_inventory_records_detail:
                    return ys.app.pad.databinding.InventoryRecordsDetailBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_appointment_main:
                    return ys.app.pad.databinding.AppointmentMainItemModelBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_vip_search:
                    return ys.app.pad.databinding.ItemVipSearchBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_service_detail:
                    return ys.app.pad.databinding.ServiceDetailActivityBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_inventory_record_detail:
                    return ys.app.pad.databinding.InventoryRecordDetailBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_achievement:
                    return ys.app.pad.databinding.ActivityAchievementBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_add_animal:
                    return ys.app.pad.databinding.ActivityAddAnimalBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_employee_performance:
                    return ys.app.pad.databinding.ActivityEmployeePerformanceBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_goods_detail:
                    return ys.app.pad.databinding.ActivityGoodsDetailBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_employee_list:
                    return ys.app.pad.databinding.ItemEmployeeListBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_sale:
                    return ys.app.pad.databinding.ActivitySaleBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_num_card_list:
                    return ys.app.pad.databinding.ActivityNumCardListBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_employee_name_new:
                    return ys.app.pad.databinding.ItemEmployeeNameNewBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_all_achievement:
                    return ys.app.pad.databinding.ActivityAllAchievementBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_sand_qrcode:
                    return ys.app.pad.databinding.SandQRCodeBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_add_inventory:
                    return ys.app.pad.databinding.ActivityAddInventoryBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_layout_collect_money_navicat:
                    return ys.app.pad.databinding.ItemLayoutCollectMoneyNavicatBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_search:
                    return ys.app.pad.databinding.ActivitySearchBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_good_type_in_vip:
                    return ys.app.pad.databinding.ItemGoodTypeInVipBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_transaction_detail:
                    return ys.app.pad.databinding.TransactionDetailBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_num_card_service:
                    return ys.app.pad.databinding.ItemNumCardBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_start:
                    return ys.app.pad.databinding.ActivityStartBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_num_card_list:
                    return ys.app.pad.databinding.ItemNumCardListBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.dialog_customer_type:
                    return ys.app.pad.databinding.DialogCustomerTypeBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_check:
                    return ys.app.pad.databinding.ActivityCheckBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_pay:
                    return ys.app.pad.databinding.ActivityPayBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_check:
                    return ys.app.pad.databinding.ItemCheckBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_about_us:
                    return ys.app.pad.databinding.ActivityAboutUsBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_shopping_pay_result:
                    return ys.app.pad.databinding.ActivityShoppingPayResultBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.fragment_achieve_statis_child:
                    return ys.app.pad.databinding.FragmentAchievementStatisBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_goods_search:
                    return ys.app.pad.databinding.ItemGoodsSearchBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_personal_pay:
                    return ys.app.pad.databinding.PersonalPayBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_sand_pay_code:
                    return ys.app.pad.databinding.SandPayCodeBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_manager:
                    return ys.app.pad.databinding.ActivityManagerBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_add_employee:
                    return ys.app.pad.databinding.ItemAddEmployeeBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_employee_list:
                    return ys.app.pad.databinding.ActivityEmployeeListBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_vip_card:
                    return ys.app.pad.databinding.ItemVipCardBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_out_put_inventory:
                    return ys.app.pad.databinding.ItemOutPutBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_all_staff_achievement:
                    return ys.app.pad.databinding.AllStaffAchievementActivityBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_commit_order:
                    return ys.app.pad.databinding.ActivityCommitOrderBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_charge:
                    return ys.app.pad.databinding.ActivityChargeBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_animal:
                    return ys.app.pad.databinding.ItemAnimalBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_add_vip:
                    return ys.app.pad.databinding.ActivityAddVipBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_vice_order_list:
                    return ys.app.pad.databinding.OrderListScreenBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_out_storage_detail:
                    return ys.app.pad.databinding.OutStorageDetialBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_appointment_main:
                    return ys.app.pad.databinding.ActivityAppointmentMainBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_add_service:
                    return ys.app.pad.databinding.ActivityAddServiceBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_service_type_in_vip:
                    return ys.app.pad.databinding.ItemServiceTypeInVipBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.fragment_vip_consume:
                    return ys.app.pad.databinding.VipConsumesBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_pay_result:
                    return ys.app.pad.databinding.ActivityPayResultBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.fragment_vip_card:
                    return ys.app.pad.databinding.FragmentVipCardBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.fragment_achievement_static_item:
                    return ys.app.pad.databinding.AchievementStatisticChildBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_vip_consume:
                    return ys.app.pad.databinding.ItemVipConsumeBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.fragment_normal_appointment:
                    return ys.app.pad.databinding.NormalAppointmentBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_transaction:
                    return ys.app.pad.databinding.ItemTransactionBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_inventory_record:
                    return ys.app.pad.databinding.InventoryRecordItemBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_inventory_records:
                    return ys.app.pad.databinding.InventoryRecordsBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_add_goods:
                    return ys.app.pad.databinding.ActivityAddGoodsBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_modify_service:
                    return ys.app.pad.databinding.ModifyServiceDetailActivityBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_goods_name:
                    return ys.app.pad.databinding.ItemGoodsNameBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_paymethod_statistics:
                    return ys.app.pad.databinding.ItemPayMethodStatisticsBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.fragment_achievement_static:
                    return ys.app.pad.databinding.FragmentAchievementStaticBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.fragment_vip_recharge:
                    return ys.app.pad.databinding.VipRechargeRecordsBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_vip_pet_child:
                    return ys.app.pad.databinding.ItemVipPetChildBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_inventory:
                    return ys.app.pad.databinding.ItemInventoryBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_modify_psw:
                    return ys.app.pad.databinding.ActivityModifyPswBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_vip_recharge:
                    return ys.app.pad.databinding.ItemVipRechargeBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_vip_detail:
                    return ys.app.pad.databinding.ActivityVipDetailBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_search_service:
                    return ys.app.pad.databinding.ItemSearchServiceBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_vip:
                    return ys.app.pad.databinding.ItemVipBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_transaction_detail:
                    return ys.app.pad.databinding.ItemTransactionDetailBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_allot_record_list:
                    return ys.app.pad.databinding.AllotRecordAcitivtyBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_allot_shop_list:
                    return ys.app.pad.databinding.AllotListActivityBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.fragment_vip_appointment:
                    return ys.app.pad.databinding.VipAppointmentBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_vip_card:
                    return ys.app.pad.databinding.ActivityVipCardBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_collect_money:
                    return ys.app.pad.databinding.ActivityCollectMoneyBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_add_employee:
                    return ys.app.pad.databinding.ActivityAddEmployeeBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_forget_pwd:
                    return ys.app.pad.databinding.ForgetPwdActivityBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_achievement_statistic:
                    return ys.app.pad.databinding.AchievementStatisticBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_edit_employee:
                    return ys.app.pad.databinding.ActivityEditEmployeeBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_goods:
                    return ys.app.pad.databinding.ItemGoodsBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_main:
                    return ys.app.pad.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_pay_list:
                    return ys.app.pad.databinding.ActivityPayListBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.load_foot_view:
                    return ys.app.pad.databinding.FootBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_vip_record:
                    return ys.app.pad.databinding.VipRecordActivityBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_take_out_inventory:
                    return ys.app.pad.databinding.ActivityTakeOutInventoryBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.fragment_appointment_list:
                    return ys.app.pad.databinding.AppointmentListBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_goods:
                    return ys.app.pad.databinding.ActivityGoodsBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_service:
                    return ys.app.pad.databinding.ItemServiceBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.fragment_out_put_list:
                    return ys.app.pad.databinding.OutPutRecordListBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_allot_manage:
                    return ys.app.pad.databinding.ItemAllotShopRecordBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_num_card_detail:
                    return ys.app.pad.databinding.ActivityNumCardBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_inventory_records:
                    return ys.app.pad.databinding.ItemInventoryRecordBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_search_goods:
                    return ys.app.pad.databinding.ItemSearchGoodsBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_employee_shop_car_goods:
                    return ys.app.pad.databinding.EmployeeServiceBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.activity_service:
                    return ys.app.pad.databinding.ActivityServiceBinding.bind(view, bindingComponent);
                case ys.app.pad.R.layout.item_appointment:
                    return ys.app.pad.databinding.ItemAppointmentBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -756728915: {
                if(tag.equals("layout/activity_modify_boss_psw_0")) {
                    return ys.app.pad.R.layout.activity_modify_boss_psw;
                }
                break;
            }
            case -1756487988: {
                if(tag.equals("layout/activity_add_vip_card_0")) {
                    return ys.app.pad.R.layout.activity_add_vip_card;
                }
                break;
            }
            case 804388572: {
                if(tag.equals("layout/item_order2_0")) {
                    return ys.app.pad.R.layout.item_order2;
                }
                break;
            }
            case 200731189: {
                if(tag.equals("layout/item_child_order_0")) {
                    return ys.app.pad.R.layout.item_child_order;
                }
                break;
            }
            case 289362706: {
                if(tag.equals("layout/activity_refund_vip_0")) {
                    return ys.app.pad.R.layout.activity_refund_vip;
                }
                break;
            }
            case -1355069687: {
                if(tag.equals("layout/item_employee_performance_1_0")) {
                    return ys.app.pad.R.layout.item_employee_performance_1;
                }
                break;
            }
            case -1355067765: {
                if(tag.equals("layout/item_employee_performance_3_0")) {
                    return ys.app.pad.R.layout.item_employee_performance_3;
                }
                break;
            }
            case -531031656: {
                if(tag.equals("layout/item_vip_pet_list_0")) {
                    return ys.app.pad.R.layout.item_vip_pet_list;
                }
                break;
            }
            case -622828890: {
                if(tag.equals("layout/item_employee_0")) {
                    return ys.app.pad.R.layout.item_employee;
                }
                break;
            }
            case -1355068726: {
                if(tag.equals("layout/item_employee_performance_2_0")) {
                    return ys.app.pad.R.layout.item_employee_performance_2;
                }
                break;
            }
            case 118916872: {
                if(tag.equals("layout/activity_employee_detail_0")) {
                    return ys.app.pad.R.layout.activity_employee_detail;
                }
                break;
            }
            case -1378399713: {
                if(tag.equals("layout/activity_statistics_0")) {
                    return ys.app.pad.R.layout.activity_statistics;
                }
                break;
            }
            case 439915170: {
                if(tag.equals("layout/item_confirm_check_out_0")) {
                    return ys.app.pad.R.layout.item_confirm_check_out;
                }
                break;
            }
            case -2002583510: {
                if(tag.equals("layout/item_service_search_0")) {
                    return ys.app.pad.R.layout.item_service_search;
                }
                break;
            }
            case 751961420: {
                if(tag.equals("layout/item_goods_collect_money_0")) {
                    return ys.app.pad.R.layout.item_goods_collect_money;
                }
                break;
            }
            case -237232145: {
                if(tag.equals("layout/activity_login_0")) {
                    return ys.app.pad.R.layout.activity_login;
                }
                break;
            }
            case -1402518154: {
                if(tag.equals("layout/activity_modify_0")) {
                    return ys.app.pad.R.layout.activity_modify;
                }
                break;
            }
            case 1270241389: {
                if(tag.equals("layout/activity_inventory_records_detail_0")) {
                    return ys.app.pad.R.layout.activity_inventory_records_detail;
                }
                break;
            }
            case -468888431: {
                if(tag.equals("layout/item_appointment_main_0")) {
                    return ys.app.pad.R.layout.item_appointment_main;
                }
                break;
            }
            case -1014993086: {
                if(tag.equals("layout/item_vip_search_0")) {
                    return ys.app.pad.R.layout.item_vip_search;
                }
                break;
            }
            case -663042409: {
                if(tag.equals("layout/activity_service_detail_0")) {
                    return ys.app.pad.R.layout.activity_service_detail;
                }
                break;
            }
            case -27635610: {
                if(tag.equals("layout/item_inventory_record_detail_0")) {
                    return ys.app.pad.R.layout.item_inventory_record_detail;
                }
                break;
            }
            case 740983413: {
                if(tag.equals("layout/activity_achievement_0")) {
                    return ys.app.pad.R.layout.activity_achievement;
                }
                break;
            }
            case 775369366: {
                if(tag.equals("layout/activity_add_animal_0")) {
                    return ys.app.pad.R.layout.activity_add_animal;
                }
                break;
            }
            case 1403631707: {
                if(tag.equals("layout/activity_employee_performance_0")) {
                    return ys.app.pad.R.layout.activity_employee_performance;
                }
                break;
            }
            case 864600534: {
                if(tag.equals("layout/activity_goods_detail_0")) {
                    return ys.app.pad.R.layout.activity_goods_detail;
                }
                break;
            }
            case -1280195559: {
                if(tag.equals("layout/item_employee_list_0")) {
                    return ys.app.pad.R.layout.item_employee_list;
                }
                break;
            }
            case 595608707: {
                if(tag.equals("layout/activity_sale_0")) {
                    return ys.app.pad.R.layout.activity_sale;
                }
                break;
            }
            case 72246202: {
                if(tag.equals("layout/activity_num_card_list_0")) {
                    return ys.app.pad.R.layout.activity_num_card_list;
                }
                break;
            }
            case -2860825: {
                if(tag.equals("layout/item_employee_name_new_0")) {
                    return ys.app.pad.R.layout.item_employee_name_new;
                }
                break;
            }
            case -1706414633: {
                if(tag.equals("layout/activity_all_achievement_0")) {
                    return ys.app.pad.R.layout.activity_all_achievement;
                }
                break;
            }
            case -1206722449: {
                if(tag.equals("layout/activity_sand_qrcode_0")) {
                    return ys.app.pad.R.layout.activity_sand_qrcode;
                }
                break;
            }
            case -682188412: {
                if(tag.equals("layout/activity_add_inventory_0")) {
                    return ys.app.pad.R.layout.activity_add_inventory;
                }
                break;
            }
            case 4027519: {
                if(tag.equals("layout/item_layout_collect_money_navicat_0")) {
                    return ys.app.pad.R.layout.item_layout_collect_money_navicat;
                }
                break;
            }
            case 101625572: {
                if(tag.equals("layout/activity_search_0")) {
                    return ys.app.pad.R.layout.activity_search;
                }
                break;
            }
            case -160426722: {
                if(tag.equals("layout/item_good_type_in_vip_0")) {
                    return ys.app.pad.R.layout.item_good_type_in_vip;
                }
                break;
            }
            case 1802443534: {
                if(tag.equals("layout/activity_transaction_detail_0")) {
                    return ys.app.pad.R.layout.activity_transaction_detail;
                }
                break;
            }
            case -1889596073: {
                if(tag.equals("layout/item_num_card_service_0")) {
                    return ys.app.pad.R.layout.item_num_card_service;
                }
                break;
            }
            case 1818204840: {
                if(tag.equals("layout/activity_start_0")) {
                    return ys.app.pad.R.layout.activity_start;
                }
                break;
            }
            case -104477122: {
                if(tag.equals("layout/item_num_card_list_0")) {
                    return ys.app.pad.R.layout.item_num_card_list;
                }
                break;
            }
            case -859490438: {
                if(tag.equals("layout/dialog_customer_type_0")) {
                    return ys.app.pad.R.layout.dialog_customer_type;
                }
                break;
            }
            case 162736590: {
                if(tag.equals("layout/activity_check_0")) {
                    return ys.app.pad.R.layout.activity_check;
                }
                break;
            }
            case -1646113106: {
                if(tag.equals("layout/activity_pay_0")) {
                    return ys.app.pad.R.layout.activity_pay;
                }
                break;
            }
            case 1005541458: {
                if(tag.equals("layout/item_check_0")) {
                    return ys.app.pad.R.layout.item_check;
                }
                break;
            }
            case 1018757388: {
                if(tag.equals("layout/activity_about_us_0")) {
                    return ys.app.pad.R.layout.activity_about_us;
                }
                break;
            }
            case -1910386159: {
                if(tag.equals("layout/activity_shopping_pay_result_0")) {
                    return ys.app.pad.R.layout.activity_shopping_pay_result;
                }
                break;
            }
            case -1481406300: {
                if(tag.equals("layout/fragment_achieve_statis_child_0")) {
                    return ys.app.pad.R.layout.fragment_achieve_statis_child;
                }
                break;
            }
            case 1118456425: {
                if(tag.equals("layout/item_goods_search_0")) {
                    return ys.app.pad.R.layout.item_goods_search;
                }
                break;
            }
            case -1708065051: {
                if(tag.equals("layout/activity_personal_pay_0")) {
                    return ys.app.pad.R.layout.activity_personal_pay;
                }
                break;
            }
            case -807861627: {
                if(tag.equals("layout/activity_sand_pay_code_0")) {
                    return ys.app.pad.R.layout.activity_sand_pay_code;
                }
                break;
            }
            case 898485747: {
                if(tag.equals("layout/activity_manager_0")) {
                    return ys.app.pad.R.layout.activity_manager;
                }
                break;
            }
            case -1922693756: {
                if(tag.equals("layout/item_add_employee_0")) {
                    return ys.app.pad.R.layout.item_add_employee;
                }
                break;
            }
            case -1103472235: {
                if(tag.equals("layout/activity_employee_list_0")) {
                    return ys.app.pad.R.layout.activity_employee_list;
                }
                break;
            }
            case -46681878: {
                if(tag.equals("layout/item_vip_card_0")) {
                    return ys.app.pad.R.layout.item_vip_card;
                }
                break;
            }
            case 1421264389: {
                if(tag.equals("layout/item_out_put_inventory_0")) {
                    return ys.app.pad.R.layout.item_out_put_inventory;
                }
                break;
            }
            case 615978360: {
                if(tag.equals("layout/activity_all_staff_achievement_0")) {
                    return ys.app.pad.R.layout.activity_all_staff_achievement;
                }
                break;
            }
            case 2110690242: {
                if(tag.equals("layout/activity_commit_order_0")) {
                    return ys.app.pad.R.layout.activity_commit_order;
                }
                break;
            }
            case 649091312: {
                if(tag.equals("layout/activity_charge_0")) {
                    return ys.app.pad.R.layout.activity_charge;
                }
                break;
            }
            case -1225083852: {
                if(tag.equals("layout/item_animal_0")) {
                    return ys.app.pad.R.layout.item_animal;
                }
                break;
            }
            case 1718176069: {
                if(tag.equals("layout/activity_add_vip_0")) {
                    return ys.app.pad.R.layout.activity_add_vip;
                }
                break;
            }
            case -676344093: {
                if(tag.equals("layout/item_vice_order_list_0")) {
                    return ys.app.pad.R.layout.item_vice_order_list;
                }
                break;
            }
            case 344286434: {
                if(tag.equals("layout/activity_out_storage_detail_0")) {
                    return ys.app.pad.R.layout.activity_out_storage_detail;
                }
                break;
            }
            case -1334248043: {
                if(tag.equals("layout/activity_appointment_main_0")) {
                    return ys.app.pad.R.layout.activity_appointment_main;
                }
                break;
            }
            case 1249168989: {
                if(tag.equals("layout/activity_add_service_0")) {
                    return ys.app.pad.R.layout.activity_add_service;
                }
                break;
            }
            case 237577768: {
                if(tag.equals("layout/item_service_type_in_vip_0")) {
                    return ys.app.pad.R.layout.item_service_type_in_vip;
                }
                break;
            }
            case 1235131361: {
                if(tag.equals("layout/fragment_vip_consume_0")) {
                    return ys.app.pad.R.layout.fragment_vip_consume;
                }
                break;
            }
            case 140134480: {
                if(tag.equals("layout/activity_pay_result_0")) {
                    return ys.app.pad.R.layout.activity_pay_result;
                }
                break;
            }
            case 1865894925: {
                if(tag.equals("layout/fragment_vip_card_0")) {
                    return ys.app.pad.R.layout.fragment_vip_card;
                }
                break;
            }
            case 24541115: {
                if(tag.equals("layout/fragment_achievement_static_item_0")) {
                    return ys.app.pad.R.layout.fragment_achievement_static_item;
                }
                break;
            }
            case 695741924: {
                if(tag.equals("layout/item_vip_consume_0")) {
                    return ys.app.pad.R.layout.item_vip_consume;
                }
                break;
            }
            case 1871137954: {
                if(tag.equals("layout/fragment_normal_appointment_0")) {
                    return ys.app.pad.R.layout.fragment_normal_appointment;
                }
                break;
            }
            case 2042024424: {
                if(tag.equals("layout/item_transaction_0")) {
                    return ys.app.pad.R.layout.item_transaction;
                }
                break;
            }
            case -1281477620: {
                if(tag.equals("layout/item_inventory_record_0")) {
                    return ys.app.pad.R.layout.item_inventory_record;
                }
                break;
            }
            case -2127424027: {
                if(tag.equals("layout/activity_inventory_records_0")) {
                    return ys.app.pad.R.layout.activity_inventory_records;
                }
                break;
            }
            case 1643175038: {
                if(tag.equals("layout/activity_add_goods_0")) {
                    return ys.app.pad.R.layout.activity_add_goods;
                }
                break;
            }
            case 1182111852: {
                if(tag.equals("layout/activity_modify_service_0")) {
                    return ys.app.pad.R.layout.activity_modify_service;
                }
                break;
            }
            case -1772145012: {
                if(tag.equals("layout/item_goods_name_0")) {
                    return ys.app.pad.R.layout.item_goods_name;
                }
                break;
            }
            case 1860025937: {
                if(tag.equals("layout/item_paymethod_statistics_0")) {
                    return ys.app.pad.R.layout.item_paymethod_statistics;
                }
                break;
            }
            case 171778073: {
                if(tag.equals("layout/fragment_achievement_static_0")) {
                    return ys.app.pad.R.layout.fragment_achievement_static;
                }
                break;
            }
            case -1855242268: {
                if(tag.equals("layout/fragment_vip_recharge_0")) {
                    return ys.app.pad.R.layout.fragment_vip_recharge;
                }
                break;
            }
            case 1282192932: {
                if(tag.equals("layout/item_vip_pet_child_0")) {
                    return ys.app.pad.R.layout.item_vip_pet_child;
                }
                break;
            }
            case 782193446: {
                if(tag.equals("layout/item_inventory_0")) {
                    return ys.app.pad.R.layout.item_inventory;
                }
                break;
            }
            case -143160373: {
                if(tag.equals("layout/activity_modify_psw_0")) {
                    return ys.app.pad.R.layout.activity_modify_psw;
                }
                break;
            }
            case -1396445631: {
                if(tag.equals("layout/item_vip_recharge_0")) {
                    return ys.app.pad.R.layout.item_vip_recharge;
                }
                break;
            }
            case -1721903185: {
                if(tag.equals("layout/activity_vip_detail_0")) {
                    return ys.app.pad.R.layout.activity_vip_detail;
                }
                break;
            }
            case -1987995178: {
                if(tag.equals("layout/item_search_service_0")) {
                    return ys.app.pad.R.layout.item_search_service;
                }
                break;
            }
            case 1207458919: {
                if(tag.equals("layout/item_vip_0")) {
                    return ys.app.pad.R.layout.item_vip;
                }
                break;
            }
            case 189375242: {
                if(tag.equals("layout/item_transaction_detail_0")) {
                    return ys.app.pad.R.layout.item_transaction_detail;
                }
                break;
            }
            case 1730213593: {
                if(tag.equals("layout/activity_allot_record_list_0")) {
                    return ys.app.pad.R.layout.activity_allot_record_list;
                }
                break;
            }
            case -618030188: {
                if(tag.equals("layout/activity_allot_shop_list_0")) {
                    return ys.app.pad.R.layout.activity_allot_shop_list;
                }
                break;
            }
            case 196535492: {
                if(tag.equals("layout/fragment_vip_appointment_0")) {
                    return ys.app.pad.R.layout.fragment_vip_appointment;
                }
                break;
            }
            case 332307950: {
                if(tag.equals("layout/activity_vip_card_0")) {
                    return ys.app.pad.R.layout.activity_vip_card;
                }
                break;
            }
            case 1873129585: {
                if(tag.equals("layout/activity_collect_money_0")) {
                    return ys.app.pad.R.layout.activity_collect_money;
                }
                break;
            }
            case 1962332296: {
                if(tag.equals("layout/activity_add_employee_0")) {
                    return ys.app.pad.R.layout.activity_add_employee;
                }
                break;
            }
            case -2068280089: {
                if(tag.equals("layout/activity_forget_pwd_0")) {
                    return ys.app.pad.R.layout.activity_forget_pwd;
                }
                break;
            }
            case 357409030: {
                if(tag.equals("layout/activity_achievement_statistic_0")) {
                    return ys.app.pad.R.layout.activity_achievement_statistic;
                }
                break;
            }
            case -270986679: {
                if(tag.equals("layout/activity_edit_employee_0")) {
                    return ys.app.pad.R.layout.activity_edit_employee;
                }
                break;
            }
            case 470265632: {
                if(tag.equals("layout/item_goods_0")) {
                    return ys.app.pad.R.layout.item_goods;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return ys.app.pad.R.layout.activity_main;
                }
                break;
            }
            case 1856642321: {
                if(tag.equals("layout/activity_pay_list_0")) {
                    return ys.app.pad.R.layout.activity_pay_list;
                }
                break;
            }
            case 1333339251: {
                if(tag.equals("layout/load_foot_view_0")) {
                    return ys.app.pad.R.layout.load_foot_view;
                }
                break;
            }
            case 729099183: {
                if(tag.equals("layout/activity_vip_record_0")) {
                    return ys.app.pad.R.layout.activity_vip_record;
                }
                break;
            }
            case -1817742865: {
                if(tag.equals("layout/activity_take_out_inventory_0")) {
                    return ys.app.pad.R.layout.activity_take_out_inventory;
                }
                break;
            }
            case -1705139623: {
                if(tag.equals("layout/fragment_appointment_list_0")) {
                    return ys.app.pad.R.layout.fragment_appointment_list;
                }
                break;
            }
            case -372539236: {
                if(tag.equals("layout/activity_goods_0")) {
                    return ys.app.pad.R.layout.activity_goods;
                }
                break;
            }
            case -635338625: {
                if(tag.equals("layout/item_service_0")) {
                    return ys.app.pad.R.layout.item_service;
                }
                break;
            }
            case 690076538: {
                if(tag.equals("layout/fragment_out_put_list_0")) {
                    return ys.app.pad.R.layout.fragment_out_put_list;
                }
                break;
            }
            case 1096280310: {
                if(tag.equals("layout/item_allot_manage_0")) {
                    return ys.app.pad.R.layout.item_allot_manage;
                }
                break;
            }
            case 407935981: {
                if(tag.equals("layout/activity_num_card_detail_0")) {
                    return ys.app.pad.R.layout.activity_num_card_detail;
                }
                break;
            }
            case -1071079831: {
                if(tag.equals("layout/item_inventory_records_0")) {
                    return ys.app.pad.R.layout.item_inventory_records;
                }
                break;
            }
            case -1770245577: {
                if(tag.equals("layout/item_search_goods_0")) {
                    return ys.app.pad.R.layout.item_search_goods;
                }
                break;
            }
            case -1778101475: {
                if(tag.equals("layout/item_employee_shop_car_goods_0")) {
                    return ys.app.pad.R.layout.item_employee_shop_car_goods;
                }
                break;
            }
            case 1178002171: {
                if(tag.equals("layout/activity_service_0")) {
                    return ys.app.pad.R.layout.activity_service;
                }
                break;
            }
            case 1462513257: {
                if(tag.equals("layout/item_appointment_0")) {
                    return ys.app.pad.R.layout.item_appointment;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"barCode"
            ,"costAmt"
            ,"dataBean"
            ,"discount"
            ,"expand"
            ,"footType"
            ,"id"
            ,"imgpath"
            ,"info"
            ,"inventoryNum"
            ,"isClick"
            ,"isPromotion"
            ,"itemViewModel"
            ,"mInfo"
            ,"mainViewModel"
            ,"model"
            ,"name"
            ,"nameArray"
            ,"payDate"
            ,"payWay"
            ,"price"
            ,"realAmt"
            ,"rechargeAmt"
            ,"state"
            ,"stockNum"
            ,"type"
            ,"typeName"
            ,"unit"
            ,"userId"
            ,"userName"
            ,"viewModel"
            ,"vipAmt"};
    }
}