# [Gold IV] Instagraph - 35224

[문제 링크](https://www.acmicpc.net/problem/35224)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 2048 MB

### 통계

제출: 20, 정답: 18, 맞힌 사람: 17, 정답 비율: 89.474%

### 분류

그래프 이론, 자료 구조, 집합과 맵

### 문제 설명

<p>A celebrity in a social network is somebody with many followers, but who doesn't follow them back. More precisely, a person is a <em>celebrity</em> for a group of people, if</p>

<ul>
<li>every member of the group follows the person,</li>
<li>the person follows nobody in the group.</li>
</ul>

<p>The <em>celebrity centrality</em> of person $v$, written $\mathrm{CC}(v)$, is the maximum size of such a group.</p>

<p>We model the social network as a directed graph with $N$ vertices  $1$,  $\ldots$, $N$. A directed edge from $u$ to $v$ means that person $u$ follows person $v$. For example, in</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35224.%E2%80%85Instagraph/6641ccf1.png" data-original-src="https://boja.mercury.kr/assets/problem/35224-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 88px;"></p>

<p>we have $\operatorname{CC}(1) = 0$, $\operatorname{CC}(2) = 1$, and $\operatorname{CC}(5) = 2$.</p>

<p>Your task is to find a vertex $v$ with the maximum celebrity centrality $\mathrm{CC}(v)$. In case of a tie, choose the smallest $v$.</p>

### 입력

<p>The input consists of</p>

<ul>
<li>One line with two integers $N$ and $M$ ($1 \le N \le 200\,000$, $0 \le M \le 1\,000\,000$), the number of vertices and the number of directed edges.</li>
<li>$M$ lines with two distinct integers $u$ and $v$ ($1 \le u,v \le N$), indicating a directed edge from $u$ to $v$. There are no duplicate edges.</li>
</ul>

### 출력

<p>Output two integers: the smallest $v$ with the maximum celebrity centrality and the value $\mathrm{CC}(v)$.</p>