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
public class UpdateItemGroupMasterRequest extends Gs2BasicRequest<UpdateItemGroupMasterRequest> {

	public static class Constant extends Gs2Showcase.Constant {
		public static final String FUNCTION = "UpdateItemGroupMaster";
	}

	/** ショーケースの名前 */
	private String showcaseName;

	/** 商品グループの名前 */
	private String itemGroupName;

	/** 販売している商品名のリスト */
	private List<String> itemNames;


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
	public UpdateItemGroupMasterRequest withShowcaseName(String showcaseName) {
		setShowcaseName(showcaseName);
		return this;
	}

	/**
	 * 商品グループの名前を取得
	 *
	 * @return 商品グループの名前
	 */
	public String getItemGroupName() {
		return itemGroupName;
	}

	/**
	 * 商品グループの名前を設定
	 *
	 * @param itemGroupName 商品グループの名前
	 */
	public void setItemGroupName(String itemGroupName) {
		this.itemGroupName = itemGroupName;
	}

	/**
	 * 商品グループの名前を設定
	 *
	 * @param itemGroupName 商品グループの名前
	 * @return this
	 */
	public UpdateItemGroupMasterRequest withItemGroupName(String itemGroupName) {
		setItemGroupName(itemGroupName);
		return this;
	}

	/**
	 * 販売している商品名のリストを取得
	 *
	 * @return 販売している商品名のリスト
	 */
	public List<String> getItemNames() {
		return itemNames;
	}

	/**
	 * 販売している商品名のリストを設定
	 *
	 * @param itemNames 販売している商品名のリスト
	 */
	public void setItemNames(List<String> itemNames) {
		this.itemNames = itemNames;
	}

	/**
	 * 販売している商品名のリストを設定
	 *
	 * @param itemNames 販売している商品名のリスト
	 * @return this
	 */
	public UpdateItemGroupMasterRequest withItemNames(List<String> itemNames) {
		setItemNames(itemNames);
		return this;
	}

}