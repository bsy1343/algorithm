# [Gold III] Lying Livestock - 27019

[문제 링크](https://www.acmicpc.net/problem/27019)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

그래프 이론, 브루트포스 알고리즘, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>There&#39;s always one troublemaker in the herd. Farmer John has determined that one of his N cows (1 &le; N &le; 100; cows are numbered 1..N) always tells lies even though all the remaining cows always tell the truth.  He wants to find this troublesome cow as quickly as possible.  To do so, he visits the cows one-by-one as they graze in the pasture and asks them Q (1 &le; Q &le; 1,000) simple questions about the amount of food they eat (though mostly honest, cows are still relatively unintelligent and food is one of the few topics they understand).  He writes down the results of his questions in the following form:</p>

<ul>
	<li>Cow #4 says that cow #5 eats more grass than cow #10.</li>
	<li>Cow #6 says that cow #10 eats more grass than cow #7.</li>
	<li>Cow #3 says that cow #2 eats more grass than cow #6.</li>
	<li>Cow #1 says that cow #7 eats more grass than cow #5.</li>
</ul>

<p>In the example above, it is clear that the untruthful cow must be either cow #4, cow #6, or cow #1.  Your task is to determine the number of &quot;potentially untruthful&quot; cows based on their responses. A potentially untruthful cow is a cow that could conceivably be the one that tells lies, judging by the input data provided.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and Q</li>
	<li>Lines 2..Q+1: Each line describes a question response and contains 3 space-separated integers: A B C, meaning that cow A says that cow B eats more grass than cow C.  The same cow might appear several times in this list.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single line with a single integer that is the number of potentially untruthful cows.</li>
</ul>