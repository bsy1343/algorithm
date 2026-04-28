# [Silver II] Achievements - 16598

[문제 링크](https://www.acmicpc.net/problem/16598)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 159, 정답: 75, 맞힌 사람: 60, 정답 비율: 43.478%

### 분류

두 포인터

### 문제 설명

<p>Did you know that Greg practices his Swedish skills every day? Well, almost every day.</p>

<p>The app that Greg uses to learn languages gives out achievement badges to keep you engaged with the app. One of the achievements is for the longest streak, i.e., the highest number of consecutive days that Greg practices Swedish. Remember that Greg does not practice every day, so there are gaps. Fortunately, the app allows him to pay for the days where he did not practice and still obtain the achievement.</p>

<p>Given the days when Greg actually practiced his Swedish and the number of days he is willing to pay for, what is the longest streak he can reach?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers n and p (1 &le; n, p &le; 2 &middot; 10<sup>5</sup>), where n is the number of days Greg practiced with the app and p is the number of days that he is willing to pay for.</li>
	<li>One line with n distinct integers d<sub>1</sub>, . . . , d<sub>n</sub> (0 &le; d<sub>1</sub> &lt; d<sub>2</sub> &lt; . . . &lt; d<sub>n</sub> &le; 10<sup>6</sup>), the days when Greg actually practiced.</li>
</ul>

### 출력

<p>Output the length of the longest streak that Greg can reach when using the paid days in an optimal way.</p>