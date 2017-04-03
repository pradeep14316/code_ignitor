echo tyoe the file you want to do perform operations
read var
while [ "$var" != "bye" ]
do 
echo "enter the command you want to perform onthe file"
read cmd
$cmd $var
echo "type another file name(type ^C to exit)"
read var
done

