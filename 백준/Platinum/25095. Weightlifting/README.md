# [Platinum I] Weightlifting - 25095

[문제 링크](https://www.acmicpc.net/problem/25095)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 56, 맞힌 사람: 50, 정답 비율: 74.627%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are following a prescribed training for weightlifting. The training consists of a series of exercises that you must do in order. Each exercise requires a specific set of weights to be placed on a machine.</p>

<p>There are $W$ types of different weights. For example, an exercise may require $3$ weights of type A and $1$ weight of type B, while the next requires $2$ weights each of types A, C, and D.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25095.%E2%80%85Weightlifting/a31d8ef2.png" data-original-src="https://upload.acmicpc.net/8b8d78f3-4743-4472-ac5b-5282428500d2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 349px; height: 144px;" /></p>

<p>The weights are placed on the machine as a stack. Formally, with a single operation, you can either add a new weight of any type to the top of the stack, or remove the weight that is currently at the top of the stack.</p>

<p>You can load the weights for each exercise onto the machine&#39;s stack in any order. So, if you place the weight of type B at the bottom in the first exercise of the example above, you will have to take all the weights off before putting on the weights for the second exercise. On the other hand, if you place the weight of type B third from the bottom, you can leave two of the weights of type A on the bottom of the stack to be part of the next exercise&#39;s set, saving you some time.</p>

<p>Given the amount of weights of each type needed for each exercise, find the minimum number of operations needed to do them all. You must complete the exercises in the order given. The machine stack starts out empty, and you must leave it empty after you finish with all your exercises.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ test cases follow. Each test case starts with a line containing $2$ integers $E$ and $W$: the number of exercises and the number of types of weights. Weight types are numbered between $1$ and $W$. Then, $E$ lines follow. The $i$-th of these lines contains $W$ integers $X_{i,1},X_{i,2},\dots,X_{i,W}$ representing that the $i$-th exercise requires exactly $X_{i,j}$ weights of type $j$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the minimum number of machine stack operations needed to run through all your exercises.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$1&le;X_{i,1}+X_{i,2}+\cdots+X_{i,W}$, for all $i$. (Each exercise requires at least one weight.)</li>
</ul>

### 힌트

<p>In Sample Case #1, there is only one type of weight. The first exercise needs $1$ weight, the second needs $2$ weights, and the third needs $1$ weight. You can complete the exercise in $4$ operations as follows:</p>

<ol>
	<li>Add a weight onto the stack. You do the first exercise.</li>
	<li>Add a weight onto the stack. You do the second exercise.</li>
	<li>Remove a weight from the top of the stack. You do the third exercise.</li>
	<li>Remove a weight from the top of the stack. Now the stack becomes empty.</li>
</ol>

<p>In Sample Case #2, one way to complete the exercises in $12$ operations is as follows:</p>

<ol>
	<li>Add a weight of type $2$.</li>
	<li>Add a weight of type $3$.</li>
	<li>Add a weight of type $1$.</li>
	<li>Add a weight of type $2$. Now the stack contains weights of types $2$, $3$, $1$, $2$ from bottom to top. You do the first exercise.</li>
	<li>Remove a weight of type $2$ from the top of the stack.</li>
	<li>Add a weight of type $3$.</li>
	<li>Add a weight of type $1$. Now the stack contains weights of types $2$, $3$, $1$, $3$, $1$ from bottom to top. You do the second exercise.</li>
	<li>Remove a weight of type $1$ from the top of the stack.</li>
	<li>Remove a weight of type $3$ from the top of the stack.</li>
	<li>Remove a weight of type $1$ from the top of the stack.</li>
	<li>Remove a weight of type $3$ from the top of the stack.</li>
	<li>Remove a weight of type $2$ from the top of the stack. Now the stack becomes empty.</li>
</ol>