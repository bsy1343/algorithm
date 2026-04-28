# [Gold III] Cheating Knight - 11445

[문제 링크](https://www.acmicpc.net/problem/11445)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 113, 정답: 34, 맞힌 사람: 32, 정답 비율: 32.653%

### 분류

임의 정밀도 / 큰 수 연산, 이분 탐색, 기하학, 수학

### 문제 설명

<p>The land of the Black King is an infinitely stretching flat surface neatly divided into black and white squares, much like an infinite chessboard. The area of every square is exactly one square metre, and the squares are neatly layed out on a perfect grid. Sir Jumpsalot is a knight who lives in the land of the Black King. By law, knights may only move around by jumping from the centre of a square to the centre of another square, as long as the distance between those centres is exactly &radic;D metres. (In the game of chess, the value of D is fixed at 5, but we will consider other values of D as well.) The value of D fixed in the law can be written as a sum of two squares, for otherwise knights would be unable to move around.</p>

<p>Sir Jumpsalot doesn&rsquo;t like to play by the rules. While he still moves around by jumping &radic;D metres, he doesn&rsquo;t bother landing on the centre of a square every time. In other words, he sometimes lands in a corner of a square or even on the border between adjacent squares, whichever is most convenient. Reaching his destination is usually easier this way, as can be seen from the following example (travelling two squares horizontally and three vertically with the familiar value of D = 5).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11445.%E2%80%85Cheating%E2%80%85Knight/411c49b7.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11445/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:118px; width:114px" /></p>

<p style="text-align: center;">a) Route for any normal, law abiding knight.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11445.%E2%80%85Cheating%E2%80%85Knight/2314e0ed.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11445/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:117px; width:115px" /></p>

<p style="text-align: center;">b) Route for the cheating Sir Jumpsalot.</p>

<p>Given that Sir Jumpsalot starts at the centre of the square with coordinates (0, 0) and has to travel to the centre of the square with coordinates (X, Y ), your task is to calculate the minimum number of jumps Sir Jumpsalot needs to reach his destination. You may safely assume that there are no obstructions in his way.</p>

### 입력

<p>The input starts with a line containing an integer T, the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with three space-separated integers D, X and Y , denoting (the square of) the distance jumped in a single jump and the coordinates of the final destination. These satisfy 1 &le; D &le; 10<sup>8</sup> and &minus;10<sup>4</sup> &le; X, Y &le; 10<sup>4</sup>. It is guaranteed that D can be written as the sum of two squares.</li>
</ul>

### 출력

<p>For each test case, output one line with a single integer J, the minimum number of jumps needed to reach the destination.</p>