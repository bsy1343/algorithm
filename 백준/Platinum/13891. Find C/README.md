# [Platinum II] Find C - 13891

[문제 링크](https://www.acmicpc.net/problem/13891)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 237, 정답: 48, 맞힌 사람: 44, 정답 비율: 27.500%

### 분류

확장 유클리드 호제법, 수학, 정수론

### 문제 설명

<p>Two of your friends Alpha and Beta are at A and B, two integer coordinates in 2D plane. You want to take their picture from another integer coordinate C fulfilling following conditions:</p>

<ol>
	<li>C has to be different from A and B.</li>
	<li>There is no integer coordinate point on the line segment AC other than its end points.</li>
	<li>There is no integer coordinate point on the line segment BC other than its end points.</li>
	<li>Triangle ABC must have positive area, that is, C must not lie on the line going through A and B.</li>
	<li>There is no integer coordinate point strictly inside triangle ABC.</li>
</ol>

<p>Don&rsquo;t forget this is the era of digital photography where people don&rsquo;t take only one snap. So you also need to find out K such C for each A and B from where you will take pictures.</p>

<p>A point P having coordinate (x,y) is called integer coordinate if both x and y are integers.</p>

### 입력

<p>First line of the input contains number of test cases T (1 &le; T &le; 1000).</p>

<p>In following T lines, there are 5 integers: A<sub>x</sub>, A<sub>y</sub>, B<sub>x</sub>, B<sub>y</sub>, K. Coordinates of A and B are (A<sub>x</sub>, A<sub>y</sub>) and (B<sub>x</sub>, B<sub>y</sub>) respectively. A and B are distinct points. (-10<sup>9</sup> &le; A<sub>x</sub>, A<sub>y</sub>, B<sub>x</sub>, B<sub>y</sub> &le; 10<sup>9</sup>, 0 &le; sum of all K &le; 20 000)</p>

### 출력

<p>For each case print K lines each containing coordinate of C in: &ldquo;C<sub>x</sub> C<sub>y</sub>&rdquo; format. You may assume that there are at least K such C points. You may output the C points in any order, but these K points has to be distinct. Also all the C<sub>x</sub> and C<sub>y</sub> have to be between -10<sup>14</sup> and 10<sup>14</sup>. For details of output format please consult the sample input output.&nbsp;</p>