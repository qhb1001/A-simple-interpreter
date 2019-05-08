import matplotlib
matplotlib.use('TkAgg')
import matplotlib.pyplot as plt

fig = plt.figure()
ax1 = fig.add_subplot(111)

ax1.set_title('Scatter Plot')

plt.xlabel('X')

plt.ylabel('Y')

x, y = [], []
with open('output.txt', 'r') as f:
    for line in f.readlines():
        input = line.split()
        x.append(eval(input[0]))
        y.append(eval(input[1]))
ax1.scatter(x, y, s=4)
ax = plt.gca()
ax.set_aspect(1)

plt.show()
