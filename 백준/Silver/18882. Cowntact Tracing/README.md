# [Silver I] Cowntact Tracing - 18882

[문제 링크](https://www.acmicpc.net/problem/18882)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 689, 정답: 187, 맞힌 사람: 151, 정답 비율: 28.872%

### 분류

구현, 브루트포스 알고리즘, 시뮬레이션

### 문제 설명

<p>Farmer John is worried for the health of his cows (conveniently numbered $1 \ldots N$ as always) after an outbreak of the highly contagious bovine disease COWVID-19.</p>

<p>Recently, Farmer John tested all of his cows and found some of them to be positive for the disease. Using video footage from inside his barn, he is able to review recent interactions between pairs of cows --- it turns out that when cows greet each-other, they shake hooves, a gesture that can unfortunately spread the infection from one cow to another. Farmer John assembles a time-stamped list of interacting pairs of cows, with entries of the form $(t, x, y)$, meaning that at time $t$, cow $x$ shook hooves with cow $y$. Farmer John also knows the following:</p>

<p>(i) Exactly one cow on his farm could have started out carrying the disease (we&#39;ll call this cow &quot;patient zero&quot;).</p>

<p>(ii) Once a cow is infected, she passes the infection along with her next $K$ hoof shakes (possibly including the same partner cow several times). After shaking hooves $K$ times, she no longer passes the infection along with subsequent hoof shakes (since at this point she realizes she is spreading the infection and washes her hooves carefully).</p>

<p>(iii) Once a cow is infected, she stays infected.</p>

<p>Unfortunately, Farmer John doesn&#39;t know which of his $N$ cows is patient zero, nor does he know the value of $K$! Please help him narrow down the possibilities for these unknowns based on his data. It is guaranteed that at least one possibility is valid.</p>

### 입력

<p>The first line of the input file contains $N$ ($2 \leq N \leq 100$) and $T$ ($1 \leq T \leq 250$). The next line contains a string of length $N$ whose entries are 0s and 1s, describing the current state of Farmer John&#39;s $N$ cows --- 0 represents a healthy cow and 1 represents a cow presently with the disease. Each of the next $T$ lines describes a record in Farmer John&#39;s list of interactions and consists of three integers $t$, $x$, and $y$, where $t$ is a positive integer time of the interaction ($t \leq 250$) and $x$ and $y$ are distinct integers in the range $1 \ldots N$, indicating which cows shook hands at time $t$. At most one interaction happens at each point in time.</p>

### 출력

<p>Print a single line with three integers $x$, $y$, and $z$, where $x$ is the number of possible cows who could have been patient zero, $y$ is the smallest possible value of $K$ consistent with the data, and $z$ is the largest possible value of $K$ consistent with the data (if there is no upper bound on $K$ that can be deduced from the data, print &quot;Infinity&quot; for $z$). Note that it might be possible to have $K=0$.</p>

### 힌트

<p>The only candidate for patient zero is cow 1. For all $K&gt;0$, cow 1 infects cow 2 at time 7, while cows 3 and 4 remain uninfected.</p>