# [Silver I] Cow Pinball - 6005

[문제 링크](https://www.acmicpc.net/problem/6005)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 165, 정답: 142, 맞힌 사람: 134, 정답 비율: 87.013%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The cows are playing that cool Japanese &#39;pinball&#39; game called Pachinko. You&#39;ve probably seen it, you drop a ball in the top and it hits nails on the way down, veering just a little left or right, until the ball comes out the bottom.</p>

<p>This pachinko game is special: the ball always hits the top nail of the R rows of nails (1 &lt;= R &lt;= 25) and then will hit either the right or left nail underneath that. From there, the ball can hit the next nail that&#39;s just a bit lower and to the left or right of the second nail, and so on. The ball never veers too far (i.e., more than 1/2 nail away) from the nail it just hit.</p>

<p>This game also has scoring that&#39;s unique: you get points X_ij (0 &lt;= X_ij &lt;= 3,000) for each little nail you hit on the way down. The cows want to maximize their score on this machine. What is the best score they can achieve?</p>

<p>Here&#39;s an example triangle and a good route:</p>

<pre>
                    7                        *7
                  3   8                    *3   8
                8   1   0                *8   1   0
              2   7   4   4             2  *7   4   4
            4   5   2   6   5         4  *5   2   6   5</pre>

<p>In the sample above, the route from 7 to 3 to 8 to 7 to 5 produces the highest sum: 30. It&#39;s not possible to go from 7 to 8 to 8 -- the 8 on the third row is too far away.</p>

### 입력

<ul>
	<li>Line 1: A single integer: R</li>
	<li>Lines 2..R+1: Line i+1 contains i space-separated integers that compose the scores of row R of the pachinko machine: X_i1, X_i2, ...</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the maximum achievable score.</li>
</ul>