# [Silver II] Location, Location, Location - 30330

[문제 링크](https://www.acmicpc.net/problem/30330)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 138, 정답: 107, 맞힌 사람: 93, 정답 비율: 76.860%

### 분류

수학, 정렬, 기하학

### 문제 설명

<p>The concept of &quot;location, location, location&quot; is a common phrase used in real estate and business to emphasize the importance of the physical location of a property or business. In real estate, it suggests that the desirability and value of a property are heavily influenced by its location, often more so than by the property&#39;s features or condition. In business, it highlights that the success of a retail store or commercial establishment can be significantly impacted by its geographical location.</p>

<p>In recent years, people tend to buy electric vehicles, but the buyers soon find it is hard to install charging piles in their apartments or houses. Building a charging station can be a good idea to make a lot of money. Your boss, Lena, ask you to find a good location for establishing her charge station to serve the electric vehicle owners.</p>

<p>In recent times, there has been a growing trend towards the adoption of electric vehicles (EVs). However, many EV owners face the challenge of installing charging infrastructure in their apartments or houses. Establishing a charging station presents a lucrative opportunity in response to this demand. Your boss, Lena, has tasked you with identifying an optimal location for building a charging station to cater to the needs of electric vehicle owners.</p>

<p>You are given a list of $n$ locations represented as $(x,y)$ coordinates in a 2D plane. For each location, there is an apartment or a house without any charging infrastructure. Your task is to build a charging station at the location that is closest to all $n$ locations on the list. In this problem, distance is measured using the Manhattan distance metric. The Manhattan distance between two points $(x_1,y_1)$ and $(x_2,y_2)$ is defined as $|x_1-x_2|+|y_1-y_2|$. Your goal is to find a location $(x,y)$ such that the sum of the Manhattan distances from that location to all $n$ locations on the list is minimized.</p>

### 입력

<p>The first line contains a positive integer $n$ indicating the number of locations. The $i$-th of the $n$ following lines contains two integers $x_i$ and $y_i$. The coordinates of the $i$-th location is $(x_i, y_i)$.</p>

### 출력

<p>Print the location $(x,y)$ minimizing the sum of Manhattan distance from $(x,y)$ to all $n$ locations on the list. If there are multiple solutions, output the one minimizing $x$. If there still multiple solutions, output the one minimizing $y$.</p>

### 제한

<ul>
	<li>$1&le;n&le;100000$</li>
	<li>$-100000&le;x_i&le;100000$ for $1&le;i&le;n$.</li>
	<li>$-100000&le;y_i&le;100000$ for $1&le;i&le;n$.</li>
</ul>