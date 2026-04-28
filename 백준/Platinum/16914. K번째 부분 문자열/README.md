# [Platinum II] K번째 부분 문자열 - 16914

[문제 링크](https://www.acmicpc.net/problem/16914)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 254, 정답: 97, 맞힌 사람: 81, 정답 비율: 42.408%

### 분류

문자열, 접미사 배열과 LCP 배열

### 문제 설명

<p>문자열 S가 주어졌을 때, 다음 쿼리를 수행하려고 한다.</p>

<ul>
	<li>K: S의 서로 다른 부분 문자열을 사전 순으로 정렬했을 때, K번째 오는 문자열을 출력한다.</li>
</ul>

<p>S = &quot;aaa&quot;인 경우&nbsp;부분 문자열은 &quot;a&quot;, &quot;a&quot;, &quot;a&quot;, &quot;aa&quot;, &quot;aa&quot;, &quot;aaa&quot;가 있고, 서로 다른 부분 문자열은 &quot;a&quot;, &quot;aa&quot;, &quot;aaa&quot;가 있다.</p>

### 입력

<p>첫째 줄에 문자열 S, 둘째 줄에 쿼리의 개수 Q가 주어진다. 다음 Q개의 줄에는 쿼리 K가 한 줄에 하나씩 주어진다.</p>

### 출력

<p>각각의 쿼리마다 S의 서로 다른 부분 문자열 중&nbsp;사전 순으로 K번째 오는 것을 한 줄에 하나씩 출력한다. K번째 부분 문자열이 없는 경우에는 -1을 출력한다.</p>

### 제한

<ul>
	<li>1 &le; S의 길이 &le; 90,000</li>
	<li>1 &le; Q &le; 500</li>
	<li>0 &lt; K &lt; 2<sup>31</sup></li>
</ul>