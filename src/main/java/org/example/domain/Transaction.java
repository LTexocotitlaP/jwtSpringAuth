package org.example.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer provider;
    private Integer tipoTarjeta;
    private String numeroSerieHex;
    private String fechaHoraTransaccion;
    private String linea;
    private String estacion;
    private String autobus;
    private String ruta;
    private String equipo;
    private String tipoEquipo;
    private String locationId;
    private String tipoTransaccion;
    private Integer saldoAntesTransaccion;
    private Integer montoTransaccion;
    private Integer saldoDespuesTransaccion;
    private Integer perfil1;
    private Integer perfil2;
    private Integer perfil3;
    private String samSerialHexUltimaRecarga;
    private String samSerialHex;
    private Integer contadorRecargas;
    private Integer contadorValidaciones;
    private String eventLog;
    private String loadLog;
    private String purchaseLog;
    private String mac;
    private String counterValue;
    private String counterAmount; 
    private String samCounter;
    private String environment;
    private String environmentIssuerId;
    private String contract;
    private String contractTariff;
    private String contractSaleSam;
    private String contractRestrictTime;
    private String contractValidityStartDate;
    private String contractValidityDuration;
    private String latitud;
    private String longitud;
}