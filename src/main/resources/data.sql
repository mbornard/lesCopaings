INSERT INTO Utilisateur(userID, nom, prenom, email, notes, dateNaiss) VALUES

(default, 'Bornard', 'Matisse', 'mb@etud.univ-jfc.fr', 5, '2002-12-25'), --code 1
(default, 'Miralles', 'Lucas', 'lm@etud.univ-jfc.fr', 5, '2002-11-09'),--code 2
(default, 'Brignatz', 'Loris', 'lb@etud.univ-jfc.fr', 5, '2002-11-20'), --code 3
(default, 'Ntamack', 'Romain', 'ntk@etud.univ-jfc.fr', 5, '1999-05-01'); --code 4

INSERT INTO Point(idPoint, nom, adresse, longitude, latitude) VALUES

(default, 'isis', 'rue firmin oules', 1.00, 2.00),
(default, 'iut', 'Av Georges Pompidou', 1.00, 2.00);

/*INSERT INTO Trajet (numTrajet, userID, idpoint)*/