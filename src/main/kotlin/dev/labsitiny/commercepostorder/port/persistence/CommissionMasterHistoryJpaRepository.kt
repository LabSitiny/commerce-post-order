package dev.labsitiny.commercepostorder.port.persistence

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommissionMasterHistoryJpaRepository : JpaRepository<CommissionMasterHistoryJpaEntity, Long> {
}