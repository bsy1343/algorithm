# [Bronze II] Art Installation - 34635

[문제 링크](https://www.acmicpc.net/problem/34635)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 125, 정답: 88, 맞힌 사람: 71, 정답 비율: 71.000%

### 분류

그리디 알고리즘, 사칙연산, 수학

### 문제 설명

<p>Jolie is setting up an art installation for her cat, Millie. The art installation will be made up of multiple LEDs.</p>

<p>Jolie has decided that she needs a specific number of red LEDs, green LEDs, and blue LEDs. After rummaging through her desk, she has found some of each. She can buy two special types of LEDs, one which can be either red or green, and another which can be either green or blue.</p>

<p>How many of the special LEDs will Jolie need to buy to finish her installation?</p>

### 입력

<p>The first line of input contains three integers $r$, $g$ and $b$ ($0 \le r,g,b \le 1\, 000$), which are the numbers of red LEDs, green LEDs, and blue LEDs Jolie needs.</p>

<p>The second line contains three integers $c_r$, $c_g$ and $c_b$ ($0 \le c_r,c_g,c_b \le 1\, 000$), which are the numbers of red LEDs, green LEDs, and blue LEDs Jolie already owns.</p>

<p>The third line contains two integers $c_{rg}$ and $c_{gb}$ ($0 \le c_{rg},c_{gb} \le 2\, 000$), which are the numbers of special LEDs that can be either red or green, and the number of special LEDs that can be either green or blue, that are available for Jolie to buy.</p>

### 출력

<p>Output a single integer, which is the total number of LEDs Jolie needs to buy to make her installation. Output $-1$ if there aren’t enough LEDs for her to complete her installation.</p>