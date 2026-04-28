# [Platinum II] Birthday Gift - 27385

[문제 링크](https://www.acmicpc.net/problem/27385)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 18, 맞힌 사람: 15, 정답 비율: 51.724%

### 분류

다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱, 수학, 정수론

### 문제 설명

<p>It&rsquo;s your Venusian friend&rsquo;s birthday. You don&rsquo;t remember their exact age, but you are sure it had to be no more than $10^{18}$ years. You will give them a decimal number (without leading zeros) for their birthday. You want the number of digits to be equal to their age. To make the number more interesting you will ensure that no adjacent pairs of digits will be identical.</p>

<p>Their exact day of birth is represented as an integer in the range $0$ to $224$ (since Venus has $225$ days in a year). To make their gift more personal you want the given number to have the same remainder as their birthday when divided by $225$.</p>

<p>There are potentially a lot of possible gifts that you could give. You may decide to give more than one gift. Determine the number of possible gifts modulo $10^9+7$.</p>

### 입력

<p>The single line of input contains two space separated integers $a$ ($1 \le a \le 10^{18}$) and $b$ ($0 \le b &lt; 225$), where $a$ is the age of your friend and $b$ is the birthdate of your friend.</p>

### 출력

<p>Output a single integer, which is the number of interesting personalized numbers you could give. Since this number may be quite large, output it modulo $10^9+7$.</p>