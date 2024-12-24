INSERT INTO tickets (id, titre, description, date_creation, date_maj, Impact, Etat, Utilisateur_createur, Poste_informatique, type_de_demande) VALUES
('T001', 'Problème démarrage', 'Le système ne démarre pas correctement', '2024-12-15 09:10:00', '2024-12-15 09:20:00', 'Bloquant', 'Ouvert', 'John', 'Poste3', 'Incident'),
('T002', 'Erreur application', 'L\'application plante à l\'ouverture', '2024-12-15 10:00:00', '2024-12-15 10:15:00', 'Majeur', 'En cours', 'Alice', 'Poste1', 'Bug'),
('T003', 'Problème connexion Wi-Fi', 'Connexion Wi-Fi instable, se déconnecte fréquemment', '2024-12-15 11:30:00', '2024-12-15 11:35:00', 'Mineur', 'Ouvert', 'Bob', 'Poste2', 'Support'),
('T004', 'Écran noir au démarrage', 'L\'ordinateur affiche un écran noir après le démarrage', '2024-12-15 12:00:00', '2024-12-15 12:10:00', 'Bloquant', 'Ouvert', 'Eve', 'Poste5', 'Incident'),
('T005', 'Clavier défectueux', 'Certaines touches du clavier ne répondent pas', '2024-12-15 13:00:00', '2024-12-15 13:10:00', 'Mineur', 'Résolu', 'Tom', 'Poste4', 'Maintenance');
INSERT INTO utilisateurs (id, nom, email, mot_de_passe, date_derniere_connexion, statut, utilisateur, intervenant) VALUES
('U001', 'John Doe', 'johndoe@example.com', 'hashed_password123', '2024-12-15 08:50:00', 'Oui', '1', '0'),
('U002', 'Alice Smith', 'alicesmith@example.com', 'hashed_password456', '2024-12-13 16:00:00', 'Non', '0', '1'),
('U003', 'Bob Johnson', 'bobjohnson@example.com', 'hashed_password789', '2024-12-12 13:00:00', 'Oui', '1', '0'),
('U004', 'Eve Carter', 'evecarter@example.com', 'hashed_password101', '2024-12-14 09:10:00', 'Oui', '0', '1'),
('U005', 'Tom Wilson', 'tomwilson@example.com', 'hashed_password202', '2024-12-13 18:30:00', 'Non', '1', '0');
INSERT INTO postes_informatiques (id, utilisateur_affecte, etat, configuration) VALUES
('Poste1', 'Alice', 'En fonction', 'Processeur Intel i7, 16GB RAM, 512GB SSD, écran 17 pouces'),
('Poste2', 'Bob', 'En maintenance', 'Processeur AMD Ryzen 7, 16GB RAM, 1TB SSD, écran 15 pouces'),
('Poste3', 'John', 'En fonction', 'Processeur Intel i5, 8GB RAM, 256GB SSD, écran 14 pouces'),
('Poste4', 'Tom', 'En fonction', 'Processeur Apple M1, 16GB RAM, 256GB SSD, écran Retina 15 pouces'),
('Poste5', 'Eve', 'En commande', 'Processeur Intel i9, 64GB RAM, 2TB SSD, écran 32 pouces');
