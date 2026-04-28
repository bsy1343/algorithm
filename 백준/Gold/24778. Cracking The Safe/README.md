# [Gold III] Cracking The Safe - 24778

[문제 링크](https://www.acmicpc.net/problem/24778)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 22, 맞힌 사람: 20, 정답 비율: 58.824%

### 분류

너비 우선 탐색, 브루트포스 알고리즘, 그래프 이론, 그래프 탐색

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24778.%E2%80%85Cracking%E2%80%85The%E2%80%85Safe/294f2c53.png" data-original-src="https://upload.acmicpc.net/097b6f04-065d-422a-9eec-7b42c74e3dba/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 210px; float: right;" />Your little sister misplaced the code for her toy safe - can you help her?</p>

<p>This particular safe has 9 buttons with digital displays. Each button shows a single digit in the range <code>0..3</code>. When you push one of the buttons, the number it displays is incremented by 1, circling around from 3 to 0. &nbsp;However, pushing a button will also increment the other digits in the same row and the same column as the button pushed.</p>

<p>The safe opens when the display shows nine zeros.</p>

<p>For instance, if you pushed the top-left, center, center, and middle-right buttons, in this order, the safe&#39;s display would change like so:</p>

<pre>
3 1 2     0 2 3     0 3 3     0 0 3     0 0 0
0 1 1  -&gt; 1 1 1  -&gt; 2 2 2  -&gt; 3 3 3  -&gt; 0 0 0
3 2 3     0 2 3     0 3 3     0 0 3     0 0 0
</pre>

<p>Write a program to determine if the safe can be opened, and if so, how many button pushes it would take!</p>

### 입력

<p>The input is a single test case, given as 9 digits $d$, ($0 \le d \le 3$) on 3 lines, representing the digits that are initially displayed on the safe&#39;s buttons. Your program will be run multiple times on different inputs.</p>

### 출력

<p>Output the number of times buttons need to be pushed to open the safe! (The same button may need to be pushed more than once, and you do not have to output which buttons must be pushed.) If the safe cannot be opened, output <code>-1</code>.</p>