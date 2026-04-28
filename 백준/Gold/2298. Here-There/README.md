# [Gold II] Here-There - 2298

[문제 링크](https://www.acmicpc.net/problem/2298)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 6, 맞힌 사람: 5, 정답 비율: 16.667%

### 분류

많은 조건 분기, 구현

### 문제 설명

<p>Do you know the game Here-There? I presume you don&#39;t. It&#39;s a virtual board game, so you should first learn how this virtual board looks like.</p>

<p>The process of making the board is remarkably simple. You start by taking a square with side of length&nbsp;3<sup>N</sup>, divide it into nine smaller squares of equal size and remove the central one. Then, you repeat the same divide-and-remove-the-centre process with each of the eight smaller squares over and over (N&nbsp;times in total), until you are left with a grid that consists of many little squares with side length 1 &ndash; and of many holes. By the way, the number&nbsp;N&nbsp;is called the degree of the board.</p>

<p>The game itself consists of two steps. First, your opponent chooses two squares on the board, one of them will be &quot;Here&quot; and the other one &quot;There&quot;. Your task is to estimate the least number of steps you have to take if you started Here and wanted to get to There. One step consists of moving to another square, which has a common side with the one you&#39;re standing on. Obviously, you cannot move over the removed parts of the board. If you guess the number of steps correctly, you get a point.</p>

<p>You would really like to become a master of this game, so you have written down the sizes of the boards and the positions of the Here and There squares from several games in the past. Now, you&#39;d like to find the exact number of steps you need to take to get from Here to There on each of the boards. Each square is described by two numbers between 1 and&nbsp;3<sup>N</sup>, the first of them denoting the column and the second one the row the square is in. The square in the upper left corner of the board has coordinates (1, 1), as you can see on the picture below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/2298.%E2%80%85Here-There/c7ad1fa9.png" data-original-src="https://upload.acmicpc.net/621b8c87-d42d-4184-8693-93f68fef5e78/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>You can see one of the shortest paths between squares (1, 1) and (4, 8) on the picture, consisting of 10 steps. Path from (1, 1) to (4, 8)</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/2298.%E2%80%85Here-There/0c1e67fc.png" data-original-src="https://upload.acmicpc.net/8b811183-7325-41b4-92fc-83398b574102/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>You are given several boards and pairs of squares on them and your task is to find the steps-distances between the squares in each pair.</p>

### 입력

<p>The first line of the input file contains an integer&nbsp;T&nbsp;specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case consists of five integers&nbsp;D,&nbsp;H<sub>c</sub>,&nbsp;T<sub>c</sub>,&nbsp;H<sub>r</sub>,&nbsp;T<sub>r</sub>, specifying the degree of the board&nbsp;D, the coordinates of Here (H<sub>c</sub>,&nbsp;H<sub>r</sub>) and the coordinates of There (T<sub>c</sub>,&nbsp;T<sub>r</sub>).</p>

### 출력

<p>For each of the test cases, output a single line with one integer &ndash; the steps-distance between Here and There.</p>