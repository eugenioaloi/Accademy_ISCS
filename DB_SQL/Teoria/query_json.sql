create table if not exists articolo(
	id int auto_increment primary key,
    descrizione varchar(100),
    specifiche json
);

insert into articolo(descrizione, specifiche)
values(
	'tv samsung smart 32"',
    '{
		"marca":"SAMSUNG",
        "pesoKg":5.5,
        "schermo":"OLED",
        "pollici":42,
        "uscite":["HDMI","USB"]
    }'
);

select * from articolo;

-- fare l'inserimento del json senza seguire la sintassi json grazie alla funzione json object
insert into articolo(descrizione, specifiche)
values(
'TV SONY SMART 32"',
	json_object(
		"marca","SAMSUNG",
        "pesoKg",5.5,
        "schermo","OLED",
        "pollici",42,
        "uscite","HDMI"
	)
);

-- le funzioni si possono anche nidificare per esempio la funzione json array per inserire l'array nel json
insert into articolo(descrizione, specifiche)
values(
'TV PHILIPS SMART 55"',
	JSON_OBJECT(
		"marca","PHILIPS",
        "pesoKg",9.5,
        "schermo","LED",
        "pollici",55,
        "uscite",JSON_ARRAY('hdmi','rca','usb','scart')
	)
);

-- ************* LEGGERE IL DATO JSON
select descrizione, JSON_EXTRACT(specifiche, '$.uscite')
from articolo;
