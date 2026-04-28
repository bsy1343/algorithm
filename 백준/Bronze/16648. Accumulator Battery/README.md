# [Bronze II] Accumulator Battery - 16648

[문제 링크](https://www.acmicpc.net/problem/16648)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 752, 정답: 488, 맞힌 사람: 433, 정답 비율: 65.606%

### 분류

수학, 사칙연산

### 문제 설명

<p>Anna loves her cell phone and becomes very sad when its battery level drops to 0 percent.</p>

<p>In normal mode, Anna&rsquo;s phone battery drains at a constant speed. When the battery level reaches 20 percent, the phone automatically switches to eco mode. In eco mode, the battery drains two times slower than in normal mode.</p>

<p>Alex has invited Anna for a date. Anna needs t minutes to get from her home to the meeting place. When Anna leaves home, her phone&rsquo;s battery level is 100 percent. At the moment she reaches the meeting place, the battery level will be p percent.</p>

<p>Alex wonders for how long Anna will be in a good mood after they meet. Help him solve this problem!</p>

### 입력

<p>The only line of the input contains two integers t and p &mdash; time Anna needs to get from her home to the meeting place, in minutes, and the battery level of her phone at the moment of meeting, in percent (1 &le; t &le; 360; 1 &le; p &le; 99).</p>

### 출력

<p>Output a single real number &mdash; time since the moment of meeting before Anna&rsquo;s phone runs out of battery, in minutes.</p>

<p>Your answer will be considered correct if its absolute or relative error doesn&rsquo;t exceed 10<sup>&minus;4</sup>.</p>

### 힌트

<p>In the first test case, the battery drains at a rate of one percent per minute. In 50 minutes after the meeting, the battery level will reach 20 percent and the phone will switch to eco mode. 40 minutes later the phone will run out of battery.</p>

<p>In the second test case, the phone is already in eco mode. The battery level will be enough for a little less than 11 minutes.</p>