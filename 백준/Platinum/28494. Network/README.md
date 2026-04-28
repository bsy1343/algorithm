# [Platinum I] Network - 28494

[문제 링크](https://www.acmicpc.net/problem/28494)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 17, 맞힌 사람: 16, 정답 비율: 57.143%

### 분류

그리디 알고리즘, 최소 공통 조상, 작은 집합에서 큰 집합으로 합치는 테크닉, 트리

### 문제 설명

<p>Rui Yuan the Duck is building a new network to run all of his new applications. This network is comprised of $n$ servers numbered from $1$ to $n$. There are also $n - 1$ network links, numbered from $1$ to $n - 1$ connecting these servers.</p>

<p>The $i$-th of these links connects servers $u[i]$ and $v[i]$ <strong>bidirectionally</strong>. It is guaranteed that it is possible to travel from any server to any other server using only the servers and network links.</p>

<p>Initially, all $n$ servers are active. Rui Yuan has $m$ applications running, which have distinct IDs from $1$ to $m$. Each application has $2$ databases. Application $j$ has databases in servers $a[j]$ and $b[j]$ (which may be the same server). It is possible for two different applications to have a database on the same server.</p>

<p>In order for application $j$ to work, both of its databases must be connected through network links and active servers. To be precise, application $j$ is working if both of the following conditions are met:</p>

<ul>
	<li>Servers $a[j]$ and $b[j]$ are both active.</li>
	<li>One can travel from server $a[j]$ to server $b[j]$ using only network links and active servers.</li>
</ul>

<p>Rui Yuan has asked Benson the Rabbit to test his network. Using his hacking skills, Benson can select any set of servers and deactivate all of them simultaneously. The robustness of the network is the minimum number of servers that must be deactivated to ensure <strong>all</strong> $m$ applications are not working.</p>

<p>Benson is very busy, so he wants you to help him compute the robustness of the network and the selection of servers he should deactivate so that he doesn&rsquo;t waste time deactivating more servers than needed.</p>

### 입력

<p>The first line of input contains two integers, $n$ and $m$.</p>

<p>$n - 1$ lines will follow. The $i$-th line contains two integers, $u[i]$ and $v[i]$ respectively, which are the servers connected by the $i$-th network link.</p>

<p>Another $m$ lines will follow. The $j$-th line contains two integers, $a[j]$ and $b[j]$ respectively, which are the servers storing the databases for application $j$.</p>

### 출력

<p>Output two lines. The first line should contain a single integer, representing the robustness of the network, which we will denote as $x$.</p>

<p>The second line should contain $x$ integers, representing the servers that should be deactivated. All $x$ integers must be pairwise distinct. You may output them in any order.</p>

### 제한

<ul>
	<li>$1 &le; n &le; 200\,000$</li>
	<li>$1 &le; m &le; 200\,000$</li>
	<li>$1 &le; u[i], v[i] &le; n$, $u[i] \ne v[i]$ (for all $1 &le; i &le; n$).</li>
	<li>$1 &le; a[j], b[j] &le; n$ (for all $1 &le; j &le; m$)</li>
	<li>It is possible to travel from any server to any other server using only the servers and network links.</li>
</ul>