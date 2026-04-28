# [Platinum IV] Let Me Count The Ways - 23988

[문제 링크](https://www.acmicpc.net/problem/23988)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 37, 맞힌 사람: 28, 정답 비율: 96.552%

### 분류

수학, 정수론, 조합론, 분할 정복을 이용한 거듭제곱, 포함 배제의 원리, 모듈로 곱셈 역원

### 문제 설명

<p>To celebrate the anniversary of Googleland,&nbsp;<b>N</b>&nbsp;couples are going to go for a boat ride in a rowboat. The rowboat is very long, but it is only one person wide, so the people will sit in a line from front to back.</p>

<p>However, during a rehearsal of the voyage, the boat did not move! After investigating, the organizers found that some newlywed couples were not rowing, but writing love poems for each other the whole time. Specifically, there are&nbsp;<b>M</b>&nbsp;pairs of newlywed couples. If the two members of a newlywed couple are sitting next to each other, they will be so busy writing poems that they will not row.</p>

<p>Now the organizers have come to you, the smartest person in Googleland, to ask, how many possible ways are there to arrange all 2<b>N</b>&nbsp;people on the rowboat, such that for each of the&nbsp;<b>M</b>&nbsp;newlywed couples, the two members are not sitting next to each other? Two ways are different if there is some position in the boat at which the two ways use different people. Notice that for the purpose of counting the number of ways, the two members of a couple are not considered to be interchangeable. Since the number can be very large, the organizers only want to know the value of the answer modulo 1000000007(10<sup>9</sup>+7).</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case consists of one line with two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>M</b>&nbsp;as described above.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of possible arrangements, modulo 1000000007(10<sup>9</sup>+7).</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
</ul>