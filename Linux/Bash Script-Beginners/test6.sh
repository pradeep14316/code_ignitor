echo Hello! here is the report of cars  bought by pradeep:
echo ----------------------------------------------------
echo 
cat /dev/stdin |cut -d' ' -f 2,3,4,5| sort
