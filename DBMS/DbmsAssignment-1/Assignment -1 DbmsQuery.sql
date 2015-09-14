
SELECT * FROM Book_Return;
-- Update table member column addressline to Jaipur
UPDATE Members SET addressLine2 = "Jaipur";

-- Update addressLine1 to Epip Sitapura
UPDATE Members set addressLine1 = 'EPIP, Sitapura' where category ='f';

-- Updating Members
SELECT * FROM Members;
DELETE FROM Title WHERE publisher_Id = 1; 
SELECT * from Title;

-- Deleting Publishers
DELETE FROM publishers;


-- Re entring the Value in Publisher Table
SET @name = 'Shyam Books';
SET @Id = 1;
INSERT INTO Publishers(publisher_Id, publisher_Name)
VALUES(@Id, @name);


SET @name = ' Cbc House';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);


SET @name = 'A M Publishers';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'Academia Research';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'Genius Publication';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'Cloud Publications';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'College Book House';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);


SELECT * FROM Publishers;