create table Utilisateur (
	userID int primary key,
	nom varchar(30),
	prenom varchar(40),
	email varchar(50),
	notes numeric,
	dateNaiss date

);
create table Trajet (
	numTrajet int primary key,
	userID int,
	idpointDepart int,
	idpointArrivee int,
	dateDepart date,
	heureDepart time,
	constraint fk_idPointDepart foreign key (idpointDepart) references Point(idPoint),
	constraint fk_idpointArrivee foreign key (idpointArrivee) references Point(idPoint)


);

	constraint fk_userID foreign key (userID) references Utilisateur(userID)
create table Passagers(
	userID int,
	numTrajet int,
	idpointDepartPassager int,
	idpointArriveePassager int,
	constraint pk_passagers primary key (userID, numTrajet),
	constraint fk_user_passager foreign key (userID) references Utilisateur(userID),
	constraint fk_trajet_passager foreign key (numTrajet) references Trajet(numTrajet),
	constraint fk_pointDepartPassager foreign key (idpointDepartPassager) references Point(idPoint),
	constraint fk_pointArriveePassager foreign key (idpointArriveePassager) references Point(idPoint)
);

create table PointArret(
	numTrajet int,
	idPoint int,
	CONSTRAINT point_arretPK PRIMARY KEY (numTrajet, idPoint),
	CONSTRAINT numTrajet_FK FOREIGN KEY (numTrajet) REFERENCES Trajet (numTrajet),
	CONSTRAINT idPoint_FK FOREIGN KEY (idPoint) REFERENCES Point (idPoint)

	)


create table Point(
	idPoint int primary key,
	nom varchar(100),
	adresse varchar(250),
	longitude numeric,
	latitude numeric
	);





/*ALTER TABLE trajet ALTER COLUMN pointDepart TYPE Point USING pointDepart::Point;
*/