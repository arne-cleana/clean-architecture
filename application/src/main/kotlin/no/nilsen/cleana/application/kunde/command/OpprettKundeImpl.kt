package no.nilsen.cleana.ansatt.command

import no.nilsen.cleana.domain.kunde.Kunde

class OpprettKundeImpl(val repo: KundeCommandRepository) : OpprettKunde {


    override fun opprett(kunde: OpprettKundeDto) {
        repo.opprett(Kunde(navn = kunde.navn))
    }

}