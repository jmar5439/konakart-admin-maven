//
// (c) 2013 DS Data Systems UK Ltd, All rights reserved.
//
// DS Data Systems and KonaKart and their respective logos, are 
// trademarks of DS Data Systems UK Ltd. All rights reserved.
//
// The information in this document is free software; you can redistribute 
// it and/or modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
// 
// This software is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
//

package com.konakartadmin.modules.payment.cyberpac;

import java.util.Date;

import com.konakart.util.Utils;
import com.konakartadmin.app.KKConfiguration;
import com.konakartadmin.bl.KKAdminBase;
import com.konakartadmin.modules.PaymentModule;

/**
 * Cyberpac payment module
 * 
 */
public class Cyberpac extends PaymentModule
{
    /**
     * @return the config key stub
     */
    public String getConfigKeyStub()
    {
        if (configKeyStub == null)
        {
            setConfigKeyStub(super.getConfigKeyStub() + "_CYBERPAC");
        }
        return configKeyStub;
    }

    public String getModuleTitle()
    {
        return getMsgs().getString("MODULE_PAYMENT_CYBERPAC_TEXT_TITLE");
    }

    /**
     * @return the implementation filename
     */
    public String getImplementationFileName()
    {
        return "cyberpac";
    }

    /**
     * @return the module code
     */
    public String getModuleCode()
    {
        return "cyberpac";
    }

    /**
     * @return an array of configuration values for this payment module
     */
    public KKConfiguration[] getConfigs()
    {
        if (configs == null)
        {
            configs = new KKConfiguration[13];
        }

        if (configs[0] != null && !Utils.isBlank(configs[0].getConfigurationKey()))
        {
            return configs;
        }

        Date now = KKAdminBase.getKonakartTimeStampDate();

        int i = 0;
        int groupId = 6;

        configs[i] = new KKConfiguration(
        /* title */"Cyberpac Status",
        /* key */"MODULE_PAYMENT_CYBERPAC_STATUS",
        /* value */"true",
        /* description */"If set to false, the Cyberpac module will be unavailable",
        /* groupId */groupId,
        /* sortO */i++,
        /* useFun */"",
        /* setFun */"tep_cfg_select_option(array('true', 'false'), ",
        /* dateAdd */now);

        configs[i] = new KKConfiguration(
        /* title */"Sort order of display",
        /* key */"MODULE_PAYMENT_CYBERPAC_SORT_ORDER",
        /* value */"0",
        /* description */"Sort Order of Cyberpac module on the UI. Lowest is displayed first.",
        /* groupId */groupId,
        /* sortO */i++,
        /* useFun */"",
        /* setFun */"",
        /* dateAdd */now);

        configs[i] = new KKConfiguration(
        /* title */"Cyberpac Payment Zone",
        /* key */"MODULE_PAYMENT_CYBERPAC_ZONE",
        /* value */"0",
        /* description */"Zone where Cyberpac module can be used. Otherwise it is disabled.",
        /* groupId */groupId,
        /* sortO */i++,
        /* useFun */"tep_get_zone_class_title",
        /* setFun */"tep_cfg_pull_down_zone_classes(",
        /* dateAdd */now);

        configs[i] = new KKConfiguration(
        /* title */"Merchant Code",
        /* key */"MODULE_PAYMENT_CYBERPAC_MERCHANT_CODE",
        /* value */"",
        /* description */"FUC code assigned to the merchant",
        /* groupId */groupId,
        /* sortO */i++,
        /* useFun */"",
        /* setFun */"",
        /* dateAdd */now);

        configs[i] = new KKConfiguration(
        /* title */"Terminal number",
        /* key */"MODULE_PAYMENT_CYBERPAC_MERCHANT_TERMINAL_NUMBER",
        /* value */"",
        /* description */"Terminal number assigned by bank",
        /* groupId */groupId,
        /* sortO */i++,
        /* useFun */"",
        /* setFun */"",
        /* dateAdd */now);

        configs[i] = new KKConfiguration(
        /* title */"Secret code",
        /* key */"MODULE_PAYMENT_CYBERPAC_SECRET_SIGNING_CODE",
        /* value */"",
        /* description */"The secret code used to digitally sign messages",
        /* groupId */groupId,
        /* sortO */i++,
        /* useFun */"",
        /* setFun */"password",
        /* dateAdd */now);

        configs[i] = new KKConfiguration(
        /* title */"Transaction Type",
        /* key */"MODULE_PAYMENT_CYBERPAC_TRANSACTION_TYPE",
        /* value */"2",
        /* description */"Transaction type (2 == confirmation)",
        /* groupId */groupId,
        /* sortO */i++,
        /* useFun */"",
        /* setFun */"",
        /* dateAdd */now);
       
        configs[i] = new KKConfiguration(
        /* title */"Callback username",
        /* key */"MODULE_PAYMENT_CYBERPAC_CALLBACK_USERNAME",
        /* value */"customer@test.com",
        /* description */"Valid username for KonaKart. Used by the callback"
                + " code to log into KonaKart in order to make an engine call",
        /* groupId */groupId,
        /* sortO */i++,
        /* useFun */"",
        /* setFun */"",
        /* dateAdd */now);

        configs[i] = new KKConfiguration(
        /* title */"Callback Password",
        /* key */"MODULE_PAYMENT_CYBERPAC_CALLBACK_PASSWORD",
        /* value */"",
        /* description */"Valid password for KonaKart. Used by the callback"
                + " code to log into KonaKart in order to make an engine call",
        /* groupId */groupId,
        /* sortO */i++,
        /* useFun */"",
        /* setFun */"password",
        /* dateAdd */now);

        configs[i] = new KKConfiguration(
        /* title */"Request URL",
        /* key */"MODULE_PAYMENT_CYBERPAC_REQUEST_URL",
        /* value */"https://sis-t.sermepa.es:25443/sis/realizarPago",
        /* description */"URL where KonaKart sends payment requests",
        /* groupId */groupId,
        /* sortO */i++,
        /* useFun */"",
        /* setFun */"",
        /* dateAdd */now);

        configs[i] = new KKConfiguration(
        /* title */"Callback URL",
        /* key */"MODULE_PAYMENT_CYBERPAC_CALLBACK_URL",
        /* value */"http://host:port/konakart/CyberpacCallback.action",
        /* description */"URL used by Cyberpac to callback into KonaKart."
                + " This would typically be HTTPS",
        /* groupId */groupId,
        /* sortO */i++,
        /* useFun */"",
        /* setFun */"",
        /* dateAdd */now);

        configs[i] = new KKConfiguration(
        /* title */"Return OK URL",
        /* key */"MODULE_PAYMENT_CYBERPAC_MERCHANT_URL_OK",
        /* value */"http://host:port/konakart/CheckoutFinished.action",
        /* description */"URL to return to when leaving Cyberpac web"
                + " site after a successful transaction",
        /* groupId */groupId,
        /* sortO */i++,
        /* useFun */"",
        /* setFun */"",
        /* dateAdd */now);

        configs[i] = new KKConfiguration(
        /* title */"Return KO URL",
        /* key */"MODULE_PAYMENT_CYBERPAC_MERCHANT_URL_KO",
        /* value */"http://host:port/konakart/CatalogCheckoutExternalPaymentErrorPage.action",
        /* description */"URL to return to when leaving Cyberpac web"
                + " site after an unsuccessful transaction",
        /* groupId */groupId,
        /* sortO */i++,
        /* useFun */"",
        /* setFun */"",
        /* dateAdd */now);

        return configs;
    }
}
