# [Platinum III] Need More T-shirts! - 22042

[문제 링크](https://www.acmicpc.net/problem/22042)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 20, 맞힌 사람: 17, 정답 비율: 28.333%

### 분류

다이나믹 프로그래밍, 배낭 문제, 수학, 정수론

### 문제 설명

<p>The Innopolis Open 2020 is coming. And this means that it&rsquo;s time to order T-shirts for the participants of the Olympiad.</p>

<p>The organizers decided that it would be great to buy T-shirts of different colors so that you can easily see who is the organizer, jury or participant of the Olympiad.</p>

<p>For this task, two people were assigned, they decided how many T-shirts of each color should be ordered. However, they did not agree among themselves, and one of them wrote down the number of T-shirts of a certain color that needs to be ordered, and the other wrote the percentage of T-shirts of a certain color. As a result, they got a list of length $n$, where each element of the list $a_i$ is either the number of T-shirts of color $i$ or the percentage of T-shirts of color $i$ of the total number of T-shirts. Moreover, it is known that in the list at least one element $a_i$ is the number of T-shirts of the color $i$.</p>

<p>Now the organizers need to understand, what is the total of T-shirts they need to buy for the olympiad. Help them find all possible options for the total number of T-shirts for which such a list could be obtained.</p>

### 입력

<p>The first line contains a single integer $n$, the number of different colors ($1 \le n \le 10^5$).</p>

<p>The second line contains $n$ integers $a_i$, either the number of T-shirts or the percentage of t-shirts for the color $i$ ($1 \le a_i&nbsp;\le 10^9$).</p>

### 출력

<p>In the first line print the number of options for the total number of T-shirts for which such a list could be obtained.</p>

<p>In the second line print all possible options for the total number of T-shirts, in sorted order.</p>

### 힌트

<p>Explanation of the first example:</p>

<p>If the total number of T-shirts is $2$: one of color $1$, and one of color $2$, we can obtain the given list if the first element ($1$) is the number of T-shirts of color $1$, and the second element ($50$) is the percentage of T-shirts of color $2$. $2 = 1 + 2 \cdot&nbsp;\frac{50}{100}$.</p>

<p>If the total number of T-shirts is $51$: one of color $1$, and $50$ of color $2$, we can obtain the given list, if both elements are the numbers of T-shirts of colors $1$ and $2$. $51 = 1 + 50$.</p>

<p>Explanation of the second example:</p>

<ul>
	<li>$120 = 20 + 30 + 70$</li>
	<li>$125 = 125 \cdot \frac{20}{100} + 30 + 70$</li>
	<li>$140 = 140 \cdot \frac{20}{100} + 140 \cdot \frac{30}{100} + 70$</li>
	<li>$300 = 300 \cdot \frac{20}{100} + 30 + 300 \cdot \frac{70}{100}$</li>
</ul>