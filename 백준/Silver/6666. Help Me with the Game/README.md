# [Silver III] Help Me with the Game - 6666

[문제 링크](https://www.acmicpc.net/problem/6666)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 50, 정답: 38, 맞힌 사람: 33, 정답 비율: 80.488%

### 분류

구현, 문자열, 정렬, 파싱

### 문제 설명

<p>Your task is to read a picture of a chessboard position and print it in the chess notation.</p>

### 입력

<p>The input consists of an ASCII-art picture of a&nbsp;chessboard with chess pieces on positions described by the input. The pieces of the white player are shown in upper-case letters, while the black player&#39;s pieces are lower-case letters. The letters are one of &quot;<code>K</code>&quot; (King), &quot;<code>Q</code>&quot; (Queen), &quot;<code>R</code>&quot; (Rook), &quot;<code>B</code>&quot; (Bishop), &quot;<code>N</code>&quot; (Knight), or &quot;<code>P</code>&quot; (Pawn). The chessboard outline is made of plus (&quot;<code>+</code>&quot;), minus (&quot;<code>-</code>&quot;), and pipe (&quot;<code>|</code>&quot;) characters. The black fields are filled with colons (&quot;<code>:</code>&quot;), white fields with dots (&quot;<code>.</code>&quot;).</p>

### 출력

<p>The output consists of two lines. The first line consists of the string &quot;<code>White:&nbsp;</code>&quot;, followed by the description of positions of the pieces of the white player. The second line consists of the string &quot;<code>Black:&nbsp;</code>&quot;, followed by the description of positions of the pieces of the black player.</p>

<p>The description of the position of the pieces is a comma-separated list of terms describing the pieces of the appropriate player. The description of a piece consists of a single upper-case letter that denotes the type of the piece (except for pawns, for that this identifier is omitted). This letter is immediatelly followed by the position of the piece in the standard chess notation -- a lower-case letter between &quot;<code>a</code>&quot; and &quot;<code>h</code>&quot; that determines the column (&quot;<code>a</code>&quot; is the leftmost column in the input) and a single digit between 1 and 8 that determines the row (8 is the first row in the input).</p>

<p>The pieces in the description must appear in the following order: King(&quot;<code>K</code>&quot;), Queens (&quot;<code>Q</code>&quot;), Rooks (&quot;<code>R</code>&quot;), Bishops (&quot;<code>B</code>&quot;), Knights (&quot;<code>N</code>&quot;), and pawns. Note that the numbers of pieces may differ from the initial position because of capturing the pieces and the promotions of pawns. In case two pieces of the same type appear in the input, the piece with the smaller row number must be described before the other one if the pieces are white, and the one with the larger row number must be described first if the pieces are black. If two pieces of the same type appear in the same row, the one with the smaller column letter must appear first.</p>