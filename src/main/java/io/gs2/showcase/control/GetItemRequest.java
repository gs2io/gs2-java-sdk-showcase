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
import io.gs2.control.Gs2UserRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class GetItemRequest extends Gs2UserRequest<GetItemRequest> {

	public static class Constant extends Gs2Showcase.Constant {
		public static final String FUNCTION = "GetItem";
	}

	/** ショーケースの名前 */
	private String showcaseName;

	/** 陳列商品のID */
	private String showcaseItemId;


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
	public GetItemRequest withShowcaseName(String showcaseName) {
		setShowcaseName(showcaseName);
		return this;
	}

	/**
	 * 陳列商品のIDを取得
	 *
	 * @return 陳列商品のID
	 */
	public String getShowcaseItemId() {
		return showcaseItemId;
	}

	/**
	 * 陳列商品のIDを設定
	 *
	 * @param showcaseItemId 陳列商品のID
	 */
	public void setShowcaseItemId(String showcaseItemId) {
		this.showcaseItemId = showcaseItemId;
	}

	/**
	 * 陳列商品のIDを設定
	 *
	 * @param showcaseItemId 陳列商品のID
	 * @return this
	 */
	public GetItemRequest withShowcaseItemId(String showcaseItemId) {
		setShowcaseItemId(showcaseItemId);
		return this;
	}

}