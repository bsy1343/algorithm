# [Bronze III] Baby Bites - 16316

[문제 링크](https://www.acmicpc.net/problem/16316)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 910, 정답: 570, 맞힌 사람: 524, 정답 비율: 66.837%

### 분류

구현, 문자열

### 문제 설명

<p>Arild just turned 1 year old, and is currently learning how to count. His favorite thing to count is how many mouthfuls he has in a meal: every time he gets a bite, he will count it by saying the number out loud.</p>

<p>Unfortunately, talking while having a mouthful sometimes causes Arild to mumble incomprehensibly, making it hard to know how far he has counted. Sometimes you even suspect he loses his count! You decide to write a program to determine whether Arild&rsquo;s counting makes sense or not.</p>

### 입력

<p>The first line of input contains an integer n (1 &le; n &le; 1 000), the number of bites Arild receives. Then second line contains n space-separated words spoken by Arild, the i&rsquo;th of which is either a non-negative integer a<sub>i</sub> (0 &le; a<sub>i</sub> &le; 10 000) or the string &ldquo;mumble&rdquo;.</p>

### 출력

<p>If Arild&rsquo;s counting might make sense, print the string &ldquo;makes sense&rdquo;. Otherwise, print the string &ldquo;something is fishy&rdquo;.</p>