# [Platinum V] Gathering Search Results - 30311

[문제 링크](https://www.acmicpc.net/problem/30311)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 36, 맞힌 사람: 34, 정답 비율: 82.927%

### 분류

수학, 그리디 알고리즘, 정렬

### 문제 설명

<p>You are making a new search engine for algorithms, called the Benelux Algorithm Preview Collector. All the marketing has been done, and you have plenty of investors, but there is one small problem: you have not written any code yet! As there are only five hours left until the product launch, you decide that there is not enough time to implement your own ranking algorithm. Instead, whenever a user searches for an algorithm, you just forward it to the $k$ most popular other search engines and use their results.</p>

<p>Each of these $k$ search engines gives a list of $n$ results, ordered by estimated relevance. Surprisingly, it turns out that for every search term you try, the different search engines always give the same $n$ results, only the order differs between the search engines! You just need to find a way to combine the $k$ different rankings into a single ranking.</p>

<p>To do this, you decide to give each possible combined ranking a cost: for each result $r$ and search engine $s$, if your combined ranking puts $r$ at the position $i$, and search engine $s$ puts $r$ at position $j$, then you incur a cost of $(i-j)^2$. The total cost of a combined ranking is the sum of all $k \cdot n$ costs computed this way.</p>

<p>As an example, consider the second sample case. The first search engine returns the same result as the sample output, which has cost $0$. The second search engine swaps two adjacent results, which has cost $1+1=2$. For the third search engine, the first result is moved two positions back, and the other two are shifted one position to the front, which has cost $4+1+1=6$. The total cost is then $0+2+6=8$, which is the minimal possible cost over all possible orders.</p>

<p>What is the order in which BAPC should output the results, such that the total cost is minimized?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing two integers $n$ and $k$ ($1\leq n\leq 5000$, $1\leq k\leq 100$), the number of results, and the number of search engines.</li>
	<li>$k$ lines, each containing $n$ integers, denoting the results as ordered by one of the search engines. It is guaranteed that each line contains every integer from $1$ to $n$ exactly once.</li>
</ul>

### 출력

<p>Output the combined order of the results, such that the cost is minimized.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>