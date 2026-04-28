# [Platinum IV] Incremental House of Pancakes - 27811

[문제 링크](https://www.acmicpc.net/problem/27811)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 13, 맞힌 사람: 12, 정답 비율: 54.545%

### 분류

이분 탐색, 수학, 매개 변수 탐색

### 문제 설명

<p>Every morning at The Incremental House of Pancakes, the kitchen staff prepares all of its pancakes for the day and arranges them into two stacks. Initially, the stack on the left has <b>L</b> pancakes, and the stack on the right has <b>R</b> pancakes.</p>

<p>This restaurant&#39;s customers behave very consistently: the i-th customer to arrive (counting starting from 1) always orders i pancakes. When the i-th customer places their order of i pancakes, you take i pancakes from the stack that has the most pancakes remaining (or from the left stack if both have the same amount). If neither stack has at least i pancakes, the restaurant closes and the i-th customer does not get served any pancakes. You never complete an order using pancakes from both stacks.</p>

<p>Given the initial numbers of pancakes in each stack, you want to know how many customers will be served, and how many pancakes will remain in each stack when the restaurant closes.</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. Each test case consists of a single line containing two integers <b>L</b> and <b>R</b>: the initial numbers of pancakes in the left and right stacks, respectively, as described above.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: n l r</code>, where <code>x</code> is the test case number (starting from 1), <code>n</code> is the number of customers who will be served, and <code>l</code> and <code>r</code> are the numbers of pancakes that will remain in the left and right stacks, respectively, when the restaurant closes.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 1000.</li>
</ul>

### 힌트

<p>In Sample Case #1, the first customer gets 1 pancake from the right stack, leaving 1 pancake in each stack. The second customer wants 2 pancakes, but neither stack has enough for them, even though there are 2 pancakes in total.</p>

<p>In Sample Case #2, the first customer gets 1 pancake from the left stack, because both stacks have the same amount. This leaves 1 pancake in the left stack and 2 in the right stack. The second customer wants 2 pancakes, which you serve to them from the right stack, emptying it. When the third customer arrives, neither stack has 3 pancakes, so no more orders are fulfilled.</p>

<p>In Sample Case #3, the first customer is served from the right stack, leaving 8 pancakes in the left stack and 10 in the right stack. The second customer is also served from the right stack, leaving 8 pancakes in each stack. The third customer is served from the left stack, leaving 5 pancakes there and 8 in the right stack. The fourth customer is then served from the right stack, leaving 4 pancakes there. Serving the fifth customer empties the left stack, and then there are not enough pancakes remaining in either stack to serve a sixth customer.</p>