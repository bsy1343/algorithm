# [Bronze I] <code>apt upgrade</code> - 30489

[문제 링크](https://www.acmicpc.net/problem/30489)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 198, 정답: 121, 맞힌 사람: 112, 정답 비율: 60.870%

### 분류

수학, 정렬, 사칙연산

### 문제 설명

<p>You are using your favourite program, the BAPC ArchLinux Package Configurator, to upgrade your system. There are $n$ outdated packages that will be upgraded, and your package manager is kind enough to inform you of the download size for each package up front. Due to recent advances in parallelism, it downloads up to $k$ packages in parallel, although you do not know the order in which they are downloaded.</p>

<p>You are now looking at the download progress bar in the console, and observe that only $m$ packages have currently finished downloading but the overall download progress is already very high. This does not seem to make sense! You wonder: what is the maximum overall percentage of the total download size that could be done with this many package downloads completed? Note that there is a small duration of time in which a package that is being downloaded is reported as $100\%$ done, but not yet finished.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers $n$, $m$, and $k$ ($1\leq n\leq 10^5$, $0\leq m\leq n$, $1\leq k\leq 10$), the number of packages being upgraded, the number of packages that finished downloading, and the number of packages that can be downloaded in parallel.</li>
	<li>One line with $n$ integers $s$ ($1\leq s\leq 10^9$), the sizes of the packages being upgraded.</li>
</ul>

### 출력

<p>Output the maximum possible percentage of the download that is done.</p>

<p>Your answer should have an <em>absolute</em> error of at most $10^{-4}$.</p>