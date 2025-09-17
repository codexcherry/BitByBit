-- Last updated: 9/17/2025, 9:28:38 PM
select FirstName, LastName, City, State
from Person left join Address
on Person.PersonId = Address.PersonId
;