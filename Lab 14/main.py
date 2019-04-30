def conpay():
    owned, payment, rate = 10000.0, 1000.0, 8.0
    
    def next2(x):
        return x*(1.0+rate/100.0)
        
    def round2(x):
        return round(x*100.0)/100.0
        
    print ("%10s%15s%15s%15s"% ("year", "owned before", "payment", "owned after "))
    print ("%10s%15s%15s%15s"% ("", "payment", "", "payment"))
    print("-------------------------------------------------------------")
    
    year=1
    while(payment<=next2(owned)):
        owned = next2(owned)
        owned = round2(owned)
        print ("%10d%15.4f%15.5f%15.5f"%(year, owned, payment, owned-payment))
        year =year +1
        owned = owned-payment
        
    owned = next2(owned)
    owned = round2(owned)
    
    print ("%10d%15.4f%15.5f%15.5f"%(year, owned, owned, 0.0))
    print("-------------------------------------------------------------")
            
        
conpay()