# [Gold IV] Garland - 7431

[문제 링크](https://www.acmicpc.net/problem/7431)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 13, 맞힌 사람: 11, 정답 비율: 45.833%

### 분류

이분 탐색, 수학, 매개 변수 탐색, 삼분 탐색

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/95723130-e8ad-4689-8926-99b16937040d/-/preview/" style="width: 391px; height: 397px; float: right;" />The New Year garland consists of N lamps attached to a common wire that hangs down on the ends to which outermost lamps are affixed. The wire sags under the weight of lamp in a particular way: each lamp is hanging at the height that is 1 millimeter lower than the average height of the two adjacent lamps.</p>

<p>The leftmost lamp in hanging at the height of A millimeters above the ground. You have to determine the lowest height B of the rightmost lamp so that no lamp in the garland lies on the ground though some of them may touch the ground.</p>

<p>You shall neglect the lamp&#39;s size in this problem. By numbering the lamps with integers from 1 to N and denoting the i<sup>th</sup> lamp height in millimeters as H<sub>i</sub>&nbsp;we derive the following equations:</p>

<ul>
	<li>H<sub>1</sub> = A</li>
	<li>H<sub>i</sub>&nbsp;= (H<sub>i-1</sub> + H<sub>i+1</sub>)/2 - 1, for all 1 &lt; i &lt; N</li>
	<li>H<sub>N</sub> = B</li>
	<li>H<sub>i</sub> = 0, for all 1 &le; i &le; N</li>
</ul>

<p>The sample garland with 8 lamps that is shown on the picture has A = 15 and B = 9.75.</p>

### 입력

<p>The input file consists of a single line with two numbers N and A separated by a space. N (3 &le; N &le;&nbsp;1000) is an integer representing the numb er of lamps in the garland, A (10 &le; A &le; 1000) is a real number representing the height of the leftmost lamp above the ground in millimeters.</p>

### 출력

<p>Write to the output file the single real number B accurate to two digits to the right of the decimal point representing the lowest possible height of the rightmost lamp.</p>