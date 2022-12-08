#! /usr/local/bin/bash

num=4
num2=5
for j in {1..3}; do
    for i in {1..5}; do
        (time java Main $num $num2) &>> test2.txt;
    
    
    done
    num=$((num+1))
    num2=$((num2+1))
done


# (time java Main 4 5) &>> test.txt; 