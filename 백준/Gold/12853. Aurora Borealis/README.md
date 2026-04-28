# [Gold I] Aurora Borealis - 12853

[문제 링크](https://www.acmicpc.net/problem/12853)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 70, 정답: 29, 맞힌 사람: 25, 정답 비율: 47.170%

### 분류

그리디 알고리즘, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Tonight is finally your chance to experience one of the most mystifying phenomena the earth has to offer: the Aurora Borealis. A week ago you begged your parents to let you go out to the countryside this evening, and luckily they gave you the green light. You put on warm clothes, fill your flask with hot coffee, and prepare a quick snack. It seems like conditions are perfect; there is only a single cloud on the horizon and you look forward to the beautiful prismatic display.</p>

<p>However, reality once agains rears its ugly head. Every time you try to look at the Aurora Borealis, this stupid single cloud is in the way! You cannot believe the bad luck you are having, but you do not get a single look at the Aurora Borealis that night.</p>

<p>Disgruntled and disillusioned you head back home and try to make the best of the short amount of sleep you have left. Unfortunately, anger-induced insomnia gets the best of you and you start thinking about this annoying cloud. You feel like you got disproportionally unlucky, and in order to get some peace of mind you decide to calculate how large the cloud had to be in order to foil your sightseeing plans so effectively.</p>

<p>You model the sky as the real line, and the cloud as a closed interval, obscuring from view any point in this interval. You assume the speed of the cloud can never exceed $1$ m/s. Whenever you looked at the sky, you wrote down the exact time it was and the exact position you looked at. Given this information, what is the smallest length the cloud could have so that the Aurora Borealis remained hidden to you?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line containing the integer $n$ ($1 \leq n \leq 3 \cdot 10^5$), the number of times you looked at the sky.</li>
	<li>$n$ lines, each with two integers $t$ and $x$ ($0 \leq t, x \leq 10^{12}$), the time and position of one of the attempts to see the Aurora.</li>
</ul>

<p>The times in the input are all unique.</p>

### 출력

<p>Output the minimum possible length of the cloud that would be able to keep you from seeing the Aurora. It can be proven that the result is always an integer.</p>