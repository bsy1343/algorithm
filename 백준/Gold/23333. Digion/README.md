# [Gold I] Digion - 23333

[문제 링크](https://www.acmicpc.net/problem/23333)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 102, 정답: 27, 맞힌 사람: 24, 정답 비율: 26.966%

### 분류

문자열, 재귀

### 문제 설명

<p>Digion은 다음과 같이&nbsp;정의한다.</p>

<ol>
	<li>빈 문자열도 Digion이다. 이것은 Null Digion이라고 부른다.</li>
	<li>&#39;<code>()</code>&#39;도 Digion이다. 이것은 기본 Digion라고 불리운다.</li>
	<li><code>A</code>와 <code>B</code>가 Digion 일 때 <code>(A)B</code>도 또한 Digion이다. 이때 <code>A</code>를 안쪽의 Digion <code>B</code>를 바깥쪽의 Digion라고 부른다.</li>
</ol>

<p>Digion의 무게는&nbsp; &#39;<code>(</code>&#39;와 &#39;<code>)</code>&#39;&nbsp;쌍의 개수이다. 예를 들어, &#39;<code>()</code>&#39;의 무게는 1이다. 다음과 같은 값을 구하는 기준으로 Digion의 순서를 정의할 수 있다.</p>

<ol>
	<li>더 무거운 것이 더 비싸다.</li>
	<li>만약 두 Digion의 무게가 같다면 안쪽 Digion가 비싼 것이 더 비싸다.</li>
	<li>두 Digion의 무게가 같고 안쪽 Digion의 값까지 같다면 바깥쪽 Digion가 비싼 것이 더 비싸다.</li>
</ol>

<p>위의 기준으로 값이 싼 것부터 비싼 것 순서로 정렬을 할 수 있다. Digion 하나가 주어질 때 그 Digion보다 바로 다음으로 비싼(정렬했을 때 바로 뒤에 올) Digion을 구해보자.</p>

### 입력

<p>첫째 줄에 Digion이 주어지며, 문자열의 끝은&nbsp;&#39;$&#39;로 표시한다. 입력으로 주어지는&nbsp;Digion의 무게는 30 이하이다.</p>

### 출력

<p>첫째 줄에 입력으로 주어진 Digion의 바로 다음으로 비싼 Digion을 출력한다.</p>