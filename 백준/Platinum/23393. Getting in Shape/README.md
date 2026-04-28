# [Platinum V] Getting in Shape - 23393

[문제 링크](https://www.acmicpc.net/problem/23393)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 81, 정답: 9, 맞힌 사람: 9, 정답 비율: 17.647%

### 분류

백트래킹, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>Juan decided to start working out and is willing to prepare a workout session.</p>

<p>He knows that some days he might not want to do all exercises from his workout session. He decided on some rules to avoid skipping the whole session and not exercising at all, while still allowing him to optionally skip some exercises.</p>

<p>The rules are:</p>

<ul>
	<li>There will be only two types of exercises: A and B.</li>
	<li>After finishing an exercise of type B he moves to the next exercise, if there is one. Otherwise, the workout session ends.</li>
	<li>After finishing an exercise of type A there are two possibilities: he can move to the next exercise, or he can skip the next exercise and move to the one after that.</li>
	<li>The last exercise in a workout session must always be of type B.</li>
</ul>

<p>Therefore, there might be different ways in which the workout session can be completed. For example, if the types of exercises in a workout session are <code>BAAB</code>, there are 3 ways in which the session can be completed: by doing all exercises, by skipping the 3rd one or by skipping the last one.</p>

<p>Juan wants to prepare his workout session in such a way that there are exactly N different ways in which the workout session can be completed. Can you help him?</p>

### 입력

<p>One positive integer N (2 &le; N &le; 10<sup>15</sup>), representing the number of ways in which the workout session can be completed.</p>

### 출력

<p>Output a line containing a string, formed only with characters &lsquo;<code>A</code>&rsquo; and &lsquo;<code>B</code>&rsquo;, representing the types of the exercises in the workout session. If there are multiple valid answers, output the lexicographically smallest answer. If there is no valid workout sessions, output a line containing the string &ldquo;IMPOSSIBLE&rdquo; (without quotes).</p>