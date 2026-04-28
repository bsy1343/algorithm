# [Gold III] Paint Mix - 4857

[문제 링크](https://www.acmicpc.net/problem/4857)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 70, 정답: 8, 맞힌 사람: 5, 정답 비율: 15.152%

### 분류

수학, 구현, 시뮬레이션

### 문제 설명

<p>You are given two large pails. One of them (known as the black pail) contains&nbsp;<em>B</em>&nbsp;gallons of black paint. The other one (known as the white pail) contains&nbsp;<em>W</em>&nbsp;gallons of white paint. You will go through a number of&nbsp;<strong><em>iterations</em></strong>of pouring paint first from the black pail into the white pail, then from the white pail into the black pail. More specifically, in each iteration you first pour&nbsp;<em>C</em>&nbsp;cups of paint from the black pail into the white pail (and thoroughly mix the paint in the white pail), then pour&nbsp;<em>C</em>&nbsp;cups of paint from the white pail back into the black pail (and thoroughly mix the paint in the black pail).&nbsp;<em>B</em>,&nbsp;<em>W</em>, and&nbsp;<em>C</em>&nbsp;are positive integers; each of&nbsp;<em>B</em>&nbsp;and&nbsp;<em>W</em>&nbsp;is less than or equal to 50, and&nbsp;<em>C</em>&nbsp;&lt; 16 *&nbsp;<em>B</em>&nbsp;(recall that 1 gallon equals 16 cups). The white pail&#39;s capacity is at least&nbsp;<em>B</em>+<em>W</em>.</p>

<p>As you perform many successive iterations, the ratio of black paint to white paint in each pail will approach&nbsp;<em>B/W</em>. Although these ratios will never actually be equal to&nbsp;<em>B/W</em>&nbsp;one can ask: how many iterations are needed to make sure that the black-to-white paint ratio in&nbsp;<em>each</em>&nbsp;of the two pails differs from&nbsp;<em>B/W</em>&nbsp;by less than a certain tolerance. We define the tolerance to be 0.00001.</p>

### 입력

<p>The input consists of a number of lines. Each line contains input for one instance of the problem: three positive integers representing the values for&nbsp;<em>B</em>,&nbsp;<em>W</em>, and&nbsp;<em>C</em>, as described above. The input is terminated with a line where&nbsp;<em>B = W = C = 0</em>.</p>

### 출력

<p>Print one line of output for each instance. Each line of output will contain one positive integer: the smallest number of iterations required such that the black-to-white paint ratio in&nbsp;<em>each</em>&nbsp;of the two pails differs from&nbsp;<em>B/W</em>&nbsp;by less than the tolerance value.</p>