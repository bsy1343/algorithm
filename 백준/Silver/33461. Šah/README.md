# [Silver V] Šah - 33461

[문제 링크](https://www.acmicpc.net/problem/33461)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 60, 정답: 49, 맞힌 사람: 29, 정답 비율: 82.857%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>Two chess giants, Vito and Patrik, will play a game of chess this year in front of the iconic theater on Jane Street, finally proving who is the <em>greatest player of all time</em>. However, as standard chess has become boring for them, they decided to modify the rules of the game to make it more interesting. We will mention only the rules that are relevant to this task.</p>

<p>The chessboard will be a square matrix with $N$ rows and $N$ columns. Only the chess pieces <strong>knight</strong>, <strong>rook</strong>, and <strong>queen</strong> will be used. The pieces behave in the same way as in standard chess. A rook attacks a square if it is in the same row or column as that rook. A queen also attacks all squares in the same row and column, but in addition to that, it attacks all squares along the same diagonals. Knights attack squares that are two rows and one column away or vice versa. Examples of these moves can be seen in the explanations of the examples.</p>

<p><strong>Note</strong>: Each piece also attacks the square on which it is placed. Additionally, pieces attack through other pieces, i.e., a piece attacks squares according to the rules stated above regardless of whether there is another piece between the square and the attacking piece.</p>

<p>Vito is preparing for the long-awaited showdown and needs your help. He has decided to practice his quick observation skills. He will do this by placing $M$ chess pieces on the board and then determining all the squares that are attacked. Your task is to determine the number of attacked squares on the given board.</p>

### 입력

<p>The first line contains positive integers $N$ and $M$ ($1 ≤ N ≤ 200$, $1 ≤ M ≤ N^2$).</p>

<p>In the next $M$ lines, each line contains a single uppercase letter of the English alphabet, representing the type of piece, which can be one of '<code>N</code>', '<code>R</code>', and '<code>Q</code>', corresponding to knight, rook, and queen, respectively, and integers $r_i$ and $c_i$ ($1 ≤ r_i , c_i ≤ N$), representing the row and column where that piece is located.</p>

<p>At most one piece can be placed on any square of the board.</p>

### 출력

<p>In the first and only line, you need to output the number of attacked squares on the board.</p>

### 힌트

<p>Clarification of the first and second example: In the sketches, examples are shown. All attacked squares are marked with a dot, except the one on which the piece is located.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/33461.%E2%80%85%C5%A0ah/57116523.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33461-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 120px; height: 120px;"></p>

<p style="text-align: center;">(a) first example</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/33461.%E2%80%85%C5%A0ah/ada7a508.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33461-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 120px; height: 120px;"></p>

<p style="text-align: center;">(b) second example</p>