# [Silver V] Noise Reduction - 34372

[문제 링크](https://www.acmicpc.net/problem/34372)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 31, 정답: 22, 맞힌 사람: 19, 정답 비율: 67.857%

### 분류

구현, 브루트포스 알고리즘, 사칙연산, 수학

### 문제 설명

<p>Monique is a climatologist who is analyzing the effects of climate change on weather patterns in Antarctica. She has compiled a set of $N$ high-precision temperature readings in nanokelvins using her world-leading thermal energy measurement system at McMurdo Station.</p>

<p>Unfortunately, there is a lot of noise in the data because the other scientists keep having snowball fights near Monique's equipment, and penguins waddle past and peck at the sensor. Monique has since moved the system to a better location, but she would like to recover as much climate data as possible from her original readings.</p>

<p>She has hired you to write a program that will reduce the <strong>noise level</strong> in her data while she builds an even better thermal energy measurement system.</p>

<p>The noise level of the dataset varies depending on the <strong>group size</strong> you choose. Given a group size $g$, the noise level can be calculated as follows:</p>

<ol>
	<li>Partition consecutive readings into groups of size $g$. Discard any readings at the end of the dataset that would not form a group of size $g$.</li>
	<li>Compute the average temperature for each of the groups. Round down to the nearest integer less than or equal to the average (the floor of the average).</li>
	<li>Calculate the noise level by determining the <em>maximum difference between the averages of two adjacent groups</em>. If there is only a single group, the noise level is $0$.</li>
</ol>

<p>Your task is to <strong>determine the smallest group size that causes the noise level of Monique's dataset to be less than or equal to the threshold $T$</strong>. Note that the largest number you should output is $N/2 + 1$ since with that size you will only be able to create a single group of size $N/2 + 1$ which by definition will have no noise.</p>

### 입력

<p>The first line contains two space-separated integers, $1 \leq N \leq 10\,000$ and $1 \leq T \leq 1\,000$, the number of readings to follow, and the target noise threshold, respectively.</p>

<p>The next $N$ lines contain the readings, with each line containing a single reading, an integer in the range $[0, 1\,000\,000\,000]$.</p>

### 출력

<p>Output a single integer, the smallest group size that ensures that the noise level of Monique's dataset is less than or equal to the threshold $T$.</p>

### 힌트

<p>In Sample Input $1$, with a group size of $2$, the average for the first group ($1$ and $3$) is $2$, the average for the second group ($4$ and $2$) is $3$, and the average for the third group ($8$ and $1$) is $4$ because you always round down to the nearest integer. The rest of the data is discarded because you cannot create a group of size $2$. The noise level of this input with a group size of $2$ is $1$ because the maximum difference between adjacent group averages is $1$. This is less than or equal to the threshold of $1$. Since using a group size of $1$ would result in a noise level of $7$, the lowest group size that satisfies the noise level threshold is $2$.</p>

<p>In Sample Input $2$, when using a group size of $2$, the third group ($1$ and $1$) has an average of $1$. This causes the difference between the averages of the second and third groups to be $2$, which is greater than the threshold of $1$. So using a group size of $2$ is not sufficient to satisfy the noise level threshold. A group size of $3$ is sufficient because the first group's average is $2$ (remember, always round <strong>down</strong>), and the second group's average is $1$.</p>