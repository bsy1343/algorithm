# [Gold I] Hacky Ordering - 30312

[문제 링크](https://www.acmicpc.net/problem/30312)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 41, 맞힌 사람: 40, 정답 비율: 71.429%

### 분류

그래프 이론, 문자열, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>You have been asked to sort! Again! For the bazillionth time! Not even numbers, but strings! Ugh! Do people still not have this in their standard library? Why do you even need to learn this? Who even uses a language without <code>sort</code> function‽</p>

<p>Clearly, you have not been paying attention in class for such a stupid ubiquitous function, but now you have been asked to implement it! Without calling <code>sort</code>! But you just cannot!</p>

<p>But wait! You have a better approach: what if you just assume that the list is sorted already? The order of the characters in the alphabet is arbitrary anyway\ldots{} So, instead of sorting the list, you want to determine whether there exists some order of the characters of the alphabet such that the list of strings is sorted according to this order.</p>

<p>Note that when a string is a prefix of some longer string, the shorter string should be sorted before the longer string.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1\leq n\leq 10^5$), the number of strings.</li>
	<li>$n$ lines, each with a string.</li>
</ul>

<p>The strings only consist of English lowercase letters (<code>a-z</code>).</p>

<p>The total number of characters in the $n$ strings is at most $10^5$.</p>

<p>The strings are not necessarily distinct.</p>

### 출력

<p>If it is impossible to determine an order of the alphabet, output &quot;<code>impossible</code>&quot;.</p>

<p>If it is possible, output a permutation of the 26 letters of the English alphabet according to which the strings are sorted.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>