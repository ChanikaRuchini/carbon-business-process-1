/*
 * Copyright (c) , WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.bpmn.analytics.publisher.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.bpmn.core.BPMNServerHolder;
import org.wso2.carbon.registry.api.RegistryException;
import org.wso2.carbon.user.api.UserRealm;
import org.wso2.carbon.user.api.UserStoreException;

/**
 * BPMNAdminConfig is used by AnalyticsPublisher to retrieve admin user name and password
 */
public class BPMNAdminConfig {
	private static Log log = LogFactory.getLog(BPMNAdminConfig.class);

	/**
	 * Get admin user name
	 * @return admin user name
	 * @throws RegistryException
	 * @throws UserStoreException
	 */
	public static String getUserName() throws RegistryException, UserStoreException {
		UserRealm userRealm = BPMNServerHolder.getInstance().getRegistryService().getGovernanceSystemRegistry().getUserRealm();
		return userRealm.getRealmConfiguration().getAdminUserName();
	}

	/**
	 * Get admin password
	 * @return admin password
	 * @throws RegistryException
	 * @throws UserStoreException
	 */
	public static String getPassword() throws RegistryException, UserStoreException {
		UserRealm userRealm = BPMNServerHolder.getInstance().getRegistryService().getGovernanceSystemRegistry().getUserRealm();
		return userRealm.getRealmConfiguration().getAdminPassword();
	}

}
