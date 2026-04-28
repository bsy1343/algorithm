# [Silver III] Mountain Watching - 6053

[문제 링크](https://www.acmicpc.net/problem/6053)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 149, 정답: 72, 맞힌 사람: 66, 정답 비율: 51.969%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>One day, Bessie was gazing off into the distance at the beautiful &nbsp;Wisconsin mountains when she wondered to herself: which is the widest one?</p>

<p>She decided to take N (1 &lt;= N &lt;= 10,000) height measurements H_i (1 &lt;= H_i &lt;= 1,000,000,000) sequentially along the horizon using her new Acme Long Distance Geoaltimeter.&nbsp;</p>

<p>A mountain is defined to be a consecutive sequence of H_i values which increases (or stays the same) and then decreases (or stays the same), e.g., 2, 3, 3, 5, 4, 4, 1. It is possible for a mountain on the edge of her field of vision only to increase or only to decrease in height, as well.</p>

<p>The width of a mountain is the number of measurements it encompasses. Help Bessie identify the widest mountain.</p>

<p>Here&#39;s a simple example of a typical horizon:</p>

<pre>
           *******                   *
          *********                 ***
          **********               *****
          ***********           *********               *
*      *****************       ***********             *** *
**    *******************     *************   * *     *******      *
**********************************************************************
?ddsssuussuussssssddddssddssssuuuuuuuuddddddssududssssuuudduddsssssuds
3211112333677777776543332111112344456765432111212111112343232111111211
aaaaa                     cccccccccccccccccccc eeeeeee    ggggggggg
  bbbbbbbbbbbbbbbbbbbbbbbbbbbb             ddddd ffffffffff  hhhhhhhhh</pre>

<p>The mountains are marked &#39;a&#39;, &#39;b&#39;, etc. &nbsp;Obviously, mountain b is widest with width 28.</p>

<p>Hint: Sometimes it&#39;s easiest to find a mountain&#39;s width by knowing where its highest parts are.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: H_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single line with a single integer that is the width of the widest mountain.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>The height measurements are 3, 2, 3, 5, 4, 1, 6.</p>

<p>The widest mountain consists of the measurements 2, 3, 5, 4, 1. Other mountains include 3, 2 and 1, 6</p>

<p>&nbsp;</p>