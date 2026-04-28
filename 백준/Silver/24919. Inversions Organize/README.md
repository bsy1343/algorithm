# [Silver III] Inversions Organize - 24919

[문제 링크](https://www.acmicpc.net/problem/24919)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 42, 정답: 26, 맞힌 사람: 25, 정답 비율: 73.529%

### 분류

애드 혹, 수학

### 문제 설명

<p>After the troubles with printing advertising for IO two years ago, the marketing team of the conference decided to use an interactive installation. It consists of a matrix of $2N$&nbsp;rows and&nbsp;$2N$&nbsp;columns of touchscreens. Each touchscreen can display either an uppercase&nbsp;<code>I</code>&nbsp;or an uppercase&nbsp;<code>O</code>. When one of the screens is touched, it switches the letter it displays to the one it was not displaying right before the touch occurred.</p>

<p>You are looking at one of those installations, and find it to be disorganized. You want to change some of the letters such that the top&nbsp;$N$&nbsp;rows show the same number of letter&nbsp;<code>I</code>⁠&#39;s as the bottom&nbsp;$N$&nbsp;rows, and at the same time, the leftmost&nbsp;$N$&nbsp;columns show the same number of letter&nbsp;<code>I</code>⁠&#39;s in total as the rightmost&nbsp;$N$&nbsp;columns.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24919.%E2%80%85Inversions%E2%80%85Organize/082d0dce.png" data-original-src="https://upload.acmicpc.net/dbeb40b7-87b8-4344-a907-c91cfda190a6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>For example, in the left picture above, $N=2$. The top&nbsp;$2$&nbsp;rows show&nbsp;$3$&nbsp;letter&nbsp;<code>I</code>⁠&#39;s in total, while the bottom&nbsp;$2$&nbsp;rows show&nbsp;$5$. On the other hand, both the leftmost&nbsp;$2$&nbsp;columns and the rightmost&nbsp;$2$&nbsp;columns show&nbsp;$4$&nbsp;letter&nbsp;<code>I</code>⁠&#39;s. By touching the two highlighted screens we can change the state to that shown in the right picture, which shows&nbsp;$4$&nbsp;letter&nbsp;<code>I</code>⁠&#39;s in the top&nbsp;$2$ columns and in the bottom&nbsp;$2$&nbsp;columns, and also maintains the balance between the left and right sides.</p>

<p>Given the state of the installation, can you find the minimum number of letter changes needed to achieve your organizational goal?</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow. Each test case starts with a line containing a single integer&nbsp;$N$, half the number of rows and columns of the matrix. Then,&nbsp;$2N$&nbsp;lines follow. The&nbsp;$i$-th of these contains a string of&nbsp;$2N$&nbsp;characters&nbsp;$C_{i,1}C_{i,2}\cdots C_{i,2N}$.&nbsp;$C_{i,j}$&nbsp;is the letter currently displayed in the screen in the&nbsp;$i$-th row and&nbsp;$j$-th column of the matrix.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where $x$&nbsp;is the test case number (starting from 1) and&nbsp;$y$&nbsp;is the minimum number of touches required to make the installation simultaneously display the same number of letter&nbsp;<code>I</code>⁠&#39;s in its top and bottom halves, and the same number of letter&nbsp;<code>I</code>⁠&#39;s in its left and right halves.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$C_{i,j}$&nbsp;is either an uppercase&nbsp;<code>I</code>&nbsp;or an uppercase&nbsp;<code>O</code>, for all&nbsp;$i,j$.</li>
</ul>

### 힌트

<p>Sample Case #1 is the one explained in the statement. Not touching anything does not work, and a single touch would leave an odd number of letters&nbsp;<code>I</code>&nbsp;in total, so the result cannot be balanced. It is explained in the statement how it can be balanced with two touches (there are other ways).</p>

<p>In Sample Case #2, changing the top left corner to&nbsp;<code>O</code>&nbsp;leaves no letter&nbsp;<code>I</code>, so all halves have the same amount ($0$).</p>

<p>In Sample Case #3, the installation is already organized according to your requirements, so no touch is needed.</p>