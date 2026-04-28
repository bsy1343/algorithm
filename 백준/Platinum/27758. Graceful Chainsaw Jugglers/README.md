# [Platinum IV] Graceful Chainsaw Jugglers - 27758

[문제 링크](https://www.acmicpc.net/problem/27758)

### 성능 요약

시간 제한: 25 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 15, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are the manager of the Graceful Chainsaw Jugglers performance group, and you are trying to succeed in the very competitive chainsaw juggling business. You have an unlimited number of identical talented jugglers, and each of them knows how to juggle any number of chainsaws. To run a show, you will choose some number of jugglers, and then distribute your red chainsaws and blue chainsaws among them, so that each juggler gets at least one chainsaw. For example, one juggler might juggle two red chainsaws and three blue chainsaws, and another juggler might juggle just one red chainsaw. During the show, each chainsaw is used by only one juggler; the jugglers do not pass chainsaws around, because it is already hard enough just to juggle them!</p>

<p>According to your market research, your audience is happiest when the show uses as many jugglers and chainsaws as possible, but the audience also demands variety: no two jugglers in the show can use both the same number of red chainsaws <i>and</i> the same number of blue chainsaws.</p>

<p>You have <b>R</b> red chainsaws and <b>B</b> blue chainsaws, and you must use all of them in the show. What is the largest number of jugglers that you can use in the show while satisfying the audience&#39;s demands?</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>; <b>T</b> test cases follow. Each test case consists of one line with two integers <b>R</b> and <b>B</b>: the numbers of red and blue chainsaws that you must use in the show.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where <code>x</code> is the test case number (starting from 1) and <code>y</code> is the largest number of jugglers that you can use in the show while satisfying the audience&#39;s demands, as described above.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
	<li><b>R</b> + <b>B</b> &gt; 0.</li>
</ul>

### 힌트

<p>In Sample Case #1, the only possible strategy is to give both red chainsaws to one juggler.</p>

<p>In Sample Case #2, one optimal strategy is to have:</p>

<ul>
	<li>one juggler with one red chainsaw</li>
	<li>one juggler with two red chainsaws</li>
	<li>one juggler with one blue chainsaw</li>
	<li>one juggler with three blue chainsaws</li>
	<li>one juggler with one red chainsaw and one blue chainsaw</li>
</ul>