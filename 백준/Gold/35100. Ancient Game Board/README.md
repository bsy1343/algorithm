# [Gold III] Ancient Game Board - 35100

[문제 링크](https://www.acmicpc.net/problem/35100)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 18, 정답: 10, 맞힌 사람: 10, 정답 비율: 62.500%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>In ancient <em>Icpca</em> civilization, games were played on a board covered with square tiles of the same size. It is certain that the tiles had either black or white surfaces, but their arrangement is not yet known.</p>

<p>One of the most influential theories says that the board was divided into square regions of the same size, each filled with the tiles of a single color, either black or white. It says that the regions had alternating colors, in both front-back and left-right directions, like a chessboard.</p>

<p>Today, a rectangular part of the board used in the game was discovered. Your task is to determine whether this artifact is consistent with the theory described above. If it is consistent, also determine whether the number of tiles as the side length of the square regions can be uniquely identified.</p>

<p>The artifact of the first test case of Sample Input 1 is shown on the left of Figure D.1. This artifact can be considered as part of a board where the square regions have sides of $2$ tiles, as shown in the red frame on the right, and thus the artifact is consistent with the theory. Furthermore, since it cannot be a part of a board with square regions of any other size, the side length is uniquely identified to be $2$ tiles.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35100.%E2%80%85Ancient%E2%80%85Game%E2%80%85Board/932068e2.png" data-original-src="https://boja.mercury.kr/assets/problem/35100-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 550px; height: 237px;"></p>

<p style="text-align: center;">Figure D.1. The first test case of Sample Input 1</p>

### 입력

<p>The input consists of at most $30$ test cases, each in the following format.</p>

<blockquote>
<p>$n$ $m$</p>

<p>$c_{1,1}$ $\cdots$ $c_{1, m}$</p>

<p>$\vdots$</p>

<p>$c_{n,1}$ $\cdots$ $c_{n,m}$</p>
</blockquote>

<p>The first line of the test case contains two integers, $n$ and $m$ ($1 ≤ n ≤ 100$, $1 ≤ m ≤ 100$), representing the numbers of tile rows and columns, respectively, of the artifact (i.e., the remaining part of a board). Each of the next $n$ lines contains a string of $m$ characters, each being ‘<code>.</code>’ or ‘<code>#</code>’, representing the colors of the tiles in the artifact. The $j$-th character in the $i$-th line of the $n$ lines $c_{i,j}$ being ‘<code>.</code>’ means that the $j$-th tile of the $i$-th row of the artifact is white, and being ‘<code>#</code>’ means it is black ($1 ≤ i ≤ n$, $1 ≤ j ≤ m$).</p>

<p>The end of the input is indicated by a line consisting of two zeros.</p>

### 출력

<p>For each test case, output one of the following integers:</p>

<ul>
<li>An integer $-1$, if the artifact is not consistent with the theory.</li>
<li>The number of tiles as the side length of the square regions, if the artifact is consistent with the theory and the side length can be uniquely identified.</li>
<li>An integer $0$, if the artifact is consistent with the theory but the number of tiles as the side length of the square regions cannot be uniquely identified.</li>
</ul>