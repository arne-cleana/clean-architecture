package no.nilsen.cleana.ansatt.command

import no.nilsen.cleana.produkt.Produkt

interface ProduktCommandRepository {
    fun endre(produkt: Produkt)
    fun opprett(produkt: Produkt)
    fun slett(produkt: Produkt)
}