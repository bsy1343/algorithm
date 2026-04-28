# [Platinum IV] Not One Bit More - 4718

[문제 링크](https://www.acmicpc.net/problem/4718)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 87, 정답: 45, 맞힌 사람: 40, 정답 비율: 57.143%

### 분류

수학, 다이나믹 프로그래밍, 조합론, 비트마스킹

### 문제 설명

<p>Start with an integer, N<sub>0</sub>, which is greater than 0. Let N<sub>1</sub> be the number of ones in the binary representation of N<sub>0</sub>. So, if N<sub>0</sub> = 27, N<sub>1</sub> = 4.</p>

<p>In general, let N<sub>i</sub> be the number of ones in the binary representation of N<sub>i&minus;1</sub>. This sequence will always converge to one.</p>

<p>For any starting number, N0, let K(N0) be the minimum i such that Ni is one. For example, if N<sub>0</sub> =31, then N<sub>1</sub> =5, N<sub>2</sub> =2, N<sub>3</sub> =1, so K(31)=3.</p>

<p>Given a range of consecutive numbers, and a value X, how many numbers in the range have a K(. . .) value equal to X?</p>

### 입력

<p>There will be several test cases in the data file. Each test case will consist of three integers on a single line:</p>

<p>LO HI X</p>

<p>where LO and HI (1 &le; LO &le; HI &le; 10<sup>18</sup>) are the lower and upper limits of a range of integers, and X (0 &le; X &le; 10) is the target value for K(...).</p>

<p>The data file will end with a line with three 0s.</p>

### 출력

<p>For each test case, output a line with a single integer, representing the number of integers in the range from LO to HI (inclusive) which have a K (. . .) value equal to X in the input.</p>