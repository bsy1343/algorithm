# [Platinum IV] Array Game - 9405

[문제 링크](https://www.acmicpc.net/problem/9405)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

(분류 없음)

### 문제 설명

<p>There is a single-player game played on a one-dimensional infinite-from-both-ends array containing integers, + signs and - signs. In each turn, the player can move all integers one cell to the left or one cell to the right (signs remain fixed).</p>

<p>The player&rsquo;s initial score is 0; when an integer I moves into a cell containing the sign S (+ or -), the integer is removed from the array and the score is increased by S &times; I.</p>

<p>The player can stop the game anytime he/she wants.</p>

<p>Below you can see the initial and the following states of the array, after two right moves are made.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9405.%E2%80%85Array%E2%80%85Game/61befd16.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/9405/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-13%20%EC%98%A4%ED%9B%84%206.26.02.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:137px; width:480px" /></p>

<p>Your task is to find the maximum possible score one can get from a given initial array.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case starts with N (1 &le; N &le; 100), the number of integers, followed by N<sub>p</sub> (1 &le; N<sub>p</sub> &le; 100), the number of + signs and N<sub>m</sub> (1 &le; N<sub>m</sub> &le; 100), the number of - signs. Each of the next N lines contains two integers p<sub>i</sub> (&minus;300 &le; p<sub>i </sub>&le; 300), the position and v<sub>i</sub> (&minus;9 &le; v<sub>i</sub> &le; 9), the value of the i<sup>th</sup> integer. The following line contains N<sub>p</sub> integers indicating the positions of the + signs. The following line contains N<sub>m</sub> integers indicating the positions of the - signs. The positions are all between &minus;300 and 300, and no two elements (integers and signs) are initially placed at the same position. The input terminates with a line containing &ldquo;0 0 0&rdquo;.</p>

### 출력

<p>For each test case write a single line containing the maximum possible score.</p>