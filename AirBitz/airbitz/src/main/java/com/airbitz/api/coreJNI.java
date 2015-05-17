/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.airbitz.api;

public class coreJNI {
  public final static native long new_intp();
  public final static native long copy_intp(int jarg1);
  public final static native void delete_intp(long jarg1);
  public final static native void intp_assign(long jarg1, int jarg2);
  public final static native int intp_value(long jarg1);
  public final static native long new_longp();
  public final static native long copy_longp(int jarg1);
  public final static native void delete_longp(long jarg1);
  public final static native void longp_assign(long jarg1, int jarg2);
  public final static native int longp_value(long jarg1);
  public final static native long new_int64_tp();
  public final static native long copy_int64_tp(long jarg1);
  public final static native void delete_int64_tp(long jarg1);
  public final static native void int64_tp_assign(long jarg1, long jarg2);
  public final static native long int64_tp_value(long jarg1);
  public final static native long new_uint64_tp();
  public final static native long copy_uint64_tp(long jarg1);
  public final static native void delete_uint64_tp(long jarg1);
  public final static native void uint64_tp_assign(long jarg1, long jarg2);
  public final static native long uint64_tp_value(long jarg1);
  public final static native long new_doublep();
  public final static native long copy_doublep(double jarg1);
  public final static native void delete_doublep(long jarg1);
  public final static native void doublep_assign(long jarg1, double jarg2);
  public final static native double doublep_value(long jarg1);
  public final static native int ABC_MAX_STRING_LENGTH_get();
  public final static native int ABC_BITCOIN_DECIMAL_PLACES_get();
  public final static native int ABC_EXCHANGE_RATE_REFRESH_INTERVAL_SECONDS_get();
  public final static native int ABC_DENOMINATION_BTC_get();
  public final static native int ABC_DENOMINATION_MBTC_get();
  public final static native int ABC_DENOMINATION_UBTC_get();
  public final static native String ABC_VERSION_get();
  public final static native int ABC_MIN_USERNAME_LENGTH_get();
  public final static native int ABC_MIN_PASS_LENGTH_get();
  public final static native int ABC_MIN_PIN_LENGTH_get();
  public final static native int ABC_GET_TX_ALL_TIMES_get();
  public final static native int ABC_CC_Ok_get();
  public final static native int ABC_CC_Error_get();
  public final static native int ABC_CC_NULLPtr_get();
  public final static native int ABC_CC_NoAvailAccountSpace_get();
  public final static native int ABC_CC_DirReadError_get();
  public final static native int ABC_CC_FileOpenError_get();
  public final static native int ABC_CC_FileReadError_get();
  public final static native int ABC_CC_FileWriteError_get();
  public final static native int ABC_CC_FileDoesNotExist_get();
  public final static native int ABC_CC_UnknownCryptoType_get();
  public final static native int ABC_CC_InvalidCryptoType_get();
  public final static native int ABC_CC_DecryptError_get();
  public final static native int ABC_CC_DecryptFailure_get();
  public final static native int ABC_CC_EncryptError_get();
  public final static native int ABC_CC_ScryptError_get();
  public final static native int ABC_CC_AccountAlreadyExists_get();
  public final static native int ABC_CC_AccountDoesNotExist_get();
  public final static native int ABC_CC_JSONError_get();
  public final static native int ABC_CC_BadPassword_get();
  public final static native int ABC_CC_WalletAlreadyExists_get();
  public final static native int ABC_CC_URLError_get();
  public final static native int ABC_CC_SysError_get();
  public final static native int ABC_CC_NotInitialized_get();
  public final static native int ABC_CC_Reinitialization_get();
  public final static native int ABC_CC_ServerError_get();
  public final static native int ABC_CC_NoRecoveryQuestions_get();
  public final static native int ABC_CC_NotSupported_get();
  public final static native int ABC_CC_MutexError_get();
  public final static native int ABC_CC_NoTransaction_get();
  public final static native int ABC_CC_ParseError_get();
  public final static native int ABC_CC_InvalidWalletID_get();
  public final static native int ABC_CC_NoRequest_get();
  public final static native int ABC_CC_InsufficientFunds_get();
  public final static native int ABC_CC_Synchronizing_get();
  public final static native int ABC_CC_NonNumericPin_get();
  public final static native int ABC_CC_NoAvailableAddress_get();
  public final static native int ABC_CC_InvalidPinWait_get();
  public final static native int ABC_CC_PinExpired_get();
  public final static native int ABC_CC_InvalidOTP_get();
  public final static native int ABC_CC_Obsolete_get();
  public final static native void tABC_Error_code_set(long jarg1, tABC_Error jarg1_, int jarg2);
  public final static native int tABC_Error_code_get(long jarg1, tABC_Error jarg1_);
  public final static native void tABC_Error_szDescription_set(long jarg1, tABC_Error jarg1_, String jarg2);
  public final static native String tABC_Error_szDescription_get(long jarg1, tABC_Error jarg1_);
  public final static native void tABC_Error_szSourceFunc_set(long jarg1, tABC_Error jarg1_, String jarg2);
  public final static native String tABC_Error_szSourceFunc_get(long jarg1, tABC_Error jarg1_);
  public final static native void tABC_Error_szSourceFile_set(long jarg1, tABC_Error jarg1_, String jarg2);
  public final static native String tABC_Error_szSourceFile_get(long jarg1, tABC_Error jarg1_);
  public final static native void tABC_Error_nSourceLine_set(long jarg1, tABC_Error jarg1_, int jarg2);
  public final static native int tABC_Error_nSourceLine_get(long jarg1, tABC_Error jarg1_);
  public final static native long new_tABC_Error();
  public final static native void delete_tABC_Error(long jarg1);
  public final static native void tABC_AsyncBitCoinInfo_pData_set(long jarg1, tABC_AsyncBitCoinInfo jarg1_, long jarg2);
  public final static native long tABC_AsyncBitCoinInfo_pData_get(long jarg1, tABC_AsyncBitCoinInfo jarg1_);
  public final static native void tABC_AsyncBitCoinInfo_eventType_set(long jarg1, tABC_AsyncBitCoinInfo jarg1_, int jarg2);
  public final static native int tABC_AsyncBitCoinInfo_eventType_get(long jarg1, tABC_AsyncBitCoinInfo jarg1_);
  public final static native void tABC_AsyncBitCoinInfo_status_set(long jarg1, tABC_AsyncBitCoinInfo jarg1_, long jarg2, tABC_Error jarg2_);
  public final static native long tABC_AsyncBitCoinInfo_status_get(long jarg1, tABC_AsyncBitCoinInfo jarg1_);
  public final static native void tABC_AsyncBitCoinInfo_szWalletUUID_set(long jarg1, tABC_AsyncBitCoinInfo jarg1_, String jarg2);
  public final static native String tABC_AsyncBitCoinInfo_szWalletUUID_get(long jarg1, tABC_AsyncBitCoinInfo jarg1_);
  public final static native void tABC_AsyncBitCoinInfo_szTxID_set(long jarg1, tABC_AsyncBitCoinInfo jarg1_, String jarg2);
  public final static native String tABC_AsyncBitCoinInfo_szTxID_get(long jarg1, tABC_AsyncBitCoinInfo jarg1_);
  public final static native void tABC_AsyncBitCoinInfo_szDescription_set(long jarg1, tABC_AsyncBitCoinInfo jarg1_, String jarg2);
  public final static native String tABC_AsyncBitCoinInfo_szDescription_get(long jarg1, tABC_AsyncBitCoinInfo jarg1_);
  public final static native void tABC_AsyncBitCoinInfo_sweepSatoshi_set(long jarg1, tABC_AsyncBitCoinInfo jarg1_, long jarg2);
  public final static native long tABC_AsyncBitCoinInfo_sweepSatoshi_get(long jarg1, tABC_AsyncBitCoinInfo jarg1_);
  public final static native long new_tABC_AsyncBitCoinInfo();
  public final static native void delete_tABC_AsyncBitCoinInfo(long jarg1);
  public final static native void tABC_Currency_szCode_set(long jarg1, tABC_Currency jarg1_, String jarg2);
  public final static native String tABC_Currency_szCode_get(long jarg1, tABC_Currency jarg1_);
  public final static native void tABC_Currency_num_set(long jarg1, tABC_Currency jarg1_, int jarg2);
  public final static native int tABC_Currency_num_get(long jarg1, tABC_Currency jarg1_);
  public final static native void tABC_Currency_szDescription_set(long jarg1, tABC_Currency jarg1_, String jarg2);
  public final static native String tABC_Currency_szDescription_get(long jarg1, tABC_Currency jarg1_);
  public final static native void tABC_Currency_szCountries_set(long jarg1, tABC_Currency jarg1_, String jarg2);
  public final static native String tABC_Currency_szCountries_get(long jarg1, tABC_Currency jarg1_);
  public final static native long new_tABC_Currency();
  public final static native void delete_tABC_Currency(long jarg1);
  public final static native void tABC_WalletInfo_szUUID_set(long jarg1, tABC_WalletInfo jarg1_, String jarg2);
  public final static native String tABC_WalletInfo_szUUID_get(long jarg1, tABC_WalletInfo jarg1_);
  public final static native void tABC_WalletInfo_szName_set(long jarg1, tABC_WalletInfo jarg1_, String jarg2);
  public final static native String tABC_WalletInfo_szName_get(long jarg1, tABC_WalletInfo jarg1_);
  public final static native void tABC_WalletInfo_currencyNum_set(long jarg1, tABC_WalletInfo jarg1_, int jarg2);
  public final static native int tABC_WalletInfo_currencyNum_get(long jarg1, tABC_WalletInfo jarg1_);
  public final static native void tABC_WalletInfo_archived_set(long jarg1, tABC_WalletInfo jarg1_, long jarg2);
  public final static native long tABC_WalletInfo_archived_get(long jarg1, tABC_WalletInfo jarg1_);
  public final static native void tABC_WalletInfo_balanceSatoshi_set(long jarg1, tABC_WalletInfo jarg1_, long jarg2);
  public final static native long tABC_WalletInfo_balanceSatoshi_get(long jarg1, tABC_WalletInfo jarg1_);
  public final static native long new_tABC_WalletInfo();
  public final static native void delete_tABC_WalletInfo(long jarg1);
  public final static native void tABC_QuestionChoice_szQuestion_set(long jarg1, tABC_QuestionChoice jarg1_, String jarg2);
  public final static native String tABC_QuestionChoice_szQuestion_get(long jarg1, tABC_QuestionChoice jarg1_);
  public final static native void tABC_QuestionChoice_szCategory_set(long jarg1, tABC_QuestionChoice jarg1_, String jarg2);
  public final static native String tABC_QuestionChoice_szCategory_get(long jarg1, tABC_QuestionChoice jarg1_);
  public final static native void tABC_QuestionChoice_minAnswerLength_set(long jarg1, tABC_QuestionChoice jarg1_, long jarg2);
  public final static native long tABC_QuestionChoice_minAnswerLength_get(long jarg1, tABC_QuestionChoice jarg1_);
  public final static native long new_tABC_QuestionChoice();
  public final static native void delete_tABC_QuestionChoice(long jarg1);
  public final static native void tABC_QuestionChoices_numChoices_set(long jarg1, tABC_QuestionChoices jarg1_, long jarg2);
  public final static native long tABC_QuestionChoices_numChoices_get(long jarg1, tABC_QuestionChoices jarg1_);
  public final static native void tABC_QuestionChoices_aChoices_set(long jarg1, tABC_QuestionChoices jarg1_, long jarg2);
  public final static native long tABC_QuestionChoices_aChoices_get(long jarg1, tABC_QuestionChoices jarg1_);
  public final static native long new_tABC_QuestionChoices();
  public final static native void delete_tABC_QuestionChoices(long jarg1);
  public final static native void tABC_TxDetails_amountSatoshi_set(long jarg1, tABC_TxDetails jarg1_, long jarg2);
  public final static native long tABC_TxDetails_amountSatoshi_get(long jarg1, tABC_TxDetails jarg1_);
  public final static native void tABC_TxDetails_amountFeesAirbitzSatoshi_set(long jarg1, tABC_TxDetails jarg1_, long jarg2);
  public final static native long tABC_TxDetails_amountFeesAirbitzSatoshi_get(long jarg1, tABC_TxDetails jarg1_);
  public final static native void tABC_TxDetails_amountFeesMinersSatoshi_set(long jarg1, tABC_TxDetails jarg1_, long jarg2);
  public final static native long tABC_TxDetails_amountFeesMinersSatoshi_get(long jarg1, tABC_TxDetails jarg1_);
  public final static native void tABC_TxDetails_szLogin_set(long jarg1, tABC_TxDetails jarg1_, String jarg2);
  public final static native String tABC_TxDetails_szLogin_get(long jarg1, tABC_TxDetails jarg1_);
  public final static native void tABC_TxDetails_amountCurrency_set(long jarg1, tABC_TxDetails jarg1_, double jarg2);
  public final static native double tABC_TxDetails_amountCurrency_get(long jarg1, tABC_TxDetails jarg1_);
  public final static native void tABC_TxDetails_szName_set(long jarg1, tABC_TxDetails jarg1_, String jarg2);
  public final static native String tABC_TxDetails_szName_get(long jarg1, tABC_TxDetails jarg1_);
  public final static native void tABC_TxDetails_bizId_set(long jarg1, tABC_TxDetails jarg1_, long jarg2);
  public final static native long tABC_TxDetails_bizId_get(long jarg1, tABC_TxDetails jarg1_);
  public final static native void tABC_TxDetails_szCategory_set(long jarg1, tABC_TxDetails jarg1_, String jarg2);
  public final static native String tABC_TxDetails_szCategory_get(long jarg1, tABC_TxDetails jarg1_);
  public final static native void tABC_TxDetails_szNotes_set(long jarg1, tABC_TxDetails jarg1_, String jarg2);
  public final static native String tABC_TxDetails_szNotes_get(long jarg1, tABC_TxDetails jarg1_);
  public final static native void tABC_TxDetails_attributes_set(long jarg1, tABC_TxDetails jarg1_, long jarg2);
  public final static native long tABC_TxDetails_attributes_get(long jarg1, tABC_TxDetails jarg1_);
  public final static native long new_tABC_TxDetails();
  public final static native void delete_tABC_TxDetails(long jarg1);
  public final static native void tABC_TxOutput_input_set(long jarg1, tABC_TxOutput jarg1_, boolean jarg2);
  public final static native boolean tABC_TxOutput_input_get(long jarg1, tABC_TxOutput jarg1_);
  public final static native void tABC_TxOutput_value_set(long jarg1, tABC_TxOutput jarg1_, long jarg2);
  public final static native long tABC_TxOutput_value_get(long jarg1, tABC_TxOutput jarg1_);
  public final static native void tABC_TxOutput_szAddress_set(long jarg1, tABC_TxOutput jarg1_, String jarg2);
  public final static native String tABC_TxOutput_szAddress_get(long jarg1, tABC_TxOutput jarg1_);
  public final static native void tABC_TxOutput_szTxId_set(long jarg1, tABC_TxOutput jarg1_, String jarg2);
  public final static native String tABC_TxOutput_szTxId_get(long jarg1, tABC_TxOutput jarg1_);
  public final static native void tABC_TxOutput_index_set(long jarg1, tABC_TxOutput jarg1_, long jarg2);
  public final static native long tABC_TxOutput_index_get(long jarg1, tABC_TxOutput jarg1_);
  public final static native long new_tABC_TxOutput();
  public final static native void delete_tABC_TxOutput(long jarg1);
  public final static native void tABC_TxInfo_szID_set(long jarg1, tABC_TxInfo jarg1_, String jarg2);
  public final static native String tABC_TxInfo_szID_get(long jarg1, tABC_TxInfo jarg1_);
  public final static native void tABC_TxInfo_szMalleableTxId_set(long jarg1, tABC_TxInfo jarg1_, String jarg2);
  public final static native String tABC_TxInfo_szMalleableTxId_get(long jarg1, tABC_TxInfo jarg1_);
  public final static native void tABC_TxInfo_timeCreation_set(long jarg1, tABC_TxInfo jarg1_, long jarg2);
  public final static native long tABC_TxInfo_timeCreation_get(long jarg1, tABC_TxInfo jarg1_);
  public final static native void tABC_TxInfo_countOutputs_set(long jarg1, tABC_TxInfo jarg1_, long jarg2);
  public final static native long tABC_TxInfo_countOutputs_get(long jarg1, tABC_TxInfo jarg1_);
  public final static native void tABC_TxInfo_aOutputs_set(long jarg1, tABC_TxInfo jarg1_, long jarg2);
  public final static native long tABC_TxInfo_aOutputs_get(long jarg1, tABC_TxInfo jarg1_);
  public final static native void tABC_TxInfo_pDetails_set(long jarg1, tABC_TxInfo jarg1_, long jarg2, tABC_TxDetails jarg2_);
  public final static native long tABC_TxInfo_pDetails_get(long jarg1, tABC_TxInfo jarg1_);
  public final static native long new_tABC_TxInfo();
  public final static native void delete_tABC_TxInfo(long jarg1);
  public final static native void tABC_PasswordRule_szDescription_set(long jarg1, tABC_PasswordRule jarg1_, String jarg2);
  public final static native String tABC_PasswordRule_szDescription_get(long jarg1, tABC_PasswordRule jarg1_);
  public final static native void tABC_PasswordRule_bPassed_set(long jarg1, tABC_PasswordRule jarg1_, boolean jarg2);
  public final static native boolean tABC_PasswordRule_bPassed_get(long jarg1, tABC_PasswordRule jarg1_);
  public final static native long new_tABC_PasswordRule();
  public final static native void delete_tABC_PasswordRule(long jarg1);
  public final static native void tABC_RequestInfo_szID_set(long jarg1, tABC_RequestInfo jarg1_, String jarg2);
  public final static native String tABC_RequestInfo_szID_get(long jarg1, tABC_RequestInfo jarg1_);
  public final static native void tABC_RequestInfo_timeCreation_set(long jarg1, tABC_RequestInfo jarg1_, long jarg2);
  public final static native long tABC_RequestInfo_timeCreation_get(long jarg1, tABC_RequestInfo jarg1_);
  public final static native void tABC_RequestInfo_pDetails_set(long jarg1, tABC_RequestInfo jarg1_, long jarg2, tABC_TxDetails jarg2_);
  public final static native long tABC_RequestInfo_pDetails_get(long jarg1, tABC_RequestInfo jarg1_);
  public final static native void tABC_RequestInfo_amountSatoshi_set(long jarg1, tABC_RequestInfo jarg1_, long jarg2);
  public final static native long tABC_RequestInfo_amountSatoshi_get(long jarg1, tABC_RequestInfo jarg1_);
  public final static native void tABC_RequestInfo_owedSatoshi_set(long jarg1, tABC_RequestInfo jarg1_, long jarg2);
  public final static native long tABC_RequestInfo_owedSatoshi_get(long jarg1, tABC_RequestInfo jarg1_);
  public final static native long new_tABC_RequestInfo();
  public final static native void delete_tABC_RequestInfo(long jarg1);
  public final static native void tABC_SpendTarget_amount_set(long jarg1, tABC_SpendTarget jarg1_, long jarg2);
  public final static native long tABC_SpendTarget_amount_get(long jarg1, tABC_SpendTarget jarg1_);
  public final static native void tABC_SpendTarget_amountMutable_set(long jarg1, tABC_SpendTarget jarg1_, boolean jarg2);
  public final static native boolean tABC_SpendTarget_amountMutable_get(long jarg1, tABC_SpendTarget jarg1_);
  public final static native void tABC_SpendTarget_szName_set(long jarg1, tABC_SpendTarget jarg1_, String jarg2);
  public final static native String tABC_SpendTarget_szName_get(long jarg1, tABC_SpendTarget jarg1_);
  public final static native void tABC_SpendTarget_szRet_set(long jarg1, tABC_SpendTarget jarg1_, String jarg2);
  public final static native String tABC_SpendTarget_szRet_get(long jarg1, tABC_SpendTarget jarg1_);
  public final static native void tABC_SpendTarget_szDestUUID_set(long jarg1, tABC_SpendTarget jarg1_, String jarg2);
  public final static native String tABC_SpendTarget_szDestUUID_get(long jarg1, tABC_SpendTarget jarg1_);
  public final static native void tABC_SpendTarget_pData_set(long jarg1, tABC_SpendTarget jarg1_, long jarg2);
  public final static native long tABC_SpendTarget_pData_get(long jarg1, tABC_SpendTarget jarg1_);
  public final static native long new_tABC_SpendTarget();
  public final static native void delete_tABC_SpendTarget(long jarg1);
  public final static native void tABC_BitcoinDenomination_denominationType_set(long jarg1, tABC_BitcoinDenomination jarg1_, int jarg2);
  public final static native int tABC_BitcoinDenomination_denominationType_get(long jarg1, tABC_BitcoinDenomination jarg1_);
  public final static native void tABC_BitcoinDenomination_satoshi_set(long jarg1, tABC_BitcoinDenomination jarg1_, long jarg2);
  public final static native long tABC_BitcoinDenomination_satoshi_get(long jarg1, tABC_BitcoinDenomination jarg1_);
  public final static native long new_tABC_BitcoinDenomination();
  public final static native void delete_tABC_BitcoinDenomination(long jarg1);
  public final static native void tABC_AccountSettings_szFirstName_set(long jarg1, tABC_AccountSettings jarg1_, String jarg2);
  public final static native String tABC_AccountSettings_szFirstName_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_szLastName_set(long jarg1, tABC_AccountSettings jarg1_, String jarg2);
  public final static native String tABC_AccountSettings_szLastName_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_szNickname_set(long jarg1, tABC_AccountSettings jarg1_, String jarg2);
  public final static native String tABC_AccountSettings_szNickname_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_szPIN_set(long jarg1, tABC_AccountSettings jarg1_, String jarg2);
  public final static native String tABC_AccountSettings_szPIN_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_bNameOnPayments_set(long jarg1, tABC_AccountSettings jarg1_, boolean jarg2);
  public final static native boolean tABC_AccountSettings_bNameOnPayments_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_minutesAutoLogout_set(long jarg1, tABC_AccountSettings jarg1_, int jarg2);
  public final static native int tABC_AccountSettings_minutesAutoLogout_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_recoveryReminderCount_set(long jarg1, tABC_AccountSettings jarg1_, int jarg2);
  public final static native int tABC_AccountSettings_recoveryReminderCount_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_szLanguage_set(long jarg1, tABC_AccountSettings jarg1_, String jarg2);
  public final static native String tABC_AccountSettings_szLanguage_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_currencyNum_set(long jarg1, tABC_AccountSettings jarg1_, int jarg2);
  public final static native int tABC_AccountSettings_currencyNum_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_szExchangeRateSource_set(long jarg1, tABC_AccountSettings jarg1_, String jarg2);
  public final static native String tABC_AccountSettings_szExchangeRateSource_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_bitcoinDenomination_set(long jarg1, tABC_AccountSettings jarg1_, long jarg2, tABC_BitcoinDenomination jarg2_);
  public final static native long tABC_AccountSettings_bitcoinDenomination_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_bAdvancedFeatures_set(long jarg1, tABC_AccountSettings jarg1_, boolean jarg2);
  public final static native boolean tABC_AccountSettings_bAdvancedFeatures_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_szFullName_set(long jarg1, tABC_AccountSettings jarg1_, String jarg2);
  public final static native String tABC_AccountSettings_szFullName_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_bDailySpendLimit_set(long jarg1, tABC_AccountSettings jarg1_, boolean jarg2);
  public final static native boolean tABC_AccountSettings_bDailySpendLimit_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_dailySpendLimitSatoshis_set(long jarg1, tABC_AccountSettings jarg1_, long jarg2);
  public final static native long tABC_AccountSettings_dailySpendLimitSatoshis_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_bSpendRequirePin_set(long jarg1, tABC_AccountSettings jarg1_, boolean jarg2);
  public final static native boolean tABC_AccountSettings_bSpendRequirePin_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_spendRequirePinSatoshis_set(long jarg1, tABC_AccountSettings jarg1_, long jarg2);
  public final static native long tABC_AccountSettings_spendRequirePinSatoshis_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_bDisablePINLogin_set(long jarg1, tABC_AccountSettings jarg1_, boolean jarg2);
  public final static native boolean tABC_AccountSettings_bDisablePINLogin_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native void tABC_AccountSettings_pinLoginCount_set(long jarg1, tABC_AccountSettings jarg1_, int jarg2);
  public final static native int tABC_AccountSettings_pinLoginCount_get(long jarg1, tABC_AccountSettings jarg1_);
  public final static native long new_tABC_AccountSettings();
  public final static native void delete_tABC_AccountSettings(long jarg1);
  public final static native int ABC_Initialize(String jarg1, String jarg2, String jarg3, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native void ABC_Terminate();
  public final static native int ABC_Version(long jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_IsTestNet(long jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_ClearKeyCache(long jarg1, tABC_Error jarg1_);
  public final static native int ABC_GeneralInfoUpdate(long jarg1, tABC_Error jarg1_);
  public final static native int ABC_GetCurrencies(long jarg1, long jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_GetQuestionChoices(long jarg1, long jarg2, tABC_Error jarg2_);
  public final static native void ABC_FreeQuestionChoices(long jarg1, tABC_QuestionChoices jarg1_);
  public final static native int ABC_ParseAmount(String jarg1, long jarg2, long jarg3);
  public final static native int ABC_FormatAmount(long jarg1, long jarg2, long jarg3, boolean jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_CheckPassword(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native void ABC_FreePasswordRuleArray(long jarg1, long jarg2);
  public final static native int ABC_QrEncode(String jarg1, long jarg2, long jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_SignIn(String jarg1, String jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_AccountAvailable(String jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_CreateAccount(String jarg1, String jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_AccountDelete(String jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_GetRecoveryQuestions(String jarg1, long jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_CheckRecoveryAnswers(String jarg1, String jarg2, long jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_PinLoginExists(String jarg1, long jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_PinLoginDelete(String jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_PinLogin(String jarg1, String jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_PinSetup(String jarg1, String jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_ListAccounts(long jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_ChangePassword(String jarg1, String jarg2, String jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_ChangePasswordWithRecoveryAnswers(String jarg1, String jarg2, String jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_SetAccountRecoveryQuestions(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_PasswordOk(String jarg1, String jarg2, long jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_PasswordExists(String jarg1, long jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_OtpKeyGet(String jarg1, long jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_OtpKeySet(String jarg1, String jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_OtpKeyRemove(String jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_OtpAuthGet(String jarg1, String jarg2, long jarg3, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_OtpAuthSet(String jarg1, String jarg2, int jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_OtpAuthRemove(String jarg1, String jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_OtpResetGet(long jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_OtpResetDate(long jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_OtpResetSet(String jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_OtpResetRemove(String jarg1, String jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_LoadAccountSettings(String jarg1, String jarg2, long jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_UpdateAccountSettings(String jarg1, String jarg2, long jarg3, tABC_AccountSettings jarg3_, long jarg4, tABC_Error jarg4_);
  public final static native void ABC_FreeAccountSettings(long jarg1, tABC_AccountSettings jarg1_);
  public final static native int ABC_GetPIN(String jarg1, String jarg2, long jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_SetPIN(String jarg1, String jarg2, String jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_GetCategories(String jarg1, String jarg2, long jarg3, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_AddCategory(String jarg1, String jarg2, String jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_RemoveCategory(String jarg1, String jarg2, String jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_DataSyncAccount(String jarg1, String jarg2, long jarg3, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_UploadLogs(String jarg1, String jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_PluginDataGet(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, long jarg6, tABC_Error jarg6_);
  public final static native int ABC_PluginDataSet(String jarg1, String jarg2, String jarg3, String jarg4, String jarg5, long jarg6, tABC_Error jarg6_);
  public final static native int ABC_PluginDataRemove(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_PluginDataClear(String jarg1, String jarg2, String jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_RequestExchangeRateUpdate(String jarg1, String jarg2, int jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_SatoshiToCurrency(String jarg1, String jarg2, long jarg3, long jarg4, int jarg5, long jarg6, tABC_Error jarg6_);
  public final static native int ABC_CurrencyToSatoshi(String jarg1, String jarg2, double jarg3, int jarg4, long jarg5, long jarg6, tABC_Error jarg6_);
  public final static native int ABC_CreateWallet(String jarg1, String jarg2, String jarg3, int jarg4, long jarg5, long jarg6, tABC_Error jarg6_);
  public final static native int ABC_GetWalletUUIDs(String jarg1, String jarg2, long jarg3, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_GetWallets(String jarg1, String jarg2, long jarg3, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native void ABC_FreeWalletInfoArray(long jarg1, long jarg2);
  public final static native int ABC_SetWalletOrder(String jarg1, String jarg2, String jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_RenameWallet(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_SetWalletArchived(String jarg1, String jarg2, String jarg3, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_GetWalletInfo(String jarg1, String jarg2, String jarg3, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native void ABC_FreeWalletInfo(long jarg1, tABC_WalletInfo jarg1_);
  public final static native int ABC_ExportWalletSeed(String jarg1, String jarg2, String jarg3, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_CsvExport(String jarg1, String jarg2, String jarg3, long jarg4, long jarg5, long jarg6, long jarg7, tABC_Error jarg7_);
  public final static native int ABC_DataSyncWallet(String jarg1, String jarg2, String jarg3, long jarg4, long jarg5, long jarg6, tABC_Error jarg6_);
  public final static native int ABC_CreateReceiveRequest(String jarg1, String jarg2, String jarg3, long jarg4, tABC_TxDetails jarg4_, long jarg5, long jarg6, tABC_Error jarg6_);
  public final static native int ABC_ModifyReceiveRequest(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, tABC_TxDetails jarg5_, long jarg6, tABC_Error jarg6_);
  public final static native int ABC_FinalizeReceiveRequest(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_CancelReceiveRequest(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_GenerateRequestQRCode(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, long jarg6, long jarg7, long jarg8, tABC_Error jarg8_);
  public final static native int ABC_GetRequestAddress(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, long jarg6, tABC_Error jarg6_);
  public final static native int ABC_GetPendingRequests(String jarg1, String jarg2, String jarg3, long jarg4, long jarg5, long jarg6, tABC_Error jarg6_);
  public final static native void ABC_FreeRequests(long jarg1, long jarg2);
  public final static native void ABC_SpendTargetFree(long jarg1, tABC_SpendTarget jarg1_);
  public final static native int ABC_SpendNewDecode(String jarg1, long jarg2, long jarg3, tABC_Error jarg3_);
  public final static native int ABC_SpendNewTransfer(String jarg1, String jarg2, long jarg3, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_SpendNewInternal(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, long jarg6, long jarg7, tABC_Error jarg7_);
  public final static native int ABC_SpendGetFee(String jarg1, String jarg2, long jarg3, tABC_SpendTarget jarg3_, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_SpendGetMax(String jarg1, String jarg2, long jarg3, tABC_SpendTarget jarg3_, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_SpendApprove(String jarg1, String jarg2, long jarg3, tABC_SpendTarget jarg3_, long jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_SweepKey(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, long jarg6, long jarg7, long jarg8, tABC_Error jarg8_);
  public final static native int ABC_GetTransaction(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, long jarg6, tABC_Error jarg6_);
  public final static native int ABC_GetTransactions(String jarg1, String jarg2, String jarg3, long jarg4, long jarg5, long jarg6, long jarg7, long jarg8, tABC_Error jarg8_);
  public final static native int ABC_SearchTransactions(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, long jarg6, long jarg7, tABC_Error jarg7_);
  public final static native int ABC_GetRawTransaction(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, long jarg6, tABC_Error jarg6_);
  public final static native void ABC_FreeTransaction(long jarg1, tABC_TxInfo jarg1_);
  public final static native void ABC_FreeTransactions(long jarg1, long jarg2);
  public final static native int ABC_SetTransactionDetails(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, tABC_TxDetails jarg5_, long jarg6, tABC_Error jarg6_);
  public final static native int ABC_GetTransactionDetails(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, long jarg6, tABC_Error jarg6_);
  public final static native int ABC_DuplicateTxDetails(long jarg1, long jarg2, tABC_TxDetails jarg2_, long jarg3, tABC_Error jarg3_);
  public final static native void ABC_FreeTxDetails(long jarg1, tABC_TxDetails jarg1_);
  public final static native int ABC_WatcherStart(String jarg1, String jarg2, String jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_WatcherLoop(String jarg1, long jarg2, long jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_WatcherConnect(String jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_WatchAddresses(String jarg1, String jarg2, String jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_PrioritizeAddress(String jarg1, String jarg2, String jarg3, String jarg4, long jarg5, tABC_Error jarg5_);
  public final static native int ABC_WatcherDisconnect(String jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_WatcherStop(String jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_WatcherDelete(String jarg1, long jarg2, tABC_Error jarg2_);
  public final static native int ABC_TxHeight(String jarg1, String jarg2, long jarg3, long jarg4, tABC_Error jarg4_);
  public final static native int ABC_BlockHeight(String jarg1, long jarg2, long jarg3, tABC_Error jarg3_);
  public final static native long p64_t_to_long_ptr(long jarg1);
  public final static native long p64_t_to_double_ptr(long jarg1);
  public final static native long int_to_uint(long jarg1);
  public final static native long longp_to_ppWalletinfo(long jarg1);
  public final static native long longp_to_pWalletinfo(long jarg1);
  public final static native long longp_to_pppWalletInfo(long jarg1);
  public final static native long longp_to_pppTxInfo(long jarg1);
  public final static native long longp_to_ppTxInfo(long jarg1);
  public final static native long longp_to_ppCurrency(long jarg1);
  public final static native long longp_to_ppTxDetails(long jarg1);
  public final static native long longp_to_pppPasswordRule(long jarg1);
  public final static native long longp_to_ppAccountSettings(long jarg1);
  public final static native long longp_to_ppChar(long jarg1);
  public final static native long longp_to_pppChar(long jarg1);
  public final static native long longp_to_ppQuestionChoices(long jarg1);
  public final static native long longp_to_unsigned_ppChar(long jarg1);
  public final static native long charpp_to_longp(long jarg1);
  public final static native long longPtr_to_ppSpendTarget(long jarg1);
}
