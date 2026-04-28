# [Bronze II] Ancient Keyboard - 7286

[문제 링크](https://www.acmicpc.net/problem/7286)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 372, 정답: 251, 맞힌 사람: 222, 정답 비율: 72.787%

### 분류

구현, 문자열

### 문제 설명

<p>The scientists have found an ancient device that works in a strange way. The device has a keyboard and an output tape. The keyboard has 26 keys, with symbols `A&#39; through `Z&#39; on them. Each key has an LED on it (like the Caps Lock key on some keyboards). Each time you press a key, the LED on it toggles (changes its state from off to on or vice versa). All LEDs are off initially.</p>

<p>To study the output written on the tape, we consider the device in discrete time steps. Suppose we are in time t . If no LED is on, no output is written on the tape. If there are i LEDs on, the i th letter of the English alphabet is written on the tape. For example, if three LEDs are on at a time step, a letter `C&#39; is written on the tape. This process repeats at every time step.</p>

<p>You are asked to write a program that simulates the ancient device.</p>

### 입력

<p>The input contains multiple test cases. The first line of the input, contains t , the number of test cases that follow. Each of the following t blocks, describes a test case.</p>

<p>The first line of each block contains one integer n (0 &le; n &le;&nbsp;26) . After this, there are n lines, each containing one capital alphabet letter, followed by two integers a and b , (0 &le; a &lt; b &le; 1000) . The capital letter shows the key pressed. The number a is the first time step at which the key is pressed and the number b is the second time step at which the key is pressed. During the interval a , a + 1 , ... , b - 1 , the LED of the key is on. You can assume that, in each test case, these letters are distinct.</p>

### 출력

<p>For each test case, output one line containing the output string that is written on the tape.</p>