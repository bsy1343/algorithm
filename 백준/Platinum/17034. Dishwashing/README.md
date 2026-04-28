# [Platinum III] Dishwashing - 17034

[문제 링크](https://www.acmicpc.net/problem/17034)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 244, 정답: 117, 맞힌 사람: 99, 정답 비율: 49.010%

### 분류

자료 구조, 그리디 알고리즘, 이분 탐색, 스택

### 문제 설명

<p>Bessie and Elsie are helping Farmer John wash the dishes, a more complicated process than one might think due to their lack of opposable thumbs.</p>

<p>The two cows decide that Bessie will apply soap, and Elsie will rinse. Bessie is given a dirty stack of plates labeled $1$ through $N$ ($1 \leq N \leq 10^5$) Elsie has an empty stack, where clean plates will go. There is a counter in between Bessie and Elsie for soapy stacks.</p>

<p>At each step, either:</p>

<ul>
	<li>Bessie takes a plate from the top of the dirty stack, applies soap, and then places it on the counter. When placing a soapy plate on the counter, Bessie must either (i) place the plate on top of an existing non-empty soapy stack or (ii) create a new soapy stack to the right of all existing soapy stacks.</li>
	<li>Elsie takes a plate from the top of the leftmost soapy stack. Elsie rinses the plate, then places it on top of the clean stack.</li>
</ul>

<p>The goal is for the clean stack to have all plates in order, with the smallest label on the bottom and the largest label on the top. It may not be possible for the cows to achieve this goal for the entire stack of plates, so please determine the length of the largest prefix of the input ordering for which the goal is achievable.</p>

### 입력

<p>The first line of input contains $N$. The next $N$ lines specify the order of the dishes in Bessie&#39;s stack, with the first number being the dish on top of the stack.</p>

### 출력

<p>Please output the length of the longest prefix of the input stack that can be successfully washed so that the plates end up ordered properly in the clean stack.</p>