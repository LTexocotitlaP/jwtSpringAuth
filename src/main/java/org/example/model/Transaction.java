package org.example.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "transacciones_organismo")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaccion;

    private Short provider;
    private Short tipoTarjeta;
    private String numeroSerieHex;
    private LocalDateTime fechaHoraTransaccion;
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
    private Short perfil1;
    private Short perfil2;
    private Short perfil3;
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
    private LocalDateTime contractValidityStartDate;
    private Short contractValidityDuration;
    private String latitud;
    private String longitud;
}