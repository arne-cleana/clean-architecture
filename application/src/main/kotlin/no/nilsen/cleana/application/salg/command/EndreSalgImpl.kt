package no.nilsen.cleana.application.salg.command

import no.nilsen.cleana.domain.ansatt.Ansatt
import no.nilsen.cleana.kunde.Kunde
import no.nilsen.cleana.produkt.Produkt
import no.nilsen.cleana.salg.Salg

class EndreSalgImpl(val repo: SalgCommandRepository) : EndreSalg {

    override fun endre(s: EndreSalgDto) {
        repo.endre(Salg(id=s.id, antall=s.antall, selger = Ansatt(id=s.ansattId), kunde = Kunde(id=s.kundeId), produkt = Produkt(id= s.produktId)))
    }
}