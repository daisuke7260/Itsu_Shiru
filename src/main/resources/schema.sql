CREATE TABLE IF NOT EXISTS quiz(
	id INT AUTO_INCREMENT,
	content VARCHAR(256) NOT NULL,
	answer VARCHAR(1),
	explanation VARCHAR(256),
	category VARCHAR(10) NOT NULL,
	field VARCHAR(10) ,
	PRIMARY KEY(id)
	);
 	 