package no.nilsen.cleana.application.kunde.query

import no.nilsen.cleana.domain.kunde.Kunde

class HentKundeDto(val id: Int, val navn: String) {
    constructor(k: Kunde) : this(k.id, k.navn) {}
}
