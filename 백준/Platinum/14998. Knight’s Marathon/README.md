# [Platinum IV] Knight’s Marathon - 14998

[문제 링크](https://www.acmicpc.net/problem/14998)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 13, 맞힌 사람: 11, 정답 비율: 21.154%

### 분류

애드 혹, 많은 조건 분기, 그래프 이론

### 문제 설명

<p>After an exhausting battle, the invading army is finally defeated. The king sends his only surviving knight to the kingdom&rsquo;s capital to tell the people of your victory. This might be a very (very!) long journey.</p>

<p>The knight moves as on a chessboard: in each move, he travels two squares in one of the four compass directions, and one more square sideways. During his journey, he must remain inside the kingdom to avoid starting any new wars. The kingdom is a N<sub>X</sub> &times; N<sub>Y</sub> rectangular grid, which is possibly much (much!) larger than the 8 &times; 8 board on which the battle was fought. The rows and columns in this kingdom are numbered from 0. The knight starts at square K<sub>X</sub>, K<sub>Y</sub>, and must travel to the capital at square C<sub>X</sub>, C<sub>Y</sub>. Output the smallest number of moves in which the knight can reach the capital.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14998.%E2%80%85Knight%E2%80%99s%E2%80%85Marathon/cc609d8b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/14998.%E2%80%85Knight%E2%80%99s%E2%80%85Marathon/cc609d8b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14998/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:153px; width:153px" /></p>

<p style="text-align: center;">Figure 4: The possible moves for a knight.</p>

### 입력

<p>The input consists of three lines, each containing two integers:</p>

<ul>
	<li>On the first line: N<sub>X</sub>, N<sub>Y</sub>, the size of the kingdom, with 8 &le; N<sub>X</sub>, N<sub>Y</sub> &le; 10<sup>9</sup>.</li>
	<li>On the second line: K<sub>X</sub>, K<sub>Y</sub>, the knight&rsquo;s starting position, with 0 &le; K<sub>X</sub> &lt; N<sub>X</sub> and 0 &le; K<sub>Y</sub> &lt; N<sub>Y</sub>.</li>
	<li>On the third line: C<sub>X</sub>, C<sub>Y</sub>, the position of the capital, with 0 &le; C<sub>X</sub> &lt; N<sub>X</sub> and 0 &le; C<sub>Y</sub> &lt; N<sub>Y</sub>.</li>
</ul>

### 출력

<p>Output a single line containing a single integer, the number of moves the knight will need to get to the capital.</p>