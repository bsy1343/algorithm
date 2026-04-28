# [Silver III] Quadratic Dissonance - 24933

[문제 링크](https://www.acmicpc.net/problem/24933)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 31, 맞힌 사람: 29, 정답 비율: 70.732%

### 분류

많은 조건 분기, 수학, 삼분 탐색

### 문제 설명

<p>Oh no! Both you and your lab partner forgot to complete one part of the latest assignment and it is due in an hour!</p>

<p>The purpose of this lab assignment was to have you analyze some experimental data, find a quadratic function that best describes the data, and report the minimum value that can be taken by this quadratic.</p>

<p>Both you and your partner have tried this part on your own, in order to double-check your answers. Unfortunately, you both found different quadratic functions!</p>

<p>You don&rsquo;t have time to repeat the experiment. To try and maximize your chances of reporting a value that is close to the minimum (i.e. to get partial credit), you decide to find a value&nbsp;$x$&nbsp;that minimizes the maximum of your two quadratic functions.</p>

<p>More precisely, your task is the following. Given two quadratic functions&nbsp;$f(x)=x^2+A&sdot;x+B$&nbsp;and&nbsp;$g(x)=x^2+C&sdot;x+D$&nbsp;(here&nbsp;$A,B,C,D$&nbsp;will be given values), you should find a value&nbsp;$x^&lowast;$&nbsp;minimizing the maximum of these two functions. That is,&nbsp;$x^&lowast;$&nbsp;should be chosen to minimize the function&nbsp;$h(x)=\max{\{f(x),g(x)\}}$.</p>

### 입력

<p>Input consists of a single line containing four integers $A,B,C,D$, each lying in the range&nbsp;$[-1000,1000]$.</p>

### 출력

<p>Display two values&nbsp;$x^&lowast;,h(x^&lowast;)$&nbsp;on a single line where&nbsp;$x^&lowast;$&nbsp;is the point that minimizes the function&nbsp;$h(x)=\max{\{x^2+A&sdot;x+B,x^2+C&sdot;x+D\}}$.</p>

<p>Your answer will be accepted if both values are within an absolute or relative error of&nbsp;$10^{-4}$ of the correct answer.</p>