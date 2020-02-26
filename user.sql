-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  mer. 26 fév. 2020 à 18:49
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP :  7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `scrum-app`
--

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `is_enabled` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `email`, `first_name`, `last_name`, `password`, `photo`, `is_enabled`) VALUES
(1, 'saber@saber22222222', 'sjjjjjjjjjjjjjjjjjjjjjjjjjaber', 'saber', '$2a$10$VGT6fiTOmblDNFMG3YB5LOGO/HMFRrlZKK2m64xe3k5CS1k3/i9IG', 'user.png', b'0'),
(2, 'saber@mekkimekkidgbgbbgbg', '1245555', 'ffdeffefrer', '$2a$10$jyX340plGdteApf7cApFLu8qET5wfvc5drIPJrpiC0p8KcOwbjzZS', NULL, b'0'),
(3, 'saber@mekki', 'sauuuuber', NULL, 'saber', NULL, b'0'),
(4, NULL, NULL, NULL, 'saber', NULL, b'0'),
(5, 'saber@saber', 'safffffffffffber', NULL, 'saber', NULL, b'0'),
(6, 'sabe11111111111r@saber', 'sabgdfger huyyu', 'saber', '$2a$10$i51VsEf8BjpzzKI5.v3XPe9XuzMVrPQfxzTf7S13nehJ9Qh6bDWeq', NULL, b'0'),
(7, 'khadija@gmail.com', NULL, NULL, '$2a$10$b/p9BPn5eCunuKEVsGdgnezDq.6gxcD31X7Ge4Hrih7bCRUARKbYa', NULL, b'0'),
(13, NULL, 'khadija', NULL, NULL, NULL, b'0'),
(14, NULL, 'khadija', NULL, NULL, NULL, b'0'),
(15, 'saber@sabdddddder', 'sjjjjjjjjjjjjjjjjjjjjjjjjjaber', 'saber', 'saber', NULL, b'0'),
(24, 'saber@adel', '1111111111111', 'sssssssssssssssssssssssssssssssssssssss', '$2a$10$VcptqbgfmLbI0uO6P9ipHuTnNIgNfizUS4J7Znmn2/4JZBDFPgl9K', NULL, b'0'),
(26, 'saber@mekkimekkidgbgbbgvvvvvbg', '1245555vvvvvvvvv', 'ffdeffefrervvvvvvvvvv', '$2a$10$91bWdFUJabmIy3W39EepoO9N70FQ/HD/foMFnbT/s00lRMaGf3HWG', 'Sélection_022.png', b'0'),
(28, 'saber@mekkimekkidgbgbbgvvvvvbg', '1245555vvvvvvvvv', 'ffdeffefrervvvvvvvvvv', '$2a$10$sIitS0YHqZnlU7mlPox83ee2e11R1LEo/d3k0JSfbVjI0NZ.vzrRu', 'Sélection_022.png', b'0');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
