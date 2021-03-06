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

package io.gs2.showcase.model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * ショーケース
 *
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Showcase implements Serializable {

	/** ショーケースGRN */
	private String showcaseId;

	/** オーナーID */
	private String ownerId;

	/** ショーケース名 */
	private String name;

	/** 説明文 */
	private String description;

	/** 公開許可判定 に実行されるGS2-Script */
	private String releaseConditionTriggerScript;

	/** 購入直前 に実行されるGS2-Script */
	private String buyTriggerScript;

	/** 作成日時(エポック秒) */
	private Integer createAt;

	/** 最終更新日時(エポック秒) */
	private Integer updateAt;


	/**
	 * ショーケースGRNを取得
	 *
	 * @return ショーケースGRN
	 */
	public String getShowcaseId() {
		return showcaseId;
	}

	/**
	 * ショーケースGRNを設定
	 *
	 * @param showcaseId ショーケースGRN
	 */
	public void setShowcaseId(String showcaseId) {
		this.showcaseId = showcaseId;
	}

	/**
	 * ショーケースGRNを設定
	 *
	 * @param showcaseId ショーケースGRN
	 * @return this
	 */
	public Showcase withShowcaseId(String showcaseId) {
		this.showcaseId = showcaseId;
		return this;
	}

	/**
	 * オーナーIDを取得
	 *
	 * @return オーナーID
	 */
	public String getOwnerId() {
		return ownerId;
	}

	/**
	 * オーナーIDを設定
	 *
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * オーナーIDを設定
	 *
	 * @param ownerId オーナーID
	 * @return this
	 */
	public Showcase withOwnerId(String ownerId) {
		this.ownerId = ownerId;
		return this;
	}

	/**
	 * ショーケース名を取得
	 *
	 * @return ショーケース名
	 */
	public String getName() {
		return name;
	}

	/**
	 * ショーケース名を設定
	 *
	 * @param name ショーケース名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ショーケース名を設定
	 *
	 * @param name ショーケース名
	 * @return this
	 */
	public Showcase withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * 説明文を取得
	 *
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 説明文を設定
	 *
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 説明文を設定
	 *
	 * @param description 説明文
	 * @return this
	 */
	public Showcase withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * 公開許可判定 に実行されるGS2-Scriptを取得
	 *
	 * @return 公開許可判定 に実行されるGS2-Script
	 */
	public String getReleaseConditionTriggerScript() {
		return releaseConditionTriggerScript;
	}

	/**
	 * 公開許可判定 に実行されるGS2-Scriptを設定
	 *
	 * @param releaseConditionTriggerScript 公開許可判定 に実行されるGS2-Script
	 */
	public void setReleaseConditionTriggerScript(String releaseConditionTriggerScript) {
		this.releaseConditionTriggerScript = releaseConditionTriggerScript;
	}

	/**
	 * 公開許可判定 に実行されるGS2-Scriptを設定
	 *
	 * @param releaseConditionTriggerScript 公開許可判定 に実行されるGS2-Script
	 * @return this
	 */
	public Showcase withReleaseConditionTriggerScript(String releaseConditionTriggerScript) {
		this.releaseConditionTriggerScript = releaseConditionTriggerScript;
		return this;
	}

	/**
	 * 購入直前 に実行されるGS2-Scriptを取得
	 *
	 * @return 購入直前 に実行されるGS2-Script
	 */
	public String getBuyTriggerScript() {
		return buyTriggerScript;
	}

	/**
	 * 購入直前 に実行されるGS2-Scriptを設定
	 *
	 * @param buyTriggerScript 購入直前 に実行されるGS2-Script
	 */
	public void setBuyTriggerScript(String buyTriggerScript) {
		this.buyTriggerScript = buyTriggerScript;
	}

	/**
	 * 購入直前 に実行されるGS2-Scriptを設定
	 *
	 * @param buyTriggerScript 購入直前 に実行されるGS2-Script
	 * @return this
	 */
	public Showcase withBuyTriggerScript(String buyTriggerScript) {
		this.buyTriggerScript = buyTriggerScript;
		return this;
	}

	/**
	 * 作成日時(エポック秒)を取得
	 *
	 * @return 作成日時(エポック秒)
	 */
	public Integer getCreateAt() {
		return createAt;
	}

	/**
	 * 作成日時(エポック秒)を設定
	 *
	 * @param createAt 作成日時(エポック秒)
	 */
	public void setCreateAt(Integer createAt) {
		this.createAt = createAt;
	}

	/**
	 * 作成日時(エポック秒)を設定
	 *
	 * @param createAt 作成日時(エポック秒)
	 * @return this
	 */
	public Showcase withCreateAt(Integer createAt) {
		this.createAt = createAt;
		return this;
	}

	/**
	 * 最終更新日時(エポック秒)を取得
	 *
	 * @return 最終更新日時(エポック秒)
	 */
	public Integer getUpdateAt() {
		return updateAt;
	}

	/**
	 * 最終更新日時(エポック秒)を設定
	 *
	 * @param updateAt 最終更新日時(エポック秒)
	 */
	public void setUpdateAt(Integer updateAt) {
		this.updateAt = updateAt;
	}

	/**
	 * 最終更新日時(エポック秒)を設定
	 *
	 * @param updateAt 最終更新日時(エポック秒)
	 * @return this
	 */
	public Showcase withUpdateAt(Integer updateAt) {
		this.updateAt = updateAt;
		return this;
	}


    public ObjectNode toJson() {

		ObjectNode body = JsonNodeFactory.instance.objectNode()

            .put("showcaseId", this.getShowcaseId())
            .put("ownerId", this.getOwnerId())
            .put("name", this.getName())
            .put("description", this.getDescription())
            .put("releaseConditionTriggerScript", this.getReleaseConditionTriggerScript())
            .put("buyTriggerScript", this.getBuyTriggerScript())
            .put("createAt", this.getCreateAt())
            .put("updateAt", this.getUpdateAt());

        return body;
    }
}