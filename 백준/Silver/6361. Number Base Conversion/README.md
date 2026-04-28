# [Silver V] Number Base Conversion - 6361

[문제 링크](https://www.acmicpc.net/problem/6361)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 240, 정답: 106, 맞힌 사람: 90, 정답 비율: 43.062%

### 분류

수학, 구현, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Write a program to convert numbers in one base to numbers in a second base. There are 62 different digits:</p>

<p>{ 0-9,A-Z,a-z }</p>

<p>HINT: If you make a sequence of base conversions using the output of one conversion as the input to the next, when you get back to the original base, you should get the original number.</p>

### 입력

<p>The first line of input contains a single positive integer. This is the number of lines that follow. Each of the following lines will have a (decimal) input base followed by a (decimal) output base followed by a number expressed in the input base. Both the input base and the output base will be in the range from 2 to 62. That is (in decimal) A = 10, B = 11, &hellip;, Z = 35, a = 36, b = 37, &hellip;, z = 61 (0-9 have their usual meanings).</p>

### 출력

<p>The output of the program should consist of three lines of output for each base conversion performed. The first line should be the input base in decimal followed by a space then the input number (as given expressed in the input base). The second output line should be the output base followed by a space then the input number (as expressed in the output base). The third output line is blank.</p>