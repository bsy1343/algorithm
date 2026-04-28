# [Gold V] Dyeing Dice - 11318

[문제 링크](https://www.acmicpc.net/problem/11318)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 27, 정답: 16, 맞힌 사람: 12, 정답 비율: 52.174%

### 분류

구현, 시뮬레이션, 많은 조건 분기

### 문제 설명

<p>You have just opened your new die colouring factory, which takes a plain die made out of natural wood and colour its six faces. The factory is of course custom-made and consists of a board of size N &times; N. Some of the N<sup>2</sup> squares are filled with paint, while other squares contain nothing. The square in the SW corner of the board is numbered (1, 1), the square in the NW corner (1, N), the square in the NE corner (N, N), and the square in the SE corner (N, 1).</p>

<p>We colour the die by rolling it through a pre-programmed path of squares. When the die lands on a square with paint, the face of the die that faces the paint takes the colour of the paint. When the die lands on a square with no paint, nothing happens. The die is coloured once all six faces are coloured, at which point the die is removed from the factory (the remaining squares on the path, if any, are disregarded). The square (1, 1) never contains any paint.</p>

<p>We initially put the die on entry (1, 1) with the number &quot;1&quot; facing up, and the number &quot;2&quot; facing the square (2, 1). This implies that the number &quot;6&quot; is at the bottom of the die, the number &quot;3&quot; facing the square (1, 2), the number &quot;4&quot; adjacent to the south side of the board, and the number &quot;5&quot; adjacent to the west side of the board. (Note that the two numbers of opposite faces of a die always add up to 7.)</p>

<p>We can roll the die in four directions: N, S, E, and W to an adjacent square, and as we do so, the faces tip over. If we e.g. roll the die north from the initial position, the die is now on square (1, 2) with the number &quot;4&quot; facing upwards and the number &quot;6&quot; facing southwards. If we roll the die east from the initial position, the die is then on square (2, 1) with the number &quot;5&quot; facing upwards and the number &quot;4&quot; facing southwards.</p>

<p>As we colour a die by rolling it, three things can go wrong. Firstly, the die can be rolled off the board. Secondly, not all six faces are being coloured. Thirdly, we may attempt to re-colour a face of the die that has already been coloured. Re-colouring a face of the die with the same colour as it already is, is ok, but re-coloring it with a different colour would yield a mixing of paint that is not permitted.</p>

### 입력

<p>The first line of the input contains three integers, N, M, and P. The size of the board N (2 &le; N &le; 200), the number of squares M (1 &le; M &lt; N<sup>2</sup>) containing paint, and the length P (1 &le; P &le; 100, 000) of the path.</p>

<p>Then follows M lines, each containing three integers, x, y, and t, where square (x, y) contains colour t. Here 1 &le; x, y &le; N and 1 &le; t &le; 100.</p>

<p>Finally follows one line with a string over the alphabet {N, S, E, W} of length P. This is the path by which we roll the die. N indicates we roll the die north, and so on.</p>

### 출력

<p>Six integers on a single line which are the colours of the six faces, in order, starting from the colour of the face with the number &quot;1&quot; to the colour of the face with the number &quot;6&quot;. If the die is not coloured correctly, output 0 0 0 0 0 0.</p>