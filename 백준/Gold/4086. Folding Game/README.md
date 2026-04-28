# [Gold II] Folding Game - 4086

[문제 링크](https://www.acmicpc.net/problem/4086)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

구현, 수학

### 문제 설명

<p>Alice and Bob are playing a game. Alice places a rectangular piece of paper in front of Bob with width W and height H. Then she proceeds to fold the paper N times. Each fold is either horizontal or vertical. Folding the paper horizontally leaves another rectangle of the same width W and smaller height h. Similarly, a vertical fold leaves a rectangle with same height H and smaller width w.</p>

<p>In the end, Alice puts her finger on some point on the resulting rectangle and asks &#39;Bob, how many layers of paper are directly beneath my finger?&#39;.&nbsp;</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with a line with three integers:</p>

<pre>W H N</pre>

<p>Where W and H (0 &lt; W,H &le; 1,000,000) are the width and height of the paper, and N (0 &le; N &le; 20) is the number of folds. W and H are guaranteed to be even. On each of the subsequent N lines there will be a letter and a number, separated by a single space:</p>

<pre>D K</pre>

<p>The letter D is one of { &lsquo;T&rsquo;, &lsquo;B&rsquo;, &lsquo;L&rsquo;, &lsquo;R&rsquo; } indicating whether the fold is from the Top, Bottom, Left or Right. It will always be capital. The number K indicates where Alice makes the fold, measured from the given edge. For example, if D is &lsquo;T&rsquo;, then Alice starts with the paper lying flat, lifts the TOP edge and folds it downward. K is guaranteed to be on the paper, and it is guaranteed to be even.</p>

<p>On the final line of each case there will be two integers:</p>

<pre>X Y</pre>

<p>Which indicate the point where Alice puts her finger. This is measured from the bottom left corner, with X being the distance towards the right, and Y being the distance towards the top. The point (X,Y) is guaranteed to be on the fully folded paper. Both X and Y are also guaranteed to be odd. Since W, H and K are all even, this assures that the point (X,Y) will not be over any edge or fold.</p>

<p>The input ends with a line with three 0s.</p>

### 출력

<p>For each case output a single integer on its own line, indicating the number of layers of paper at the given point (X,Y). Output no extra spaces, and do not separate answers with blank lines.</p>