create table orders
(
   orderId int,	
   customername varchar(255),
   orderdate varchar(255),
   shippingaddress varchar(255),
   orderitems varchar(255),
   total int,
   primary key(customername)
);