package com.clearpicture.platform.service.impl;


import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;

import javax.sql.DataSource;

/**
 * 
 * @author Nuwan
 *
 */
public class ClientDetailsServiceImpl extends JdbcClientDetailsService {

	public ClientDetailsServiceImpl(DataSource dataSource) {
		super(dataSource);
		setSelectClientDetailsSql(
				"select client_id, client_secret, resource_ids, scope, authorized_grant_types, web_server_redirect_uri,"
						+ " authorities, access_token_validity, refresh_token_validity, additional_information, autoapprove"
						+ " from cp_user_db.oauth_client_details where client_id = ?");
	}

}
