# [Silver II] Tram - 20738

[문제 링크](https://www.acmicpc.net/problem/20738)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 40, 맞힌 사람: 36, 정답 비율: 80.000%

### 분류

수학, 기하학

### 문제 설명

<p>It is 1815 and the politicians in Lund have just decided to build a tram line in Lund. Oh, sorry. That was wrong, let&#39;s start over. It is 2015 and the politicians in Lund have just decided to build a tram line in Lund.</p>

<p>The politicians have already decided that the tram line should run from south-east to north-west. In order not to cause too many complaints from the citizens, they want to make the line as useful as possible. Therefore they want to minimize the total unusefulness of the tram.</p>

<p>The <em>unusefulness</em> for citizen $i$ is equal to the square of the closest distance from the citizen&#39;s home to the tram line. The total unusefulness of the tram is the sum of all citizens&#39; unusefulnesses.</p>

<p>Given the coordinates of each citizen&#39;s home, determine the value $a$ minimizing the total unusefulnes, where the equation of the tram line is given by $y=x+a$.</p>

### 입력

<p>The first line of input consists of an integer, $1\leq N\leq 10^5$, the number of citizens in Lund. Then follow $N$ lines, with two space-separated integers $x_i,y_i$ ($|x_i|,|y_i|\leq 10^6$), the coordinates of citizen $i$&#39;s home.</p>

### 출력

<p>The output consists of a single number, $a$, minimizing the total unusefulness. An answer will be accepted if it is within an absolute or relative error of $10^{-3}$.</p>