# [Platinum II] Jack and Jill and Joe - 15390

[문제 링크](https://www.acmicpc.net/problem/15390)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 11, 맞힌 사람: 11, 정답 비율: 28.205%

### 분류

브루트포스 알고리즘, 수학, 런타임 전의 전처리

### 문제 설명

<p>Jill and Jack are about to purchase separate plots of land. Jill would like her plot to be a square one while Jack&rsquo;s is a rectangular plot with one side longer than the other by whatever the sidelength of Jill&rsquo;s plot is.</p>

<p>Joe, their father, insisted that the sidelengths of their plot cannot exceed N feet and that the square of the difference of the area of Jack and Jill&rsquo;s plot is at most 900 square feet. Furthermore the sum of the areas should be the maximum possible.</p>

<p>Joe insists that the sidelengths of the plots are at least 100 feet and are integers.</p>

### 입력

<p>The input starts with a positive integer T, followed by T test cases.</p>

<p>Each test case consists of one positive integer N on a line by itself.</p>

<p>Constraints</p>

<ul>
	<li>1 &le; T &le; 12000</li>
	<li>100 &lt; N &lt; 2<sup>31</sup></li>
</ul>

### 출력

<p>For each case, output a single line. If the case is not solvable, output impossible, else output a and b, separated by a space, where a is the sidelength of Jill&rsquo;s square plot and b is the shorter sidelength of Jack&rsquo;s rectangular plot.</p>