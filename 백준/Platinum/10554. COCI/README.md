# [Platinum I] COCI - 10554

[문제 링크](https://www.acmicpc.net/problem/10554)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 96, 정답: 31, 맞힌 사람: 28, 정답 비율: 32.558%

### 분류

자료 구조, 정렬, 세그먼트 트리, 누적 합, 많은 조건 분기, 두 포인터

### 문제 설명

<p>The 3rd round of COCI is already here! In order to bet on predict the scores, we have assumed the following:</p>

<ul>
	<li>If contestant A scored strictly more points than contestant B in each of the first two rounds, then in the third round A will score at least an equal amount of points as B.</li>
</ul>

<p>Of course, in each round (including this one, the 3rd one) it is possible to score from 0 to 650 points. On the total ranking list, contestants are sorted descending according to the sum of points from all three rounds. The contestants with an equal sum share the same place and the next contestant gets the realistic following place. For example, contestants with sums equal to 1000, 1000, 900, 900 and 800 points win places 1., 1., 3., 3. and 5., respectively.</p>

<p>For each of the N contestants, we know the number of points scored in the first and second round. Given the aforementioned assumption, determine the highest and lowest place each contestant can get on the total ranking list after three rounds of COCI.</p>

### 입력

<p>The first line of input contains an integer N (1 &le; N &le; 500 000), the number of contestants.</p>

<p>Each of the following N lines contains two integers from the interval [0, 650]: the number of points each contestant won in the first and second round.</p>

### 출력

<p>For each contestant, in the order given in the input, output two integers per line: the required highest and lowest place they can get on the total ranking list.</p>