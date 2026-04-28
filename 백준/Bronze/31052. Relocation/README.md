# [Bronze III] Relocation - 31052

[문제 링크](https://www.acmicpc.net/problem/31052)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 262, 정답: 222, 맞힌 사람: 192, 정답 비율: 84.956%

### 분류

구현

### 문제 설명

<p>In the faraway country of Lineland, tech companies are starting to take over! Every week, it seems that tech companies sprout from the ground, merge, get acquired, or go under. For software engineers looking for new jobs in Lineland, it can be difficult to even find the companies where they&rsquo;re interviewing.</p>

<p>To solve this issue, you&rsquo;re going to make a new tech company! The product is simple: using deep neural blockchains in the cloud, your app finds the distance between any two tech companies in Lineland. This is supremely useful, as companies change offices all the time and it&rsquo;s difficult to stay completely up to date. By centralizing this information, your company is going to make the world a better place.</p>

<p>Since Lineland is organized around a single line, the location of a company can be given by a single coordinate. The distance between any two companies is equal to the distance between their two coordinates.</p>

<p>Your job is to handle two kinds of user requests to the company&rsquo;s flagship app. One kind of request updates the address of a company, the other requests the shortest distance between two companies.</p>

### 입력

<p>The first line has two positive space-separated integers $N$ and $Q$: the number of companies the app tracks ($2 \le N \le 100\, 000$), and the number of requests to process ($1 \le Q \le 100\, 000$). The next line has $N$ space-separated integers $1 \le X_ i \le 10^9$, which are the initial locations of the $N$ companies, given in order from $i=1$ to $i=N$.</p>

<p>Each of the next $Q$ lines has $3$ space-separated integers, taking one of the following forms:</p>

<ul>
	<li>
	<p>$1$ $C$ $X$, which means that company $C$ moves its location to $X$, or</p>
	</li>
	<li>
	<p>$2$ $A$ $B$, which is a query for the distance between companies $A$ and $B$.</p>
	</li>
</ul>

<p>It is guaranteed that $1 \leq A, B, C \leq N$ and $1 \leq X \leq 10^9$. It is possible two companies can share the same location. It is also guaranteed there is at least one query of type $2$.</p>

### 출력

<p>For each query of type $2$, print the distance between companies $A$ and $B$.</p>

### 힌트

<p>In the first query, Company $2$ moves to location $10$. Then the app is asked for the distance between company $4$ and company $5$, which is $3$. The next query is the distance between companies $1$ and $3$, which is also $3$. A number of updates and queries follow.</p>