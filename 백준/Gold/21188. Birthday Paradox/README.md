# [Gold IV] Birthday Paradox - 21188

[문제 링크](https://www.acmicpc.net/problem/21188)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 14, 맞힌 사람: 13, 정답 비율: 68.421%

### 분류

수학, 조합론, 확률론

### 문제 설명

<p>The Birthday Paradox is the name given to the surprising fact that if there are just $23$ people in a group, there is a greater than $50\%$ chance that a pair of them share the same birthday. The underlying assumptions for this are that all birthdays are equally likely (which isn&#39;t quite true), the year has exactly $365$ days (which also isn&#39;t true), and the people in the group are uniformly randomly selected (which is a somewhat strange premise). &nbsp;For this problem, we&#39;ll accept these assumptions.</p>

<p>Consider what we might observe if we randomly select groups of $P=10$ people. Once we have chosen a group, we break them up into subgroups based on shared birthdays. Among <em>many</em> other possibilities, we might observe the following distributions of shared birthdays:</p>

<ul>
	<li>all $10$ have different birthdays, or</li>
	<li>all $10$ have the same birthday, or</li>
	<li>$3$ people have the same birthday, $2$ other people have the same birthday (on a different day), and the remaining $5$ all have different birthdays.</li>
</ul>

<p>Of course, these distributions have different probabilities of occurring.</p>

<p>Your job is to calculate this probability for a given distribution of people sharing birthdays. &nbsp;That is, if there are $P$ people in a group, how probable is the given distribution of shared birthdays (among all possible distributions for $P$ people chosen uniformly at random)?</p>

### 입력

<p>The first line gives a number $n$ where $1 \le n \le 365$. The second line contain integers $c_1$ through $c_n$, where $1 \le c_i \le 100$ for all $c_i$. The value $c_i$ represents the number of people who share a certain birthday (and whose birthday is distinct from the birthdays of everyone else in the group).</p>

### 출력

<p>Compute the probability $b$ of observing a group of people with the given distribution of shared birthdays. Since $b$ may be quite small, output instead $\log_{10}(b)$. Your submission&#39;s answer is considered correct if it has an absolute or relative error of at most $10^{-6}$ from the judge&#39;s answer.</p>

### 힌트

<p>The first sample case shows $P=2$ people with distinct birthdays. The probability of this occurring is $b = 364/365 \approx 0.9972602740$, and $\log_{10}(b) \approx -0.001191480807419$.</p>

<p>The second sample case represents the third example in the list given earlier with $P=10$ people. In this case, the probability is $b \approx 0.0000489086$, and $\log_{10}(b) \approx -4.310614508857128$.</p>