# [Platinum III] Isomorphic Inversion - 16301

[문제 링크](https://www.acmicpc.net/problem/16301)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 201, 정답: 83, 맞힌 사람: 54, 정답 비율: 38.571%

### 분류

그리디 알고리즘, 문자열, 해싱, 라빈–카프

### 문제 설명

<p>Let s be a given string of up to 10<sup>6</sup> digits. Find the maximal k for which it is possible to partition s into k consecutive contiguous substrings, such that the k parts form a palindrome. More precisely, we say that strings s<sub>0</sub>, s<sub>1</sub>, . . . , s<sub>k&minus;1</sub> form a palindrome if s<sub>i</sub> = s<sub>k&minus;1&minus;i</sub> for all 0 &le; i &lt; k.</p>

<p>In the first sample case, we can split the string <code>652526</code> into 4 parts as <code>6|52|52|6</code>, and these parts together form a palindrome. It turns out that it is impossible to split this input into more than 4 parts while still making sure the parts form a palindrome.</p>

### 입력

<ul>
	<li>A nonempty string of up to 10<sup>6</sup> digits.</li>
</ul>

### 출력

<ul>
	<li>Print the maximal value of k on a single line.</li>
</ul>