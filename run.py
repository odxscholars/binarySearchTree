import os


outfile = "test"
tCases = 5
k = 5
n = 4
s1 = "bash --version"
s = "(time java Main " + str(n) + " " + str(k) + ") &>> " + outfile + ".txt"
print(s)
os.system(s1)


