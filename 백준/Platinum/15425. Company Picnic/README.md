# [Platinum V] Company Picnic - 15425

[문제 링크](https://www.acmicpc.net/problem/15425)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 73, 정답: 19, 맞힌 사람: 19, 정답 비율: 30.159%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Each year, your employer hosts a company picnic. This event features a three-legged race, a race where two runners work as a team, running side-by-side with the legs between them tied together. It is more difficult to run like that, so teams run at a speed that is the minimum of the running speed of the two team members. For example, if Mildred can run 4.4 meters per second and Ken can run 4.0 meters per second, then, as a team, they will run 4.0 meters per second.</p>

<p>To improve company morale, all teams are chosen so they include an employee and the supervisor they report directly to. In the organization chart below, Mildred could be on a team with Ken (running at 4.0 meters per second) or with Zack (running at 4.2 meters per second), but Mildred could not be on a team with Barbara.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15425/1.png" style="height:178px; width:250px" /></p>

<p style="text-align:center">Figure E.1: Organization chart illustrating the sample input below.</p>

<p>Given a description of the company organizational chart, your job is to create as many teams as possible for the upcoming race, provided each employee can only be on one team. To make the race exciting, you want to choose the fastest teams possible, so, while forming as many teams as you can, you must pair up team members so that the average team running speed is maximized. For example, in the chart above, you could form four teams by pairing Mildred with Ken, Zack with Tina, Wilbur with Virgil and Rose with Seth. However, a better solution would pair Rose with Barbara instead of Seth. This would still give you four teams, but it would give you a greater average speed for the teams.</p>

### 입력

<p>The first line of input contains an integer n (2 &le; n &le; 1 000) giving the total number of employees in the company. This is followed by n lines, each describing an employee. Each of these lines contains three space-separated values, first the name of the employee, then a real number giving their running speed in meters per second, and, finally, the name of their immediate supervisor in the organization chart. The organization chart is guaranteed to form a tree, with the CEO at the root. Since the CEO does not report to anyone, the input just gives &ldquo;CEO&rdquo; as their supervisor (no one&rsquo;s name is CEO). For all other employees, the supervisor is the name of another employee listed elsewhere in the input. Employee names are all unique and consist of 1 to 12 upper- and lower-case letters (a&ndash;z), and running speeds are all in the plausible range from 2.2 meters per second up to 5.3 meters per second. Running speeds have at most 3 digits after the decimal point.</p>

### 출력

<p>Print the largest number of three-legged-race teams that can be formed, followed by the maximum possible average running speed for that number of teams. The speed should be accurate to within 0.001 meters per second.</p>