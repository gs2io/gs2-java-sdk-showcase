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
public class CreateShowcaseItemMasterRequest extends Gs2BasicRequest<CreateShowcaseItemMasterRequest> {

	public static class Constant extends Gs2Showcase.Constant {
		public static final String FUNCTION = "CreateShowcaseItemMaster";
	}

	/** ショーケースの名前 */
	private String showcaseName;

	/** 商品の種類 */
	private String category;

	/** 商品名 */
	private String itemName;

	/** グループ名 */
	private String itemGroupName;

	/** 公開判定の種類 */
	private String releaseConditionType;

	/** 公開許可判定 に実行されるGS2-Schedule */
	private String releaseConditionScheduleName;

	/** 公開許可判定 に実行されるGS2-Schedule のイベント名 */
	private String releaseConditionScheduleEventName;

	/** 応答順序優先度 */
	private Integer priority;


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
	public CreateShowcaseItemMasterRequest withShowcaseName(String showcaseName) {
		setShowcaseName(showcaseName);
		return this;
	}

	/**
	 * 商品の種類を取得
	 *
	 * @return 商品の種類
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * 商品の種類を設定
	 *
	 * @param category 商品の種類
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * 商品の種類を設定
	 *
	 * @param category 商品の種類
	 * @return this
	 */
	public CreateShowcaseItemMasterRequest withCategory(String category) {
		setCategory(category);
		return this;
	}

	/**
	 * 商品名を取得
	 *
	 * @return 商品名
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * 商品名を設定
	 *
	 * @param itemName 商品名
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * 商品名を設定
	 *
	 * @param itemName 商品名
	 * @return this
	 */
	public CreateShowcaseItemMasterRequest withItemName(String itemName) {
		setItemName(itemName);
		return this;
	}

	/**
	 * グループ名を取得
	 *
	 * @return グループ名
	 */
	public String getItemGroupName() {
		return itemGroupName;
	}

	/**
	 * グループ名を設定
	 *
	 * @param itemGroupName グループ名
	 */
	public void setItemGroupName(String itemGroupName) {
		this.itemGroupName = itemGroupName;
	}

	/**
	 * グループ名を設定
	 *
	 * @param itemGroupName グループ名
	 * @return this
	 */
	public CreateShowcaseItemMasterRequest withItemGroupName(String itemGroupName) {
		setItemGroupName(itemGroupName);
		return this;
	}

	/**
	 * 公開判定の種類を取得
	 *
	 * @return 公開判定の種類
	 */
	public String getReleaseConditionType() {
		return releaseConditionType;
	}

	/**
	 * 公開判定の種類を設定
	 *
	 * @param releaseConditionType 公開判定の種類
	 */
	public void setReleaseConditionType(String releaseConditionType) {
		this.releaseConditionType = releaseConditionType;
	}

	/**
	 * 公開判定の種類を設定
	 *
	 * @param releaseConditionType 公開判定の種類
	 * @return this
	 */
	public CreateShowcaseItemMasterRequest withReleaseConditionType(String releaseConditionType) {
		setReleaseConditionType(releaseConditionType);
		return this;
	}

	/**
	 * 公開許可判定 に実行されるGS2-Scheduleを取得
	 *
	 * @return 公開許可判定 に実行されるGS2-Schedule
	 */
	public String getReleaseConditionScheduleName() {
		return releaseConditionScheduleName;
	}

	/**
	 * 公開許可判定 に実行されるGS2-Scheduleを設定
	 *
	 * @param releaseConditionScheduleName 公開許可判定 に実行されるGS2-Schedule
	 */
	public void setReleaseConditionScheduleName(String releaseConditionScheduleName) {
		this.releaseConditionScheduleName = releaseConditionScheduleName;
	}

	/**
	 * 公開許可判定 に実行されるGS2-Scheduleを設定
	 *
	 * @param releaseConditionScheduleName 公開許可判定 に実行されるGS2-Schedule
	 * @return this
	 */
	public CreateShowcaseItemMasterRequest withReleaseConditionScheduleName(String releaseConditionScheduleName) {
		setReleaseConditionScheduleName(releaseConditionScheduleName);
		return this;
	}

	/**
	 * 公開許可判定 に実行されるGS2-Schedule のイベント名を取得
	 *
	 * @return 公開許可判定 に実行されるGS2-Schedule のイベント名
	 */
	public String getReleaseConditionScheduleEventName() {
		return releaseConditionScheduleEventName;
	}

	/**
	 * 公開許可判定 に実行されるGS2-Schedule のイベント名を設定
	 *
	 * @param releaseConditionScheduleEventName 公開許可判定 に実行されるGS2-Schedule のイベント名
	 */
	public void setReleaseConditionScheduleEventName(String releaseConditionScheduleEventName) {
		this.releaseConditionScheduleEventName = releaseConditionScheduleEventName;
	}

	/**
	 * 公開許可判定 に実行されるGS2-Schedule のイベント名を設定
	 *
	 * @param releaseConditionScheduleEventName 公開許可判定 に実行されるGS2-Schedule のイベント名
	 * @return this
	 */
	public CreateShowcaseItemMasterRequest withReleaseConditionScheduleEventName(String releaseConditionScheduleEventName) {
		setReleaseConditionScheduleEventName(releaseConditionScheduleEventName);
		return this;
	}

	/**
	 * 応答順序優先度を取得
	 *
	 * @return 応答順序優先度
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * 応答順序優先度を設定
	 *
	 * @param priority 応答順序優先度
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * 応答順序優先度を設定
	 *
	 * @param priority 応答順序優先度
	 * @return this
	 */
	public CreateShowcaseItemMasterRequest withPriority(Integer priority) {
		setPriority(priority);
		return this;
	}

}