# [Silver V] 단어 시계 - 17091

[문제 링크](https://www.acmicpc.net/problem/17091)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 1291, 정답: 408, 맞힌 사람: 333, 정답 비율: 30.720%

### 분류

구현, 문자열, 많은 조건 분기

### 문제 설명

<p>단어 시계는 시각을 단어를 이용해서 표현하는 시계이다. 다음은 몇 가지 예시이다.</p>

<ul>
	<li>5:00&nbsp;&rarr; five o&#39; clock</li>
	<li>5:01&nbsp;&rarr; one minute past five</li>
	<li>5:10&nbsp;&rarr; ten minutes past five</li>
	<li>5:15&nbsp;&rarr; quarter past five</li>
	<li>5:28 &rarr; twenty eight minutes past five</li>
	<li>5:30&nbsp;&rarr; half past five</li>
	<li>5:40&nbsp;&rarr; twenty minutes to six</li>
	<li>5:45&nbsp;&rarr; quarter to six</li>
	<li>5:47&nbsp;&rarr; thirteen minutes to six</li>
</ul>

<p>분 = 0이면&nbsp;&quot;o&#39; clock&quot;을 사용하고, 1 &le; 분 &le; 30은 &quot;past&quot;를, 30 &lt; 분이면 &quot;to&quot; 를 사용한다.</p>

<p>시각이 주어졌을 때, 단어 시계에서 사용하는 표현으로 출력해보자.</p>

### 입력

<p>첫째 줄에 시를 나타내는 h(1 &le; h &le; 12), 둘째 줄에 분을 나타내는 m(0 &le; m &lt; 60)이 주어진다.</p>

### 출력

<p>첫째 줄에 입력으로 주어진 시각을 단어 시계에서 사용하는 표현으로 출력한다.</p>