package com.demoRestAPI.account.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class DocumentDTO {
    Long DocumentId;
    Long patientId;
}
