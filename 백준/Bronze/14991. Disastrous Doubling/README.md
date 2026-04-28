# [Bronze II] Disastrous Doubling - 14991

[문제 링크](https://www.acmicpc.net/problem/14991)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 620, 정답: 187, 맞힌 사람: 148, 정답 비율: 28.850%

### 분류

수학, 구현, 사칙연산, 시뮬레이션, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>A scientist, E. Collie, is going to do some experiments with bacteria. Right now, she has one bacterium. She already knows that this species of bacteria doubles itself every hour. Hence, after one hour there will be 2 bacteria. E.</p>

<p>E. Collie will do one experiment every hour, for n consecutive hours. She starts the first experiment exactly one hour after the first bacterium starts growing. In experiment i she will need b<sub>i</sub> bacteria.</p>

<p>How many bacteria will be left directly after starting the last experiment? If at any point there are not enough bacteria to do the experiment, print &ldquo;error&rdquo;.</p>

<p>Since the answer may be very large, please print it modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>The input consists of two lines.</p>

<ul>
	<li>The first line contains an integer 1 &le; n &le; 10<sup>5</sup>, the number of experiments.</li>
	<li>The second line contains n integers b<sub>1</sub>, . . . , b<sub>n</sub>, where 0 &le; b<sub>i</sub> &le; 2<sup>60</sup> is the number of bacteria used in the ith experiment.</li>
</ul>

### 출력

<p>Output a single line containing the number of bacteria that remains after doing all the experiments, or &ldquo;error&rdquo;.</p>