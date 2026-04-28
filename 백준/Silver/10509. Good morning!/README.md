# [Silver III] Good morning! - 10509

[문제 링크](https://www.acmicpc.net/problem/10509)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 214, 정답: 122, 맞힌 사람: 110, 정답 비율: 56.995%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Good morning! This is your 5am wake-up call! A partly cloudy day is expected with light rain coming afternoon...</p>

<p>You have just woken up. You desperately need coffee... and... more coffee... and some cereal. And your clothes. And coffee.</p>

<p>To prepare warm cereal, you put some milk into a microwave, trying to heat it for k seconds. You must enter k on the microwave keyboard:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/10509.%E2%80%85Good%E2%80%85morning!/6e19cda7.png" data-original-src="https://www.acmicpc.net/upload/images2/goodmorning.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>As you still haven&rsquo;t had your coffee, your hand (along with eyes and brain) keeps falling down. You are only able to enter a number if your hand would only move downwards and/or to the right. You cannot go back left, nor move your hand up, though you can press the same key again. And again... and again...</p>

<p>For example, you can enter the number 180 or 49, but not 98 or 132. Enter a number that is as close to k as possible. If there are two solutions, enter any one of them. You are too sleepy to actually care. And you need coffee.</p>

### 입력

<p>The first line of input contains the number of test cases T. The descriptions of the test cases follow:</p>

<p>Each test case consists of one line containing an integer k (1 &le; k &le; 200).</p>

### 출력

<p>For each test case, output a number that is closest to k which can be entered on the keyboard</p>