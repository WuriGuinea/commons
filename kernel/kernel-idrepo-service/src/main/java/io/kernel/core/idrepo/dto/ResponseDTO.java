package io.kernel.core.idrepo.dto;

import lombok.Data;

/**
 * The Class ResponseDTO.
 *
 * @author Manoj SP
 */
@Data
public class ResponseDTO {
	
	/** The entity. */
	private String entity;
	
	/** The identity. */
	private Object identity;
}
