# [Platinum IV] Frog - 8198

[문제 링크](https://www.acmicpc.net/problem/8198)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 190, 정답: 73, 맞힌 사람: 55, 정답 비율: 36.667%

### 분류

자료 구조, 희소 배열, 두 포인터

### 문제 설명

<p>On the bed of one particularly long and straight Byteotian brook there lie n rocks jutting above the water level. Their distances from the brook&#39;s spring are p<sub>1</sub> &lt; p<sub>2</sub> &lt; &hellip; &lt; p<sub>n</sub> respectively. A small frog sitting on one of these is about to begin its leaping training. Each time the frog leaps to the rock that is the k-th closest to the one it is sitting on. Specifically, if the frog is sitting on the rock at position pi, then it will leap onto such pj that:</p>

<p style="text-align: center;">|{p<sub>a</sub>&nbsp;: |p<sub>a</sub>-p<sub>i</sub>| &lt; |p<sub>j</sub>-p<sub>i</sub>|}| &le; k and |{p<sub>a</sub> : |p<sub>a</sub>-p<sub>i</sub>| &le; |p<sub>j</sub>-p<sub>i</sub>|}| &gt; k.</p>

<p>If pj is not unique, then the frog chooses among them the rock that is closest to the spring. On which rock the frog will be sitting after m leaps depending on the rock is started from?</p>

### 입력

<p>The first line of the standard input holds three integers, n, k and m (1 &le; k &lt; n &le; 1,000,000, 1 &le; m &le; 10<sup>18</sup>), separated by single spaces, that denote respectively: the number of rocks, the parameter k, and the number of intended leaps. The second line holds n integers p<sub>j</sub> (1 &le; p<sub>1</sub> &lt; p<sub>2</sub> &lt; &hellip; &lt; p<sub>n</sub> &le; 10<sup>18</sup>), separated by single spaces, that denote the positions of successive rocks on the bed of the brook.</p>

### 출력

<p>Your program should print a single line on the standard output, with n integers r<sub>1</sub>, r<sub>2</sub>, &hellip;, r<sub>n</sub> from the interval [1,n] in it, separated by single spaces. The number ri denotes the number of the rock that the frog ends on after making m leaps starting from the rock no. i (in the input order).</p>

### 힌트

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8198/1.gif" style="height:46px; line-height:1.6em; width:192px" /></p>

<p>The figure presents where the frog leaps to (in a single leap) from each and every rock.</p>