# [Platinum IV] Byteland - 8632

[문제 링크](https://www.acmicpc.net/problem/8632)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 200, 정답: 84, 맞힌 사람: 53, 정답 비율: 35.333%

### 분류

그래프 이론, 자료 구조, 트리, 분리 집합, 최소 스패닝 트리

### 문제 설명

<p>King Byteasar I the Great is the ruler of a mighty and rich country of Byteland. There are $n$&nbsp;towns in the country. King Byteasar would like to improve the infrastructure of Byteland and has ordered the royal architects to prepare plans for building highways across the country. He has received $m$&nbsp;proposals, each of which is described by three numbers $p$, $k$, $w$, where $p$&nbsp;and $k$&nbsp;are the towns being the endpoints of the highway, and $w$&nbsp;denotes the cost of building this highway. Each highway is bidirectional and does not visit any town except for its endpoints.</p>

<p>The king would like to choose the highways so that there exists at least one way of travelling between any pair of towns, possibly by visiting several towns along the way. Byteasar would like to build the highway network as cheaply as possible.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input the number of towns, the number of proposed highways and the descriptions of these highways,</li>
	<li>finds out, for each highway, whether there exists a highway network containing this highway and satisfying Byteasar&#39;s requirements,</li>
	<li>writes the results to the standard output.</li>
</ul>

### 입력

<p>The first line of the input contains two integers: the number of towns, $n$, and the number of proposed highways, $m$, separated with a single space and satisfying the conditions: $2 &le; n &le; 7\,000$, $1 &le; m &le; 300\,000$. Each of the following $m$&nbsp;lines contains three space-separated integers $p$, $k$, $w$, describing the proposed highway. Here $p$&nbsp;and $k$&nbsp;denote the numbers of towns which are endpoints of the highway, and $w$&nbsp;is the price of the highway ($1 &le; p, k &le; n$, $1 &le; w &le; 100\,000$).</p>

### 출력

<p>The output should consist of $m$&nbsp;lines. The $i$-th of those lines should contain a word &quot;<code>TAK</code>&quot; or &quot;<code>NIE</code>&quot;, depending on whether there exists a highway network satisfying Byteasar&#39;s requirements containing the $i$-th highway from the input. You can safely assume that there exists at least one highway network satisfying Byteasar&#39;s requirements.</p>