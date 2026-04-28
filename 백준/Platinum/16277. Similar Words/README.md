# [Platinum II] Similar Words - 16277

[문제 링크](https://www.acmicpc.net/problem/16277)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 33, 정답: 13, 맞힌 사람: 9, 정답 비율: 47.368%

### 분류

다이나믹 프로그래밍, 자료 구조, 그래프 이론, 문자열, 그래프 탐색, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍, 해싱, 트라이

### 문제 설명

<p>Let us call a non-empty sequence of lowercase English letters a word. Prefix of a word x is a word y that can be obtained from x by removing zero or more last letters of x.</p>

<p>Let us call two words similar, if one of them can be obtained from the other by removing its first letter.</p>

<p>You are given a set S of words. Find the maximal possible size of set of non-empty words X such that they satisfy the following:</p>

<ul>
	<li>each word of X is prefix of some word from S;</li>
	<li>X has no similar words.</li>
</ul>

### 입력

<p>Input data contains multiple test cases. The first line of the input data contains an integer t &mdash; the number of test cases. The descriptions of test cases follow.</p>

<p>The first line of each description contains an integer n &mdash; the number of words in the set S (1&thinsp;&le;&thinsp;n&thinsp;&le;&thinsp;10<sup>6</sup>). Each of the following n lines contains one non-empty word &mdash; elements of S. All words in S are different.</p>

<p>It is guaranteed that the total length of all words in one input data doesn&#39;t exceed 10<sup>6</sup>.</p>

### 출력

<p>For each test case print one line that contains one integer m &mdash; the maximal number of words that X can contain.</p>