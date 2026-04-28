# [Platinum IV] Checkers - 11647

[문제 링크](https://www.acmicpc.net/problem/11647)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 45, 정답: 11, 맞힌 사람: 11, 정답 비율: 64.706%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 애드 혹, 분리 집합, 격자 그래프, 오일러 경로, 홀짝성

### 문제 설명

<p>Checkers is played on a square nxn grid (typically n equals 8, 10, or 12, but for this problem, n will range from 2 up to 26). The board has squares colored red and black, and all pieces move only on the black squares. Red and Black squares alternate, so that no two squares that share a side are ever of the same color. The two players are called Black and White, and their pieces are so colored. There are two kinds of pieces, Checkers and Kings, but for this problem, we will only be concerned with Kings. Kings may jump a piece of the other color in one diagonal hop, capturing the piece (removing it from the board). If such a capture is possible, the jumping piece may continue jumping and capturing pieces of the other color until no more jumps are possible. A King may jump in any of the four diagonal directions.</p>

<p>In order to perform a jump, the piece jumped must be immediately adjacent (diagonally) to the piece jumping, and the square on the other side of the jumped piece must be vacant.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11647/1.png" style="height:392px; width:390px" /></p>

<p>In this problem, it is Black&#39;s turn to move. Given a position of checkers, you must determine if it is possible for a Black King to jump all of White&#39;s Kings in a single move, and if so, how many Black Kings are able to do so.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. The first line of input contains an integer n (2&le;n&le;26), the size of the board. The following n lines describe the board. Each line will contain exactly n characters, and each character will be one of &lsquo;.&rsquo;, &lsquo;_&rsquo;, &lsquo;B&rsquo;, or &lsquo;W&rsquo;, indicating the contents of that square, as follows:</p>

<ul>
	<li>. Indicates a Red square. No Kings may be placed on a Red square.</li>
	<li>_ indicates a Black square that is unoccupied.</li>
	<li>B indicates a Black square with a Black King.</li>
	<li>W indicates a Black square with a White King.</li>
</ul>

<p>You may assume that the given board is well-formed; that is, Black and Red squares will alternate through every row and every column, and no Kings will be on any Red square.</p>

### 출력

<p>Output a single integer indicating the number of Black Kings that can capture all of the White Kings in a single move.</p>