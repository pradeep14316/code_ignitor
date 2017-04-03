
echo Here is the summary of sales report:
echo ===================================
echo
cat /dev/stdin | cut -d' ' -f 2,3 | sort
