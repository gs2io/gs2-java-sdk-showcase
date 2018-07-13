/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.showcase.control;

import org.json.JSONObject;
import java.util.List;
import io.gs2.showcase.model.*;
import io.gs2.showcase.Gs2Showcase;
import io.gs2.control.Gs2BasicRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class CreateItemMasterRequest extends Gs2BasicRequest<CreateItemMasterRequest> {

	public static class Constant extends Gs2Showcase.Constant {
		public static final String FUNCTION = "CreateItemMaster";
	}

	/** ショーケースの名前 */
	private String showcaseName;

	/** 商品名 */
	private String name;

	/** メタデータ */
	private String meta;

	/** 販売通貨 */
	private String currencyType;

	/** GS2-Money 課金通貨名 */
	private String currencyMoneyName;

	/** GS2-Gold 通貨名 */
	private String currencyGoldName;

	/** GS2-ConsumableItem アイテムプール名 */
	private String currencyConsumableItemItemPoolName;

	/** GS2-ConsumableItem アイテム名 */
	private String currencyConsumableItemItemName;

	/** 対価消費処理にまつわるオプション値 */
	private String currencyOption;

	/** 販売価格 */
	private Float price;

	/** 入手アイテムの種類 */
	private String itemType;

	/** GS2-Money 課金通貨名 */
	private String itemMoneyName;

	/** GS2-Gold 通貨名 */
	private String itemGoldName;

	/** GS2-Stamina スタミナプール名 */
	private String itemStaminaStaminaPoolName;

	/** GS2-ConsumableItem アイテムプール名 */
	private String itemConsumableItemItemPoolName;

	/** GS2-ConsumableItem アイテム名 */
	private String itemConsumableItemItemName;

	/** GS2-Gacha ガチャプール名 */
	private String itemGachaGachaPoolName;

	/** GS2-Gacha ガチャ名 */
	private String itemGachaGachaName;

	/** 入手数量 */
	private Integer itemAmount;

	/** アイテムの入手処理にまつわるオプション値 */
	private String itemOption;

	/** 購入許可判定の種類 */
	private String openConditionType;

	/** 購入許可判定 に実行されるGS2-Limit */
	private String openConditionLimitName;

	/** 購入許可判定 に実行されるGS2-Limit のカウンター */
	private String openConditionLimitCounterName;


	/**
	 * ショーケースの名前を取得
	 *
	 * @return ショーケースの名前
	 */
	public String getShowcaseName() {
		return showcaseName;
	}

	/**
	 * ショーケースの名前を設定
	 *
	 * @param showcaseName ショーケースの名前
	 */
	public void setShowcaseName(String showcaseName) {
		this.showcaseName = showcaseName;
	}

	/**
	 * ショーケースの名前を設定
	 *
	 * @param showcaseName ショーケースの名前
	 * @return this
	 */
	public CreateItemMasterRequest withShowcaseName(String showcaseName) {
		setShowcaseName(showcaseName);
		return this;
	}

	/**
	 * 商品名を取得
	 *
	 * @return 商品名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 商品名を設定
	 *
	 * @param name 商品名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 商品名を設定
	 *
	 * @param name 商品名
	 * @return this
	 */
	public CreateItemMasterRequest withName(String name) {
		setName(name);
		return this;
	}

	/**
	 * メタデータを取得
	 *
	 * @return メタデータ
	 */
	public String getMeta() {
		return meta;
	}

	/**
	 * メタデータを設定
	 *
	 * @param meta メタデータ
	 */
	public void setMeta(String meta) {
		this.meta = meta;
	}

	/**
	 * メタデータを設定
	 *
	 * @param meta メタデータ
	 * @return this
	 */
	public CreateItemMasterRequest withMeta(String meta) {
		setMeta(meta);
		return this;
	}

	/**
	 * 販売通貨を取得
	 *
	 * @return 販売通貨
	 */
	public String getCurrencyType() {
		return currencyType;
	}

	/**
	 * 販売通貨を設定
	 *
	 * @param currencyType 販売通貨
	 */
	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	/**
	 * 販売通貨を設定
	 *
	 * @param currencyType 販売通貨
	 * @return this
	 */
	public CreateItemMasterRequest withCurrencyType(String currencyType) {
		setCurrencyType(currencyType);
		return this;
	}

	/**
	 * GS2-Money 課金通貨名を取得
	 *
	 * @return GS2-Money 課金通貨名
	 */
	public String getCurrencyMoneyName() {
		return currencyMoneyName;
	}

	/**
	 * GS2-Money 課金通貨名を設定
	 *
	 * @param currencyMoneyName GS2-Money 課金通貨名
	 */
	public void setCurrencyMoneyName(String currencyMoneyName) {
		this.currencyMoneyName = currencyMoneyName;
	}

	/**
	 * GS2-Money 課金通貨名を設定
	 *
	 * @param currencyMoneyName GS2-Money 課金通貨名
	 * @return this
	 */
	public CreateItemMasterRequest withCurrencyMoneyName(String currencyMoneyName) {
		setCurrencyMoneyName(currencyMoneyName);
		return this;
	}

	/**
	 * GS2-Gold 通貨名を取得
	 *
	 * @return GS2-Gold 通貨名
	 */
	public String getCurrencyGoldName() {
		return currencyGoldName;
	}

	/**
	 * GS2-Gold 通貨名を設定
	 *
	 * @param currencyGoldName GS2-Gold 通貨名
	 */
	public void setCurrencyGoldName(String currencyGoldName) {
		this.currencyGoldName = currencyGoldName;
	}

	/**
	 * GS2-Gold 通貨名を設定
	 *
	 * @param currencyGoldName GS2-Gold 通貨名
	 * @return this
	 */
	public CreateItemMasterRequest withCurrencyGoldName(String currencyGoldName) {
		setCurrencyGoldName(currencyGoldName);
		return this;
	}

	/**
	 * GS2-ConsumableItem アイテムプール名を取得
	 *
	 * @return GS2-ConsumableItem アイテムプール名
	 */
	public String getCurrencyConsumableItemItemPoolName() {
		return currencyConsumableItemItemPoolName;
	}

	/**
	 * GS2-ConsumableItem アイテムプール名を設定
	 *
	 * @param currencyConsumableItemItemPoolName GS2-ConsumableItem アイテムプール名
	 */
	public void setCurrencyConsumableItemItemPoolName(String currencyConsumableItemItemPoolName) {
		this.currencyConsumableItemItemPoolName = currencyConsumableItemItemPoolName;
	}

	/**
	 * GS2-ConsumableItem アイテムプール名を設定
	 *
	 * @param currencyConsumableItemItemPoolName GS2-ConsumableItem アイテムプール名
	 * @return this
	 */
	public CreateItemMasterRequest withCurrencyConsumableItemItemPoolName(String currencyConsumableItemItemPoolName) {
		setCurrencyConsumableItemItemPoolName(currencyConsumableItemItemPoolName);
		return this;
	}

	/**
	 * GS2-ConsumableItem アイテム名を取得
	 *
	 * @return GS2-ConsumableItem アイテム名
	 */
	public String getCurrencyConsumableItemItemName() {
		return currencyConsumableItemItemName;
	}

	/**
	 * GS2-ConsumableItem アイテム名を設定
	 *
	 * @param currencyConsumableItemItemName GS2-ConsumableItem アイテム名
	 */
	public void setCurrencyConsumableItemItemName(String currencyConsumableItemItemName) {
		this.currencyConsumableItemItemName = currencyConsumableItemItemName;
	}

	/**
	 * GS2-ConsumableItem アイテム名を設定
	 *
	 * @param currencyConsumableItemItemName GS2-ConsumableItem アイテム名
	 * @return this
	 */
	public CreateItemMasterRequest withCurrencyConsumableItemItemName(String currencyConsumableItemItemName) {
		setCurrencyConsumableItemItemName(currencyConsumableItemItemName);
		return this;
	}

	/**
	 * 対価消費処理にまつわるオプション値を取得
	 *
	 * @return 対価消費処理にまつわるオプション値
	 */
	public String getCurrencyOption() {
		return currencyOption;
	}

	/**
	 * 対価消費処理にまつわるオプション値を設定
	 *
	 * @param currencyOption 対価消費処理にまつわるオプション値
	 */
	public void setCurrencyOption(String currencyOption) {
		this.currencyOption = currencyOption;
	}

	/**
	 * 対価消費処理にまつわるオプション値を設定
	 *
	 * @param currencyOption 対価消費処理にまつわるオプション値
	 * @return this
	 */
	public CreateItemMasterRequest withCurrencyOption(String currencyOption) {
		setCurrencyOption(currencyOption);
		return this;
	}

	/**
	 * 販売価格を取得
	 *
	 * @return 販売価格
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * 販売価格を設定
	 *
	 * @param price 販売価格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * 販売価格を設定
	 *
	 * @param price 販売価格
	 * @return this
	 */
	public CreateItemMasterRequest withPrice(Float price) {
		setPrice(price);
		return this;
	}

	/**
	 * 入手アイテムの種類を取得
	 *
	 * @return 入手アイテムの種類
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * 入手アイテムの種類を設定
	 *
	 * @param itemType 入手アイテムの種類
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	/**
	 * 入手アイテムの種類を設定
	 *
	 * @param itemType 入手アイテムの種類
	 * @return this
	 */
	public CreateItemMasterRequest withItemType(String itemType) {
		setItemType(itemType);
		return this;
	}

	/**
	 * GS2-Money 課金通貨名を取得
	 *
	 * @return GS2-Money 課金通貨名
	 */
	public String getItemMoneyName() {
		return itemMoneyName;
	}

	/**
	 * GS2-Money 課金通貨名を設定
	 *
	 * @param itemMoneyName GS2-Money 課金通貨名
	 */
	public void setItemMoneyName(String itemMoneyName) {
		this.itemMoneyName = itemMoneyName;
	}

	/**
	 * GS2-Money 課金通貨名を設定
	 *
	 * @param itemMoneyName GS2-Money 課金通貨名
	 * @return this
	 */
	public CreateItemMasterRequest withItemMoneyName(String itemMoneyName) {
		setItemMoneyName(itemMoneyName);
		return this;
	}

	/**
	 * GS2-Gold 通貨名を取得
	 *
	 * @return GS2-Gold 通貨名
	 */
	public String getItemGoldName() {
		return itemGoldName;
	}

	/**
	 * GS2-Gold 通貨名を設定
	 *
	 * @param itemGoldName GS2-Gold 通貨名
	 */
	public void setItemGoldName(String itemGoldName) {
		this.itemGoldName = itemGoldName;
	}

	/**
	 * GS2-Gold 通貨名を設定
	 *
	 * @param itemGoldName GS2-Gold 通貨名
	 * @return this
	 */
	public CreateItemMasterRequest withItemGoldName(String itemGoldName) {
		setItemGoldName(itemGoldName);
		return this;
	}

	/**
	 * GS2-Stamina スタミナプール名を取得
	 *
	 * @return GS2-Stamina スタミナプール名
	 */
	public String getItemStaminaStaminaPoolName() {
		return itemStaminaStaminaPoolName;
	}

	/**
	 * GS2-Stamina スタミナプール名を設定
	 *
	 * @param itemStaminaStaminaPoolName GS2-Stamina スタミナプール名
	 */
	public void setItemStaminaStaminaPoolName(String itemStaminaStaminaPoolName) {
		this.itemStaminaStaminaPoolName = itemStaminaStaminaPoolName;
	}

	/**
	 * GS2-Stamina スタミナプール名を設定
	 *
	 * @param itemStaminaStaminaPoolName GS2-Stamina スタミナプール名
	 * @return this
	 */
	public CreateItemMasterRequest withItemStaminaStaminaPoolName(String itemStaminaStaminaPoolName) {
		setItemStaminaStaminaPoolName(itemStaminaStaminaPoolName);
		return this;
	}

	/**
	 * GS2-ConsumableItem アイテムプール名を取得
	 *
	 * @return GS2-ConsumableItem アイテムプール名
	 */
	public String getItemConsumableItemItemPoolName() {
		return itemConsumableItemItemPoolName;
	}

	/**
	 * GS2-ConsumableItem アイテムプール名を設定
	 *
	 * @param itemConsumableItemItemPoolName GS2-ConsumableItem アイテムプール名
	 */
	public void setItemConsumableItemItemPoolName(String itemConsumableItemItemPoolName) {
		this.itemConsumableItemItemPoolName = itemConsumableItemItemPoolName;
	}

	/**
	 * GS2-ConsumableItem アイテムプール名を設定
	 *
	 * @param itemConsumableItemItemPoolName GS2-ConsumableItem アイテムプール名
	 * @return this
	 */
	public CreateItemMasterRequest withItemConsumableItemItemPoolName(String itemConsumableItemItemPoolName) {
		setItemConsumableItemItemPoolName(itemConsumableItemItemPoolName);
		return this;
	}

	/**
	 * GS2-ConsumableItem アイテム名を取得
	 *
	 * @return GS2-ConsumableItem アイテム名
	 */
	public String getItemConsumableItemItemName() {
		return itemConsumableItemItemName;
	}

	/**
	 * GS2-ConsumableItem アイテム名を設定
	 *
	 * @param itemConsumableItemItemName GS2-ConsumableItem アイテム名
	 */
	public void setItemConsumableItemItemName(String itemConsumableItemItemName) {
		this.itemConsumableItemItemName = itemConsumableItemItemName;
	}

	/**
	 * GS2-ConsumableItem アイテム名を設定
	 *
	 * @param itemConsumableItemItemName GS2-ConsumableItem アイテム名
	 * @return this
	 */
	public CreateItemMasterRequest withItemConsumableItemItemName(String itemConsumableItemItemName) {
		setItemConsumableItemItemName(itemConsumableItemItemName);
		return this;
	}

	/**
	 * GS2-Gacha ガチャプール名を取得
	 *
	 * @return GS2-Gacha ガチャプール名
	 */
	public String getItemGachaGachaPoolName() {
		return itemGachaGachaPoolName;
	}

	/**
	 * GS2-Gacha ガチャプール名を設定
	 *
	 * @param itemGachaGachaPoolName GS2-Gacha ガチャプール名
	 */
	public void setItemGachaGachaPoolName(String itemGachaGachaPoolName) {
		this.itemGachaGachaPoolName = itemGachaGachaPoolName;
	}

	/**
	 * GS2-Gacha ガチャプール名を設定
	 *
	 * @param itemGachaGachaPoolName GS2-Gacha ガチャプール名
	 * @return this
	 */
	public CreateItemMasterRequest withItemGachaGachaPoolName(String itemGachaGachaPoolName) {
		setItemGachaGachaPoolName(itemGachaGachaPoolName);
		return this;
	}

	/**
	 * GS2-Gacha ガチャ名を取得
	 *
	 * @return GS2-Gacha ガチャ名
	 */
	public String getItemGachaGachaName() {
		return itemGachaGachaName;
	}

	/**
	 * GS2-Gacha ガチャ名を設定
	 *
	 * @param itemGachaGachaName GS2-Gacha ガチャ名
	 */
	public void setItemGachaGachaName(String itemGachaGachaName) {
		this.itemGachaGachaName = itemGachaGachaName;
	}

	/**
	 * GS2-Gacha ガチャ名を設定
	 *
	 * @param itemGachaGachaName GS2-Gacha ガチャ名
	 * @return this
	 */
	public CreateItemMasterRequest withItemGachaGachaName(String itemGachaGachaName) {
		setItemGachaGachaName(itemGachaGachaName);
		return this;
	}

	/**
	 * 入手数量を取得
	 *
	 * @return 入手数量
	 */
	public Integer getItemAmount() {
		return itemAmount;
	}

	/**
	 * 入手数量を設定
	 *
	 * @param itemAmount 入手数量
	 */
	public void setItemAmount(Integer itemAmount) {
		this.itemAmount = itemAmount;
	}

	/**
	 * 入手数量を設定
	 *
	 * @param itemAmount 入手数量
	 * @return this
	 */
	public CreateItemMasterRequest withItemAmount(Integer itemAmount) {
		setItemAmount(itemAmount);
		return this;
	}

	/**
	 * アイテムの入手処理にまつわるオプション値を取得
	 *
	 * @return アイテムの入手処理にまつわるオプション値
	 */
	public String getItemOption() {
		return itemOption;
	}

	/**
	 * アイテムの入手処理にまつわるオプション値を設定
	 *
	 * @param itemOption アイテムの入手処理にまつわるオプション値
	 */
	public void setItemOption(String itemOption) {
		this.itemOption = itemOption;
	}

	/**
	 * アイテムの入手処理にまつわるオプション値を設定
	 *
	 * @param itemOption アイテムの入手処理にまつわるオプション値
	 * @return this
	 */
	public CreateItemMasterRequest withItemOption(String itemOption) {
		setItemOption(itemOption);
		return this;
	}

	/**
	 * 購入許可判定の種類を取得
	 *
	 * @return 購入許可判定の種類
	 */
	public String getOpenConditionType() {
		return openConditionType;
	}

	/**
	 * 購入許可判定の種類を設定
	 *
	 * @param openConditionType 購入許可判定の種類
	 */
	public void setOpenConditionType(String openConditionType) {
		this.openConditionType = openConditionType;
	}

	/**
	 * 購入許可判定の種類を設定
	 *
	 * @param openConditionType 購入許可判定の種類
	 * @return this
	 */
	public CreateItemMasterRequest withOpenConditionType(String openConditionType) {
		setOpenConditionType(openConditionType);
		return this;
	}

	/**
	 * 購入許可判定 に実行されるGS2-Limitを取得
	 *
	 * @return 購入許可判定 に実行されるGS2-Limit
	 */
	public String getOpenConditionLimitName() {
		return openConditionLimitName;
	}

	/**
	 * 購入許可判定 に実行されるGS2-Limitを設定
	 *
	 * @param openConditionLimitName 購入許可判定 に実行されるGS2-Limit
	 */
	public void setOpenConditionLimitName(String openConditionLimitName) {
		this.openConditionLimitName = openConditionLimitName;
	}

	/**
	 * 購入許可判定 に実行されるGS2-Limitを設定
	 *
	 * @param openConditionLimitName 購入許可判定 に実行されるGS2-Limit
	 * @return this
	 */
	public CreateItemMasterRequest withOpenConditionLimitName(String openConditionLimitName) {
		setOpenConditionLimitName(openConditionLimitName);
		return this;
	}

	/**
	 * 購入許可判定 に実行されるGS2-Limit のカウンターを取得
	 *
	 * @return 購入許可判定 に実行されるGS2-Limit のカウンター
	 */
	public String getOpenConditionLimitCounterName() {
		return openConditionLimitCounterName;
	}

	/**
	 * 購入許可判定 に実行されるGS2-Limit のカウンターを設定
	 *
	 * @param openConditionLimitCounterName 購入許可判定 に実行されるGS2-Limit のカウンター
	 */
	public void setOpenConditionLimitCounterName(String openConditionLimitCounterName) {
		this.openConditionLimitCounterName = openConditionLimitCounterName;
	}

	/**
	 * 購入許可判定 に実行されるGS2-Limit のカウンターを設定
	 *
	 * @param openConditionLimitCounterName 購入許可判定 に実行されるGS2-Limit のカウンター
	 * @return this
	 */
	public CreateItemMasterRequest withOpenConditionLimitCounterName(String openConditionLimitCounterName) {
		setOpenConditionLimitCounterName(openConditionLimitCounterName);
		return this;
	}

}