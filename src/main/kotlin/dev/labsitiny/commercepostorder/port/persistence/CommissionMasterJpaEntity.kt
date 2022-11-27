package dev.labsitiny.commercepostorder.port.persistence

import lombok.Data
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Data
class CommissionMasterJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id : Long = 0L
}