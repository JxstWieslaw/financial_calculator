# 31/01/2022❤️‍🔥Finance Calculator
We have 3 people who have spend money collectively. 
So i need a way to calculate budgets and accountabilities. 
How much we each owe each other. Given that one of 3 
people is the mediater who balances out the money spent, 
I will create a calculator to automate the process. 

1. I need 3 variables:
	- seanPaid-get Total
	- nenyashaPaid-getTotal
	- wieslawPaid-getTotal
2. Calculate how much each is owed : 
	- seanPaid= seanPaid-seanPaid/3;
	- nenyashaPaid= nenyashaPaid-nenyashaPaid/3;
	- wieslawPaid= wieslawPaid-wieslawPaid/3;
3. Make copies of these variables to:
	-  seanBalance = seanPaid;
	- nenyashaBalance = nenyashaBalance;
	- wieslawBalance = wieslawBalance;
4. Calculate how much each will remain with after making changes:
	- seanPaid = seanPaid -nenyashaBalance /2 -wieslawBalance /2;
	- nenyashaPaid = nenyashaPaid - seanBalance /2 - wieslawBalance /2;
	- wieslawPaid = wieslawPaid - seanBalance/2 - nenyashaBalance /2;
5. Now we have actual balances....
